package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class LanceRightClickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		DashMagicProcedure.execute(world, x, y, z, entity);
	}
}