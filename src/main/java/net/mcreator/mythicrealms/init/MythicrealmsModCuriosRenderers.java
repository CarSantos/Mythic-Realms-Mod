package net.mcreator.mythicrealms.init;

import top.theillusivec4.curios.api.client.ICurioRenderer;

import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

import net.mcreator.mythicrealms.client.renderer.TomoeRingRenderer;
import net.mcreator.mythicrealms.client.renderer.TechGooglesRenderer;
import net.mcreator.mythicrealms.client.renderer.MagnetPropulsorRenderer;
import net.mcreator.mythicrealms.client.renderer.ChimeraGunRenderer;

public class MythicrealmsModCuriosRenderers {
	public static void registerRenderers(FMLClientSetupEvent event) {
		ICurioRenderer.register(MythicrealmsModItems.TECH_GOOGLES_ITEM.get(), TechGooglesRenderer::new);
		ICurioRenderer.register(MythicrealmsModItems.MAGNET.get(), MagnetPropulsorRenderer::new);
		ICurioRenderer.register(MythicrealmsModItems.CHIMERA_GUN_ITEM.get(), ChimeraGunRenderer::new);
		ICurioRenderer.register(MythicrealmsModItems.TOMOE_RING_ITEM.get(), TomoeRingRenderer::new);
	}
}