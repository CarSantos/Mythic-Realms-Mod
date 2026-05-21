package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.entity.Entity;

public class WalkConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.getDeltaMovement().horizontalDistanceSqr() > 1.0E-6D && entity.onGround() && !entity.isSprinting();
	}
}