package net.mcreator.mythicrealms.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.mythicrealms.procedures.ZombieOnEntityDeathProcedure;
import net.mcreator.mythicrealms.procedures.ZombieOnEffectActiveTickProcedure;
import net.mcreator.mythicrealms.MythicrealmsMod;

public class ZombieMobEffect extends MobEffect {
	public ZombieMobEffect() {
		super(MobEffectCategory.HARMFUL, -13408768);
		this.addAttributeModifier(Attributes.ARMOR, ResourceLocation.fromNamespaceAndPath(MythicrealmsMod.MODID, "effect.zombie_0"), 1, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, ResourceLocation.fromNamespaceAndPath(MythicrealmsMod.MODID, "effect.zombie_1"), 0.5, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, ResourceLocation.fromNamespaceAndPath(MythicrealmsMod.MODID, "effect.zombie_2"), -0.5, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
		ZombieOnEffectActiveTickProcedure.execute(level, entity);
		return super.applyEffectTick(level, entity, amplifier);
	}

	@Override
	public void onMobRemoved(ServerLevel level, LivingEntity entity, int amplifier, Entity.RemovalReason reason) {
		if (reason == Entity.RemovalReason.KILLED) {
			ZombieOnEntityDeathProcedure.execute(level, entity.getX(), entity.getY(), entity.getZ());
		}
	}
}