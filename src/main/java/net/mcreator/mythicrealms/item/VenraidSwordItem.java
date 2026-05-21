package net.mcreator.mythicrealms.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class VenraidSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 512, 4f, 0, 20, TagKey.create(Registries.ITEM, ResourceLocation.parse("mythicrealms:venraid_sword_repair_items")));

	public VenraidSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 11f, -2.6f));
	}
}