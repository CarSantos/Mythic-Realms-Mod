package net.mcreator.mythicrealms.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.Minecraft;

import net.mcreator.mythicrealms.procedures.IdleConditionProcedure;
import net.mcreator.mythicrealms.entity.LavaGolemEntity;
import net.mcreator.mythicrealms.client.model.animations.Lava_GolemAnimation;
import net.mcreator.mythicrealms.client.model.ModelLava_Golem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class LavaGolemRenderer extends MobRenderer<LavaGolemEntity, LivingEntityRenderState, ModelLava_Golem> {
	private LavaGolemEntity entity = null;

	public LavaGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelLava_Golem.LAYER_LOCATION)), 0.7f);
		this.addLayer(new RenderLayer<>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("mythicrealms:textures/entities/lava_golem_glow.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LivingEntityRenderState state, float headYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (IdleConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new ModelLava_Golem(Minecraft.getInstance().getEntityModels().bakeLayer(ModelLava_Golem.LAYER_LOCATION));
					model.setupAnim(state);
					model.renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY);
				}
			}
		});
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(LavaGolemEntity entity, LivingEntityRenderState state, float partialTicks) {
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
		return ResourceLocation.parse("mythicrealms:textures/entities/lava_golem.png");
	}

	private static final class AnimatedModel extends ModelLava_Golem {
		private LavaGolemEntity entity = null;
		private final KeyframeAnimation keyframeAnimation0;
		private final KeyframeAnimation keyframeAnimation1;

		public AnimatedModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = Lava_GolemAnimation.idle.bake(root);
			this.keyframeAnimation1 = Lava_GolemAnimation.walk.bake(root);
		}

		public void setEntity(LavaGolemEntity entity) {
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