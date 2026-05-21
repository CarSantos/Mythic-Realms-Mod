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
public class MoonEventProcedure {
	@SubscribeEvent
	public static void onSkyRendered(RenderLevelStageEvent.AfterSky event) {
		Minecraft mc = Minecraft.getInstance();
		execute(event, mc.player.level(), mc.player.getX(), mc.player.getY(), mc.player.getZ(), mc.player, event);
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, RenderLevelStageEvent.AfterSky skyRenderEvent) {
		execute(null, world, x, y, z, entity, skyRenderEvent);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, RenderLevelStageEvent.AfterSky skyRenderEvent) {
		if (entity == null || skyRenderEvent == null)
			return;
		double random = 0;
		if ((world instanceof Level _lvl0 && _lvl0.isBrightOutside()) == false && (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
			if (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 31 && Calendar.getInstance().get(Calendar.MONTH) == 10) {
				PumpkinMoonEventProcedure.execute(world, skyRenderEvent);
			} else if (world.dimensionType().moonPhase(world.dayTime()) == 0) {
				if (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 13) {
					BloodMoonEventProcedure.execute(world, entity, skyRenderEvent);
				}
				if (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 7) {
					HarvestMoonEventProcedure.execute(world, x, y, z, skyRenderEvent);
				}
			} else {
				RenderUtils.swapVanillaTexture(RenderUtils.MOON_LOCATION, ResourceLocation.parse("mythicrealms:textures/environment/moon_phases.png"));
			}
		}
	}
}