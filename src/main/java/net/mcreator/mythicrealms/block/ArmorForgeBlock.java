package net.mcreator.mythicrealms.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class ArmorForgeBlock extends Block {
	public ArmorForgeBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GRAVEL).strength(1.05f, 10f).lightLevel(s -> 2).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).instrument(NoteBlockInstrument.HAT));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.or(box(1, 1, 1, 4, 8, 15), box(12, 1, 1, 15, 8, 15), box(1, 8, 1, 15, 10, 15), box(1, 0.1, 1, 15, 2.1, 15), box(0.8, 0.8, 0.8, 15.2, 3.2, 14.2), box(1.3, 0, 4.8, 14.7, 10.4, 15.2), box(14.4, -0.1, 0.9, 15.6, 10.1, 15.1),
				box(11.4, 1.9, 0.9, 12.6, 7.1, 15.1), box(3.4, 1.9, 0.9, 4.6, 7.1, 15.1), box(5.5, 2, 1.2, 6.5, 7, 2.2), box(7.5, 2, 1.2, 8.5, 7, 2.2), box(9.5, 2, 1.2, 10.5, 7, 2.2), box(2.85, 6.85, 0.85, 13.15, 8.15, 15.15),
				box(0.4, -0.1, 0.9, 1.6, 10.1, 15.1), box(0, 10, 0, 16, 12, 16), box(3, 10, 3, 13, 13, 13), box(11, 10, 4, 12, 16, 12), box(5, 10, 4, 11, 16, 5), box(5, 10, 11, 11, 16, 12), box(4, 10, 4, 5, 16, 12));
	}
}