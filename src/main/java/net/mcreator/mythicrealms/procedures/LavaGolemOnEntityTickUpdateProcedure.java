package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class LavaGolemOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		for (Entity entityiterator : world.getEntities(entity, new AABB((x + 8), (y + 8), (z + 8), (x - 8), (y - 8), (z - 8)))) {
			entityiterator.igniteForSeconds(5);
		}
	}
}