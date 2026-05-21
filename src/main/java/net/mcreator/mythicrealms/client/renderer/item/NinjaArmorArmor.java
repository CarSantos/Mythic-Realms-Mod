package net.mcreator.mythicrealms.client.renderer.item;

import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.Minecraft;

import net.mcreator.mythicrealms.init.MythicrealmsModItems;
import net.mcreator.mythicrealms.client.model.ModelArmor_Ninja;

import java.util.Map;
import java.util.Collections;

@EventBusSubscriber(Dist.CLIENT)
public class NinjaArmorArmor {
	@SubscribeEvent
	public static void registerItemExtensions(RegisterClientExtensionsEvent event) {
		event.registerItem(new IClientItemExtensions() {
			private HumanoidModel armorModel = null;

			@Override
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				if (armorModel == null) {
					armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(), Map.of("head",
							new ModelPart(Collections.emptyList(),
									Map.of("head", new ModelArmor_Ninja(Minecraft.getInstance().getEntityModels().bakeLayer(ModelArmor_Ninja.LAYER_LOCATION)).Helmet, "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))),
							"body", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
				}
				return armorModel;
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("mythicrealms:textures/entities/armor_nnja.png");
			}
		}, MythicrealmsModItems.NINJA_ARMOR_HELMET.get());
		event.registerItem(new IClientItemExtensions() {
			private HumanoidModel armorModel = null;

			@Override
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				if (armorModel == null) {
					ModelArmor_Ninja model = new ModelArmor_Ninja(Minecraft.getInstance().getEntityModels().bakeLayer(ModelArmor_Ninja.LAYER_LOCATION));
					armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
							Map.of("body", model.Chestplate, "left_arm", model.LeftPlate, "right_arm", model.RightPlate, "head", new ModelPart(Collections.emptyList(), Map.of("hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))),
									"right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
				}
				return armorModel;
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("mythicrealms:textures/entities/armor_nnja.png");
			}
		}, MythicrealmsModItems.NINJA_ARMOR_CHESTPLATE.get());
		event.registerItem(new IClientItemExtensions() {
			private HumanoidModel armorModel = null;

			@Override
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				if (armorModel == null) {
					ModelArmor_Ninja model = new ModelArmor_Ninja(Minecraft.getInstance().getEntityModels().bakeLayer(ModelArmor_Ninja.LAYER_LOCATION));
					armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
							Map.of("left_leg", model.LeftLegging, "right_leg", model.RightLegging, "head", new ModelPart(Collections.emptyList(), Map.of("hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))), "body",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
				}
				return armorModel;
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("mythicrealms:textures/entities/armor_nnja.png");
			}
		}, MythicrealmsModItems.NINJA_ARMOR_LEGGINGS.get());
		event.registerItem(new IClientItemExtensions() {
			private HumanoidModel armorModel = null;

			@Override
			public HumanoidModel getHumanoidArmorModel(ItemStack itemStack, EquipmentClientInfo.LayerType layerType, Model original) {
				if (armorModel == null) {
					ModelArmor_Ninja model = new ModelArmor_Ninja(Minecraft.getInstance().getEntityModels().bakeLayer(ModelArmor_Ninja.LAYER_LOCATION));
					armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
							Map.of("left_leg", model.LeftBoots, "right_leg", model.RightBoots, "head", new ModelPart(Collections.emptyList(), Map.of("hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()))), "body",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
				}
				return armorModel;
			}

			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("mythicrealms:textures/entities/armor_nnja.png");
			}
		}, MythicrealmsModItems.NINJA_ARMOR_BOOTS.get());
	}
}