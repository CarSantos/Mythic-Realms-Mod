package net.mcreator.mythicrealms.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.mythicrealms.procedures.HighPressureOnEffectActiveTickProcedure;

public class HighPressureMobEffect extends MobEffect {
	public HighPressureMobEffect() {
		super(MobEffectCategory.HARMFUL, -9605779);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
		HighPressureOnEffectActiveTickProcedure.execute(entity);
		return super.applyEffectTick(level, entity, amplifier);
	}
}