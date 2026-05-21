package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.mythicrealms.entity.GhostHorseEntity;

public class GhostHorseHurtConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity instanceof GhostHorseEntity _datEntL0 && _datEntL0.getEntityData().get(GhostHorseEntity.DATA_hurt);
	}
}