package net.mcreator.mythicrealms.procedures;

import net.neoforged.neoforge.common.NeoForgeMod;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class HippocampusOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
			_livingEntity1.getAttribute(Attributes.MAX_HEALTH).setBaseValue((Mth.nextInt(RandomSource.create(), 15, 30)));
		if (entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(Attributes.OXYGEN_BONUS))
			_livingEntity2.getAttribute(Attributes.OXYGEN_BONUS).setBaseValue(512);
		if (entity instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(NeoForgeMod.SWIM_SPEED))
			_livingEntity5.getAttribute(NeoForgeMod.SWIM_SPEED)
					.setBaseValue(((entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(NeoForgeMod.SWIM_SPEED) ? _livingEntity3.getAttribute(NeoForgeMod.SWIM_SPEED).getBaseValue() : 0)
							+ Mth.nextInt(RandomSource.create(), 1, 2)));
		if (entity instanceof LivingEntity _livingEntity7 && _livingEntity7.getAttributes().hasAttribute(Attributes.WATER_MOVEMENT_EFFICIENCY))
			_livingEntity7.getAttribute(Attributes.WATER_MOVEMENT_EFFICIENCY).setBaseValue((Mth.nextInt(RandomSource.create(), (int) 0.5, 1)));
	}
}