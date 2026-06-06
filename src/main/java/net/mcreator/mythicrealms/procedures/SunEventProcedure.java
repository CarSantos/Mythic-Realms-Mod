package net.mcreator.mythicrealms.procedures;

import net.neoforged.neoforge.client.event.RenderLevelStageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.mythicrealms.client.RenderUtils;

import javax.annotation.Nullable;

@EventBusSubscriber(Dist.CLIENT)
public class SunEventProcedure {
	@SubscribeEvent
	public static void onSkyRendered(RenderLevelStageEvent.AfterSky event) {
		Minecraft mc = Minecraft.getInstance();
		execute(event, mc.player.level(), mc.player, event);
	}

	public static void execute(LevelAccessor world, Entity entity, RenderLevelStageEvent.AfterSky skyRenderEvent) {
		execute(null, world, entity, skyRenderEvent);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, RenderLevelStageEvent.AfterSky skyRenderEvent) {
		if (entity == null || skyRenderEvent == null)
			return;
		boolean is_day = false;
		if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
			is_day = false;
			if (world.dayTime() == 0) {
				if (Math.random() < (1) / ((float) 500)) {
					is_day = true;
					if (world.dayTime() == 12000) {
						is_day = false;
					}
				} else {
					RenderUtils.swapVanillaTexture(RenderUtils.SUN_LOCATION, ResourceLocation.parse("mythicrealms:textures/environment/sun.png"));
				}
			}
			if (is_day == true) {
				EclipseEventProcedure.execute(world, entity, skyRenderEvent);
			}
		}
	}
}