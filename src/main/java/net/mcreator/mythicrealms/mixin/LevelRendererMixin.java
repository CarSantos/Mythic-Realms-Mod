package net.mcreator.mythicrealms.mixin;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Camera;

import net.mcreator.mythicrealms.MythicrealmsModPlayerAnimationAPI;

import java.util.List;

@Mixin(LevelRenderer.class)
public abstract class LevelRendererMixin {
	private String master = null;

	@Inject(method = "collectVisibleEntities", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Camera;isDetached()Z"))
	private void fakeThirdPersonMode(Camera camera, Frustum frustum, List<Entity> entities, CallbackInfoReturnable<Boolean> cir) {
		if (master == null) {
			if (!MythicrealmsModPlayerAnimationAPI.animations.isEmpty())
				master = "mythicrealms";
			else
				return;
		}
		if (!master.equals("mythicrealms")) {
			return;
		}
		if (camera.getEntity() instanceof Player player && player.getPersistentData().getBooleanOr("FirstPersonAnimation", false) && Minecraft.getInstance().player == player) {
			((CameraAccessor) camera).setDetached(true);
		}
	}

	@Inject(method = "collectVisibleEntities", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Camera;isDetached()Z", shift = At.Shift.AFTER))
	private void resetThirdPerson(Camera camera, Frustum frustum, List<Entity> entities, CallbackInfoReturnable<Boolean> cir) {
		if (master == null) {
			if (!MythicrealmsModPlayerAnimationAPI.animations.isEmpty())
				master = "mythicrealms";
			else
				return;
		}
		if (!master.equals("mythicrealms")) {
			return;
		}
		((CameraAccessor) camera).setDetached(false);
	}
}