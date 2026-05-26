package net.mcreator.mythicrealms.item;

import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.component.UseRemainder;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.core.component.DataComponents;

import net.mcreator.mythicrealms.init.MythicrealmsModItems;

@EventBusSubscriber
public class ManaPotionItem extends Item {
	public ManaPotionItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).stacksTo(1).food((new FoodProperties.Builder()).nutrition(0).saturationModifier(0f).build(), Consumables.DEFAULT_DRINK));
	}

	@SubscribeEvent
	public static void modifyItemComponents(ModifyDefaultComponentsEvent event) {
		event.modify(MythicrealmsModItems.MANA_POTION.get(), builder -> builder.set(DataComponents.USE_REMAINDER, new UseRemainder(new ItemStack(MythicrealmsModItems.MANA_BOTTLE.get()))));
	}
}