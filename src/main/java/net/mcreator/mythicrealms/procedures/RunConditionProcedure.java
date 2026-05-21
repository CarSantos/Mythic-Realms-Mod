package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.entity.Entity;

public class RunConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.isSprinting();
	}
}