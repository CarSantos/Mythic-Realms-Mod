package net.mcreator.mythicrealms.client.model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelSturgeon extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mythicrealms", "model_sturgeon"), "main");
	public final ModelPart ichthyst;
	public final ModelPart body;
	public final ModelPart torso;
	public final ModelPart right_leg;
	public final ModelPart left_leg;
	public final ModelPart tail;
	public final ModelPart tail2;
	public final ModelPart tail3;
	public final ModelPart torso2;
	public final ModelPart right_arm;
	public final ModelPart left_arm;
	public final ModelPart neck;
	public final ModelPart head;
	public final ModelPart jaw;
	public final ModelPart eyes;

	public ModelSturgeon(ModelPart root) {
		super(root);
		this.ichthyst = root.getChild("ichthyst");
		this.body = this.ichthyst.getChild("body");
		this.torso = this.body.getChild("torso");
		this.right_leg = this.torso.getChild("right_leg");
		this.left_leg = this.torso.getChild("left_leg");
		this.tail = this.torso.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.torso2 = this.body.getChild("torso2");
		this.right_arm = this.torso2.getChild("right_arm");
		this.left_arm = this.torso2.getChild("left_arm");
		this.neck = this.torso2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.eyes = this.head.getChild("eyes");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition ichthyst = partdefinition.addOrReplaceChild("ichthyst", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -5.0F));
		PartDefinition body = ichthyst.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -7.9F, 2.0F));
		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(32, 20).addBox(-3.0F, -7.4F, -1.0F, 6.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.8F, 2.0F));
		PartDefinition torso_r1 = torso.addOrReplaceChild("torso_r1", CubeListBuilder.create().texOffs(24, 62).addBox(0.5F, -6.9F, -3.9F, 1.0F, 9.7F, 4.9F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -6.8F, 0.0F, -0.5672F, 0.0F, 0.0F));
		PartDefinition right_leg = torso.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-5.0F, 1.0832F, 5.5F));
		PartDefinition right_leg_r1 = right_leg.addOrReplaceChild("right_leg_r1", CubeListBuilder.create().texOffs(34, 16).addBox(-7.0F, -4.5168F, 8.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 4.0168F, -9.5F, 0.0F, 0.1309F, 0.0F));
		PartDefinition left_leg = torso.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(5.0F, 1.0832F, 5.5F));
		PartDefinition left_leg_r1 = left_leg.addOrReplaceChild("left_leg_r1", CubeListBuilder.create().texOffs(48, 16).addBox(3.0F, -4.5168F, 8.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 4.0168F, -9.5F, 0.0F, -0.1309F, 0.0F));
		PartDefinition tail = torso.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(34, 0).addBox(-2.7611F, -2.0F, -0.0171F, 5.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.1F, 8.0F));
		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 20).addBox(-2.0F, -2.5F, 0.0F, 4.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.2611F, 1.0F, 9.9829F));
		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 17.0F));
		PartDefinition tail3_r1 = tail3.addOrReplaceChild("tail3_r1", CubeListBuilder.create().texOffs(48, 51).addBox(0.5F, -1.0F, -1.0F, 1.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -2.0F, -6.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition tail3_r2 = tail3.addOrReplaceChild("tail3_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -3.0F, -1.0F, 3.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, -5.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition torso2 = body.addOrReplaceChild("torso2", CubeListBuilder.create().texOffs(0, 37).addBox(-4.0F, -4.6F, -4.0F, 8.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition right_arm = torso2.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-3.5F, 3.4F, -2.5F));
		PartDefinition right_arm_r1 = right_arm.addOrReplaceChild("right_arm_r1", CubeListBuilder.create().texOffs(62, 16).addBox(-10.0F, -5.0F, -2.0F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, 4.5F, 0.5F, 0.0F, 0.2618F, 0.0F));
		PartDefinition left_arm = torso2.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(3.5F, 3.4F, -2.5F));
		PartDefinition left_arm_r1 = left_arm.addOrReplaceChild("left_arm_r1", CubeListBuilder.create().texOffs(62, 21).addBox(3.0F, -5.0F, -2.0F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, 4.5F, 0.5F, 0.0F, -0.2618F, 0.0F));
		PartDefinition neck = torso2.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(52, 38).addBox(-3.5F, -3.5F, -1.5F, 7.0F, 7.0F, 3.0F, new CubeDeformation(-0.14F)), PartPose.offset(0.0F, -0.65F, -4.8F));
		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -0.7289F, -0.6423F));
		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(26, 38).addBox(-1.5F, -9.05F, -21.4F, 3.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.6789F, 7.4423F, 0.1309F, 0.0F, 0.0F));
		PartDefinition head_r2 = head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(0, 51).addBox(-3.5F, -1.8F, -4.2F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.5F, -0.3211F, -1.4577F, 0.0436F, 0.0F, 0.0F));
		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(24, 51).addBox(-1.0F, -0.8F, 0.0F, 2.0F, 1.3F, 10.0F, new CubeDeformation(0.1F)), PartPose.offset(0.0F, 2.9289F, -13.6577F));
		PartDefinition eyes = head.addOrReplaceChild("eyes", CubeListBuilder.create(), PartPose.offset(0.0F, 2.2289F, -16.7577F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}