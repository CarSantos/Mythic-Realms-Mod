/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mythicrealms.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.mythicrealms.MythicrealmsMod;

public class MythicrealmsModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, MythicrealmsMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> FIRE_MAGIC_PARTICLE = REGISTRY.register("fire_magic_particle", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> SOUL_MAGIC_PARTICLE = REGISTRY.register("soul_magic_particle", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> MUSIC_MAGIC_PARTICLE = REGISTRY.register("music_magic_particle", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> POISON_MAGIC_PARTICLE = REGISTRY.register("poison_magic_particle", () -> new SimpleParticleType(false));
}