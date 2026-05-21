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

import net.mcreator.mythicrealms.procedures.ThunderMagicProcedure;
import net.mcreator.mythicrealms.MythicrealmsMod;

@EventBusSubscriber
public record ThunderKeyMessage(int eventType, int pressedms) implements CustomPacketPayload {
	public static final Type<ThunderKeyMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(MythicrealmsMod.MODID, "key_thunder_key"));
	public static final StreamCodec<RegistryFriendlyByteBuf, ThunderKeyMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, ThunderKeyMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new ThunderKeyMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<ThunderKeyMessage> type() {
		return TYPE;
	}

	public static void handleData(final ThunderKeyMessage message, final IPayloadContext context) {
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

			ThunderMagicProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		MythicrealmsMod.addNetworkMessage(ThunderKeyMessage.TYPE, ThunderKeyMessage.STREAM_CODEC, ThunderKeyMessage::handleData);
	}
}