package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class PumpkinProjectileProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.CARVED_PUMPKIN.defaultBlockState(), 3);
	}
}