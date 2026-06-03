package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;
import net.mcreator.mythicrealms.init.MythicrealmsModParticleTypes;

public class PoisonCloudMagicProcedure {
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
				_level.sendParticles((SimpleParticleType) (MythicrealmsModParticleTypes.POISON_MAGIC_PARTICLE.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 1280, 7, 4, 7, 1);
			for (Entity entityiterator : world.getEntities(entity, new AABB((x + 7), (y + 4), (z + 7), (x - 7), (y - 4), (z - 7)))) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (MythicrealmsModParticleTypes.POISON_MAGIC_PARTICLE.get()), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 100, 0, 4, 0, 1);
				if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 3000, 2, false, false));
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack, 100);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You don't have enough Soulforce"), true);
		}
	}
}