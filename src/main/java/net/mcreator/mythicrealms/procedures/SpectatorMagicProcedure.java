package net.mcreator.mythicrealms.procedures;

import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.Minecraft;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;
import net.mcreator.mythicrealms.init.MythicrealmsModKeyMappings;

import javax.annotation.Nullable;

@EventBusSubscriber
public class SpectatorMagicProcedure {
	@SubscribeEvent
	public static void onEntityTick(EntityTickEvent.Pre event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (MythicrealmsModKeyMappings.SPECTATE_MAGIC.isDown() == true) {
			if (entity instanceof ServerPlayer _plr1 && _plr1.level() instanceof ServerLevel _serverLevel1
					&& _plr1.getAdvancements().getOrStartProgress(_serverLevel1.getServer().getAdvancements().get(ResourceLocation.parse("mythicrealms:spectate_magic_unlock"))).isDone()) {
				if (entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce > 10) {
					if (entity instanceof ServerPlayer _player)
						_player.setGameMode(GameType.SPECTATOR);
					if (entity instanceof Player _player) {
						_player.getAbilities().flying = true;
						_player.onUpdateAbilities();
					}
					{
						MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
						_vars.Soulforce = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce - 2;
						_vars.markSyncDirty();
					}
				} else if (getEntityGameType(entity) == GameType.CREATIVE) {
					if (entity instanceof ServerPlayer _player)
						_player.setGameMode(GameType.CREATIVE);
					if (entity instanceof Player _player) {
						_player.getAbilities().flying = true;
						_player.onUpdateAbilities();
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("You don't have enough Soulforce"), true);
				} else {
					entity.noPhysics = false;
					if (entity instanceof ServerPlayer _player)
						_player.setGameMode(GameType.SURVIVAL);
					if (entity instanceof Player _player) {
						_player.getAbilities().flying = false;
						_player.onUpdateAbilities();
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("You don't have enough Soulforce"), true);
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("You need to unlock this magic first"), true);
			}
		}
	}

	private static GameType getEntityGameType(Entity entity) {
		if (entity instanceof ServerPlayer serverPlayer) {
			return serverPlayer.gameMode.getGameModeForPlayer();
		} else if (entity instanceof Player player && player.level().isClientSide()) {
			PlayerInfo playerInfo = Minecraft.getInstance().getConnection().getPlayerInfo(player.getGameProfile().getId());
			if (playerInfo != null)
				return playerInfo.getGameMode();
		}
		return null;
	}
}