package net.mcreator.mythicrealms.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class TelaSFProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static String execute(Entity entity) {
		return execute(null, entity);
	}

	private static String execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return "";
		return new java.text.DecimalFormat("##").format(entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce);
	}
}