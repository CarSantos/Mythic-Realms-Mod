package net.mcreator.mythicrealms.procedures;

import net.neoforged.neoforge.client.event.RenderLevelStageEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.Difficulty;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;

import net.mcreator.mythicrealms.client.RenderUtils;

public class BloodMoonEventProcedure {
	public static void execute(LevelAccessor world, Entity entity, RenderLevelStageEvent.AfterSky skyRenderEvent) {
		if (entity == null || skyRenderEvent == null)
			return;
		RenderUtils.swapVanillaTexture(RenderUtils.MOON_LOCATION, ResourceLocation.parse("mythicrealms:textures/environment/blood_moon.png"));
		if (world.getServer() != null) {
			world.getServer().setDifficulty(Difficulty.HARD, true);
		}
		if (world.dayTime() == 12000) {
			if (world instanceof ServerLevel _level) {
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Warning: The Blood Moon has risen!").withColor(0xff0000).withStyle(ChatFormatting.BOLD), false);
			}
			if (world instanceof ServerLevel _level) {
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Hostile mobs grow stronger and more aggressive!").withColor(0xff0000).withStyle(ChatFormatting.BOLD), false);
			}
			if (world instanceof ServerLevel _level) {
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Seek shelter or prepare to fight for your life!").withColor(0xff0000).withStyle(ChatFormatting.BOLD), false);
			}
			if (entity instanceof Monster == true) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.STRENGTH, 12000, 2));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.RESISTANCE, 12000, 2));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 12000, 1));
			}
		}
	}
}