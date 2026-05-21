package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.mythicrealms.entity.GhostHorseEntity;
import net.mcreator.mythicrealms.MythicrealmsMod;

public class GhostHorseEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof GhostHorseEntity _datEntL0 && _datEntL0.getEntityData().get(GhostHorseEntity.DATA_hurt))) {
			if (entity instanceof GhostHorseEntity _datEntSetL)
				_datEntSetL.getEntityData().set(GhostHorseEntity.DATA_hurt, true);
			MythicrealmsMod.queueServerWork(20, () -> {
				if (entity instanceof GhostHorseEntity _datEntSetL)
					_datEntSetL.getEntityData().set(GhostHorseEntity.DATA_hurt, false);
			});
		}
	}
}