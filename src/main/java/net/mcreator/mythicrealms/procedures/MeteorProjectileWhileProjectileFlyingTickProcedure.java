package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.mythicrealms.init.MythicrealmsModParticleTypes;

public class MeteorProjectileWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (MythicrealmsModParticleTypes.FIRE_MAGIC_PARTICLE.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 5, 1, 1, 1, 1);
	}
}