package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

public class PumpkinStaffItemInInventoryTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == Blocks.CARVED_PUMPKIN.asItem()) {
			if (entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.HEAD, ItemStack.EMPTY);
			}
		}
	}
}