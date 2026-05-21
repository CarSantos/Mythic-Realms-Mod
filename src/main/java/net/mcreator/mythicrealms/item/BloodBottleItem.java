package net.mcreator.mythicrealms.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.mythicrealms.procedures.BloodBottleEveryTickWhileUsingItemProcedure;

public class BloodBottleItem extends Item {
	public BloodBottleItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(2).saturationModifier(1f).build()).usingConvertsTo(Items.GLASS_BOTTLE));
	}

	@Override
	public void onUseTick(Level world, LivingEntity entity, ItemStack itemstack, int time) {
		BloodBottleEveryTickWhileUsingItemProcedure.execute(entity);
	}
}