package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;

public class SubstituteMagicProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce > 10) {
			{
				MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
				_vars.Soulforce = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce - 10;
				_vars.markSyncDirty();
			}
			world.setBlock(BlockPos.containing(x, y, z), Blocks.OAK_LOG.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.OAK_LOG.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.DUST_PLUME, x, y, z, 16, 1.5, 3, 1.5, 1);
			entity.setDeltaMovement(new Vec3((Math.sin(entity.getYRot() * (-1) * 0.017453292) * Math.cos(entity.getXRot() * (-1)) * (-6)), (Math.sin(entity.getXRot() * (-1)) * 0),
					(Math.cos(entity.getYRot() * (-1) * 0.017453292) * Math.cos(entity.getXRot() * (-1)) * (-6))));
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You don't have enough Soulforce"), true);
		}
	}
}