package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.mythicrealms.init.MythicrealmsModBlocks;
import net.mcreator.mythicrealms.MythicrealmsMod;

public class DeepworldTravelMachineOnBlockRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.DIAMOND);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			world.setBlock(BlockPos.containing(x, y + 1, z), MythicrealmsModBlocks.DEEPWORLD_PORTAL.get().defaultBlockState(), 3);
			MythicrealmsMod.queueServerWork(100, () -> {
				world.setBlock(BlockPos.containing(x, y + 2, z), MythicrealmsModBlocks.DEEPWORLD_PORTAL.get().defaultBlockState(), 3);
				MythicrealmsMod.queueServerWork(100, () -> {
					world.setBlock(BlockPos.containing(x, y + 3, z), Blocks.BEDROCK.defaultBlockState(), 3);
				});
			});
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You need diamond to active the portal"), false);
		}
	}
}