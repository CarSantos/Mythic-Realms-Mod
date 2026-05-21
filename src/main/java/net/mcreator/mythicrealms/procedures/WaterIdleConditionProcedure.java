package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class WaterIdleConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double z, Entity entity) {
		if (entity == null)
			return false;
		return entity.isInWater() && world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) x, (int) z) > 1 && entity.getDeltaMovement().x() == 0 && entity.getDeltaMovement().y() == 0 && entity.getDeltaMovement().z() == 0;
	}
}