package net.mcreator.mythicrealms.client.model;

import net.minecraft.util.Mth;
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

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelhindugodarmor extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mythicrealms", "modelhindugodarmor"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart Right_Arm;
	public final ModelPart Left_Arm;
	public final ModelPart Right_Leg;
	public final ModelPart Left_Leg;
	public final ModelPart Right_boot;
	public final ModelPart Left_boot;

	public Modelhindugodarmor(ModelPart root) {
		super(root);
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.Right_Arm = root.getChild("Right_Arm");
		this.Left_Arm = root.getChild("Left_Arm");
		this.Right_Leg = root.getChild("Right_Leg");
		this.Left_Leg = root.getChild("Left_Leg");
		this.Right_boot = root.getChild("Right_boot");
		this.Left_boot = root.getChild("Left_boot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 47).addBox(-4.0F, -7.0F, 3.0F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.15F)).texOffs(0, 32).addBox(-4.0F, -7.0F, -4.0F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.1F)).texOffs(18, 40)
						.addBox(3.0F, -7.0F, -4.0F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.1F)).texOffs(60, 5).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(60, 62).addBox(-2.0F, -35.0F, -4.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(8.3F, 24.0F, -11.6F, -0.3927F, -0.3927F, 0.0F));
		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(56, 62).addBox(1.0F, -35.0F, -4.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-8.3F, 24.0F, -11.6F, -0.3927F, 0.3927F, 0.0F));
		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(18, 32).addBox(0.0F, -35.0F, -4.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.0F, 22.3F, -12.8F, -0.3927F, 0.0F, 0.0F));
		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(46, 62).addBox(-2.0F, -35.0F, -4.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 23.3F, -12.8F, -0.3927F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(0, 16).addBox(-4.0F, 0.0F, -1.5F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(44, 16)
						.addBox(-4.0F, 11.0F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.65F)).texOffs(24, 30).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.65F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(0, 63).addBox(-4.0F, -13.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.65F)),
				PartPose.offsetAndRotation(-6.364F, 22.2F, -0.1F, 0.0F, 0.0F, 0.7854F));
		PartDefinition Right_Arm = partdefinition.addOrReplaceChild("Right_Arm",
				CubeListBuilder.create().texOffs(16, 55).addBox(-3.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(48, 57).addBox(-3.0F, 3.3F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.3F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition rightarm_r1 = Right_Arm.addOrReplaceChild("rightarm_r1", CubeListBuilder.create().texOffs(26, 62).addBox(-8.0F, -25.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.4F)),
				PartPose.offsetAndRotation(-3.5F, 17.2F, -16.2635F, -0.7854F, 0.0F, 0.3927F));
		PartDefinition rightarm_r2 = Right_Arm.addOrReplaceChild("rightarm_r2", CubeListBuilder.create().texOffs(16, 61).addBox(-8.0F, -25.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.4F)),
				PartPose.offsetAndRotation(-3.5F, 18.2F, -16.2635F, -0.7854F, 0.0F, 0.3927F));
		PartDefinition rightarm_r3 = Right_Arm.addOrReplaceChild("rightarm_r3", CubeListBuilder.create().texOffs(52, 42).addBox(-8.0F, -24.0F, -2.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.4F)),
				PartPose.offsetAndRotation(11.5F, 18.5F, 0.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition Left_Arm = partdefinition.addOrReplaceChild("Left_Arm",
				CubeListBuilder.create().texOffs(32, 56).addBox(-1.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(60, 0).addBox(-1.0F, 3.3F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.3F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition leftarm_r1 = Left_Arm.addOrReplaceChild("leftarm_r1", CubeListBuilder.create().texOffs(36, 62).addBox(7.0F, -25.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.4F)),
				PartPose.offsetAndRotation(3.5F, 17.2F, -16.2635F, -0.7854F, 0.0F, -0.3927F));
		PartDefinition leftarm_r2 = Left_Arm.addOrReplaceChild("leftarm_r2", CubeListBuilder.create().texOffs(60, 7).addBox(7.0F, -25.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.4F)),
				PartPose.offsetAndRotation(3.5F, 18.2F, -16.2635F, -0.7854F, 0.0F, -0.3927F));
		PartDefinition leftarm_r3 = Left_Arm.addOrReplaceChild("leftarm_r3", CubeListBuilder.create().texOffs(52, 35).addBox(3.0F, -24.0F, -2.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.4F)),
				PartPose.offsetAndRotation(-11.5F, 18.5F, 0.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition Right_Leg = partdefinition.addOrReplaceChild("Right_Leg", CubeListBuilder.create().texOffs(36, 40).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition rightlef_r1 = Right_Leg.addOrReplaceChild("rightlef_r1",
				CubeListBuilder.create().texOffs(44, 21).addBox(-4.9F, -4.0F, -3.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(24, 15).addBox(-4.9F, -12.0F, -3.0F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8F, 12.0F, 0.5F, 0.0F, 0.0F, 0.2618F));
		PartDefinition Left_Leg = partdefinition.addOrReplaceChild("Left_Leg", CubeListBuilder.create().texOffs(44, 0).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition leftlef_r1 = Left_Leg.addOrReplaceChild("leftlef_r1",
				CubeListBuilder.create().texOffs(48, 28).addBox(-0.1F, -4.0F, -3.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(24, 0).addBox(-0.1F, -12.0F, -3.0F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8F, 12.0F, 0.5F, 0.0F, 0.0F, -0.2618F));
		PartDefinition Right_boot = partdefinition.addOrReplaceChild("Right_boot", CubeListBuilder.create().texOffs(52, 49).addBox(-1.9F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.3F)), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition Left_boot = partdefinition.addOrReplaceChild("Left_boot", CubeListBuilder.create().texOffs(0, 55).addBox(-2.1F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.3F)), PartPose.offset(2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.Right_Leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Left_boot.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Right_Arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Right_boot.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Left_Leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Left_Arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}