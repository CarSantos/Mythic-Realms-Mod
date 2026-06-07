package net.mcreator.mythicrealms.block;

import net.minecraft.world.level.redstone.Orientation;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.mythicrealms.procedures.BloodNeighbourBlockChangesProcedure;
import net.mcreator.mythicrealms.init.MythicrealmsModFluids;

import javax.annotation.Nullable;

public class BloodBlock extends LiquidBlock {
	public BloodBlock(BlockBehaviour.Properties properties) {
		super(MythicrealmsModFluids.BLOOD.get(), properties.mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, @Nullable Orientation orientation, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, orientation, moving);
		BloodNeighbourBlockChangesProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}