package net.mcreator.mythicrealms.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.mythicrealms.init.MythicrealmsModItems;
import net.mcreator.mythicrealms.MythicrealmsMod;

public class PedestalOnTickUpdateRecipesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double previousRecipe = 0;
		double fireHeight = 0;
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == MythicrealmsModItems.VIBRANIUM_INGOT.get()
				&& (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()).getItem() == MythicrealmsModItems.STAR_DUST.get()
				&& (itemFromBlockInventory(world, BlockPos.containing(x, y, z), 3).copy()).getItem() == MythicrealmsModItems.ENRICHED_URANIUM.get()) {
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				int _slotid = 1;
				ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
				_stk.shrink(1);
				_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
			}
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				int _slotid = 2;
				ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
				_stk.shrink(1);
				_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
			}
			if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
				int _slotid = 3;
				ItemStack _stk = _itemHandlerModifiable.getStackInSlot(_slotid).copy();
				_stk.shrink(1);
				_itemHandlerModifiable.setStackInSlot(_slotid, _stk);
			}
			if (world instanceof ServerLevel _level) {
				LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level, EntitySpawnReason.TRIGGERED);
				entityToSpawn.snapTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));
				entityToSpawn.setVisualOnly(true);
				_level.addFreshEntity(entityToSpawn);
			}
			MythicrealmsMod.queueServerWork(20, () -> {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 16, 0, 3, 0, 0.5);
				MythicrealmsMod.queueServerWork(20, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 16, 0, 3, 0, 0.5);
					MythicrealmsMod.queueServerWork(20, () -> {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 16, 0, 3, 0, 0.5);
						MythicrealmsMod.queueServerWork(20, () -> {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 16, 0, 3, 0, 0.5);
						});
						MythicrealmsMod.queueServerWork(20, () -> {
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 16, 0, 3, 0, 0.5);
							MythicrealmsMod.queueServerWork(20, () -> {
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 16, 0, 3, 0, 0.5);
								MythicrealmsMod.queueServerWork(20, () -> {
									if (world instanceof ServerLevel _level)
										_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 16, 0, 3, 0, 0.5);
									MythicrealmsMod.queueServerWork(20, () -> {
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 16, 0, 3, 0, 0.5);
									});
									MythicrealmsMod.queueServerWork(20, () -> {
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 16, 0, 3, 0, 0.5);
										MythicrealmsMod.queueServerWork(20, () -> {
											if (world instanceof ServerLevel _level)
												_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 16, 0, 3, 0, 0.5);
										});
									});
								});
							});
						});
					});
				});
			});
			MythicrealmsMod.queueServerWork(200, () -> {
				if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getItem() == MythicrealmsModItems.NANOS.get()) {
					if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
						ItemStack _setstack = new ItemStack(MythicrealmsModItems.NANOS.get()).copy();
						_setstack.setCount(itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).getCount() + 1);
						_itemHandlerModifiable.setStackInSlot(0, _setstack);
					}
				} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getItem() == ItemStack.EMPTY.getItem()) {
					if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
						ItemStack _setstack = new ItemStack(MythicrealmsModItems.NANOS.get()).copy();
						_setstack.setCount(1);
						_itemHandlerModifiable.setStackInSlot(0, _setstack);
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MythicrealmsModItems.NANOS.get()));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			});
		}
	}

	private static ItemStack itemFromBlockInventory(LevelAccessor world, BlockPos pos, int slot) {
		if (world instanceof ILevelExtension ext) {
			IItemHandler itemHandler = ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
			if (itemHandler != null)
				return itemHandler.getStackInSlot(slot);
		}
		return ItemStack.EMPTY;
	}
}