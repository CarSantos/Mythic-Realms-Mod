package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;

public class ComandoResetProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
			_vars.SoulforceLimit = 1000000;
			_vars.Soulforce = 10;
			_vars.Soulforce = 0.001;
			_vars.markSyncDirty();
		}
	}
}