package net.mcreator.mythicrealms.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class LimitSFProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) != 0) {
			{
				MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
				_vars.SoulforceLimit = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).SoulforceLimit * (entity instanceof Player _plr ? _plr.experienceLevel : 0);
				_vars.markSyncDirty();
			}
		}
	}
}