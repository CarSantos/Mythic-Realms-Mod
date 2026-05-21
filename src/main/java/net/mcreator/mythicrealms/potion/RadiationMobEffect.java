package net.mcreator.mythicrealms.potion;

import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientMobEffectExtensions;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.mythicrealms.procedures.RadiationOnEntityDeathProcedure;
import net.mcreator.mythicrealms.procedures.RadiationOnEffectActiveTickProcedure;
import net.mcreator.mythicrealms.init.MythicrealmsModMobEffects;

@EventBusSubscriber
public class RadiationMobEffect extends MobEffect {
	public RadiationMobEffect() {
		super(MobEffectCategory.NEUTRAL, -6697984);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
		RadiationOnEffectActiveTickProcedure.execute(level, entity);
		return super.applyEffectTick(level, entity, amplifier);
	}

	@Override
	public void onMobRemoved(ServerLevel level, LivingEntity entity, int amplifier, Entity.RemovalReason reason) {
		if (reason == Entity.RemovalReason.KILLED) {
			RadiationOnEntityDeathProcedure.execute(level, entity.getX(), entity.getY(), entity.getZ(), entity);
		}
	}

	@SubscribeEvent
	public static void registerMobEffectExtensions(RegisterClientExtensionsEvent event) {
		event.registerMobEffect(new IClientMobEffectExtensions() {
			@Override
			public boolean isVisibleInInventory(MobEffectInstance effect) {
				return false;
			}

			@Override
			public boolean renderInventoryText(MobEffectInstance instance, AbstractContainerScreen<?> screen, GuiGraphics guiGraphics, int x, int y, int blitOffset) {
				return false;
			}

			@Override
			public boolean isVisibleInGui(MobEffectInstance effect) {
				return false;
			}
		}, MythicrealmsModMobEffects.RADIATION.get());
	}
}