package net.mcreator.mythicrealms.procedures;

import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;
import net.mcreator.mythicrealms.init.MythicrealmsModKeyMappings;

import javax.annotation.Nullable;

@EventBusSubscriber
public class WaterBreathMagicProcedure {
	@SubscribeEvent
	public static void onEntityTick(EntityTickEvent.Pre event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (MythicrealmsModKeyMappings.WATER_BREATH_KEY.isDown() == true) {
			if (entity instanceof ServerPlayer _plr1 && _plr1.level() instanceof ServerLevel _serverLevel1
					&& _plr1.getAdvancements().getOrStartProgress(_serverLevel1.getServer().getAdvancements().get(ResourceLocation.parse("mythicrealms:water_breath_magic_unlock"))).isDone()) {
				if (entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce > 10) {
					{
						MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
						_vars.Soulforce = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce - 0.25;
						_vars.markSyncDirty();
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING,
								(entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.WATER_BREATHING) ? _livEnt.getEffect(MobEffects.WATER_BREATHING).getDuration() : 0) + 20, 1, false, false));
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("You don't have enough Soulforce"), false);
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("You need to unlock this magic first"), false);
			}
		}
	}
}