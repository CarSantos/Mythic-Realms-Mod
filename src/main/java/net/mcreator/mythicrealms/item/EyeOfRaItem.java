package net.mcreator.mythicrealms.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EyeOfRaItem extends Item {
	public EyeOfRaItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).stacksTo(1));
	}
}