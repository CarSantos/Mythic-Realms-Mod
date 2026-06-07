package net.mcreator.mythicrealms.procedures;

import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;
import net.mcreator.mythicrealms.init.MythicrealmsModKeyMappings;

import javax.annotation.Nullable;

@EventBusSubscriber
public class GhostMagicRealProcedure {
	@SubscribeEvent
	public static void onEntityTick(EntityTickEvent.Pre event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (MythicrealmsModKeyMappings.GHOST_KEY.isDown() == true) {
			if (entity instanceof ServerPlayer _plr1 && _plr1.level() instanceof ServerLevel _serverLevel1
					&& _plr1.getAdvancements().getOrStartProgress(_serverLevel1.getServer().getAdvancements().get(ResourceLocation.parse("mythicrealms:ghost_mode_magic_unlock"))).isDone()) {
				if (entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce > 10) {
					{
						MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
						_vars.Soulforce = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce - 2;
						_vars.markSyncDirty();
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"execute at @a anchored feet run tp @p ^ ^0.01 ^0.01");
					if (entity instanceof Player _player) {
						_player.getAbilities().flying = true;
						_player.onUpdateAbilities();
					}
				} else {
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
}