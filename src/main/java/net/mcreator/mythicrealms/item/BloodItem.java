package net.mcreator.mythicrealms.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.mythicrealms.init.MythicrealmsModFluids;

public class BloodItem extends BucketItem {
	public BloodItem(Item.Properties properties) {
		super(MythicrealmsModFluids.BLOOD.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}
}