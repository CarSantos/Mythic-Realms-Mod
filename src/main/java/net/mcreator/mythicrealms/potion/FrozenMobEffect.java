package net.mcreator.mythicrealms.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.mythicrealms.procedures.FrozenOnEffectActiveTickProcedure;
import net.mcreator.mythicrealms.MythicrealmsMod;

public class FrozenMobEffect extends MobEffect {
	public FrozenMobEffect() {
		super(MobEffectCategory.HARMFUL, -3342337);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, ResourceLocation.fromNamespaceAndPath(MythicrealmsMod.MODID, "effect.frozen_0"), -0.3, AttributeModifier.Operation.ADD_MULTIPLIED_BASE);
		this.addAttributeModifier(Attributes.SNEAKING_SPEED, ResourceLocation.fromNamespaceAndPath(MythicrealmsMod.MODID, "effect.frozen_1"), -0.3, AttributeModifier.Operation.ADD_MULTIPLIED_BASE);
		this.addAttributeModifier(Attributes.MOVEMENT_EFFICIENCY, ResourceLocation.fromNamespaceAndPath(MythicrealmsMod.MODID, "effect.frozen_2"), -0.3, AttributeModifier.Operation.ADD_MULTIPLIED_BASE);
		this.addAttributeModifier(Attributes.JUMP_STRENGTH, ResourceLocation.fromNamespaceAndPath(MythicrealmsMod.MODID, "effect.frozen_3"), -0.3, AttributeModifier.Operation.ADD_MULTIPLIED_BASE);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
		FrozenOnEffectActiveTickProcedure.execute(entity);
		return super.applyEffectTick(level, entity, amplifier);
	}
}