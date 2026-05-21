package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;

public class SoulforceBookItemIsDroppedByPlayerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
			_vars.soulforceRegen = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).soulforceRegen;
			_vars.markSyncDirty();
		}
	}
}