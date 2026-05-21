package net.mcreator.mythicrealms.item;

import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.network.chat.Component;

import java.util.function.Consumer;

public class BarrierMagicBookItem extends Item {
	public BarrierMagicBookItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).stacksTo(1).food((new FoodProperties.Builder()).nutrition(0).saturationModifier(0f).build()).usingConvertsTo(Items.BOOK));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
		componentConsumer.accept(Component.translatable("item.mythicrealms.barrier_magic_book.description_0"));
	}
}