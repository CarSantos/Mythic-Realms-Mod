package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.mythicrealms.MythicrealmsMod;

public class EyeOfRaVisionProjectileProjectileHitsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 1200, 3, false, false));
		new Object() {
			void timedLoop(int timedloopiterator, int timedlooptotal, int ticks) {
				entity.igniteForSeconds(30);
				final int tick2 = ticks;
				MythicrealmsMod.queueServerWork(tick2, () -> {
					if (timedlooptotal > timedloopiterator + 1) {
						timedLoop(timedloopiterator + 1, timedlooptotal, tick2);
					}
				});
			}
		}.timedLoop(0, 60, 20);
	}
}