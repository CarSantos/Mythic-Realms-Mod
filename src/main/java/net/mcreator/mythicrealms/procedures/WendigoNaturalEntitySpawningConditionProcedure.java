package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.mythicrealms.init.MythicrealmsModEntities;

public class WendigoNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.4 && (world instanceof Level _lvl0 && _lvl0.isBrightOutside()) == false && world.dimensionType().moonPhase(world.dayTime()) == 5
				&& (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("mythicrealms:darkness_forest")) == true || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest")) == true)) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = MythicrealmsModEntities.WENDIGO.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			return false;
		}
		return false;
	}
}