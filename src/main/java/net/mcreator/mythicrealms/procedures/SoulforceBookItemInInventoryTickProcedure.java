package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;

public class SoulforceBookItemInInventoryTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
			_vars.soulforceRegen = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).soulforceRegen + 0.5;
			_vars.markSyncDirty();
		}
	}
}