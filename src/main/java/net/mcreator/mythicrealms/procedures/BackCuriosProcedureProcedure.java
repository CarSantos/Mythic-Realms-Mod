package net.mcreator.mythicrealms.procedures;

import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.Minecraft;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;
import net.mcreator.mythicrealms.init.MythicrealmsModItems;
import net.mcreator.mythicrealms.init.MythicrealmsModEntities;
import net.mcreator.mythicrealms.entity.ToxicSlimeProjetileEntity;
import net.mcreator.mythicrealms.MythicrealmsMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class BackCuriosProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double z, Entity entity) {
		execute(null, world, x, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player player13) {
			IItemHandler inventory13 = MythicrealmsMod.CuriosApiHelper.getCuriosInventory(player13);
			if (inventory13 != null) {
				for (int i = 0; i < inventory13.getSlots(); i++) {
					ItemStack itemstackiterator = inventory13.getStackInSlot(i);
					if (itemstackiterator.getItem() == MythicrealmsModItems.MAGNET.get() && entity.getBbHeight() <= world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) + 5
							&& Minecraft.getInstance().options.keyJump.isDown()) {
						entity.push(0, 0.1, 0);
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 100, 5));
					}
					if (itemstackiterator.getItem() == MythicrealmsModItems.CHIMERA_GUN_ITEM.get() && Minecraft.getInstance().options.keyAttack.isDown()) {
						if (entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce > 10) {
							{
								MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
								_vars.Soulforce = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce - 10;
								_vars.markSyncDirty();
							}
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = initArrowProjectile(
											new ToxicSlimeProjetileEntity(MythicrealmsModEntities.TOXIC_SLIME_PROJETILE.get(), 0, 0, 0, projectileLevel, createArrowWeaponItemStack(projectileLevel, (int) 0.1, (byte) 0)), null, 2, true, false, false,
											AbstractArrow.Pickup.DISALLOWED);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("You don't have enough Soulforce"), true);
						}
					}
				}
			}
		}
	}

	private static AbstractArrow initArrowProjectile(AbstractArrow entityToSpawn, Entity shooter, float damage, boolean silent, boolean fire, boolean particles, AbstractArrow.Pickup pickup) {
		entityToSpawn.setOwner(shooter);
		entityToSpawn.setBaseDamage(damage);
		if (silent)
			entityToSpawn.setSilent(true);
		if (fire)
			entityToSpawn.igniteForSeconds(100);
		if (particles)
			entityToSpawn.setCritArrow(true);
		entityToSpawn.pickup = pickup;
		return entityToSpawn;
	}

	private static ItemStack createArrowWeaponItemStack(Level level, int knockback, byte piercing) {
		ItemStack weapon = new ItemStack(Items.ARROW);
		if (knockback > 0)
			weapon.enchant(level.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.KNOCKBACK), knockback);
		if (piercing > 0)
			weapon.enchant(level.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.PIERCING), piercing);
		return weapon;
	}
}