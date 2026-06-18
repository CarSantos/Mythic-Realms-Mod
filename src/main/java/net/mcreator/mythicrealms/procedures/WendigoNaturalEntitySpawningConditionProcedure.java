package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class WendigoNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.4 && (world instanceof Level _lvl0 && _lvl0.isBrightOutside()) == false && world.dimensionType().moonPhase(world.dayTime()) == 5
				&& (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("mythicrealms:darkness_forest")) == true || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest")) == true)) {
			return true;
		}
		return false;
	}
}