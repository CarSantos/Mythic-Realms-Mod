package net.mcreator.mythicrealms.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class SteelShovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 660, 9f, 0, 22, TagKey.create(Registries.ITEM, ResourceLocation.parse("mythicrealms:steel_shovel_repair_items")));

	public SteelShovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 1.5f, -3f, properties);
	}
}