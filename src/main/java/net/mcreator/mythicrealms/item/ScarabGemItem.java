package net.mcreator.mythicrealms.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.mythicrealms.procedures.ScarabItemInInventoryTickProcedure;

import javax.annotation.Nullable;

public class ScarabGemItem extends Item {
	public ScarabGemItem(Item.Properties properties) {
		super(properties.stacksTo(1));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, ServerLevel world, Entity entity, @Nullable EquipmentSlot equipmentSlot) {
		super.inventoryTick(itemstack, world, entity, equipmentSlot);
		ScarabItemInInventoryTickProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
	}
}