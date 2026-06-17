package net.mcreator.mythicrealms.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.mythicrealms.procedures.MoonSwordLivingEntityIsHitWithToolProcedure;

public class MoonSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 16224, 4f, 0, 64, TagKey.create(Registries.ITEM, ResourceLocation.parse("mythicrealms:moon_sword_repair_items")));

	public MoonSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 19f, -3f).fireResistant());
	}

	@Override
	public void hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		super.hurtEnemy(itemstack, entity, sourceentity);
		MoonSwordLivingEntityIsHitWithToolProcedure.execute(entity);
	}
}