package net.mcreator.mythicrealms.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.core.BlockPos;

import net.mcreator.mythicrealms.procedures.AntiMagneticRockOnTickUpdateProcedure;

public class AntiMagneticRockBlock extends Block {
	public AntiMagneticRockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GRAVEL).strength(10f).lightLevel(s -> 7).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}

	@Override
	public void setPlacedBy(Level world, BlockPos pos, BlockState blockstate, LivingEntity entity, ItemStack itemstack) {
		super.setPlacedBy(world, pos, blockstate, entity, itemstack);
		AntiMagneticRockOnTickUpdateProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}