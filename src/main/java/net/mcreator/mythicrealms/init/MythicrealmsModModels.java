/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mythicrealms.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.mythicrealms.client.model.*;

@EventBusSubscriber(Dist.CLIENT)
public class MythicrealmsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelHippocampus.LAYER_LOCATION, ModelHippocampus::createBodyLayer);
		event.registerLayerDefinition(ModelMagic_Armor.LAYER_LOCATION, ModelMagic_Armor::createBodyLayer);
		event.registerLayerDefinition(ModelLava_Golem.LAYER_LOCATION, ModelLava_Golem::createBodyLayer);
		event.registerLayerDefinition(ModelJoker.LAYER_LOCATION, ModelJoker::createBodyLayer);
		event.registerLayerDefinition(ModelArmor_Demon.LAYER_LOCATION, ModelArmor_Demon::createBodyLayer);
		event.registerLayerDefinition(ModelArmor_Nano.LAYER_LOCATION, ModelArmor_Nano::createBodyLayer);
		event.registerLayerDefinition(ModelGhostHorse.LAYER_LOCATION, ModelGhostHorse::createBodyLayer);
		event.registerLayerDefinition(ModelArmor_Angel.LAYER_LOCATION, ModelArmor_Angel::createBodyLayer);
		event.registerLayerDefinition(ModelPandemic.LAYER_LOCATION, ModelPandemic::createBodyLayer);
		event.registerLayerDefinition(ModelVampire.LAYER_LOCATION, ModelVampire::createBodyLayer);
		event.registerLayerDefinition(ModelArmor_Samurai.LAYER_LOCATION, ModelArmor_Samurai::createBodyLayer);
		event.registerLayerDefinition(ModelTech_Nocturn_Armor.LAYER_LOCATION, ModelTech_Nocturn_Armor::createBodyLayer);
		event.registerLayerDefinition(ModelMagnet_Armor.LAYER_LOCATION, ModelMagnet_Armor::createBodyLayer);
		event.registerLayerDefinition(Modelarmor_venraid.LAYER_LOCATION, Modelarmor_venraid::createBodyLayer);
		event.registerLayerDefinition(Modelent.LAYER_LOCATION, Modelent::createBodyLayer);
		event.registerLayerDefinition(ModelArmor_Blood.LAYER_LOCATION, ModelArmor_Blood::createBodyLayer);
		event.registerLayerDefinition(Modelplayermodel.LAYER_LOCATION, Modelplayermodel::createBodyLayer);
		event.registerLayerDefinition(ModelMummy.LAYER_LOCATION, ModelMummy::createBodyLayer);
		event.registerLayerDefinition(ModelArmor_Ninja.LAYER_LOCATION, ModelArmor_Ninja::createBodyLayer);
		event.registerLayerDefinition(ModelDemon.LAYER_LOCATION, ModelDemon::createBodyLayer);
		event.registerLayerDefinition(ModelPharaoh.LAYER_LOCATION, ModelPharaoh::createBodyLayer);
		event.registerLayerDefinition(ModelAngel.LAYER_LOCATION, ModelAngel::createBodyLayer);
		event.registerLayerDefinition(ModelVenraid.LAYER_LOCATION, ModelVenraid::createBodyLayer);
		event.registerLayerDefinition(ModelBlackHole.LAYER_LOCATION, ModelBlackHole::createBodyLayer);
		event.registerLayerDefinition(ModelYeti.LAYER_LOCATION, ModelYeti::createBodyLayer);
		event.registerLayerDefinition(ModelTechGoogles.LAYER_LOCATION, ModelTechGoogles::createBodyLayer);
		event.registerLayerDefinition(Modelwendigo.LAYER_LOCATION, Modelwendigo::createBodyLayer);
		event.registerLayerDefinition(ModelMagnet_Propulsor.LAYER_LOCATION, ModelMagnet_Propulsor::createBodyLayer);
		event.registerLayerDefinition(ModelNightmareHorse.LAYER_LOCATION, ModelNightmareHorse::createBodyLayer);
		event.registerLayerDefinition(ModelWendigo_Armor.LAYER_LOCATION, ModelWendigo_Armor::createBodyLayer);
		event.registerLayerDefinition(ModelArmor_pharaoh.LAYER_LOCATION, ModelArmor_pharaoh::createBodyLayer);
		event.registerLayerDefinition(ModelSturgeon.LAYER_LOCATION, ModelSturgeon::createBodyLayer);
		event.registerLayerDefinition(ModelXochitl_Armor.LAYER_LOCATION, ModelXochitl_Armor::createBodyLayer);
		event.registerLayerDefinition(ModelArmor_Ent.LAYER_LOCATION, ModelArmor_Ent::createBodyLayer);
		event.registerLayerDefinition(ModelDracula.LAYER_LOCATION, ModelDracula::createBodyLayer);
		event.registerLayerDefinition(ModelPaladino_Armor.LAYER_LOCATION, ModelPaladino_Armor::createBodyLayer);
		event.registerLayerDefinition(ModelZombie.LAYER_LOCATION, ModelZombie::createBodyLayer);
		event.registerLayerDefinition(ModelKitsune.LAYER_LOCATION, ModelKitsune::createBodyLayer);
		event.registerLayerDefinition(ModelXochitl.LAYER_LOCATION, ModelXochitl::createBodyLayer);
	}
}