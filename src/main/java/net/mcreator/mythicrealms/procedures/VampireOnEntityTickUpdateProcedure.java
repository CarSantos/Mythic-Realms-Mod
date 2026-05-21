package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class VampireOnEntityTickUpdateProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return false;
		if (world.dimensionType().moonPhase(world.dayTime()) == 1) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 1, false, false));
			return false;
		} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("mythicrealms:darkness_plains")) == true || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("mythicrealms:darkness_forest")) == true) {
			if (entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(Attributes.BURNING_TIME))
				_livingEntity4.getAttribute(Attributes.BURNING_TIME).setBaseValue(0);
			return false;
		}
		return false;
	}
}