package net.mcreator.mythicrealms.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class GlaciteOreBlock extends Block {
	public GlaciteOreBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GLASS).strength(5f, 50f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}