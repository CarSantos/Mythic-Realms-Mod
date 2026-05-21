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

import java.util.Calendar;

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
		if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
			if ((world instanceof Level _lvl3 && _lvl3.isBrightOutside()) == true) {
				if (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 31) {
					EclipseEventProcedure.execute(world, entity, skyRenderEvent);
				} else if (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) != 31) {
					RenderUtils.swapVanillaTexture(RenderUtils.SUN_LOCATION, ResourceLocation.parse("mythicrealms:textures/environment/sun.png"));
				}
			}
		}
	}
}