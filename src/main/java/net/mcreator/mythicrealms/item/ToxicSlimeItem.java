package net.mcreator.mythicrealms.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import net.mcreator.mythicrealms.procedures.ToxicSlimeRightclickedProcedure;

public class ToxicSlimeItem extends Item {
	public ToxicSlimeItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		ToxicSlimeRightclickedProcedure.execute(entity);
		return ar;
	}
}