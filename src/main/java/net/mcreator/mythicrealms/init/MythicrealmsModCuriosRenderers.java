package net.mcreator.mythicrealms.init;

import top.theillusivec4.curios.api.client.ICurioRenderer;

import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

import net.mcreator.mythicrealms.client.renderer.TechGooglesRenderer;
import net.mcreator.mythicrealms.client.renderer.MagnetPropulsorRenderer;

public class MythicrealmsModCuriosRenderers {
	public static void registerRenderers(FMLClientSetupEvent event) {
		ICurioRenderer.register(MythicrealmsModItems.TECH_GOOGLES_ITEM.get(), TechGooglesRenderer::new);
		ICurioRenderer.register(MythicrealmsModItems.MAGNET.get(), MagnetPropulsorRenderer::new);
	}
}