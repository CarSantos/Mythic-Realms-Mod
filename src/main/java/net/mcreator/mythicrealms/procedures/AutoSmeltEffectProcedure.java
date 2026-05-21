package net.mcreator.mythicrealms.procedures;

import net.neoforged.neoforge.event.level.BlockEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.crafting.SingleRecipeInput;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@EventBusSubscriber
public class AutoSmeltEffectProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).isCorrectToolForDrops((world.getBlockState(BlockPos.containing(x, y, z))))) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
					.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("mythicrealms:auto_smelt")))) != 0) {
				if (!((getItemStackFromItemStackSlot(world, (new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock())))).getItem() == Blocks.AIR.asItem())) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5), (getItemStackFromItemStackSlot(world, (new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock())))));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				} else {
					{
						BlockPos _pos = BlockPos.containing(x, y, z);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
				}
			}
		}
	}

	private static ItemStack getItemStackFromItemStackSlot(LevelAccessor level, ItemStack input) {
		SingleRecipeInput recipeInput = new SingleRecipeInput(input);
		if (level instanceof ServerLevel serverLevel) {
			return serverLevel.recipeAccess().getRecipeFor(RecipeType.SMELTING, recipeInput, serverLevel).map(recipe -> recipe.value().assemble(recipeInput, serverLevel.registryAccess()).copy()).orElse(ItemStack.EMPTY);
		}
		return ItemStack.EMPTY;
	}
}