package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.mythicrealms.init.MythicrealmsModMobEffects;

public class PandemicPlayerCollidesWithThisEntityProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MythicrealmsModMobEffects.PLAGUE, 600, 1));
	}
}