package net.mcreator.mythicrealms.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class SteelSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 256, 8f, 0, 22, TagKey.create(Registries.ITEM, ResourceLocation.parse("mythicrealms:steel_sword_repair_items")));

	public SteelSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 5.5f, -2.4f));
	}
}