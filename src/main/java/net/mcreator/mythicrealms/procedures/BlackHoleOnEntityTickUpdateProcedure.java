package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;

import java.util.Comparator;

public class BlackHoleOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
				if (!(entity == entityiterator) && !(entity instanceof Player)) {
					entityiterator.hurt(new DamageSource(world.holderOrThrow(DamageTypes.FELL_OUT_OF_WORLD)), 2);
					entityiterator.setDeltaMovement(new Vec3(((x - entityiterator.getX()) * 0.1), ((y - entityiterator.getY()) * 0.1), ((z - entityiterator.getZ()) * 0.1)));
				}
				if (!(entity == entityiterator) && entity instanceof Player) {
					entityiterator.hurt(new DamageSource(world.holderOrThrow(DamageTypes.FELL_OUT_OF_WORLD)), 2);
					entityiterator.setDeltaMovement(new Vec3(((x - entityiterator.getX()) * 0.1), ((y - entityiterator.getY()) * 0.1), ((z - entityiterator.getZ()) * 0.1)));
					{
						MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
						_vars.Soulforce = -100;
						_vars.markSyncDirty();
					}
				}
			}
		}
		entity.setDeltaMovement(new Vec3(0, 0, 0));
	}
}