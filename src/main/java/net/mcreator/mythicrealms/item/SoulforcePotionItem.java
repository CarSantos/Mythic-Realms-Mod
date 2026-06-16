package net.mcreator.mythicrealms.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.mythicrealms.procedures.SoulforcePotionPlayerFinishesUsingItemProcedure;

public class SoulforcePotionItem extends Item {
	public SoulforcePotionItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(0).saturationModifier(0f).build()).usingConvertsTo(Items.GLASS_BOTTLE));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		SoulforcePotionPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}