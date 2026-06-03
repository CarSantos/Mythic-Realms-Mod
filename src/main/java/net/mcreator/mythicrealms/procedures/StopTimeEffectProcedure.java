package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;
import net.mcreator.mythicrealms.MythicrealmsMod;

public class StopTimeEffectProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce > 1000) {
			{
				MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
				_vars.Soulforce = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce - 1000;
				_vars.markSyncDirty();
			}
			for (Entity entityiterator : world.getEntities(entity, new AABB((x + 4), (y + 4), (z + 4), (x - 4), (y - 4), (z - 4)))) {
				if (entityiterator instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
					_livingEntity0.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0);
				if (entityiterator instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.GRAVITY))
					_livingEntity1.getAttribute(Attributes.GRAVITY).setBaseValue(1);
				if (entityiterator instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(Attributes.JUMP_STRENGTH))
					_livingEntity2.getAttribute(Attributes.JUMP_STRENGTH).setBaseValue(0);
				if (entityiterator instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(Attributes.ATTACK_SPEED))
					_livingEntity3.getAttribute(Attributes.ATTACK_SPEED).setBaseValue(0);
				if (entityiterator instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
					_livingEntity4.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(0);
				if (entityiterator instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(Attributes.KNOCKBACK_RESISTANCE))
					_livingEntity5.getAttribute(Attributes.KNOCKBACK_RESISTANCE).setBaseValue(1);
				if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 2400, 1, false, false));
				MythicrealmsMod.queueServerWork(2400, () -> {
					if (entityiterator instanceof LivingEntity _livingEntity7 && _livingEntity7.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
						_livingEntity7.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.1);
					if (entityiterator instanceof LivingEntity _livingEntity8 && _livingEntity8.getAttributes().hasAttribute(Attributes.GRAVITY))
						_livingEntity8.getAttribute(Attributes.GRAVITY).setBaseValue(0.08);
					if (entityiterator instanceof LivingEntity _livingEntity9 && _livingEntity9.getAttributes().hasAttribute(Attributes.JUMP_STRENGTH))
						_livingEntity9.getAttribute(Attributes.JUMP_STRENGTH).setBaseValue(0.42);
					if (entityiterator instanceof LivingEntity _livingEntity10 && _livingEntity10.getAttributes().hasAttribute(Attributes.ATTACK_SPEED))
						_livingEntity10.getAttribute(Attributes.ATTACK_SPEED).setBaseValue(4);
					if (entityiterator instanceof LivingEntity _livingEntity11 && _livingEntity11.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
						_livingEntity11.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(1);
					if (entityiterator instanceof LivingEntity _livingEntity12 && _livingEntity12.getAttributes().hasAttribute(Attributes.KNOCKBACK_RESISTANCE))
						_livingEntity12.getAttribute(Attributes.KNOCKBACK_RESISTANCE).setBaseValue(0);
				});
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack, 3200);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You don't have enough Soulforce"), true);
		}
	}
}