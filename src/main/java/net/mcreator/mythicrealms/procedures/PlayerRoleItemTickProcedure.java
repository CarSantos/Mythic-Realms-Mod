package net.mcreator.mythicrealms.procedures;

import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.mythicrealms.init.MythicrealmsModItems;

public class PlayerRoleItemTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (hasEntityInInventory(entity, new ItemStack(MythicrealmsModItems.PLAYER_ROLE.get()))) {
			if (!((getItemStackFromItemStackSlot(0, new ItemStack(MythicrealmsModItems.PLAYER_ROLE.get()))).getItem() == ItemStack.EMPTY.getItem())) {
				if ((getItemStackFromItemStackSlot(0, new ItemStack(MythicrealmsModItems.PLAYER_ROLE.get()))).getItem() == MythicrealmsModItems.TANK_ROLE.get()) {
					TankAtributeProcedure.execute(entity);
				} else if ((getItemStackFromItemStackSlot(0, new ItemStack(MythicrealmsModItems.PLAYER_ROLE.get()))).getItem() == MythicrealmsModItems.GIANT_ROLE.get()) {
					GiantAtributeProcedure.execute(entity);
				} else if ((getItemStackFromItemStackSlot(0, new ItemStack(MythicrealmsModItems.PLAYER_ROLE.get()))).getItem() == MythicrealmsModItems.GUARDIAN_ROLE.get()) {
					GuardianAtributeProcedure.execute(entity);
				} else if ((getItemStackFromItemStackSlot(0, new ItemStack(MythicrealmsModItems.PLAYER_ROLE.get()))).getItem() == MythicrealmsModItems.BARBARIAN_ROLE.get()) {
					BarbarianAtributeProcedure.execute(entity);
				} else if ((getItemStackFromItemStackSlot(0, new ItemStack(MythicrealmsModItems.PLAYER_ROLE.get()))).getItem() == MythicrealmsModItems.ASSASSIN_ROLE.get()) {
					AssassinAtributeProcedure.execute(entity);
				} else if ((getItemStackFromItemStackSlot(0, new ItemStack(MythicrealmsModItems.PLAYER_ROLE.get()))).getItem() == MythicrealmsModItems.SOLDIER_ROLE.get()) {
					SoldierAtributeProcedure.execute(entity);
				} else if ((getItemStackFromItemStackSlot(0, new ItemStack(MythicrealmsModItems.PLAYER_ROLE.get()))).getItem() == MythicrealmsModItems.INVESTIGATOR_ROLE.get()) {
					InvestigatorAtributeProcedure.execute(world, x, y, z, entity);
				} else if ((getItemStackFromItemStackSlot(0, new ItemStack(MythicrealmsModItems.PLAYER_ROLE.get()))).getItem() == MythicrealmsModItems.HUNTER_ROLE.get()) {
					HunterAtributeProcedure.execute(entity);
				} else if ((getItemStackFromItemStackSlot(0, new ItemStack(MythicrealmsModItems.PLAYER_ROLE.get()))).getItem() == MythicrealmsModItems.MONK_ROLE.get()) {
					MonkAtributeProcedure.execute(entity);
				} else if ((getItemStackFromItemStackSlot(0, new ItemStack(MythicrealmsModItems.PLAYER_ROLE.get()))).getItem() == MythicrealmsModItems.SUMMONER_ROLE.get()) {
					SummonerAtributeProcedure.execute(entity);
				} else if ((getItemStackFromItemStackSlot(0, new ItemStack(MythicrealmsModItems.PLAYER_ROLE.get()))).getItem() == MythicrealmsModItems.DRUID_ROLE.get()) {
					DruidAtributeProcedure.execute(entity);
				}
			} else {
				BasicHumanProcedure.execute(entity);
			}
		}
	}

	private static boolean hasEntityInInventory(Entity entity, ItemStack itemstack) {
		if (entity instanceof Player player)
			return player.getInventory().contains(stack -> !stack.isEmpty() && ItemStack.isSameItem(stack, itemstack));
		return false;
	}

	private static ItemStack getItemStackFromItemStackSlot(int slotID, ItemStack itemStack) {
		IItemHandler itemHandler = itemStack.getCapability(Capabilities.ItemHandler.ITEM, null);
		if (itemHandler != null)
			return itemHandler.getStackInSlot(slotID).copy();
		return ItemStack.EMPTY;
	}
}