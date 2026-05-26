/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mythicrealms.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.mythicrealms.block.*;
import net.mcreator.mythicrealms.MythicrealmsMod;

import java.util.function.Function;

public class MythicrealmsModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(MythicrealmsMod.MODID);
	public static final DeferredBlock<Block> TITANIUM_ORE;
	public static final DeferredBlock<Block> VIBRANIUM_ORE;
	public static final DeferredBlock<Block> ADAMANT_ORE;
	public static final DeferredBlock<Block> DEEPWORLD_TRAVEL_MACHINE;
	public static final DeferredBlock<Block> DEEPWORLD_PORTAL;
	public static final DeferredBlock<Block> LUNAR_BLOCK;
	public static final DeferredBlock<Block> BLOOD_LOG;
	public static final DeferredBlock<Block> BLOOD_WOOD;
	public static final DeferredBlock<Block> STRIPPED_BLOOD_LOG;
	public static final DeferredBlock<Block> STRIPPED_BLOOD_WOOD;
	public static final DeferredBlock<Block> BLOOD_PLANKS;
	public static final DeferredBlock<Block> BLOOD_LEAVES;
	public static final DeferredBlock<Block> BLOOD_STAIRS;
	public static final DeferredBlock<Block> BLOOD_SLAB;
	public static final DeferredBlock<Block> BLOOD_FENCE;
	public static final DeferredBlock<Block> BLOOD_FENCE_GATE;
	public static final DeferredBlock<Block> BLOOD_DOOR;
	public static final DeferredBlock<Block> BLOOD_TRAPDOOR;
	public static final DeferredBlock<Block> BLOOD_PRESSURE_PLATE;
	public static final DeferredBlock<Block> BLOOD_BUTTON;
	public static final DeferredBlock<Block> BLOOD_SAPLING;
	public static final DeferredBlock<Block> ARMOR_FORGE;
	public static final DeferredBlock<Block> GHOST_MUSHROOM;
	public static final DeferredBlock<Block> BLOOD_GRASS;
	public static final DeferredBlock<Block> MAGIC_SAPLING;
	public static final DeferredBlock<Block> MAGIC_LOG;
	public static final DeferredBlock<Block> MAGIC_WOOD;
	public static final DeferredBlock<Block> STRIPPED_MAGIC_LOG;
	public static final DeferredBlock<Block> STRIPPED_MAGIC_WOOD;
	public static final DeferredBlock<Block> MAGIC_PLANKS;
	public static final DeferredBlock<Block> MAGIC_LEAVES;
	public static final DeferredBlock<Block> MAGIC_STAIRS;
	public static final DeferredBlock<Block> MAGIC_SLAB;
	public static final DeferredBlock<Block> MAGIC_FENCE;
	public static final DeferredBlock<Block> MAGIC_FENCE_GATE;
	public static final DeferredBlock<Block> MAGIC_DOOR;
	public static final DeferredBlock<Block> MAGIC_TRAPDOOR;
	public static final DeferredBlock<Block> MAGIC_PRESSURE_PLATE;
	public static final DeferredBlock<Block> MAGIC_BUTTON;
	public static final DeferredBlock<Block> CRYSTAL;
	public static final DeferredBlock<Block> MAGNETIC_ROCK;
	public static final DeferredBlock<Block> ANTI_MAGNETIC_ROCK;
	public static final DeferredBlock<Block> PALLADIO_BLOCK;
	public static final DeferredBlock<Block> YGGDRASIL_LOG;
	public static final DeferredBlock<Block> YGGDRASIL_WOOD;
	public static final DeferredBlock<Block> STRIPPED_YGGDRASIL_LOG;
	public static final DeferredBlock<Block> STRIPPED_YGGDRASIL_WOOD;
	public static final DeferredBlock<Block> YGGDRASIL_PLANKS;
	public static final DeferredBlock<Block> YGGDRASIL_LEAVES;
	public static final DeferredBlock<Block> YGGDRASIL_STAIRS;
	public static final DeferredBlock<Block> YGGDRASIL_SLAB;
	public static final DeferredBlock<Block> YGGDRASIL_FENCE;
	public static final DeferredBlock<Block> YGGDRASIL_FENCE_GATE;
	public static final DeferredBlock<Block> YGGDRASIL_DOOR;
	public static final DeferredBlock<Block> YGGDRASIL_TRAPDOOR;
	public static final DeferredBlock<Block> YGGDRASIL_PRESSURE_PLATE;
	public static final DeferredBlock<Block> YGGDRASIL_BUTTON;
	public static final DeferredBlock<Block> YGGDRASIL_SAPLING;
	public static final DeferredBlock<Block> URANIUM_BLOCK;
	public static final DeferredBlock<Block> SAND_OF_STAR;
	public static final DeferredBlock<Block> TOXIC_SAND;
	public static final DeferredBlock<Block> SKIES_STONE;
	public static final DeferredBlock<Block> MYTHRILL_ORE;
	public static final DeferredBlock<Block> SKIES_GRASS;
	public static final DeferredBlock<Block> SKIES_STONE_BRICKS;
	public static final DeferredBlock<Block> PEDESTAL;
	public static final DeferredBlock<Block> LUNAR_COBBLESTONE;
	public static final DeferredBlock<Block> LUNAR_COBBLE_SLAB;
	static {
		TITANIUM_ORE = register("titanium_ore", TitaniumOreBlock::new);
		VIBRANIUM_ORE = register("vibranium_ore", VibraniumOreBlock::new);
		ADAMANT_ORE = register("adamant_ore", AdamantOreBlock::new);
		DEEPWORLD_TRAVEL_MACHINE = register("deepworld_travel_machine", DeepworldTravelMachineBlock::new);
		DEEPWORLD_PORTAL = register("deepworld_portal", DeepworldPortalBlock::new);
		LUNAR_BLOCK = register("lunar_block", LunarBlockBlock::new);
		BLOOD_LOG = register("blood_log", BloodLogBlock::new);
		BLOOD_WOOD = register("blood_wood", BloodWoodBlock::new);
		STRIPPED_BLOOD_LOG = register("stripped_blood_log", StrippedBloodLogBlock::new);
		STRIPPED_BLOOD_WOOD = register("stripped_blood_wood", StrippedBloodWoodBlock::new);
		BLOOD_PLANKS = register("blood_planks", BloodPlanksBlock::new);
		BLOOD_LEAVES = register("blood_leaves", BloodLeavesBlock::new);
		BLOOD_STAIRS = register("blood_stairs", BloodStairsBlock::new);
		BLOOD_SLAB = register("blood_slab", BloodSlabBlock::new);
		BLOOD_FENCE = register("blood_fence", BloodFenceBlock::new);
		BLOOD_FENCE_GATE = register("blood_fence_gate", BloodFenceGateBlock::new);
		BLOOD_DOOR = register("blood_door", BloodDoorBlock::new);
		BLOOD_TRAPDOOR = register("blood_trapdoor", BloodTrapdoorBlock::new);
		BLOOD_PRESSURE_PLATE = register("blood_pressure_plate", BloodPressurePlateBlock::new);
		BLOOD_BUTTON = register("blood_button", BloodButtonBlock::new);
		BLOOD_SAPLING = register("blood_sapling", BloodSaplingBlock::new);
		ARMOR_FORGE = register("armor_forge", ArmorForgeBlock::new);
		GHOST_MUSHROOM = register("ghost_mushroom", GhostMushroomBlock::new);
		BLOOD_GRASS = register("blood_grass", BloodGrassBlock::new);
		MAGIC_SAPLING = register("magic_sapling", MagicSaplingBlock::new);
		MAGIC_LOG = register("magic_log", MagicLogBlock::new);
		MAGIC_WOOD = register("magic_wood", MagicWoodBlock::new);
		STRIPPED_MAGIC_LOG = register("stripped_magic_log", StrippedMagicLogBlock::new);
		STRIPPED_MAGIC_WOOD = register("stripped_magic_wood", StrippedMagicWoodBlock::new);
		MAGIC_PLANKS = register("magic_planks", MagicPlanksBlock::new);
		MAGIC_LEAVES = register("magic_leaves", MagicLeavesBlock::new);
		MAGIC_STAIRS = register("magic_stairs", MagicStairsBlock::new);
		MAGIC_SLAB = register("magic_slab", MagicSlabBlock::new);
		MAGIC_FENCE = register("magic_fence", MagicFenceBlock::new);
		MAGIC_FENCE_GATE = register("magic_fence_gate", MagicFenceGateBlock::new);
		MAGIC_DOOR = register("magic_door", MagicDoorBlock::new);
		MAGIC_TRAPDOOR = register("magic_trapdoor", MagicTrapdoorBlock::new);
		MAGIC_PRESSURE_PLATE = register("magic_pressure_plate", MagicPressurePlateBlock::new);
		MAGIC_BUTTON = register("magic_button", MagicButtonBlock::new);
		CRYSTAL = register("crystal", CrystalBlock::new);
		MAGNETIC_ROCK = register("magnetic_rock", MagneticRockBlock::new);
		ANTI_MAGNETIC_ROCK = register("anti_magnetic_rock", AntiMagneticRockBlock::new);
		PALLADIO_BLOCK = register("palladio_block", PalladioBlockBlock::new);
		YGGDRASIL_LOG = register("yggdrasil_log", YggdrasilLogBlock::new);
		YGGDRASIL_WOOD = register("yggdrasil_wood", YggdrasilWoodBlock::new);
		STRIPPED_YGGDRASIL_LOG = register("stripped_yggdrasil_log", StrippedYggdrasilLogBlock::new);
		STRIPPED_YGGDRASIL_WOOD = register("stripped_yggdrasil_wood", StrippedYggdrasilWoodBlock::new);
		YGGDRASIL_PLANKS = register("yggdrasil_planks", YggdrasilPlanksBlock::new);
		YGGDRASIL_LEAVES = register("yggdrasil_leaves", YggdrasilLeavesBlock::new);
		YGGDRASIL_STAIRS = register("yggdrasil_stairs", YggdrasilStairsBlock::new);
		YGGDRASIL_SLAB = register("yggdrasil_slab", YggdrasilSlabBlock::new);
		YGGDRASIL_FENCE = register("yggdrasil_fence", YggdrasilFenceBlock::new);
		YGGDRASIL_FENCE_GATE = register("yggdrasil_fence_gate", YggdrasilFenceGateBlock::new);
		YGGDRASIL_DOOR = register("yggdrasil_door", YggdrasilDoorBlock::new);
		YGGDRASIL_TRAPDOOR = register("yggdrasil_trapdoor", YggdrasilTrapdoorBlock::new);
		YGGDRASIL_PRESSURE_PLATE = register("yggdrasil_pressure_plate", YggdrasilPressurePlateBlock::new);
		YGGDRASIL_BUTTON = register("yggdrasil_button", YggdrasilButtonBlock::new);
		YGGDRASIL_SAPLING = register("yggdrasil_sapling", YggdrasilSaplingBlock::new);
		URANIUM_BLOCK = register("uranium_block", UraniumBlockBlock::new);
		SAND_OF_STAR = register("sand_of_star", SandOfStarBlock::new);
		TOXIC_SAND = register("toxic_sand", ToxicSandBlock::new);
		SKIES_STONE = register("skies_stone", SkiesStoneBlock::new);
		MYTHRILL_ORE = register("mythrill_ore", MythrillOreBlock::new);
		SKIES_GRASS = register("skies_grass", SkiesGrassBlock::new);
		SKIES_STONE_BRICKS = register("skies_stone_bricks", SkiesStoneBricksBlock::new);
		PEDESTAL = register("pedestal", PedestalBlock::new);
		LUNAR_COBBLESTONE = register("lunar_cobblestone", LunarCobblestoneBlock::new);
		LUNAR_COBBLE_SLAB = register("lunar_cobble_slab", LunarCobbleSlabBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}