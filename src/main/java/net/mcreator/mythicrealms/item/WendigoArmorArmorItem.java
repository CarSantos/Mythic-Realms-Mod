package net.mcreator.mythicrealms.item;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;

import java.util.Map;

public abstract class WendigoArmorArmorItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(32, Map.of(ArmorType.BOOTS, 5, ArmorType.LEGGINGS, 7, ArmorType.CHESTPLATE, 10, ArmorType.HELMET, 5, ArmorType.BODY, 10), 30,
			BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.EMPTY), 0.2f, 0f, TagKey.create(Registries.ITEM, ResourceLocation.parse("mythicrealms:wendigo_armor_armor_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("mythicrealms:wendigo_armor_armor")));

	private WendigoArmorArmorItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends WendigoArmorArmorItem {
		public Helmet(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET));
		}
	}

	public static class Chestplate extends WendigoArmorArmorItem {
		public Chestplate(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE));
		}
	}

	public static class Leggings extends WendigoArmorArmorItem {
		public Leggings(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.LEGGINGS));
		}
	}

	public static class Boots extends WendigoArmorArmorItem {
		public Boots(Item.Properties properties) {
			super(properties.humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS));
		}
	}
}