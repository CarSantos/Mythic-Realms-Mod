package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;

public class SummonerAtributeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
			_livingEntity0.getAttribute(Attributes.MAX_HEALTH).setBaseValue(25);
		if (entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
			_livingEntity1.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(2);
		if (entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(Attributes.ARMOR))
			_livingEntity2.getAttribute(Attributes.ARMOR).setBaseValue(3);
		if (entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
			_livingEntity3.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.3);
		{
			MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
			_vars.soulforceRegen = 0.1;
			_vars.markSyncDirty();
		}
		if (entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(Attributes.SCALE))
			_livingEntity4.getAttribute(Attributes.SCALE).setBaseValue(1);
		if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
			AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("mythicrealms:necromance_magic_unlock"));
			if (_adv != null) {
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		}
	}
}