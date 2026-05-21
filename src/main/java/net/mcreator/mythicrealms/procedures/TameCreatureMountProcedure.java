package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.mythicrealms.MythicrealmsMod;

public class TameCreatureMountProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity.isPassenger() && !(entity instanceof TamableAnimal _tamIsTamedBy && sourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) && Math.random() < 0.3) {
			if (entity instanceof TamableAnimal _toTame && sourceentity instanceof Player _owner)
				_toTame.tame(_owner);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HEART, x, y, z, 16, 3, 3, 3, 1);
		} else if (sourceentity.isPassenger() && (entity instanceof TamableAnimal _tamIsTamedBy && sourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 1);
		} else {
			MythicrealmsMod.queueServerWork(Mth.nextInt(RandomSource.create(), 20, 40), () -> {
				sourceentity.stopRiding();
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SMALL_GUST, x, y, z, 16, 3, 3, 3, 1);
			});
		}
	}
}