package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;

public class VampireEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
			_vars.soulforceRegen = 0.001;
			_vars.markSyncDirty();
		}
		if (entity instanceof Player _player) {
			_player.getAbilities().mayfly = false;
			_player.onUpdateAbilities();
		}
	}
}