package net.mcreator.mythicrealms.procedures;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class UnicornOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livingEntity1 && _livingEntity1.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
			_livingEntity1.getAttribute(Attributes.MAX_HEALTH).setBaseValue((Mth.nextInt(RandomSource.create(), 20, 40)));
		if (entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(Attributes.BURNING_TIME))
			_livingEntity2.getAttribute(Attributes.BURNING_TIME).setBaseValue(0);
		if (entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(Attributes.JUMP_STRENGTH))
			_livingEntity4.getAttribute(Attributes.JUMP_STRENGTH).setBaseValue((Mth.nextInt(RandomSource.create(), (int) 0.5, (int) 1.2)));
		if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 1));
		}
		if (entity instanceof LivingEntity _livingEntity11 && _livingEntity11.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
			_livingEntity11.getAttribute(Attributes.MOVEMENT_SPEED)
					.setBaseValue(((entity instanceof LivingEntity _livingEntity9 && _livingEntity9.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED) ? _livingEntity9.getAttribute(Attributes.MOVEMENT_SPEED).getBaseValue() : 0)
							+ Mth.nextInt(RandomSource.create(), 0, (int) 0.3)));
	}
}