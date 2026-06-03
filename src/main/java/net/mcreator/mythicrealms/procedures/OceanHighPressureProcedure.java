package net.mcreator.mythicrealms.procedures;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.mythicrealms.init.MythicrealmsModMobEffects;

import javax.annotation.Nullable;

@EventBusSubscriber
public class OceanHighPressureProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (getEntitySubmergedHeight(entity) >= 30 && entity.isInWater() && entity instanceof Player
				&& (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("cold_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_cold_ocean"))
						|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_frozen_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_lukewarm_ocean"))
						|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("frozen_ocean"))
						|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("lukewarm_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("ocean"))
						|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("warm_ocean")))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MythicrealmsModMobEffects.HIGH_PRESSURE, 20, 1, false, false));
		}
	}

	private static double getEntitySubmergedHeight(Entity entity) {
		for (FluidType fluidType : NeoForgeRegistries.FLUID_TYPES) {
			if (entity.level().getFluidState(entity.blockPosition()).getFluidType() == fluidType)
				return entity.getFluidTypeHeight(fluidType);
		}
		return 0;
	}
}