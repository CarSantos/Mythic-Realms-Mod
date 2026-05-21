package net.mcreator.mythicrealms.item;

import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import java.util.Map;

public abstract class DemonArmorItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(20, Map.of(ArmorType.BOOTS, 4, ArmorType.LEGGINGS, 8, ArmorType.CHESTPLATE, 11, ArmorType.HELMET, 4, ArmorType.BODY, 11), 25,
			DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("item.armor.equip_netherite")), 1f, 0.1f, TagKey.create(Registries.ITEM, ResourceLocation.parse("mythicrealms:demon_armor_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("mythicrealms:demon_armor")));

	private DemonArmorItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends DemonArmorItem {
		public Helmet(Item.Properties properties) {
			super(properties.fireResistant().humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET));
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}
	}

	public static class Chestplate extends DemonArmorItem {
		public Chestplate(Item.Properties properties) {
			super(properties.fireResistant().humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE));
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}
	}

	public static class Leggings extends DemonArmorItem {
		public Leggings(Item.Properties properties) {
			super(properties.fireResistant().humanoidArmor(ARMOR_MATERIAL, ArmorType.LEGGINGS));
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}
	}

	public static class Boots extends DemonArmorItem {
		public Boots(Item.Properties properties) {
			super(properties.fireResistant().humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS));
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}
	}
}