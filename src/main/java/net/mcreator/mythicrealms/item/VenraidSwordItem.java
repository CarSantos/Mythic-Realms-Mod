package net.mcreator.mythicrealms.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.mythicrealms.procedures.VenraidSwordToolInInventoryTickProcedure;

import javax.annotation.Nullable;

public class VenraidSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 512, 4f, 0, 20, TagKey.create(Registries.ITEM, ResourceLocation.parse("mythicrealms:venraid_sword_repair_items")));

	public VenraidSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 11f, -2.6f));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, ServerLevel world, Entity entity, @Nullable EquipmentSlot equipmentSlot) {
		super.inventoryTick(itemstack, world, entity, equipmentSlot);
		VenraidSwordToolInInventoryTickProcedure.execute(world, itemstack);
	}
}