package net.mcreator.mythicrealms.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.mythicrealms.procedures.CrystalOnTickUpdateProcedure;

public class CrystalBarrierBlockBlock extends Block {
	public CrystalBarrierBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GRAVEL).strength(-1, 3600000).lightLevel(s -> 3));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 3;
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		CrystalOnTickUpdateProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}