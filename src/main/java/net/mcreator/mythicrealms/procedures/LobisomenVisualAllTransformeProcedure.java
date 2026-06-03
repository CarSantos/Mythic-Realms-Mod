package net.mcreator.mythicrealms.procedures;

import net.neoforged.neoforge.client.event.RenderLivingEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import net.mcreator.mythicrealms.init.MythicrealmsModRenderStateModifiers;
import net.mcreator.mythicrealms.init.MythicrealmsModMobEffects;
import net.mcreator.mythicrealms.client.model.ModelLobisomen;

import javax.annotation.Nullable;

import java.util.Calendar;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

@EventBusSubscriber(Dist.CLIENT)
public class LobisomenVisualAllTransformeProcedure {
	@SubscribeEvent
	public static void onEntityRendered(RenderLivingEvent.Pre event) {
		Entity entity = (Entity) event.getRenderState().getRenderData(MythicrealmsModRenderStateModifiers.LIVING_ENTITY);
		execute(event, entity.level(), entity, event);
	}

	public static void renderEntity(RenderLivingEvent entityRenderEvent, EntityModel model, VertexConsumer vertexConsumer, LivingEntityRenderState state) {
		PoseStack poseStack = entityRenderEvent.getPoseStack();
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(180.0F - state.bodyRot));
		if (state.deathTime > 0) {
			float f = ((float) state.deathTime + entityRenderEvent.getPartialTick() - 1f) / 20f * 1.6f;
			f = Mth.sqrt(f);
			if (f > 1f) {
				f = 1f;
			}
			poseStack.mulPose(Axis.ZP.rotationDegrees(f * 90f));
		}
		poseStack.scale(-1, -1, 1);
		poseStack.translate(0.0D, -1.501, 0.0D);
		model.setupAnim(state);
		model.renderToBuffer(poseStack, vertexConsumer, entityRenderEvent.getPackedLight(), LivingEntityRenderer.getOverlayCoords(state, 0));
		poseStack.popPose();
	}

	public static void execute(LevelAccessor world, Entity entity, RenderLivingEvent entityRenderEvent) {
		execute(null, world, entity, entityRenderEvent);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, RenderLivingEvent entityRenderEvent) {
		if (entity == null || entityRenderEvent == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MythicrealmsModMobEffects.WEREWOLF_EFFECT) && (world instanceof Level _lvl1 && _lvl1.isBrightOutside()) == false && world.dimensionType().moonPhase(world.dayTime()) == 0) {
			{
				ResourceLocation texture = (ResourceLocation.fromNamespaceAndPath("mythicrealms", "textures/entities/lobisomen.png"));
				renderEntity(entityRenderEvent, (new ModelLobisomen(Minecraft.getInstance().getEntityModels().bakeLayer(ModelLobisomen.LAYER_LOCATION))), entityRenderEvent.getMultiBufferSource().getBuffer(RenderType.entityCutout(texture)),
						entityRenderEvent.getRenderState());
			}
		}
		if (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 13) {
			{
				ResourceLocation texture = (ResourceLocation.fromNamespaceAndPath("mythicrealms", "textures/entities/lobisomen.png"));
				renderEntity(entityRenderEvent, (new ModelLobisomen(Minecraft.getInstance().getEntityModels().bakeLayer(ModelLobisomen.LAYER_LOCATION))), entityRenderEvent.getMultiBufferSource().getBuffer(RenderType.entityCutout(texture)),
						entityRenderEvent.getRenderState());
			}
		}
	}
}