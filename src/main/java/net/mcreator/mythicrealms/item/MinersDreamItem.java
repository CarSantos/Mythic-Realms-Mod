package net.mcreator.mythicrealms.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.mythicrealms.procedures.MinersDreamRightclickedOnBlockProcedure;

public class MinersDreamItem extends Item {
	public MinersDreamItem(Item.Properties properties) {
		super(properties.stacksTo(16));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		MinersDreamRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ());
		return InteractionResult.SUCCESS;
	}
}