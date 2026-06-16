package net.mcreator.mythicrealms.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DivineIngotItem extends Item {
	public DivineIngotItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}