package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.mythicrealms.init.MythicrealmsModMobEffects;

public class BloodPotionsEveryTickWhileUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MythicrealmsModMobEffects.VAMPIRE_EFFECT, (int) Double.POSITIVE_INFINITY, 1, false, false));
	}
}