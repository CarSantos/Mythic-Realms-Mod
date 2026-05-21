package net.mcreator.mythicrealms.procedures;

import net.neoforged.neoforge.event.entity.player.CriticalHitEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.mythicrealms.network.MythicrealmsModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class CurseOfTreeEffectProcedure {
	@SubscribeEvent
	public static void onPlayerCriticalHit(CriticalHitEvent event) {
		execute(event, event.getEntity().level(), event.getTarget(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("mythicrealms:curse_of_tree")))) != 0) {
			entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.MAGIC)), 10);
			if (entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce > 42) {
				{
					MythicrealmsModVariables.PlayerVariables _vars = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES);
					_vars.Soulforce = entity.getData(MythicrealmsModVariables.PLAYER_VARIABLES).Soulforce - 32;
					_vars.markSyncDirty();
				}
				world.setBlock(BlockPos.containing(entity.getX(), entity.getY() - 1, entity.getZ()), Blocks.DIRT.defaultBlockState(), 3);
				if (world.getBiome(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ())).is(ResourceLocation.parse("mushroom_fields"))) {
					world.setBlock(BlockPos.containing(entity.getX(), entity.getY() - 1, entity.getZ()), Blocks.MYCELIUM.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), Blocks.RED_MUSHROOM.defaultBlockState(), 3);
				} else if (world.getBiome(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ())).is(ResourceLocation.parse("dark_forest"))) {
					world.setBlock(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), Blocks.DARK_OAK_SAPLING.defaultBlockState(), 3);
				} else if (world.getBiome(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ())).is(ResourceLocation.parse("savanna"))) {
					world.setBlock(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), Blocks.ACACIA_SAPLING.defaultBlockState(), 3);
				} else if (world.getBiome(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ())).is(ResourceLocation.parse("taiga"))) {
					world.setBlock(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), Blocks.SPRUCE_SAPLING.defaultBlockState(), 3);
				} else if (world.getBiome(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ())).is(ResourceLocation.parse("jungle"))) {
					world.setBlock(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), Blocks.JUNGLE_SAPLING.defaultBlockState(), 3);
				} else if (world.getBiome(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ())).is(ResourceLocation.parse("bamboo_jungle"))) {
					world.setBlock(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), Blocks.BAMBOO.defaultBlockState(), 3);
				} else if (world.getBiome(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ())).is(ResourceLocation.parse("birch_forest"))) {
					world.setBlock(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), Blocks.BIRCH_SAPLING.defaultBlockState(), 3);
				} else {
					world.setBlock(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), Blocks.OAK_SAPLING.defaultBlockState(), 3);
				}
				for (int index0 = 0; index0 < 7; index0++) {
					if (world instanceof Level _level) {
						BlockPos _bp = BlockPos.containing(entity.getX(), entity.getY(), entity.getZ());
						if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
							if (!_level.isClientSide())
								_level.levelEvent(2005, _bp, 0);
						}
					}
				}
			}
		}
	}
}