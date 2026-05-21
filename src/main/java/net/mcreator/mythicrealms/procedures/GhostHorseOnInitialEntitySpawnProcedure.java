package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class GhostHorseOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
			_livingEntity1.getAttribute(Attributes.MAX_HEALTH).setBaseValue((Mth.nextInt(RandomSource.create(), 15, 30)));
		if (entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
			_livingEntity3.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue((Mth.nextInt(RandomSource.create(), (int) 0.3, (int) 0.4)));
		if (entity instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(Attributes.JUMP_STRENGTH))
			_livingEntity5.getAttribute(Attributes.JUMP_STRENGTH).setBaseValue((Mth.nextInt(RandomSource.create(), (int) 0.4, 1)));
	}
}