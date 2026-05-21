package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;
import net.mcreator.mythicrealms.init.MythicrealmsModParticleTypes;

import java.util.Comparator;

public class SoulforceStealMagicProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _plr0 && _plr0.level() instanceof ServerLevel _serverLevel0
				&& _plr0.getAdvancements().getOrStartProgress(_serverLevel0.getServer().getAdvancements().get(ResourceLocation.parse("mythicrealms:soulforce_steal_magic_unlock"))).isDone()) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
					if (entityiterator instanceof Player) {
						{
							MythicrealmsModVariables.PlayerVariables _vars = entityiterator.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
							_vars.Soulforce = entityiterator.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce - 200;
							_vars.markSyncDirty();
						}
						{
							MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
							_vars.Soulforce = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce + 100;
							_vars.markSyncDirty();
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (MythicrealmsModParticleTypes.SOUL_MAGIC_PARTICLE.get()), x, y, z, 640, 16, 4, 16, 1);
					}
					if (!(entityiterator instanceof Player)) {
						{
							MythicrealmsModVariables.PlayerVariables _vars = entityiterator.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
							_vars.Soulforce = entityiterator.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce - 40;
							_vars.markSyncDirty();
						}
						{
							MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
							_vars.Soulforce = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce + 20;
							_vars.markSyncDirty();
						}
						entityiterator.hurt(new DamageSource(world.holderOrThrow(DamageTypes.MAGIC)), 4);
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (MythicrealmsModParticleTypes.SOUL_MAGIC_PARTICLE.get()), x, y, z, 320, 16, 4, 16, 1);
					}
				}
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You need to unlock this magic first"), false);
		}
	}
}