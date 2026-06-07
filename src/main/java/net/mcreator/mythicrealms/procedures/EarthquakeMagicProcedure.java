package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.phys.Vec3;
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
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;

import java.util.Comparator;

public class EarthquakeMagicProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce > 150) {
			{
				MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
				_vars.Soulforce = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce - 150;
				_vars.markSyncDirty();
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 160, 4, 2, 4, 1);
			{
				final Vec3 _center = new Vec3(x, y, z);
				for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
					if (!(entityiterator == entity)) {
						entityiterator.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())));
						entityiterator.push((entityiterator.getLookAngle().x * (-5)), 1.5, (entityiterator.getLookAngle().z * (-5)));
						entityiterator.hurt(new DamageSource(world.holderOrThrow(DamageTypes.MAGIC)), 2);
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 200, 2, false, false));
					}
				}
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack, 360);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You don't have enough Soulforce"), true);
		}
	}
}