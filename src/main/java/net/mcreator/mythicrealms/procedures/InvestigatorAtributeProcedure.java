package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class InvestigatorAtributeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
			_livingEntity0.getAttribute(Attributes.MAX_HEALTH).setBaseValue(20);
		if (entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
			_livingEntity1.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(5);
		if (entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(Attributes.ARMOR))
			_livingEntity2.getAttribute(Attributes.ARMOR).setBaseValue(4);
		if (entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
			_livingEntity3.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.4);
		if (entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(Attributes.SCALE))
			_livingEntity4.getAttribute(Attributes.SCALE).setBaseValue(0.9);
		for (Entity entityiterator : world.getEntities(entity, new AABB((x + 10), (y + 10), (z + 10), (x - 4), (y - 4), (z - 4)))) {
			if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 200, 1));
		}
	}
}