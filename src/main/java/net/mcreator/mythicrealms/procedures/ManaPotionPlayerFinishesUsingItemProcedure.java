package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;

public class ManaPotionPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
			_vars.Soulforce = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce + 10000;
			_vars.markSyncDirty();
		}
	}
}