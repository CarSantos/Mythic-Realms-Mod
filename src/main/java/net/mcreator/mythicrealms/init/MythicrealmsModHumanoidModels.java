package net.mcreator.mythicrealms.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.Minecraft;

import net.mcreator.mythicrealms.client.model.Modelplayermodel;
import net.mcreator.mythicrealms.client.model.ModelLobisomen;
import net.mcreator.mythicrealms.client.model.ModelArmor_Nano;

import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

@EventBusSubscriber(Dist.CLIENT)
public class MythicrealmsModHumanoidModels {
	public static PlayerModel NANO_MODEL;
	public static PlayerModel PLAYER_BASE;
	public static PlayerModel LOBISOMEN_MODEL;

	@SubscribeEvent
	public static void initModels(EntityRenderersEvent.AddLayers event) {
		ModelArmor_Nano nano_model_temp = new ModelArmor_Nano(Minecraft.getInstance().getEntityModels().bakeLayer(ModelArmor_Nano.LAYER_LOCATION));
		NANO_MODEL = new PlayerModel(new ModelPart(Collections.emptyList(),
				Map.of("head", new ModelPart(Collections.emptyList(), Map.of("head", nano_model_temp.Head, "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))), "body", getPlayerPart(nano_model_temp.Body, "jacket"), "left_arm",
						getPlayerPart(nano_model_temp.LeftArm, "left_sleeve"), "right_arm", getPlayerPart(nano_model_temp.RIghtArm, "right_sleeve"), "left_leg", getPlayerPart(nano_model_temp.LeftLeg, "left_pants"), "right_leg",
						getPlayerPart(nano_model_temp.RightLeg, "right_pants"))),
				false);
		Modelplayermodel player_base_temp = new Modelplayermodel(Minecraft.getInstance().getEntityModels().bakeLayer(Modelplayermodel.LAYER_LOCATION));
		PLAYER_BASE = new PlayerModel(new ModelPart(Collections.emptyList(),
				Map.of("head", new ModelPart(Collections.emptyList(), Map.of("head", player_base_temp.Head, "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))), "body", getPlayerPart(player_base_temp.Body, "jacket"), "left_arm",
						getPlayerPart(player_base_temp.LeftArm, "left_sleeve"), "right_arm", getPlayerPart(player_base_temp.RightArm, "right_sleeve"), "left_leg", getPlayerPart(player_base_temp.LeftLeg, "left_pants"), "right_leg",
						getPlayerPart(player_base_temp.RightLeg, "right_pants"))),
				false);
		ModelLobisomen lobisomen_model_temp = new ModelLobisomen(Minecraft.getInstance().getEntityModels().bakeLayer(ModelLobisomen.LAYER_LOCATION));
		LOBISOMEN_MODEL = new PlayerModel(new ModelPart(Collections.emptyList(),
				Map.of("head", new ModelPart(Collections.emptyList(), Map.of("head", lobisomen_model_temp.head, "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))), "body", getPlayerPart(lobisomen_model_temp.Body, "jacket"),
						"left_arm", getPlayerPart(lobisomen_model_temp.LeftArm, "left_sleeve"), "right_arm", getPlayerPart(lobisomen_model_temp.RightArm, "right_sleeve"), "left_leg", getPlayerPart(lobisomen_model_temp.LeftLeg, "left_pants"),
						"right_leg", getPlayerPart(lobisomen_model_temp.RightLeg, "right_pants"))),
				false);
	}

	private static ModelPart getPlayerPart(ModelPart modelPart, String child) {
		Map<String, ModelPart> oldChildren = modelPart.children;
		Map<String, ModelPart> newChildren = new HashMap<>(oldChildren);
		newChildren.put(child, new ModelPart(Collections.emptyList(), Collections.emptyMap()));
		modelPart.children = Collections.unmodifiableMap(newChildren);
		return modelPart;
	}
}