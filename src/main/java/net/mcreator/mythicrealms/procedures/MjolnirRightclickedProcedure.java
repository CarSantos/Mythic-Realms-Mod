package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.Minecraft;

public class MjolnirRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (Minecraft.getInstance().options.keyShift.isDown()) {
			TempestMagicProcedure.execute(world, x, y, z, entity, itemstack);
		}
	}
}