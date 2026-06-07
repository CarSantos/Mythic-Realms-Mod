package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.mythicrealms.init.MythicrealmsModEntities;

public class DemonNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("mythicrealms:moon"))
				&& (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER) {
			if (Math.random() < 0.5) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = MythicrealmsModEntities.DEMON.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				return true;
			}
		}
		if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
			if (Math.random() < 0.2 && (world instanceof Level _lvl10 && _lvl10.isBrightOutside()) == false && world.dimensionType().moonPhase(world.dayTime()) == 5
					&& (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("mythicrealms:darkness_plains")) == true
							|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("mythicrealms:darkness_forest")) == true)) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = MythicrealmsModEntities.DEMON.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				return true;
			}
		}
		return false;
	}
}