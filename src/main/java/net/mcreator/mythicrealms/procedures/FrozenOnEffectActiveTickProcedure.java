package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.entity.Entity;

public class FrozenOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setTicksFrozen(60);
	}
}