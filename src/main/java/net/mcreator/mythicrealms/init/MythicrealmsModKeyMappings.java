/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mythicrealms.init;

import org.lwjgl.glfw.GLFW;

import net.neoforged.neoforge.client.network.ClientPacketDistributor;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.mythicrealms.network.*;

@EventBusSubscriber(Dist.CLIENT)
public class MythicrealmsModKeyMappings {
	public static final KeyMapping DASH_KEY = new KeyMapping("key.mythicrealms.dash_key", GLFW.GLFW_KEY_UNKNOWN, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new DashKeyMessage(0, 0));
				DashKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping CAVE = new KeyMapping("key.mythicrealms.cave", GLFW.GLFW_KEY_UNKNOWN, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new CaveMessage(0, 0));
				CaveMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping GHOST_KEY = new KeyMapping("key.mythicrealms.ghost_key", GLFW.GLFW_KEY_UNKNOWN, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new GhostKeyMessage(0, 0));
				GhostKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SMOKE_KEY = new KeyMapping("key.mythicrealms.smoke_key", GLFW.GLFW_KEY_UNKNOWN, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new SmokeKeyMessage(0, 0));
				SmokeKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				SMOKE_KEY_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - SMOKE_KEY_LASTPRESS);
				ClientPacketDistributor.sendToServer(new SmokeKeyMessage(1, dt));
				SmokeKeyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ACCELARATION_KEY = new KeyMapping("key.mythicrealms.accelaration_key", GLFW.GLFW_KEY_UNKNOWN, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new AccelarationKeyMessage(0, 0));
				AccelarationKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping WATER_BREATH_KEY = new KeyMapping("key.mythicrealms.water_breath_key", GLFW.GLFW_KEY_UNKNOWN, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new WaterBreathKeyMessage(0, 0));
				WaterBreathKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping EXPOSE_ARMOR = new KeyMapping("key.mythicrealms.expose_armor", GLFW.GLFW_KEY_UNKNOWN, "key.categories.misc");
	public static final KeyMapping SPECTATE_MAGIC = new KeyMapping("key.mythicrealms.spectate_magic", GLFW.GLFW_KEY_UNKNOWN, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new SpectateMagicMessage(0, 0));
				SpectateMagicMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				SPECTATE_MAGIC_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - SPECTATE_MAGIC_LASTPRESS);
				ClientPacketDistributor.sendToServer(new SpectateMagicMessage(1, dt));
				SpectateMagicMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long SMOKE_KEY_LASTPRESS = 0;
	private static long SPECTATE_MAGIC_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(DASH_KEY);
		event.register(CAVE);
		event.register(GHOST_KEY);
		event.register(SMOKE_KEY);
		event.register(ACCELARATION_KEY);
		event.register(WATER_BREATH_KEY);
		event.register(EXPOSE_ARMOR);
		event.register(SPECTATE_MAGIC);
	}

	@EventBusSubscriber(Dist.CLIENT)
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(ClientTickEvent.Post event) {
			if (Minecraft.getInstance().screen == null) {
				DASH_KEY.consumeClick();
				CAVE.consumeClick();
				GHOST_KEY.consumeClick();
				SMOKE_KEY.consumeClick();
				ACCELARATION_KEY.consumeClick();
				WATER_BREATH_KEY.consumeClick();
				SPECTATE_MAGIC.consumeClick();
			}
		}
	}
}