package net.mcreator.mythicrealms.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionHand;

import net.mcreator.mythicrealms.init.MythicrealmsModMobEffects;
import net.mcreator.mythicrealms.init.MythicrealmsModItems;

import javax.annotation.Nullable;

@EventBusSubscriber
public class FangUpgradeProcedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		if (event.getHand() != InteractionHand.MAIN_HAND)
			return;
		execute(event, event.getLevel(), event.getTarget(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MythicrealmsModItems.FANG.get() && entity instanceof Villager && entity instanceof LivingEntity _livEnt3
				&& _livEnt3.hasEffect(MythicrealmsModMobEffects.WEREWOLF_EFFECT)) {
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(MythicrealmsModItems.FANG.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (sourceentity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(MythicrealmsModItems.WEREWOLF_FANG.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 100);
		}
	}
}