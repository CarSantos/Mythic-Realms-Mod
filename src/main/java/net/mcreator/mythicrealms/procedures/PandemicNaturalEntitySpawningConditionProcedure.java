package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class PandemicNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level0 && _level0.isVillage(BlockPos.containing(x, y, z))) {
			return true;
		}
		return true;
	}
}