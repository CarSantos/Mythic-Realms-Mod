package net.mcreator.mythicrealms.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.BlockPos;

import net.mcreator.mythicrealms.init.MythicrealmsModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class OceanPortalOpenProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != InteractionHand.MAIN_HAND)
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.HEART_OF_THE_SEA && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == MythicrealmsModBlocks.WATER_STONE.get()
				&& (world.getBlockState(BlockPos.containing(x, y + 6, z))).getBlock() == MythicrealmsModBlocks.WATER_STONE.get() && (world.getBlockState(BlockPos.containing(x + 2, y + 1, z))).getBlock() == MythicrealmsModBlocks.WATER_STONE.get()
				&& (world.getBlockState(BlockPos.containing(x - 2, y + 1, z))).getBlock() == MythicrealmsModBlocks.WATER_STONE.get() && (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == MythicrealmsModBlocks.WATER_STONE.get()
				&& (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == MythicrealmsModBlocks.WATER_STONE.get() && (world.getBlockState(BlockPos.containing(x + 1, y + 6, z))).getBlock() == MythicrealmsModBlocks.WATER_STONE.get()
				&& (world.getBlockState(BlockPos.containing(x - 1, y + 6, z))).getBlock() == MythicrealmsModBlocks.WATER_STONE.get() && (world.getBlockState(BlockPos.containing(x + 2, y + 2, z))).getBlock() == MythicrealmsModBlocks.WATER_STONE.get()
				&& (world.getBlockState(BlockPos.containing(x - 2, y + 2, z))).getBlock() == MythicrealmsModBlocks.WATER_STONE.get() && (world.getBlockState(BlockPos.containing(x + 2, y + 3, z))).getBlock() == MythicrealmsModBlocks.WATER_STONE.get()
				&& (world.getBlockState(BlockPos.containing(x - 2, y + 3, z))).getBlock() == MythicrealmsModBlocks.WATER_STONE.get() && (world.getBlockState(BlockPos.containing(x + 2, y + 4, z))).getBlock() == MythicrealmsModBlocks.WATER_STONE.get()
				&& (world.getBlockState(BlockPos.containing(x - 2, y + 4, z))).getBlock() == MythicrealmsModBlocks.WATER_STONE.get() && (world.getBlockState(BlockPos.containing(x + 2, y + 5, z))).getBlock() == MythicrealmsModBlocks.WATER_STONE.get()
				&& (world.getBlockState(BlockPos.containing(x - 2, y + 5, z))).getBlock() == MythicrealmsModBlocks.WATER_STONE.get()) {
			world.setBlock(BlockPos.containing(x + 1, y + 1, z), MythicrealmsModBlocks.OCEAN_PORTAL.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 1, z), MythicrealmsModBlocks.OCEAN_PORTAL.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 1, y + 1, z), MythicrealmsModBlocks.OCEAN_PORTAL.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 1, y + 2, z), MythicrealmsModBlocks.OCEAN_PORTAL.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 2, z), MythicrealmsModBlocks.OCEAN_PORTAL.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 1, y + 2, z), MythicrealmsModBlocks.OCEAN_PORTAL.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 1, y + 3, z), MythicrealmsModBlocks.OCEAN_PORTAL.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 3, z), MythicrealmsModBlocks.OCEAN_PORTAL.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 1, y + 3, z), MythicrealmsModBlocks.OCEAN_PORTAL.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 1, y + 4, z), MythicrealmsModBlocks.OCEAN_PORTAL.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 4, z), MythicrealmsModBlocks.OCEAN_PORTAL.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 1, y + 4, z), MythicrealmsModBlocks.OCEAN_PORTAL.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + 1, y + 5, z), MythicrealmsModBlocks.OCEAN_PORTAL.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 5, z), MythicrealmsModBlocks.OCEAN_PORTAL.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - 1, y + 5, z), MythicrealmsModBlocks.OCEAN_PORTAL.get().defaultBlockState(), 3);
		}
	}
}