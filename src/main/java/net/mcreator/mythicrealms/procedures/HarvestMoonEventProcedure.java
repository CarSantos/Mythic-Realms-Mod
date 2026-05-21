package net.mcreator.mythicrealms.procedures;

import net.neoforged.neoforge.client.event.RenderLevelStageEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.Difficulty;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.ChatFormatting;

import net.mcreator.mythicrealms.client.RenderUtils;

public class HarvestMoonEventProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, RenderLevelStageEvent.AfterSky skyRenderEvent) {
		if (skyRenderEvent == null)
			return;
		RenderUtils.renderCustomMoon(skyRenderEvent, ResourceLocation.parse("mythicrealms:textures/environment/blood_moon.png"));
		if (world instanceof Level _level) {
			BlockPos _bp = BlockPos.containing(x, y, z);
			if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
				if (!_level.isClientSide())
					_level.levelEvent(2005, _bp, 0);
			}
		}
		if (world.getServer() != null) {
			world.getServer().setDifficulty(Difficulty.EASY, true);
		}
		if (world.dayTime() == 12000) {
			if (world instanceof ServerLevel _level) {
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("The Harvest Night begins.").withColor(0xcccc00).withStyle(ChatFormatting.BOLD), false);
			}
			if (world instanceof ServerLevel _level) {
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("The moon glows golden as nature awakens in abundance.").withColor(0xcccc00).withStyle(ChatFormatting.BOLD), false);
			}
			if (world instanceof ServerLevel _level) {
				_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Crops grow faster and fortune smiles upon the farmers tonight.").withColor(0xcccc00).withStyle(ChatFormatting.BOLD), false);
			}
		}
	}
}