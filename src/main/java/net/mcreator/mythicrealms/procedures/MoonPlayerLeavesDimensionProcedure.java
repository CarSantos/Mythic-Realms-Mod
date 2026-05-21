package net.mcreator.mythicrealms.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.mythicrealms.init.MythicrealmsModMobEffects;
import net.mcreator.mythicrealms.MythicrealmsMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class MoonPlayerLeavesDimensionProcedure {
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
		if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("mythicrealms:moon"))) {
			if (entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(Attributes.GRAVITY))
				_livingEntity3.getAttribute(Attributes.GRAVITY).setBaseValue(0.02);
			entity.setAirSupply((int) (entity.getAirSupply() - 0.1));
			MythicrealmsMod.queueServerWork(200, () -> {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MythicrealmsModMobEffects.FROZEN, 60, 1));
			});
		}
	}
}