package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class SwimConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double z, Entity entity) {
		if (entity == null)
			return false;
		return entity.isSwimming() && entity.isInWater() && world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) x, (int) z) > 1;
	}
}