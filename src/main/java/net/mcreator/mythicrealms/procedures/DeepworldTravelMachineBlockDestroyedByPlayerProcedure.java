package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.mythicrealms.MythicrealmsMod;

public class DeepworldTravelMachineBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y + 3, z), Blocks.AIR.defaultBlockState(), 3);
		MythicrealmsMod.queueServerWork(100, () -> {
			world.setBlock(BlockPos.containing(x, y + 2, z), Blocks.AIR.defaultBlockState(), 3);
			MythicrealmsMod.queueServerWork(100, () -> {
				world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
			});
		});
	}
}