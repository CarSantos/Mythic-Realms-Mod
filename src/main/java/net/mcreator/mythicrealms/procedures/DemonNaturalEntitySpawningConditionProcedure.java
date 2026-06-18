package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class DemonNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("mythicrealms:moon"))
				&& (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER) {
			if (Math.random() < 0.5) {
				return true;
			}
		}
		if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
			if (Math.random() < 0.2 && (world instanceof Level _lvl9 && _lvl9.isBrightOutside()) == false && world.dimensionType().moonPhase(world.dayTime()) == 5
					&& (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("mythicrealms:darkness_plains")) == true
							|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("mythicrealms:darkness_forest")) == true)) {
				return true;
			}
		}
		return false;
	}
}