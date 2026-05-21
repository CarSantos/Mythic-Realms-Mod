package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.mythicrealms.init.MythicrealmsModItems;

import java.util.Calendar;

public class PumpkinHeadEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Calendar.getInstance().get(Calendar.MONTH) == 10 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 31) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MythicrealmsModItems.PUMPKIN_STAFF.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.PUMPKIN));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}