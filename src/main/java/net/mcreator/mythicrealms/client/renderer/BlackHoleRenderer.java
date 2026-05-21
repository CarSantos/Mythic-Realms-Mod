package net.mcreator.mythicrealms.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.Minecraft;

import net.mcreator.mythicrealms.entity.BlackHoleEntity;
import net.mcreator.mythicrealms.client.model.animations.BlackHoleAnimation;
import net.mcreator.mythicrealms.client.model.ModelBlackHole;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BlackHoleRenderer extends MobRenderer<BlackHoleEntity, LivingEntityRenderState, ModelBlackHole> {
	private BlackHoleEntity entity = null;

	public BlackHoleRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelBlackHole.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mythicrealms:textures/entities/blackholeglow.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LivingEntityRenderState state, float headYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				EntityModel model = new ModelBlackHole(Minecraft.getInstance().getEntityModels().bakeLayer(ModelBlackHole.LAYER_LOCATION));
				model.setupAnim(state);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(state, 0));
			}
		});
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BlackHoleEntity entity, LivingEntityRenderState state, float partialTicks) {
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
		return ResourceLocation.parse("mythicrealms:textures/entities/blackhole.png");
	}

	private static final class AnimatedModel extends ModelBlackHole {
		private BlackHoleEntity entity = null;
		private final KeyframeAnimation keyframeAnimation0;

		public AnimatedModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = BlackHoleAnimation.idle.bake(root);
		}

		public void setEntity(BlackHoleEntity entity) {
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