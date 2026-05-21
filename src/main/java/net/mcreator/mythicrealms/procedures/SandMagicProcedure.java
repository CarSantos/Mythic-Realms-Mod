package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;

public class SandMagicProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _plr0 && _plr0.level() instanceof ServerLevel _serverLevel0
				&& _plr0.getAdvancements().getOrStartProgress(_serverLevel0.getServer().getAdvancements().get(ResourceLocation.parse("mythicrealms:sand_storm_magic_unlock"))).isDone()) {
			if (entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce > 25) {
				{
					MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
					_vars.Soulforce = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce - 25;
					_vars.markSyncDirty();
				}
				for (Entity entityiterator : world.getEntities(entity, new AABB((x + 8), (y + 4), (z + 8), (x - 8), (y - 4), (z - 8)))) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.DUST_PLUME, x, y, z, 1280, 8, 4, 8, 1);
					if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 3200, 1, false, false));
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