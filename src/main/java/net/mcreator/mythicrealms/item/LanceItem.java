package net.mcreator.mythicrealms.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.mythicrealms.procedures.LanceRightClickProcedure;

public class LanceItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 512, 4f, 0, 20, TagKey.create(Registries.ITEM, ResourceLocation.parse("mythicrealms:lance_repair_items")));

	public LanceItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 8f, -2.5f));
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		LanceRightClickProcedure.execute(entity);
		return ar;
	}
}