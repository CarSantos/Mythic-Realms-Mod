package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;

import java.util.Calendar;

public class PumpkinMagicProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (Calendar.getInstance().get(Calendar.MONTH) == 10) {
			if (entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce > 10) {
				{
					MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
					_vars.Soulforce = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce - 0;
					_vars.markSyncDirty();
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("You don't have enough Soulforce"), true);
			}
		} else {
			if (entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce > 10) {
				{
					MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
					_vars.Soulforce = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce - 5;
					_vars.markSyncDirty();
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("You don't have enough Soulforce"), true);
			}
		}
		return true;
	}
}