package net.mcreator.mythicrealms.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;

import net.mcreator.mythicrealms.procedures.GhostMagicRealesedProcedure;
import net.mcreator.mythicrealms.procedures.GhostMagicProcedure;
import net.mcreator.mythicrealms.MythicrealmsMod;

@EventBusSubscriber
public record GhostKeyMessage(int eventType, int pressedms) implements CustomPacketPayload {
	public static final Type<GhostKeyMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(MythicrealmsMod.MODID, "key_ghost_key"));
	public static final StreamCodec<RegistryFriendlyByteBuf, GhostKeyMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, GhostKeyMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new GhostKeyMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<GhostKeyMessage> type() {
		return TYPE;
	}

	public static void handleData(final GhostKeyMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				pressAction(context.player(), message.eventType, message.pressedms);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;
		if (type == 0) {

			GhostMagicProcedure.execute(entity);
		}
		if (type == 1) {

			GhostMagicRealesedProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		MythicrealmsMod.addNetworkMessage(GhostKeyMessage.TYPE, GhostKeyMessage.STREAM_CODEC, GhostKeyMessage::handleData);
	}
}