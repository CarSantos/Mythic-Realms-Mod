package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import net.mcreator.mythicrealms.init.MythicrealmsModMobEffects;

public class ChimeraGunWhileBaubleIsEquippedTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MobEffects.POISON) || entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(MythicrealmsModMobEffects.ZOMBIE)
				|| entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(MythicrealmsModMobEffects.RADIATION) || entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(MythicrealmsModMobEffects.PLAGUE)) {
			entity.invulnerableTime = 200;
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MythicrealmsModMobEffects.PLAGUE);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MythicrealmsModMobEffects.RADIATION);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MythicrealmsModMobEffects.ZOMBIE);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.BLINDNESS);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.DARKNESS);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.HUNGER);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.MINING_FATIGUE);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.NAUSEA);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.POISON);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.UNLUCK);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.WEAKNESS);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.WITHER);
		}
	}
}