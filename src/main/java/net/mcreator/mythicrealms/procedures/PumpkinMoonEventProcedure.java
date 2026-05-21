package net.mcreator.mythicrealms.procedures;

import net.neoforged.neoforge.client.event.RenderLevelStageEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.Difficulty;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;

import net.mcreator.mythicrealms.client.RenderUtils;

public class PumpkinMoonEventProcedure {
	public static void execute(LevelAccessor world, RenderLevelStageEvent.AfterSky skyRenderEvent) {
		if (skyRenderEvent == null)
			return;
		RenderUtils.swapVanillaTexture(RenderUtils.MOON_LOCATION, ResourceLocation.parse("mythicrealms:textures/environment/pumpkin_moon.png"));
		if (world.getServer() != null) {
			world.getServer().setDifficulty(Difficulty.HARD, true);
		}
		if (world.dayTime() == 12000) {
			if (world instanceof ServerLevel _level) {
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("The Pumpkin Moon is here!").withColor(0xff9900).withStyle(ChatFormatting.BOLD), false);
			}
			if (world instanceof ServerLevel _level) {
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Eerie laughter echoes through the land...").withColor(0xff9900).withStyle(ChatFormatting.BOLD), false);
			}
			if (world instanceof ServerLevel _level) {
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Beware the spirits and the haunted pumpkins!").withColor(0xff9900).withStyle(ChatFormatting.BOLD), false);
			}
		}
	}
}