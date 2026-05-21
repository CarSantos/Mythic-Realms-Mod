package net.mcreator.mythicrealms.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.PressurePlateBlock;

public class BloodPressurePlateBlock extends PressurePlateBlock {
	public BloodPressurePlateBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.OAK, properties.sound(SoundType.WOOD).strength(0.5f).noCollission().pushReaction(PushReaction.DESTROY).ignitedByLava().instrument(NoteBlockInstrument.BASS).forceSolidOn());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}
}