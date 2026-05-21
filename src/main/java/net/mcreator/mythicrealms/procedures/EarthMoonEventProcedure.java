package net.mcreator.mythicrealms.procedures;

import net.neoforged.neoforge.client.event.RenderLevelStageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.Difficulty;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.Minecraft;

import net.mcreator.mythicrealms.client.RenderUtils;

import javax.annotation.Nullable;

@EventBusSubscriber(Dist.CLIENT)
public class EarthMoonEventProcedure {
	@SubscribeEvent
	public static void onSkyRendered(RenderLevelStageEvent.AfterSky event) {
		Minecraft mc = Minecraft.getInstance();
		execute(event, mc.player.level(), event);
	}

	public static void execute(LevelAccessor world, RenderLevelStageEvent.AfterSky skyRenderEvent) {
		execute(null, world, skyRenderEvent);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, RenderLevelStageEvent.AfterSky skyRenderEvent) {
		if (skyRenderEvent == null)
			return;
		if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("mythicrealms:moon"))) {
			RenderUtils.swapVanillaTexture(RenderUtils.MOON_LOCATION, ResourceLocation.parse("mythicrealms:textures/environment/earth_moon.png"));
			if (world.getServer() != null) {
				world.getServer().setDifficulty(Difficulty.PEACEFUL, true);
			}
		}
	}
}