package net.mcreator.mythicrealms.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.animation.KeyframeAnimation;

import net.mcreator.mythicrealms.entity.SturgeonEntity;
import net.mcreator.mythicrealms.client.model.animations.ichthystAnimation;
import net.mcreator.mythicrealms.client.model.ModelSturgeon;

public class SturgeonRenderer extends MobRenderer<SturgeonEntity, LivingEntityRenderState, ModelSturgeon> {
	private SturgeonEntity entity = null;

	public SturgeonRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelSturgeon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SturgeonEntity entity, LivingEntityRenderState state, float partialTicks) {
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
		return ResourceLocation.parse("mythicrealms:textures/entities/sturgeon.png");
	}

	private static final class AnimatedModel extends ModelSturgeon {
		private SturgeonEntity entity = null;
		private final KeyframeAnimation keyframeAnimation0;

		public AnimatedModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = ichthystAnimation.swim.bake(root);
		}

		public void setEntity(SturgeonEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.keyframeAnimation0.apply(entity.animationState0, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}
}