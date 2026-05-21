package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.entity.Entity;

public class IdleConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.onGround() && entity.getDeltaMovement().x() == 0 && entity.getDeltaMovement().y() == 0 && entity.getDeltaMovement().z() == 0;
	}
}