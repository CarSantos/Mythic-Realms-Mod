package net.mcreator.mythicrealms.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class WaterStoneBlock extends Block {
	public WaterStoneBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GRAVEL).strength(-1, 3600000).lightLevel(s -> 6));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}