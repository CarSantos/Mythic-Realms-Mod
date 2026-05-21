package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.Husk;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.mythicrealms.init.MythicrealmsModParticleTypes;
import net.mcreator.mythicrealms.entity.PharaohEntity;
import net.mcreator.mythicrealms.entity.MummyEntity;

public class ScarabItemInInventoryTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 60, 1, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 2, false, false));
		for (Entity entityiterator : world.getEntities(entity, new AABB((x + 16), (y + 16), (z + 16), (x - 16), (y - 16), (z - 16)))) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (MythicrealmsModParticleTypes.FIRE_MAGIC_PARTICLE.get()), x, y, z, 4, 2, 2, 2, 1);
			if (entityiterator instanceof PharaohEntity || entityiterator instanceof MummyEntity || entityiterator instanceof Husk) {
				if (entityiterator instanceof Mob) {
					try {
						((Mob) entityiterator).setTarget(null);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}