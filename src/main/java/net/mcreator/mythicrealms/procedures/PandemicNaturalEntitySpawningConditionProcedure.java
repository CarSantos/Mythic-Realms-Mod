package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.mythicrealms.init.MythicrealmsModEntities;

public class PandemicNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world instanceof ServerLevel _level0 && _level0.isVillage(BlockPos.containing(x, y, z))) == true) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = MythicrealmsModEntities.PANDEMIC.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			return true;
		}
		return false;
	}
}