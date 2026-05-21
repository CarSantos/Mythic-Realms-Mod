package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.scores.PlayerTeam;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.entity.*;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;
import net.mcreator.mythicrealms.init.MythicrealmsModItems;
import net.mcreator.mythicrealms.MythicrealmsMod;

public class NecromancerMagicProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (world instanceof Level _level)
			_level.getScoreboard().addPlayerTeam("necro");
		if (entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce > 1000) {
			{
				MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
				_vars.Soulforce = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce - 1000;
				_vars.markSyncDirty();
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.WITHER_SKELETON.spawn(_level, BlockPos.containing(x + 2, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.WITHER_SKELETON.spawn(_level, BlockPos.containing(x - 2, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.WITHER_SKELETON.spawn(_level, BlockPos.containing(x, y, z + 2), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.WITHER_SKELETON.spawn(_level, BlockPos.containing(x, y, z - 2), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
				}
			}
			for (Entity entityiterator : world.getEntities(entity, new AABB((x + 3), (y + 2), (z + 3), (x - 3), (y - 2), (z - 3)))) {
				if (hasEntityInInventory(entity, new ItemStack(MythicrealmsModItems.NECROMANCER_MAGIC_BOOK.get()))) {
					if (entityiterator instanceof WitherSkeleton) {
						{
							Entity _entityTeam = entityiterator;
							PlayerTeam _pt = _entityTeam.level().getScoreboard().getPlayerTeam("necro");
							if (_pt != null) {
								if (_entityTeam instanceof Player _player)
									_entityTeam.level().getScoreboard().addPlayerToTeam(_player.getGameProfile().getName(), _pt);
								else
									_entityTeam.level().getScoreboard().addPlayerToTeam(_entityTeam.getStringUUID(), _pt);
							}
						}
						if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
							_toTame.tame(_owner);
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.STRENGTH, 6000, 1, false, false));
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.RESISTANCE, 6000, 1, false, false));
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.SPEED, 6000, 1, false, false));
						if (entityiterator instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Items.IRON_HELMET));
						}
						if (entityiterator instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Items.IRON_CHESTPLATE));
						}
						if (entityiterator instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Items.IRON_LEGGINGS));
						}
						if (entityiterator instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(Items.IRON_BOOTS));
						}
						if (entityiterator instanceof LivingEntity _entity) {
							ItemStack _setstack16 = new ItemStack(MythicrealmsModItems.STEEL_AXE.get()).copy();
							_setstack16.setCount(1);
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack16);
							ItemStack _setstack17 = new ItemStack(Items.TOTEM_OF_UNDYING).copy();
							_setstack17.setCount(1);
							_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack17);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
						MythicrealmsMod.queueServerWork(3200, () -> {
							if (!entityiterator.level().isClientSide())
								entityiterator.discard();
						});
					}
				}
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You don't have enough Soulforce"), true);
		}
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack, 200);
	}

	private static boolean hasEntityInInventory(Entity entity, ItemStack itemstack) {
		if (entity instanceof Player player)
			return player.getInventory().contains(stack -> !stack.isEmpty() && ItemStack.isSameItem(stack, itemstack));
		return false;
	}
}