/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mythicrealms.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.mythicrealms.fluid.types.BloodFluidType;
import net.mcreator.mythicrealms.MythicrealmsMod;

public class MythicrealmsModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, MythicrealmsMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> BLOOD_TYPE = REGISTRY.register("blood", () -> new BloodFluidType());
}