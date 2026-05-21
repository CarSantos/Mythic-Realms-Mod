package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;
import net.mcreator.mythicrealms.init.MythicrealmsModParticleTypes;

public class HighestSoundEffectProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce > 200) {
			{
				MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
				_vars.Soulforce = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce - 200;
				_vars.markSyncDirty();
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (MythicrealmsModParticleTypes.MUSIC_MAGIC_PARTICLE.get()), x, y, z, 1280, 6, 6, 6, 0.2);
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (MythicrealmsModParticleTypes.MUSIC_MAGIC_PARTICLE.get()), x, y, z, 640, 10, 6, 10, 0.2);
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (MythicrealmsModParticleTypes.MUSIC_MAGIC_PARTICLE.get()), x, y, z, 320, 18, 6, 18, 0.2);
			for (Entity entityiterator : world.getEntities(entity, new AABB((x + 4), (y + 4), (z + 4), (x - 4), (y - 4), (z - 4)))) {
				entityiterator.hurt(new DamageSource(world.holderOrThrow(DamageTypes.MAGIC)), 4);
				if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 2400, 2, false, false));
			}
			for (Entity entityiterator : world.getEntities(entity, new AABB((x + 8), (y + 8), (z + 8), (x - 8), (y - 8), (z - 8)))) {
				entityiterator.hurt(new DamageSource(world.holderOrThrow(DamageTypes.MAGIC)), 2);
				if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 1200, 1, false, false));
			}
			for (Entity entityiterator : world.getEntities(entity, new AABB((x + 16), (y + 16), (z + 16), (x - 16), (y - 16), (z - 16)))) {
				entityiterator.hurt(new DamageSource(world.holderOrThrow(DamageTypes.MAGIC)), 2);
				if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.NAUSEA, 1200, 1, false, false));
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You don't have enough Soulforce"), true);
		}
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack, 80);
	}
}