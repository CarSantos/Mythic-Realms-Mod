/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mythicrealms.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.mythicrealms.procedures.VampireEffectExpiresProcedure;
import net.mcreator.mythicrealms.procedures.HighPressureEffectExpiresProcedure;
import net.mcreator.mythicrealms.potion.*;
import net.mcreator.mythicrealms.MythicrealmsMod;

@EventBusSubscriber
public class MythicrealmsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, MythicrealmsMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> EXPANSION_SF = REGISTRY.register("expansion_sf", () -> new ExpansionSFMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> EXAUSTED_SF = REGISTRY.register("exausted_sf", () -> new ExaustedSFMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> FROZEN = REGISTRY.register("frozen", () -> new FrozenMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> PLAGUE = REGISTRY.register("plague", () -> new PlagueMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ZOMBIE = REGISTRY.register("zombie", () -> new ZombieMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> HIGH_PRESSURE = REGISTRY.register("high_pressure", () -> new HighPressureMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> VAMPIRE_EFFECT = REGISTRY.register("vampire_effect", () -> new VampireEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> RADIATION = REGISTRY.register("radiation", () -> new RadiationMobEffect());

	@SubscribeEvent
	public static void onEffectRemoved(MobEffectEvent.Remove event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	@SubscribeEvent
	public static void onEffectExpired(MobEffectEvent.Expired event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	private static void expireEffects(Entity entity, MobEffectInstance effectInstance) {
		if (effectInstance.getEffect().is(HIGH_PRESSURE)) {
			HighPressureEffectExpiresProcedure.execute(entity);
		} else if (effectInstance.getEffect().is(VAMPIRE_EFFECT)) {
			VampireEffectExpiresProcedure.execute(entity);
		}
	}
}