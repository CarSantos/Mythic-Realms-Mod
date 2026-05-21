package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.mythicrealms.init.MythicrealmsModItems;

public class EgyptianSwordToolInInventoryTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (hasEntityInInventory(entity, new ItemStack(MythicrealmsModItems.SCARAB_GEM.get()))) {
			itemstack.setDamageValue((int) (itemstack.getDamageValue() - 0.1));
		}
	}

	private static boolean hasEntityInInventory(Entity entity, ItemStack itemstack) {
		if (entity instanceof Player player)
			return player.getInventory().contains(stack -> !stack.isEmpty() && ItemStack.isSameItem(stack, itemstack));
		return false;
	}
}