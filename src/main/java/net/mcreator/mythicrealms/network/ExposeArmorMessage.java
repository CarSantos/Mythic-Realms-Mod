package net.mcreator.mythicrealms.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;

import net.mcreator.mythicrealms.MythicrealmsMod;

@EventBusSubscriber
public record ExposeArmorMessage(int eventType, int pressedms) implements CustomPacketPayload {
	public static final Type<ExposeArmorMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(MythicrealmsMod.MODID, "key_expose_armor"));
	public static final StreamCodec<RegistryFriendlyByteBuf, ExposeArmorMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, ExposeArmorMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new ExposeArmorMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<ExposeArmorMessage> type() {
		return TYPE;
	}

	public static void handleData(final ExposeArmorMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		MythicrealmsMod.addNetworkMessage(ExposeArmorMessage.TYPE, ExposeArmorMessage.STREAM_CODEC, ExposeArmorMessage::handleData);
	}
}