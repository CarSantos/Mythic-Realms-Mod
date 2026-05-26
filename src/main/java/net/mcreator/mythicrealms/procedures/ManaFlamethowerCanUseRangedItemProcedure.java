package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.SmallFireball;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;

public class ManaFlamethowerCanUseRangedItemProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce > 5) {
			{
				MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
				_vars.Soulforce = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce - 5;
				_vars.markSyncDirty();
			}
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = new SmallFireball(EntityType.SMALL_FIREBALL, projectileLevel);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack, 40);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You don't have enough Soulforce"), true);
		}
		if (entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce > 256 && Minecraft.getInstance().options.keyShift.isDown()) {
			{
				MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
				_vars.Soulforce = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce - 256;
				_vars.markSyncDirty();
			}
			itemstack.setDamageValue(0);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You don't have enough Soulforce"), true);
		}
	}
}