package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.network.chat.Component;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;

public class ReflectMagicEffectProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce > 100) {
			{
				MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
				_vars.Soulforce = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce - 100;
				_vars.markSyncDirty();
			}
			entity.invulnerableTime = 80;
			while (entity.isInvulnerable() && !world.getEntitiesOfClass(Monster.class, new AABB(Vec3.ZERO, Vec3.ZERO).move(new Vec3(x, y, z)).inflate(4 / 2d), e -> true).isEmpty()) {
				for (Entity entityiterator : world.getEntities(entity, new AABB((x + 8), (y + 4), (z + 8), (x - 8), (y - 4), (z - 8)))) {
					entityiterator.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)),
							(float) ((entityiterator instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE) ? _livingEntity3.getAttribute(Attributes.ATTACK_DAMAGE).getBaseValue() : 0)
									+ (entityiterator instanceof LivingEntity _entUseItem4 ? _entUseItem4.getUseItem() : ItemStack.EMPTY).getDamageValue()));
				}
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack, 100);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You don't have enough Soulforce"), false);
		}
	}
}