package net.mcreator.mythicrealms.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.animation.KeyframeAnimation;

import net.mcreator.mythicrealms.entity.NightmareHorseEntity;
import net.mcreator.mythicrealms.client.model.animations.GhostHorseAnimation;
import net.mcreator.mythicrealms.client.model.ModelNightmareHorse;

import com.mojang.blaze3d.vertex.PoseStack;

public class NightmareHorseRenderer extends MobRenderer<NightmareHorseEntity, LivingEntityRenderState, ModelNightmareHorse> {
	private NightmareHorseEntity entity = null;

	public NightmareHorseRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelNightmareHorse.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(NightmareHorseEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		if (entity != null)
			return ResourceLocation.parse("mythicrealms:textures/entities/" + entity.getTexture() + ".png");
		return ResourceLocation.parse("mythicrealms:textures/entities/nightmarehorse.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(entity.getAgeScale(), entity.getAgeScale(), entity.getAgeScale());
	}

	private static final class AnimatedModel extends ModelNightmareHorse {
		private NightmareHorseEntity entity = null;
		private final KeyframeAnimation keyframeAnimation0;
		private final KeyframeAnimation keyframeAnimation1;
		private final KeyframeAnimation keyframeAnimation2;

		public AnimatedModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = GhostHorseAnimation.walk.bake(root);
			this.keyframeAnimation1 = GhostHorseAnimation.run.bake(root);
			this.keyframeAnimation2 = GhostHorseAnimation.refuse.bake(root);
		}

		public void setEntity(NightmareHorseEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.keyframeAnimation0.apply(entity.animationState0, state.ageInTicks, 1f);
			this.keyframeAnimation1.apply(entity.animationState1, state.ageInTicks, 1f);
			this.keyframeAnimation2.apply(entity.animationState2, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}
}