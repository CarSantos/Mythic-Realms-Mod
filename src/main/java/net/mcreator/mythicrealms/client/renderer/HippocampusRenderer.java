package net.mcreator.mythicrealms.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.animation.KeyframeAnimation;

import net.mcreator.mythicrealms.entity.HippocampusEntity;
import net.mcreator.mythicrealms.client.model.animations.HippocampusAnimation;
import net.mcreator.mythicrealms.client.model.ModelHippocampus;

import com.mojang.blaze3d.vertex.PoseStack;

public class HippocampusRenderer extends MobRenderer<HippocampusEntity, LivingEntityRenderState, ModelHippocampus> {
	private HippocampusEntity entity = null;

	public HippocampusRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelHippocampus.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(HippocampusEntity entity, LivingEntityRenderState state, float partialTicks) {
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
		return ResourceLocation.parse("mythicrealms:textures/entities/hippocampus.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(1.1f, 1.1f, 1.1f);
		poseStack.scale(entity.getAgeScale(), entity.getAgeScale(), entity.getAgeScale());
	}

	private static final class AnimatedModel extends ModelHippocampus {
		private HippocampusEntity entity = null;
		private final KeyframeAnimation keyframeAnimation0;
		private final KeyframeAnimation keyframeAnimation1;
		private final KeyframeAnimation keyframeAnimation2;

		public AnimatedModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = HippocampusAnimation.Swim.bake(root);
			this.keyframeAnimation1 = HippocampusAnimation.SwimIdle.bake(root);
			this.keyframeAnimation2 = HippocampusAnimation.idle.bake(root);
		}

		public void setEntity(HippocampusEntity entity) {
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