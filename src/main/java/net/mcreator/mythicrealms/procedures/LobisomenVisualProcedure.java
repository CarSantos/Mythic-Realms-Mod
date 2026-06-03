package net.mcreator.mythicrealms.procedures;

import org.joml.Vector3f;

import net.neoforged.neoforge.client.event.RenderPlayerEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.client.renderer.entity.state.PlayerRenderState;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.model.EntityModel;

import net.mcreator.mythicrealms.init.MythicrealmsModRenderStateModifiers;
import net.mcreator.mythicrealms.init.MythicrealmsModMobEffects;
import net.mcreator.mythicrealms.init.MythicrealmsModHumanoidModels;

import javax.annotation.Nullable;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Collection;
import java.util.Calendar;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

@EventBusSubscriber(Dist.CLIENT)
public class LobisomenVisualProcedure {
	@SubscribeEvent
	public static void onPlayerRendered(RenderPlayerEvent.Pre event) {
		Entity entity = (Entity) event.getRenderState().getRenderData(MythicrealmsModRenderStateModifiers.LIVING_ENTITY);
		execute(event, entity.level(), entity, event);
	}

	public static Collection<Runnable> capes = new ConcurrentLinkedQueue<>();

	public static void offsetScale(PlayerModel model, Vector3f offset) {
		model.head.offsetScale(offset);
		model.head.y += offset.x() > 0 ? 0.05 : -0.05;
		model.body.offsetScale(offset);
		model.leftArm.offsetScale(offset);
		model.rightArm.offsetScale(offset);
		model.leftLeg.offsetScale(offset);
		model.rightLeg.offsetScale(offset);
		model.hat.offsetScale(offset);
		model.hat.y += offset.x() > 0 ? 0.05 : -0.05;
		model.jacket.offsetScale(offset);
		model.leftSleeve.offsetScale(offset);
		model.rightSleeve.offsetScale(offset);
		model.leftPants.offsetScale(offset);
		model.rightPants.offsetScale(offset);
	}

	public static void renderHumanoid(RenderPlayerEvent playerRenderEvent, PlayerModel model, VertexConsumer vertexConsumer, PlayerRenderState state) {
		PoseStack poseStack = playerRenderEvent.getPoseStack();
		poseStack.pushPose();
		CompoundTag playerData = state.getRenderData(MythicrealmsModRenderStateModifiers.LIVING_ENTITY).getPersistentData();
		float oldAnimationProgress = 0;
		float oldAgeInTicks = 0;
		if (playerData.contains("PlayerAnimationProgress")) {
			oldAnimationProgress = playerData.getFloatOr("PlayerAnimationProgress", 0);
			oldAgeInTicks = playerData.getFloatOr("LastTickTime", 0);
		}
		model.setupAnim(state);
		if (playerData.contains("PlayerAnimationProgress") && playerData.getFloatOr("PlayerAnimationProgress", 0) > 0) {
			playerData.putFloat("PlayerAnimationProgress", oldAnimationProgress);
			playerData.putFloat("LastTickTime", oldAgeInTicks);
		} else if (oldAnimationProgress > 0) {
			model.setupAnim(state);
		}
		playerRenderEvent.getRenderer().setupRotations(state, poseStack, state.bodyRot, 0);
		poseStack.scale(-0.938f, -0.938f, 0.938f);
		poseStack.translate(0.0D, -1.501, 0.0D);
		Vector3f offset = new Vector3f(0.015f);
		offsetScale(model, offset);
		if (!capes.isEmpty()) {
			capes.forEach(cape -> cape.run());
			capes.clear();
		}
		model.renderToBuffer(poseStack, vertexConsumer, playerRenderEvent.getPackedLight(), LivingEntityRenderer.getOverlayCoords(state, 0));
		offset.negate();
		offsetScale(model, offset);
		poseStack.popPose();
	}

	public static void renderEntity(RenderPlayerEvent playerRenderEvent, EntityModel model, VertexConsumer vertexConsumer, LivingEntityRenderState state) {
		PoseStack poseStack = playerRenderEvent.getPoseStack();
		poseStack.pushPose();
		playerRenderEvent.getRenderer().setupRotations((PlayerRenderState) state, poseStack, state.bodyRot, 0);
		poseStack.scale(-0.938f, -0.938f, 0.938f);
		poseStack.translate(0.0D, -1.501, 0.0D);
		model.setupAnim(state);
		model.renderToBuffer(poseStack, vertexConsumer, playerRenderEvent.getPackedLight(), LivingEntityRenderer.getOverlayCoords(state, 0));
		poseStack.popPose();
	}

	public static void execute(LevelAccessor world, Entity entity, RenderPlayerEvent playerRenderEvent) {
		execute(null, world, entity, playerRenderEvent);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, RenderPlayerEvent playerRenderEvent) {
		if (entity == null || playerRenderEvent == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MythicrealmsModMobEffects.WEREWOLF_EFFECT) && (world instanceof Level _lvl1 && _lvl1.isBrightOutside()) == false && world.dimensionType().moonPhase(world.dayTime()) == 0) {
			{
				ResourceLocation texture = (ResourceLocation.fromNamespaceAndPath("mythicrealms", "textures/entities/lobisomen.png"));
				renderHumanoid(playerRenderEvent, MythicrealmsModHumanoidModels.LOBISOMEN_MODEL, playerRenderEvent.getMultiBufferSource().getBuffer(RenderType.entityCutout(texture)), playerRenderEvent.getRenderState());
			}
			if (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 13) {
				{
					ResourceLocation texture = (ResourceLocation.fromNamespaceAndPath("mythicrealms", "textures/entities/lobisomen.png"));
					renderHumanoid(playerRenderEvent, MythicrealmsModHumanoidModels.LOBISOMEN_MODEL, playerRenderEvent.getMultiBufferSource().getBuffer(RenderType.entityCutout(texture)), playerRenderEvent.getRenderState());
				}
			}
		}
	}
}