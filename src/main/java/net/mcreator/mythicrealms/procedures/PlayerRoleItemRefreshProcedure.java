package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.mythicrealms.init.MythicrealmsModMenus;

public class PlayerRoleItemRefreshProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MythicrealmsModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(0).getItem() : ItemStack.EMPTY));
			entityToSpawn.setPickUpDelay(5);
			_level.addFreshEntity(entityToSpawn);
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof MythicrealmsModMenus.MenuAccessor _menu) {
			_menu.getSlots().get(0).remove(1);
			_player.containerMenu.broadcastChanges();
		}
		BasicHumanProcedure.execute(entity);
	}
}