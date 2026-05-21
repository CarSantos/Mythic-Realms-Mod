package net.mcreator.mythicrealms.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class SteelAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 660, 8f, 0, 28, TagKey.create(Registries.ITEM, ResourceLocation.parse("mythicrealms:steel_axe_repair_items")));

	public SteelAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 8f, -3f, properties);
	}
}