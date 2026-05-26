package net.mcreator.mythicrealms.procedures;

import net.neoforged.neoforge.event.entity.player.CriticalHitEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;

import net.mcreator.mythicrealms.init.MythicrealmsModItems;

import javax.annotation.Nullable;

@EventBusSubscriber
public class ManaPotionCraftProcedure {
	@SubscribeEvent
	public static void onPlayerCriticalHit(CriticalHitEvent event) {
		execute(event, event.getEntity().level(), event.getTarget());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == MythicrealmsModItems.MANA_BOTTLE.get()) {
			if (Math.random() < 0.2) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(MythicrealmsModItems.MANA_BOTTLE.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack3 = new ItemStack(MythicrealmsModItems.MANA_POTION.get()).copy();
					_setstack3.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack3);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof ServerLevel _level) {
					_level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Your Mana Bottle is finally full").withColor(0x09d2c4).withStyle(ChatFormatting.ITALIC), false);
				}
			}
		}
	}
}