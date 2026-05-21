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
	public static final KeyMapping EARTHQUAKE_KEY = new KeyMapping("key.mythicrealms.earthquake_key", GLFW.GLFW_KEY_UNKNOWN, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new EarthquakeKeyMessage(0, 0));
				EarthquakeKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping FIREBALL_KEY = new KeyMapping("key.mythicrealms.fireball_key", GLFW.GLFW_KEY_UNKNOWN, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new FireballKeyMessage(0, 0));
				FireballKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ICEBALL_KEY = new KeyMapping("key.mythicrealms.iceball_key", GLFW.GLFW_KEY_UNKNOWN, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new IceballKeyMessage(0, 0));
				IceballKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping THUNDER_KEY = new KeyMapping("key.mythicrealms.thunder_key", GLFW.GLFW_KEY_UNKNOWN, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new ThunderKeyMessage(0, 0));
				ThunderKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping HEAL_KEY = new KeyMapping("key.mythicrealms.heal_key", GLFW.GLFW_KEY_UNKNOWN, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new HealKeyMessage(0, 0));
				HealKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
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
	public static final KeyMapping LIFE_STEAL_KEY = new KeyMapping("key.mythicrealms.life_steal_key", GLFW.GLFW_KEY_UNKNOWN, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new LifeStealKeyMessage(0, 0));
				LifeStealKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
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
	public static final KeyMapping METEOR_KEY = new KeyMapping("key.mythicrealms.meteor_key", GLFW.GLFW_KEY_UNKNOWN, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new MeteorKeyMessage(0, 0));
				MeteorKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SOULFORCE_STEAL = new KeyMapping("key.mythicrealms.soulforce_steal", GLFW.GLFW_KEY_UNKNOWN, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new SoulforceStealMessage(0, 0));
				SoulforceStealMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SAND_KEY = new KeyMapping("key.mythicrealms.sand_key", GLFW.GLFW_KEY_UNKNOWN, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new SandKeyMessage(0, 0));
				SandKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
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
				GHOST_KEY_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - GHOST_KEY_LASTPRESS);
				ClientPacketDistributor.sendToServer(new GhostKeyMessage(1, dt));
				GhostKeyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping NECROMANCER_INVOCATION_KEY = new KeyMapping("key.mythicrealms.necromancer_invocation_key", GLFW.GLFW_KEY_UNKNOWN, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new NecromancerInvocationKeyMessage(0, 0));
				NecromancerInvocationKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
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
	public static final KeyMapping STOP_TIME_KEY = new KeyMapping("key.mythicrealms.stop_time_key", GLFW.GLFW_KEY_UNKNOWN, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new StopTimeKeyMessage(0, 0));
				StopTimeKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping HIGHEST_SOUND_KEY = new KeyMapping("key.mythicrealms.highest_sound_key", GLFW.GLFW_KEY_UNKNOWN, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new HighestSoundKeyMessage(0, 0));
				HighestSoundKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
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
	public static final KeyMapping EXPELL_KEY = new KeyMapping("key.mythicrealms.expell_key", GLFW.GLFW_KEY_UNKNOWN, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new ExpellKeyMessage(0, 0));
				ExpellKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping DETECT_KEY = new KeyMapping("key.mythicrealms.detect_key", GLFW.GLFW_KEY_UNKNOWN, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new DetectKeyMessage(0, 0));
				DetectKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping VULCAN_KEY = new KeyMapping("key.mythicrealms.vulcan_key", GLFW.GLFW_KEY_UNKNOWN, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new VulcanKeyMessage(0, 0));
				VulcanKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping BLACK_HOLE_KEY = new KeyMapping("key.mythicrealms.black_hole_key", GLFW.GLFW_KEY_UNKNOWN, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new BlackHoleKeyMessage(0, 0));
				BlackHoleKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping REFLECT_KEY = new KeyMapping("key.mythicrealms.reflect_key", GLFW.GLFW_KEY_UNKNOWN, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new ReflectKeyMessage(0, 0));
				ReflectKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping POISON_CLOUD_KEY = new KeyMapping("key.mythicrealms.poison_cloud_key", GLFW.GLFW_KEY_UNKNOWN, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new PoisonCloudKeyMessage(0, 0));
				PoisonCloudKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping LIGHT_TRAVEL = new KeyMapping("key.mythicrealms.light_travel", GLFW.GLFW_KEY_UNKNOWN, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new LightTravelMessage(0, 0));
				LightTravelMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping WATER_BREATH_KEY = new KeyMapping("key.mythicrealms.water_breath_key", GLFW.GLFW_KEY_UNKNOWN, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new WaterBreathKeyMessage(0, 0));
				WaterBreathKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				WATER_BREATH_KEY_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - WATER_BREATH_KEY_LASTPRESS);
				ClientPacketDistributor.sendToServer(new WaterBreathKeyMessage(1, dt));
				WaterBreathKeyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping TEMPEST_KEY = new KeyMapping("key.mythicrealms.tempest_key", GLFW.GLFW_KEY_UNKNOWN, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new TempestKeyMessage(0, 0));
				TempestKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping BARRIER_KEY = new KeyMapping("key.mythicrealms.barrier_key", GLFW.GLFW_KEY_UNKNOWN, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new BarrierKeyMessage(0, 0));
				BarrierKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	private static long GHOST_KEY_LASTPRESS = 0;
	private static long SMOKE_KEY_LASTPRESS = 0;
	private static long WATER_BREATH_KEY_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(EARTHQUAKE_KEY);
		event.register(FIREBALL_KEY);
		event.register(ICEBALL_KEY);
		event.register(THUNDER_KEY);
		event.register(HEAL_KEY);
		event.register(DASH_KEY);
		event.register(LIFE_STEAL_KEY);
		event.register(CAVE);
		event.register(METEOR_KEY);
		event.register(SOULFORCE_STEAL);
		event.register(SAND_KEY);
		event.register(GHOST_KEY);
		event.register(NECROMANCER_INVOCATION_KEY);
		event.register(SMOKE_KEY);
		event.register(STOP_TIME_KEY);
		event.register(HIGHEST_SOUND_KEY);
		event.register(ACCELARATION_KEY);
		event.register(EXPELL_KEY);
		event.register(DETECT_KEY);
		event.register(VULCAN_KEY);
		event.register(BLACK_HOLE_KEY);
		event.register(REFLECT_KEY);
		event.register(POISON_CLOUD_KEY);
		event.register(LIGHT_TRAVEL);
		event.register(WATER_BREATH_KEY);
		event.register(TEMPEST_KEY);
		event.register(BARRIER_KEY);
	}

	@EventBusSubscriber(Dist.CLIENT)
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(ClientTickEvent.Post event) {
			if (Minecraft.getInstance().screen == null) {
				EARTHQUAKE_KEY.consumeClick();
				FIREBALL_KEY.consumeClick();
				ICEBALL_KEY.consumeClick();
				THUNDER_KEY.consumeClick();
				HEAL_KEY.consumeClick();
				DASH_KEY.consumeClick();
				LIFE_STEAL_KEY.consumeClick();
				CAVE.consumeClick();
				METEOR_KEY.consumeClick();
				SOULFORCE_STEAL.consumeClick();
				SAND_KEY.consumeClick();
				GHOST_KEY.consumeClick();
				NECROMANCER_INVOCATION_KEY.consumeClick();
				SMOKE_KEY.consumeClick();
				STOP_TIME_KEY.consumeClick();
				HIGHEST_SOUND_KEY.consumeClick();
				ACCELARATION_KEY.consumeClick();
				EXPELL_KEY.consumeClick();
				DETECT_KEY.consumeClick();
				VULCAN_KEY.consumeClick();
				BLACK_HOLE_KEY.consumeClick();
				REFLECT_KEY.consumeClick();
				POISON_CLOUD_KEY.consumeClick();
				LIGHT_TRAVEL.consumeClick();
				WATER_BREATH_KEY.consumeClick();
				TEMPEST_KEY.consumeClick();
				BARRIER_KEY.consumeClick();
			}
		}
	}
}