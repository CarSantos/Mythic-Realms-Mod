package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;

public class ExpellMagicProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce > 50) {
			{
				MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
				_vars.Soulforce = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce - 50;
				_vars.markSyncDirty();
			}
			for (Entity entityiterator : world.getEntities(entity, new AABB((x + 6), (y + 6), (z + 6), (x - 6), (y - 6), (z - 6)))) {
				entityiterator.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y, z));
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 160, 4, 2, 4, 1);
				entityiterator.setDeltaMovement(new Vec3((entityiterator.getLookAngle().x * 8), (entityiterator.getLookAngle().y * 4), (entityiterator.getLookAngle().z * 8)));
				entityiterator.hurt(new DamageSource(world.holderOrThrow(DamageTypes.MAGIC)), 2);
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You don't have enough Soulforce"), true);
		}
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack, 80);
	}
}