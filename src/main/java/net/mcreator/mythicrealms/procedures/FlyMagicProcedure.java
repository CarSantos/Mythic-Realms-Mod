package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;
import net.mcreator.mythicrealms.MythicrealmsMod;

public class FlyMagicProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce > 20) {
			{
				MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
				_vars.Soulforce = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce - 20;
				_vars.markSyncDirty();
			}
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = true;
				_player.onUpdateAbilities();
			}
			MythicrealmsMod.queueServerWork(1200, () -> {
				if (entity instanceof Player _player) {
					_player.getAbilities().mayfly = false;
					_player.onUpdateAbilities();
				}
			});
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You don't have enough Soulforce"), true);
		}
	}
}