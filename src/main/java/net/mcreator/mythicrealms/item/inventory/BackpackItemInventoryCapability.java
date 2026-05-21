package net.mcreator.mythicrealms.item.inventory;

import net.neoforged.neoforge.items.ComponentItemHandler;
import net.neoforged.neoforge.event.entity.item.ItemTossEvent;
import net.neoforged.neoforge.common.MutableDataComponentHolder;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.component.DataComponents;

import net.mcreator.mythicrealms.world.inventory.BackpackMenu;
import net.mcreator.mythicrealms.init.MythicrealmsModItems;

import javax.annotation.Nonnull;

@EventBusSubscriber
public class BackpackItemInventoryCapability extends ComponentItemHandler {
	@SubscribeEvent
	public static void onItemDropped(ItemTossEvent event) {
		if (event.getEntity().getItem().getItem() == MythicrealmsModItems.BACKPACK_ITEM.get()) {
			Player player = event.getPlayer();
			if (player.containerMenu instanceof BackpackMenu)
				player.closeContainer();
		}
	}

	public BackpackItemInventoryCapability(MutableDataComponentHolder parent) {
		super(parent, DataComponents.CONTAINER, 27);
	}

	@Override
	public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
		return stack.getItem() != MythicrealmsModItems.BACKPACK_ITEM.get();
	}

	@Override
	public ItemStack getStackInSlot(int slot) {
		return super.getStackInSlot(slot).copy();
	}
}