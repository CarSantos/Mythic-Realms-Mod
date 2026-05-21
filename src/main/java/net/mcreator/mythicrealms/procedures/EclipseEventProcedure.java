package net.mcreator.mythicrealms.procedures;

import net.neoforged.neoforge.client.event.RenderLevelStageEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;

import net.mcreator.mythicrealms.client.RenderUtils;

public class EclipseEventProcedure {
	public static void execute(LevelAccessor world, Entity entity, RenderLevelStageEvent.AfterSky skyRenderEvent) {
		if (entity == null || skyRenderEvent == null)
			return;
		RenderUtils.renderCustomSun(skyRenderEvent, ResourceLocation.parse("mythicrealms:textures/environment/eclipse.png"));
		if (world.dayTime() == 0) {
			if (world instanceof ServerLevel _level) {
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("A Solar Eclipse darkens the sky!").withColor(0xffffcc).withStyle(ChatFormatting.BOLD), false);
			}
			if (world instanceof ServerLevel _level) {
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Light fades, shadows take control...").withColor(0xffffcc).withStyle(ChatFormatting.BOLD), false);
			}
			if (world instanceof ServerLevel _level) {
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Strange creatures stir in the dim silence.").withColor(0xffffcc).withStyle(ChatFormatting.BOLD), false);
			}
			if (entity instanceof Monster == true) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 12000, 1, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.STRENGTH, 12000, 1, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 12000, 1, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.SPEED, 12000, 1, false, false));
			}
		}
	}
}