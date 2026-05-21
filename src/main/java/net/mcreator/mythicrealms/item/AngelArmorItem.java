package net.mcreator.mythicrealms.item;

import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import java.util.Map;

public abstract class AngelArmorItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(20, Map.of(ArmorType.BOOTS, 6, ArmorType.LEGGINGS, 15, ArmorType.CHESTPLATE, 18, ArmorType.HELMET, 6, ArmorType.BODY, 18), 25,
			DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("item.armor.equip_netherite")), 1f, 0.1f, TagKey.create(Registries.ITEM, ResourceLocation.parse("mythicrealms:angel_armor_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("mythicrealms:angel_armor")));

	private AngelArmorItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends AngelArmorItem {
		public Helmet(Item.Properties properties) {
			super(properties.fireResistant().humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET));
		}
	}

	public static class Chestplate extends AngelArmorItem {
		public Chestplate(Item.Properties properties) {
			super(properties.fireResistant().humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE));
		}
	}

	public static class Leggings extends AngelArmorItem {
		public Leggings(Item.Properties properties) {
			super(properties.fireResistant().humanoidArmor(ARMOR_MATERIAL, ArmorType.LEGGINGS));
		}
	}

	public static class Boots extends AngelArmorItem {
		public Boots(Item.Properties properties) {
			super(properties.fireResistant().humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS));
		}
	}
}