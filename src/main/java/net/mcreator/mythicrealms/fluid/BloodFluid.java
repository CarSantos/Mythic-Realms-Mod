package net.mcreator.mythicrealms.fluid;

import org.apache.logging.log4j.core.util.Source;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.mythicrealms.init.MythicrealmsModItems;
import net.mcreator.mythicrealms.init.MythicrealmsModFluids;
import net.mcreator.mythicrealms.init.MythicrealmsModFluidTypes;
import net.mcreator.mythicrealms.init.MythicrealmsModBlocks;

public abstract class BloodFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> MythicrealmsModFluidTypes.BLOOD_TYPE.get(), () -> MythicrealmsModFluids.BLOOD.get(), () -> MythicrealmsModFluids.FLOWING_BLOOD.get())
			.explosionResistance(100f).bucket(() -> MythicrealmsModItems.BLOOD_BUCKET.get()).block(() -> (LiquidBlock) MythicrealmsModBlocks.BLOOD.get());

	private BloodFluid() {
		super(PROPERTIES);
	}

	public static class Source extends BloodFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends BloodFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}