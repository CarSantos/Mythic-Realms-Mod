package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;

public class EarthquakeMagicProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _plr0 && _plr0.level() instanceof ServerLevel _serverLevel0
				&& _plr0.getAdvancements().getOrStartProgress(_serverLevel0.getServer().getAdvancements().get(ResourceLocation.parse("mythicrealms:earthquake_magic_unlock"))).isDone()) {
			if (entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce > 100) {
				{
					MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
					_vars.Soulforce = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce - 100;
					_vars.markSyncDirty();
				}
				for (Entity entityiterator : world.getEntities(entity, new AABB((x + 4), (y + 4), (z + 4), (x - 4), (y - 4), (z - 4)))) {
					entityiterator.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y, z));
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 160, 4, 2, 4, 1);
					entityiterator.setDeltaMovement(new Vec3((entityiterator.getLookAngle().x * 6), (entityiterator.getLookAngle().y * 6), (entityiterator.getLookAngle().z * 6)));
					entityiterator.hurt(new DamageSource(world.holderOrThrow(DamageTypes.MAGIC)), 2);
					if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 200, 2, false, false));
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("You don't have enough Soulforce"), true);
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You need to unlock this magic first"), true);
		}
	}
}