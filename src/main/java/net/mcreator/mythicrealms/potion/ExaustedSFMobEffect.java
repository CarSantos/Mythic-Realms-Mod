package net.mcreator.mythicrealms.potion;

import net.neoforged.neoforge.common.NeoForgeMod;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.mythicrealms.MythicrealmsMod;

public class ExaustedSFMobEffect extends MobEffect {
	public ExaustedSFMobEffect() {
		super(MobEffectCategory.HARMFUL, -15466475);
		this.addAttributeModifier(Attributes.ARMOR, ResourceLocation.fromNamespaceAndPath(MythicrealmsMod.MODID, "effect.exausted_sf_0"), -0.2, AttributeModifier.Operation.ADD_MULTIPLIED_BASE);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, ResourceLocation.fromNamespaceAndPath(MythicrealmsMod.MODID, "effect.exausted_sf_1"), -0.2, AttributeModifier.Operation.ADD_MULTIPLIED_BASE);
		this.addAttributeModifier(Attributes.FLYING_SPEED, ResourceLocation.fromNamespaceAndPath(MythicrealmsMod.MODID, "effect.exausted_sf_2"), -0.2, AttributeModifier.Operation.ADD_MULTIPLIED_BASE);
		this.addAttributeModifier(Attributes.JUMP_STRENGTH, ResourceLocation.fromNamespaceAndPath(MythicrealmsMod.MODID, "effect.exausted_sf_3"), -0.2, AttributeModifier.Operation.ADD_MULTIPLIED_BASE);
		this.addAttributeModifier(Attributes.MAX_HEALTH, ResourceLocation.fromNamespaceAndPath(MythicrealmsMod.MODID, "effect.exausted_sf_4"), -0.2, AttributeModifier.Operation.ADD_MULTIPLIED_BASE);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, ResourceLocation.fromNamespaceAndPath(MythicrealmsMod.MODID, "effect.exausted_sf_5"), -0.2, AttributeModifier.Operation.ADD_MULTIPLIED_BASE);
		this.addAttributeModifier(Attributes.OXYGEN_BONUS, ResourceLocation.fromNamespaceAndPath(MythicrealmsMod.MODID, "effect.exausted_sf_6"), -0.2, AttributeModifier.Operation.ADD_MULTIPLIED_BASE);
		this.addAttributeModifier(Attributes.SAFE_FALL_DISTANCE, ResourceLocation.fromNamespaceAndPath(MythicrealmsMod.MODID, "effect.exausted_sf_7"), -0.2, AttributeModifier.Operation.ADD_MULTIPLIED_BASE);
		this.addAttributeModifier(Attributes.SNEAKING_SPEED, ResourceLocation.fromNamespaceAndPath(MythicrealmsMod.MODID, "effect.exausted_sf_8"), -0.2, AttributeModifier.Operation.ADD_MULTIPLIED_BASE);
		this.addAttributeModifier(NeoForgeMod.SWIM_SPEED, ResourceLocation.fromNamespaceAndPath(MythicrealmsMod.MODID, "effect.exausted_sf_9"), -0.2, AttributeModifier.Operation.ADD_MULTIPLIED_BASE);
	}
}