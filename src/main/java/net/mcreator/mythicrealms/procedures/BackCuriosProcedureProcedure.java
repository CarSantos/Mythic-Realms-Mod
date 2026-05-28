package net.mcreator.mythicrealms.procedures;

import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
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
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;
import net.mcreator.mythicrealms.init.MythicrealmsModParticleTypes;
import net.mcreator.mythicrealms.init.MythicrealmsModMobEffects;
import net.mcreator.mythicrealms.init.MythicrealmsModItems;
import net.mcreator.mythicrealms.init.MythicrealmsModEntities;
import net.mcreator.mythicrealms.entity.ToxicSlimeProjetileEntity;
import net.mcreator.mythicrealms.MythicrealmsMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class BackCuriosProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player player37) {
			IItemHandler inventory37 = MythicrealmsMod.CuriosApiHelper.getCuriosInventory(player37);
			if (inventory37 != null) {
				for (int i = 0; i < inventory37.getSlots(); i++) {
					ItemStack itemstackiterator = inventory37.getStackInSlot(i);
					if (itemstackiterator.getItem() == MythicrealmsModItems.MAGNET.get() && entity.getY() < world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) + 5 && Minecraft.getInstance().options.keyJump.isDown()) {
						entity.push(0, 0.1, 0);
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 100, 5));
					}
					if (itemstackiterator.getItem() == MythicrealmsModItems.TECH_JETPACK_ITEM.get() && entity.getY() < world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) + 50
							&& Minecraft.getInstance().options.keyJump.isDown()) {
						entity.push(0, 0.2, 0);
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 100, 5));
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (MythicrealmsModParticleTypes.FIRE_MAGIC_PARTICLE.get()), x, y, z, 5, 0, 0.5, 0, 0.2);
					}
					if (itemstackiterator.getItem() == MythicrealmsModItems.TOMOE_RING_ITEM.get() && Minecraft.getInstance().options.keyAttack.isDown()) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.END_ROD, x, y, z, 64, 1, 1, 1, 0.2);
						if (entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce > 200) {
							{
								MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
								_vars.Soulforce = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce - 200;
								_vars.markSyncDirty();
							}
							for (Entity entityiterator : world.getEntities(entity, new AABB((x + 16), (y + 16), (z + 16), (x - 16), (y - 16), (z - 16)))) {
								world.getLevelData().setRaining(true);
								MythicrealmsMod.queueServerWork(40, () -> {
									entityiterator.hurt(new DamageSource(world.holderOrThrow(DamageTypes.MAGIC)), 2);
									if (world instanceof ServerLevel _level) {
										LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
										entityToSpawn.snapTo(Vec3.atBottomCenterOf(BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ())));;
										_level.addFreshEntity(entityToSpawn);
									}
									if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MythicrealmsModMobEffects.FROZEN, 100, 2, false, false));
									world.getLevelData().setRaining(false);
								});
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("You don't have enough Soulforce"), true);
						}
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