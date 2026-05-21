package net.mcreator.mythicrealms.mixin;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.renderer.entity.state.PlayerRenderState;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.model.PlayerModel;

import net.mcreator.mythicrealms.MythicrealmsModPlayerAnimationAPI;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.PoseStack;

@Mixin(PlayerRenderer.class)
public abstract class PlayerAnimationRendererMixin extends LivingEntityRenderer<AbstractClientPlayer, PlayerRenderState, PlayerModel> {
	public PlayerAnimationRendererMixin(EntityRendererProvider.Context context, boolean slim) {
		super(null, null, 0.5f);
	}

	private String master = null;

	@Inject(method = "Lnet/minecraft/client/renderer/entity/player/PlayerRenderer;setupRotations(Lnet/minecraft/client/renderer/entity/state/PlayerRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;FF)V", at = @At("RETURN"))
	private void setupRotations(PlayerRenderState renderState, PoseStack poseStack, float bodyRot, float scale_, CallbackInfo ci) {
		Player player = (Player) renderState.getRenderData(MythicrealmsModPlayerAnimationAPI.ClientAttachments.PLAYER);
		if (player == null)
			return;
		if (master == null) {
			if (!MythicrealmsModPlayerAnimationAPI.animations.isEmpty())
				master = "mythicrealms";
			else
				return;
		}
		if (!master.equals("mythicrealms"))
			return;
		MythicrealmsModPlayerAnimationAPI.PlayerAnimation animation = MythicrealmsModPlayerAnimationAPI.active_animations.get(player);
		if (animation == null)
			return;
		MythicrealmsModPlayerAnimationAPI.PlayerBone bone = animation.bones.get("body");
		if (bone == null)
			return;
		float animationProgress = player.getPersistentData().getFloatOr("PlayerAnimationProgress", 0);
		Vec3 scale = MythicrealmsModPlayerAnimationAPI.PlayerBone.interpolate(bone.scales, animationProgress);
		if (scale != null) {
			poseStack.scale((float) scale.x, (float) scale.y, (float) scale.z);
		}
		Vec3 position = MythicrealmsModPlayerAnimationAPI.PlayerBone.interpolate(bone.positions, animationProgress);
		if (position != null) {
			poseStack.translate((float) -position.x * 0.0625f, (float) (position.y * 0.0625f), (float) position.z * 0.0625f);
		}
		Vec3 rotation = MythicrealmsModPlayerAnimationAPI.PlayerBone.interpolate(bone.rotations, animationProgress);
		if (rotation != null) {
			poseStack.mulPose(Axis.ZP.rotationDegrees((float) rotation.z));
			poseStack.mulPose(Axis.YP.rotationDegrees((float) -rotation.y));
			poseStack.mulPose(Axis.XP.rotationDegrees((float) -rotation.x));
		}
	}
}