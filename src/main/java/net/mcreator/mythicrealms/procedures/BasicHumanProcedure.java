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

public class BasicHumanProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(Attributes.ARMOR))
			_livingEntity0.getAttribute(Attributes.ARMOR).setBaseValue(0);
		if (entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.ARMOR_TOUGHNESS))
			_livingEntity1.getAttribute(Attributes.ARMOR_TOUGHNESS).setBaseValue(0);
		if (entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
			_livingEntity2.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(2);
		if (entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(Attributes.ATTACK_KNOCKBACK))
			_livingEntity3.getAttribute(Attributes.ATTACK_KNOCKBACK).setBaseValue(0);
		if (entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(Attributes.ATTACK_SPEED))
			_livingEntity4.getAttribute(Attributes.ATTACK_SPEED).setBaseValue(4);
		if (entity instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(Attributes.BLOCK_BREAK_SPEED))
			_livingEntity5.getAttribute(Attributes.BLOCK_BREAK_SPEED).setBaseValue(1);
		if (entity instanceof LivingEntity _livingEntity6 && _livingEntity6.getAttributes().hasAttribute(Attributes.BLOCK_INTERACTION_RANGE))
			_livingEntity6.getAttribute(Attributes.BLOCK_INTERACTION_RANGE).setBaseValue(4.5);
		if (entity instanceof LivingEntity _livingEntity7 && _livingEntity7.getAttributes().hasAttribute(Attributes.BURNING_TIME))
			_livingEntity7.getAttribute(Attributes.BURNING_TIME).setBaseValue(1);
		if (entity instanceof LivingEntity _livingEntity8 && _livingEntity8.getAttributes().hasAttribute(Attributes.CAMERA_DISTANCE))
			_livingEntity8.getAttribute(Attributes.CAMERA_DISTANCE).setBaseValue(4);
		if (entity instanceof LivingEntity _livingEntity9 && _livingEntity9.getAttributes().hasAttribute(Attributes.ENTITY_INTERACTION_RANGE))
			_livingEntity9.getAttribute(Attributes.ENTITY_INTERACTION_RANGE).setBaseValue(3);
		if (entity instanceof LivingEntity _livingEntity10 && _livingEntity10.getAttributes().hasAttribute(Attributes.EXPLOSION_KNOCKBACK_RESISTANCE))
			_livingEntity10.getAttribute(Attributes.EXPLOSION_KNOCKBACK_RESISTANCE).setBaseValue(0);
		if (entity instanceof LivingEntity _livingEntity11 && _livingEntity11.getAttributes().hasAttribute(Attributes.FALL_DAMAGE_MULTIPLIER))
			_livingEntity11.getAttribute(Attributes.FALL_DAMAGE_MULTIPLIER).setBaseValue(0);
		if (entity instanceof LivingEntity _livingEntity12 && _livingEntity12.getAttributes().hasAttribute(Attributes.FLYING_SPEED))
			_livingEntity12.getAttribute(Attributes.FLYING_SPEED).setBaseValue(0.4);
		if (entity instanceof LivingEntity _livingEntity13 && _livingEntity13.getAttributes().hasAttribute(Attributes.FOLLOW_RANGE))
			_livingEntity13.getAttribute(Attributes.FOLLOW_RANGE).setBaseValue(32);
		if (entity instanceof LivingEntity _livingEntity14 && _livingEntity14.getAttributes().hasAttribute(Attributes.GRAVITY))
			_livingEntity14.getAttribute(Attributes.GRAVITY).setBaseValue(0.08);
		if (entity instanceof LivingEntity _livingEntity15 && _livingEntity15.getAttributes().hasAttribute(Attributes.JUMP_STRENGTH))
			_livingEntity15.getAttribute(Attributes.JUMP_STRENGTH).setBaseValue(0.42);
		if (entity instanceof LivingEntity _livingEntity16 && _livingEntity16.getAttributes().hasAttribute(Attributes.KNOCKBACK_RESISTANCE))
			_livingEntity16.getAttribute(Attributes.KNOCKBACK_RESISTANCE).setBaseValue(0);
		if (entity instanceof LivingEntity _livingEntity17 && _livingEntity17.getAttributes().hasAttribute(Attributes.LUCK))
			_livingEntity17.getAttribute(Attributes.LUCK).setBaseValue(0);
		if (entity instanceof LivingEntity _livingEntity18 && _livingEntity18.getAttributes().hasAttribute(Attributes.MAX_ABSORPTION))
			_livingEntity18.getAttribute(Attributes.MAX_ABSORPTION).setBaseValue(0);
		if (entity instanceof LivingEntity _livingEntity19 && _livingEntity19.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
			_livingEntity19.getAttribute(Attributes.MAX_HEALTH).setBaseValue(20);
		if (entity instanceof LivingEntity _livingEntity20 && _livingEntity20.getAttributes().hasAttribute(Attributes.MINING_EFFICIENCY))
			_livingEntity20.getAttribute(Attributes.MINING_EFFICIENCY).setBaseValue(0);
		if (entity instanceof LivingEntity _livingEntity21 && _livingEntity21.getAttributes().hasAttribute(Attributes.MOVEMENT_EFFICIENCY))
			_livingEntity21.getAttribute(Attributes.MOVEMENT_EFFICIENCY).setBaseValue(0);
		if (entity instanceof LivingEntity _livingEntity22 && _livingEntity22.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
			_livingEntity22.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.1);
		if (entity instanceof LivingEntity _livingEntity23 && _livingEntity23.getAttributes().hasAttribute(Attributes.OXYGEN_BONUS))
			_livingEntity23.getAttribute(Attributes.OXYGEN_BONUS).setBaseValue(0);
		if (entity instanceof LivingEntity _livingEntity24 && _livingEntity24.getAttributes().hasAttribute(Attributes.SAFE_FALL_DISTANCE))
			_livingEntity24.getAttribute(Attributes.SAFE_FALL_DISTANCE).setBaseValue(3);
		if (entity instanceof LivingEntity _livingEntity25 && _livingEntity25.getAttributes().hasAttribute(Attributes.SCALE))
			_livingEntity25.getAttribute(Attributes.SCALE).setBaseValue(1);
		if (entity instanceof LivingEntity _livingEntity26 && _livingEntity26.getAttributes().hasAttribute(Attributes.SPAWN_REINFORCEMENTS_CHANCE))
			_livingEntity26.getAttribute(Attributes.SPAWN_REINFORCEMENTS_CHANCE).setBaseValue(0);
		if (entity instanceof LivingEntity _livingEntity27 && _livingEntity27.getAttributes().hasAttribute(Attributes.SNEAKING_SPEED))
			_livingEntity27.getAttribute(Attributes.SNEAKING_SPEED).setBaseValue(0.3);
		if (entity instanceof LivingEntity _livingEntity28 && _livingEntity28.getAttributes().hasAttribute(Attributes.STEP_HEIGHT))
			_livingEntity28.getAttribute(Attributes.STEP_HEIGHT).setBaseValue(0.6);
		if (entity instanceof LivingEntity _livingEntity29 && _livingEntity29.getAttributes().hasAttribute(Attributes.SUBMERGED_MINING_SPEED))
			_livingEntity29.getAttribute(Attributes.SUBMERGED_MINING_SPEED).setBaseValue(0.2);
		if (entity instanceof LivingEntity _livingEntity30 && _livingEntity30.getAttributes().hasAttribute(Attributes.SWEEPING_DAMAGE_RATIO))
			_livingEntity30.getAttribute(Attributes.SWEEPING_DAMAGE_RATIO).setBaseValue(0);
		if (entity instanceof LivingEntity _livingEntity31 && _livingEntity31.getAttributes().hasAttribute(Attributes.TEMPT_RANGE))
			_livingEntity31.getAttribute(Attributes.TEMPT_RANGE).setBaseValue(10);
		if (entity instanceof LivingEntity _livingEntity32 && _livingEntity32.getAttributes().hasAttribute(Attributes.WATER_MOVEMENT_EFFICIENCY))
			_livingEntity32.getAttribute(Attributes.WATER_MOVEMENT_EFFICIENCY).setBaseValue(0);
		{
			MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
			_vars.soulforceRegen = 0.001;
			_vars.markSyncDirty();
		}
		if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
			AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("mythicrealms:necromance_magic_unlock"));
			if (_adv != null) {
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (_ap.isDone()) {
					for (String criteria : _ap.getCompletedCriteria())
						_player.getAdvancements().revoke(_adv, criteria);
				}
			}
		}
		if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
			AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("mythicrealms:detect_magic_unlock"));
			if (_adv != null) {
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (_ap.isDone()) {
					for (String criteria : _ap.getCompletedCriteria())
						_player.getAdvancements().revoke(_adv, criteria);
				}
			}
		}
	}
}