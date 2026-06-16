package net.mcreator.mythicrealms.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class KatanaItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 512, 4f, 0, 40, TagKey.create(Registries.ITEM, ResourceLocation.parse("mythicrealms:katana_repair_items")));

	public KatanaItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 6f, -3f));
	}
}