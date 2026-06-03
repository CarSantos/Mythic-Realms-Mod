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
		boolean is_bloodmoon = false;
		boolean is_harvestmooon = false;
		boolean is_manamoon = false;
		if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
			if (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 31 && Calendar.getInstance().get(Calendar.MONTH) == 10) {
				PumpkinMoonEventProcedure.execute(world, entity, skyRenderEvent);
			} else if (world.dimensionType().moonPhase(world.dayTime()) == 0) {
				if (world.dayTime() == 12000) {
					if (Math.random() < (1) / ((float) 100) || Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 13 && Math.random() < (1) / ((float) 20)) {
						is_bloodmoon = true;
						if (world.dayTime() == 24000) {
							is_bloodmoon = false;
						}
					} else if (Math.random() < (1) / ((float) 150) || Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 7 && Math.random() < (1) / ((float) 30)) {
						is_harvestmooon = true;
						if (world.dayTime() == 24000) {
							is_harvestmooon = false;
						}
					} else if (Math.random() < (1) / ((float) 150) || Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 14 && Math.random() < (1) / ((float) 30)) {
						is_manamoon = true;
						if (world.dayTime() == 24000) {
							is_manamoon = false;
						}
					} else {
						RenderUtils.swapVanillaTexture(RenderUtils.SUN_LOCATION, ResourceLocation.parse("mythicrealms:textures/environment/sun.png"));
					}
				}
			} else {
				RenderUtils.swapVanillaTexture(RenderUtils.MOON_LOCATION, ResourceLocation.parse("mythicrealms:textures/environment/moon_phases.png"));
			}
		}
		if (is_bloodmoon == true) {
			BloodMoonEventProcedure.execute(world, entity, skyRenderEvent);
			BloodMoonEntityProcedure.execute(entity);
		}
		if (is_harvestmooon == true) {
			HarvestMoonEventProcedure.execute(world, x, y, z, entity, skyRenderEvent);
		}
		if (is_manamoon == true) {
			ManaMoonEventProcedure.execute(world, entity, skyRenderEvent);
			ManaMoonEntityProcedure.execute(world, entity, skyRenderEvent);
		}
	}
}