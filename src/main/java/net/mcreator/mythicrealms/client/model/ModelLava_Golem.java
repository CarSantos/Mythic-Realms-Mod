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
public class ModelLava_Golem extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mythicrealms", "model_lava_golem"), "main");
	public final ModelPart LavaGolem;
	public final ModelPart body0;
	public final ModelPart body1;
	public final ModelPart rightArm0;
	public final ModelPart rightArm1;
	public final ModelPart rightHand;
	public final ModelPart rightFingers;
	public final ModelPart leftArm0;
	public final ModelPart leftArm1;
	public final ModelPart leftHand;
	public final ModelPart leftFingers;
	public final ModelPart head;
	public final ModelPart leftLeg0;
	public final ModelPart leftLeg1;
	public final ModelPart rightLeg0;
	public final ModelPart rightLeg1;

	public ModelLava_Golem(ModelPart root) {
		super(root);
		this.LavaGolem = root.getChild("LavaGolem");
		this.body0 = this.LavaGolem.getChild("body0");
		this.body1 = this.body0.getChild("body1");
		this.rightArm0 = this.body1.getChild("rightArm0");
		this.rightArm1 = this.rightArm0.getChild("rightArm1");
		this.rightHand = this.rightArm1.getChild("rightHand");
		this.rightFingers = this.rightHand.getChild("rightFingers");
		this.leftArm0 = this.body1.getChild("leftArm0");
		this.leftArm1 = this.leftArm0.getChild("leftArm1");
		this.leftHand = this.leftArm1.getChild("leftHand");
		this.leftFingers = this.leftHand.getChild("leftFingers");
		this.head = this.body1.getChild("head");
		this.leftLeg0 = this.LavaGolem.getChild("leftLeg0");
		this.leftLeg1 = this.leftLeg0.getChild("leftLeg1");
		this.rightLeg0 = this.LavaGolem.getChild("rightLeg0");
		this.rightLeg1 = this.rightLeg0.getChild("rightLeg1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition LavaGolem = partdefinition.addOrReplaceChild("LavaGolem", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0F, 2.5F));
		PartDefinition body0 = LavaGolem.addOrReplaceChild("body0",
				CubeListBuilder.create().texOffs(0, 38).addBox(-9.0F, -10.0F, -7.5F, 18.0F, 13.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(80, 112).addBox(-7.0F, 3.0F, -3.5F, 13.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition body1 = body0.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -14.0F, -11.0F, 24.0F, 16.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.0F, 0.5F, 0.3927F, 0.0F, 0.0F));
		PartDefinition rightArm0 = body1.addOrReplaceChild("rightArm0", CubeListBuilder.create().texOffs(0, 67).addBox(-12.0F, -8.0F, -8.0F, 17.0F, 14.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0F, -14.0F, 0.0F, -0.2618F, 0.0F, -0.6109F));
		PartDefinition rightArm1 = rightArm0.addOrReplaceChild("rightArm1", CubeListBuilder.create().texOffs(0, 124).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 17.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 1.0F, -1.0F, -0.0873F, 0.0F, 0.9599F));
		PartDefinition rightHand = rightArm1.addOrReplaceChild("rightHand", CubeListBuilder.create().texOffs(68, 38).addBox(-6.0F, -1.0F, -6.0F, 12.0F, 13.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition rightHand_r1 = rightHand.addOrReplaceChild("rightHand_r1", CubeListBuilder.create().texOffs(88, 126).addBox(-1.5F, -5.5F, -2.0F, 3.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, 12.5F, -5.0F, 0.0873F, 0.0F, 0.1309F));
		PartDefinition rightFingers = rightHand.addOrReplaceChild("rightFingers", CubeListBuilder.create(), PartPose.offset(-4.5F, 12.0F, 0.0F));
		PartDefinition rightFingers_r1 = rightFingers.addOrReplaceChild("rightFingers_r1", CubeListBuilder.create().texOffs(118, 128).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.0873F, 0.0F, -0.4363F));
		PartDefinition rightFingers_r2 = rightFingers.addOrReplaceChild("rightFingers_r2", CubeListBuilder.create().texOffs(126, 112).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, -0.0873F, 0.0F, -0.4363F));
		PartDefinition rightFingers_r3 = rightFingers.addOrReplaceChild("rightFingers_r3", CubeListBuilder.create().texOffs(104, 126).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition leftArm0 = body1.addOrReplaceChild("leftArm0", CubeListBuilder.create().texOffs(66, 67).addBox(-5.0F, -8.0F, -8.0F, 17.0F, 14.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, -14.0F, 0.0F, -0.2618F, 0.0F, 0.6109F));
		PartDefinition leftArm1 = leftArm0.addOrReplaceChild("leftArm1", CubeListBuilder.create().texOffs(32, 124).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 17.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 1.0F, -1.0F, -0.0873F, 0.0F, -0.9599F));
		PartDefinition leftHand = leftArm1.addOrReplaceChild("leftHand", CubeListBuilder.create().texOffs(92, 0).addBox(-6.0F, -1.0F, -6.0F, 12.0F, 13.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition leftHand_r1 = leftHand.addOrReplaceChild("leftHand_r1", CubeListBuilder.create().texOffs(126, 97).addBox(-1.5F, -5.5F, -2.0F, 3.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, 12.5F, -5.0F, 0.0873F, 0.0F, -0.1309F));
		PartDefinition leftFingers = leftHand.addOrReplaceChild("leftFingers", CubeListBuilder.create(), PartPose.offset(4.5F, 12.0F, 0.0F));
		PartDefinition leftFingers_r1 = leftFingers.addOrReplaceChild("leftFingers_r1", CubeListBuilder.create().texOffs(132, 128).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.0873F, 0.0F, 0.4363F));
		PartDefinition leftFingers_r2 = leftFingers.addOrReplaceChild("leftFingers_r2", CubeListBuilder.create().texOffs(132, 80).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, -0.0873F, 0.0F, 0.4363F));
		PartDefinition leftFingers_r3 = leftFingers.addOrReplaceChild("leftFingers_r3", CubeListBuilder.create().texOffs(132, 64).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition head = body1.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(116, 25).addBox(-5.0F, -5.0F, -9.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(68, 63).addBox(-4.0F, -3.0F, -9.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 63)
						.addBox(2.0F, -3.0F, -9.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 97).addBox(-6.0F, 1.0F, -10.0F, 12.0F, 4.0F, 11.0F, new CubeDeformation(0.01F)).texOffs(92, 25)
						.addBox(-6.0F, 0.0F, -10.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(92, 31).addBox(-2.0F, -1.0F, -10.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(140, 0)
						.addBox(4.0F, 0.0F, -10.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.0F, -9.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition leftLeg0 = LavaGolem.addOrReplaceChild("leftLeg0", CubeListBuilder.create().texOffs(116, 45).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 6.0F, 2.5F, -0.4363F, -0.4363F, 0.0F));
		PartDefinition leftLeg1 = leftLeg0.addOrReplaceChild("leftLeg1", CubeListBuilder.create().texOffs(0, 97).addBox(-5.0F, -2.0F, -5.0F, 10.0F, 17.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.0F, 0.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition rightLeg0 = LavaGolem.addOrReplaceChild("rightLeg0", CubeListBuilder.create().texOffs(64, 126).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 6.0F, 2.5F, -0.4363F, 0.4363F, 0.0F));
		PartDefinition rightLeg1 = rightLeg0.addOrReplaceChild("rightLeg1", CubeListBuilder.create().texOffs(40, 97).addBox(-5.0F, -2.0F, -5.0F, 10.0F, 17.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.0F, 0.0F, 0.4363F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}