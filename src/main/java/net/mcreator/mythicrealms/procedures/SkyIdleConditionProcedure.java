package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class SkyIdleConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double z, Entity entity) {
		if (entity == null)
			return false;
		return world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) >= 1 && entity.getDeltaMovement().x() == 0 && entity.getDeltaMovement().y() == 0 && entity.getDeltaMovement().z() == 0;
	}
}