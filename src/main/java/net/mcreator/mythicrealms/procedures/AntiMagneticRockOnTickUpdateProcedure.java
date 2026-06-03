package net.mcreator.mythicrealms.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.mythicrealms.init.MythicrealmsModBlocks;

import javax.annotation.Nullable;

import java.util.Comparator;

@EventBusSubscriber
public class AntiMagneticRockOnTickUpdateProcedure {
	@SubscribeEvent
	public static void onBlockBreaking(PlayerEvent.BreakSpeed event) {
		if (event.getPosition().isEmpty())
			return;
		execute(event, event.getEntity().level(), event.getPosition().get().getX(), event.getPosition().get().getY(), event.getPosition().get().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == MythicrealmsModBlocks.ANTI_MAGNETIC_ROCK.get()) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(9 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
					entityiterator.push((entityiterator.getLookAngle().x * (-3)), (entityiterator.getLookAngle().y * (-3)), (entityiterator.getLookAngle().z * (-3)));
				}
			}
		}
	}
}