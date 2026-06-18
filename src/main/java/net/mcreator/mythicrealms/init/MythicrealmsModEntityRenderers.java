/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mythicrealms.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.mythicrealms.client.renderer.*;

@EventBusSubscriber(Dist.CLIENT)
public class MythicrealmsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MythicrealmsModEntities.FIREBALL_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MythicrealmsModEntities.ICEBALL_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MythicrealmsModEntities.THUNDER_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MythicrealmsModEntities.GHOST_HORSE.get(), GhostHorseRenderer::new);
		event.registerEntityRenderer(MythicrealmsModEntities.NIGHTMARE_HORSE.get(), NightmareHorseRenderer::new);
		event.registerEntityRenderer(MythicrealmsModEntities.HIPPOCAMPUS.get(), HippocampusRenderer::new);
		event.registerEntityRenderer(MythicrealmsModEntities.METEOR_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MythicrealmsModEntities.METEOR.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MythicrealmsModEntities.BLACK_HOLE.get(), BlackHoleRenderer::new);
		event.registerEntityRenderer(MythicrealmsModEntities.BLACK_HOLE_PROJECTILE.get(), BlackHoleProjectileRenderer::new);
		event.registerEntityRenderer(MythicrealmsModEntities.PANDEMIC.get(), PandemicRenderer::new);
		event.registerEntityRenderer(MythicrealmsModEntities.YETI.get(), YetiRenderer::new);
		event.registerEntityRenderer(MythicrealmsModEntities.JOKER.get(), JokerRenderer::new);
		event.registerEntityRenderer(MythicrealmsModEntities.VAMPIRE.get(), VampireRenderer::new);
		event.registerEntityRenderer(MythicrealmsModEntities.DRACULA.get(), DraculaRenderer::new);
		event.registerEntityRenderer(MythicrealmsModEntities.LAVA_GOLEM.get(), LavaGolemRenderer::new);
		event.registerEntityRenderer(MythicrealmsModEntities.MUMMY.get(), MummyRenderer::new);
		event.registerEntityRenderer(MythicrealmsModEntities.PHARAOH.get(), PharaohRenderer::new);
		event.registerEntityRenderer(MythicrealmsModEntities.ENT.get(), EntRenderer::new);
		event.registerEntityRenderer(MythicrealmsModEntities.KITSUNE.get(), KitsuneRenderer::new);
		event.registerEntityRenderer(MythicrealmsModEntities.STURGEON.get(), SturgeonRenderer::new);
		event.registerEntityRenderer(MythicrealmsModEntities.VENRAID.get(), VenraidRenderer::new);
		event.registerEntityRenderer(MythicrealmsModEntities.PUMPKIN_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MythicrealmsModEntities.ANGEL.get(), AngelRenderer::new);
		event.registerEntityRenderer(MythicrealmsModEntities.DEMON.get(), DemonRenderer::new);
		event.registerEntityRenderer(MythicrealmsModEntities.WENDIGO.get(), WendigoRenderer::new);
		event.registerEntityRenderer(MythicrealmsModEntities.XOCHITL.get(), XochitlRenderer::new);
		event.registerEntityRenderer(MythicrealmsModEntities.TOXIC_SLIME_PROJETILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MythicrealmsModEntities.UNICORN.get(), UnicornRenderer::new);
		event.registerEntityRenderer(MythicrealmsModEntities.EYE_OF_RA_VISION_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MythicrealmsModEntities.VELOCIRAPTOR.get(), VelociraptorRenderer::new);
	}
}