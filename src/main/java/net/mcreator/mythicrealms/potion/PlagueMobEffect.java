package net.mcreator.mythicrealms.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.mythicrealms.procedures.PlagueActiveTickConditionProcedure;
import net.mcreator.mythicrealms.MythicrealmsMod;

public class PlagueMobEffect extends MobEffect {
	public PlagueMobEffect() {
		super(MobEffectCategory.HARMFUL, -13408768);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, ResourceLocation.fromNamespaceAndPath(MythicrealmsMod.MODID, "effect.plague_0"), 0.5, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, ResourceLocation.fromNamespaceAndPath(MythicrealmsMod.MODID, "effect.plague_1"), 0.5, AttributeModifier.Operation.ADD_VALUE);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
		PlagueActiveTickConditionProcedure.execute(level, entity.getX(), entity.getY(), entity.getZ(), entity);
		return super.applyEffectTick(level, entity, amplifier);
	}
}