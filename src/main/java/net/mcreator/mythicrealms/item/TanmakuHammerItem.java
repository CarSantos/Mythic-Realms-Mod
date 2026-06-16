package net.mcreator.mythicrealms.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.mythicrealms.procedures.ExpellMagicProcedure;

public class TanmakuHammerItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1024, 4f, 0, 50, TagKey.create(Registries.ITEM, ResourceLocation.parse("mythicrealms:tanmaku_hammer_repair_items")));

	public TanmakuHammerItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 11f, -2.4f));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		ExpellMagicProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}