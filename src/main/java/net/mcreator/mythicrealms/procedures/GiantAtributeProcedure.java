package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;

public class GiantAtributeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
			_livingEntity0.getAttribute(Attributes.MAX_HEALTH).setBaseValue(40);
		if (entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
			_livingEntity1.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(8);
		if (entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(Attributes.ARMOR))
			_livingEntity2.getAttribute(Attributes.ARMOR).setBaseValue(5);
		if (entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
			_livingEntity3.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.05);
		if (entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(Attributes.SCALE))
			_livingEntity4.getAttribute(Attributes.SCALE).setBaseValue(2);
		if (entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce > 100) {
			{
				MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
				_vars.soulforceRegen = 0;
				_vars.markSyncDirty();
			}
		} else {
			{
				MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
				_vars.soulforceRegen = 0.001;
				_vars.markSyncDirty();
			}
		}
	}
}