package net.mcreator.mythicrealms.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class MagneticRockBlock extends Block {
	public MagneticRockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GRAVEL).strength(10f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}