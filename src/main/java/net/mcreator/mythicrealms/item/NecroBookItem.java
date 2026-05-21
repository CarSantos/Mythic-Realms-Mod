package net.mcreator.mythicrealms.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.mythicrealms.procedures.NecroBookItemIsDroppedByPlayerProcedure;
import net.mcreator.mythicrealms.procedures.NecroBookItemInInventoryTickProcedure;

import javax.annotation.Nullable;

public class NecroBookItem extends Item {
	public NecroBookItem(Item.Properties properties) {
		super(properties.stacksTo(16));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, ServerLevel world, Entity entity, @Nullable EquipmentSlot equipmentSlot) {
		super.inventoryTick(itemstack, world, entity, equipmentSlot);
		NecroBookItemInInventoryTickProcedure.execute(entity);
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
		NecroBookItemIsDroppedByPlayerProcedure.execute(entity);
		return true;
	}
}