package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.mythicrealms.init.MythicrealmsModMenus;
import net.mcreator.mythicrealms.init.MythicrealmsModItems;

public class PlayerRoleItemTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MythicrealmsModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem())) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MythicrealmsModMenus.MenuAccessor _menu3 ? _menu3.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == MythicrealmsModItems.TANK_ROLE.get()) {
				TankAtributeProcedure.execute(entity);
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MythicrealmsModMenus.MenuAccessor _menu5 ? _menu5.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == MythicrealmsModItems.GIANT_ROLE
					.get()) {
				GiantAtributeProcedure.execute(entity);
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MythicrealmsModMenus.MenuAccessor _menu7 ? _menu7.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == MythicrealmsModItems.GUARDIAN_ROLE
					.get()) {
				GuardianAtributeProcedure.execute(entity);
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MythicrealmsModMenus.MenuAccessor _menu9 ? _menu9.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == MythicrealmsModItems.BARBARIAN_ROLE
					.get()) {
				BarbarianAtributeProcedure.execute(entity);
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MythicrealmsModMenus.MenuAccessor _menu11 ? _menu11.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == MythicrealmsModItems.ASSASSIN_ROLE
					.get()) {
				AssassinAtributeProcedure.execute(entity);
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MythicrealmsModMenus.MenuAccessor _menu13 ? _menu13.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == MythicrealmsModItems.SOLDIER_ROLE
					.get()) {
				SoldierAtributeProcedure.execute(entity);
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MythicrealmsModMenus.MenuAccessor _menu15 ? _menu15.getSlots().get(0).getItem() : ItemStack.EMPTY)
					.getItem() == MythicrealmsModItems.INVESTIGATOR_ROLE.get()) {
				InvestigatorAtributeProcedure.execute(world, x, y, z, entity);
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MythicrealmsModMenus.MenuAccessor _menu17 ? _menu17.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == MythicrealmsModItems.HUNTER_ROLE
					.get()) {
				HunterAtributeProcedure.execute(entity);
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MythicrealmsModMenus.MenuAccessor _menu19 ? _menu19.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == MythicrealmsModItems.MONK_ROLE
					.get()) {
				MonkAtributeProcedure.execute(entity);
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MythicrealmsModMenus.MenuAccessor _menu21 ? _menu21.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == MythicrealmsModItems.SUMMONER_ROLE
					.get()) {
				SummonerAtributeProcedure.execute(entity);
			} else if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MythicrealmsModMenus.MenuAccessor _menu23 ? _menu23.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == MythicrealmsModItems.DRUID_ROLE
					.get()) {
				DruidAtributeProcedure.execute(entity);
			}
		} else {
			BasicHumanProcedure.execute(entity);
		}
	}
}