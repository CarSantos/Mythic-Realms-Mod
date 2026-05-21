package net.mcreator.mythicrealms.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.mythicrealms.init.MythicrealmsModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements MythicrealmsModBiomes.MythicrealmsModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> mythicrealms_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.mythicrealms_dimensionTypeReference != null) {
			retval = MythicrealmsModBiomes.adaptSurfaceRule(retval, this.mythicrealms_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setmythicrealmsDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.mythicrealms_dimensionTypeReference = dimensionType;
	}
}