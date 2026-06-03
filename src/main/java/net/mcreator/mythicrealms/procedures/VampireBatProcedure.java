package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.Minecraft;

import net.mcreator.mythicrealms.init.MythicrealmsModMobEffects;
import net.mcreator.mythicrealms.init.MythicrealmsModKeyMappings;

public class VampireBatProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MythicrealmsModMobEffects.VAMPIRE_EFFECT) && MythicrealmsModKeyMappings.VAMPIRE_BAT_FORM.isDown() && Minecraft.getInstance().options.keyJump.isDown()) {
			entity.push((entity.getLookAngle().x * 0.05), (entity.getLookAngle().y * 0.05), (entity.getLookAngle().z * 0.05));
		}
	}
}