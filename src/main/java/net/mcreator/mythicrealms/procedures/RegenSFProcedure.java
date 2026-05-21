package net.mcreator.mythicrealms.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class RegenSFProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).SoulforceLimit > entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce) {
			if (world.dimensionType().moonPhase(world.dayTime()) == 0) {
				{
					MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
					_vars.Soulforce = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce + entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).soulforceRegen * 2;
					_vars.markSyncDirty();
				}
			} else {
				{
					MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
					_vars.Soulforce = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce + entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).soulforceRegen;
					_vars.markSyncDirty();
				}
			}
		}
	}
}