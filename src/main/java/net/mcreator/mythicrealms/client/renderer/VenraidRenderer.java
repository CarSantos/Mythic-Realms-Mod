package net.mcreator.mythicrealms.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.animation.KeyframeAnimation;

import net.mcreator.mythicrealms.entity.VenraidEntity;
import net.mcreator.mythicrealms.client.model.animations.VenraidAnimation;
import net.mcreator.mythicrealms.client.model.ModelVenraid;

public class VenraidRenderer extends MobRenderer<VenraidEntity, LivingEntityRenderState, ModelVenraid> {
	private VenraidEntity entity = null;

	public VenraidRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelVenraid.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(VenraidEntity entity, LivingEntityRenderState state, float partialTicks) {
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
		return ResourceLocation.parse("mythicrealms:textures/entities/venraid.png");
	}

	private static final class AnimatedModel extends ModelVenraid {
		private VenraidEntity entity = null;
		private final KeyframeAnimation keyframeAnimation0;
		private final KeyframeAnimation keyframeAnimation1;

		public AnimatedModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = VenraidAnimation.idle.bake(root);
			this.keyframeAnimation1 = VenraidAnimation.walk.bake(root);
		}

		public void setEntity(VenraidEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.keyframeAnimation0.apply(entity.animationState0, state.ageInTicks, 1f);
			this.keyframeAnimation1.apply(entity.animationState1, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}
}