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
public class ModelArmor_god_egyptian extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mythicrealms", "model_armor_god_egyptian"), "main");
	public final ModelPart Helmet;
	public final ModelPart Chestplate;
	public final ModelPart RightPlate;
	public final ModelPart LeftPlate;
	public final ModelPart RightLegging;
	public final ModelPart LeftLegging;
	public final ModelPart LeftBoots;
	public final ModelPart RightBoots;

	public ModelArmor_god_egyptian(ModelPart root) {
		super(root);
		this.Helmet = root.getChild("Helmet");
		this.Chestplate = root.getChild("Chestplate");
		this.RightPlate = root.getChild("RightPlate");
		this.LeftPlate = root.getChild("LeftPlate");
		this.RightLegging = root.getChild("RightLegging");
		this.LeftLegging = root.getChild("LeftLegging");
		this.LeftBoots = root.getChild("LeftBoots");
		this.RightBoots = root.getChild("RightBoots");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Helmet = partdefinition.addOrReplaceChild("Helmet",
				CubeListBuilder.create().texOffs(24, 12).addBox(4.0F, -8.5F, -5.0F, 1.0F, 8.0F, 10.0F, new CubeDeformation(0.2F)).texOffs(0, 0).addBox(-4.0F, -8.5F, -5.0F, 8.0F, 2.0F, 10.0F, new CubeDeformation(0.25F)).texOffs(70, 33)
						.addBox(-4.0F, -8.5F, -3.5F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.35F)).texOffs(76, 57).addBox(-4.0F, -8.5F, -0.5F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.35F)).texOffs(76, 60)
						.addBox(-4.0F, -8.5F, 2.5F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.35F)).texOffs(22, 58).addBox(-4.0F, -7.5F, 2.0F, 8.0F, 8.0F, 3.0F, new CubeDeformation(0.25F)).texOffs(64, 0)
						.addBox(-4.0F, -7.5F, 2.0F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.35F)).texOffs(66, 37).addBox(-4.0F, -4.5F, 2.0F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.35F)).texOffs(66, 41)
						.addBox(-4.0F, -1.5F, 2.0F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.35F)).texOffs(0, 46).addBox(4.0F, -7.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.3F)).texOffs(46, 7)
						.addBox(4.0F, -4.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.3F)).texOffs(46, 18).addBox(4.0F, -1.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.3F)).texOffs(0, 57)
						.addBox(-5.0F, -1.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.3F)).texOffs(44, 47).addBox(-5.0F, -4.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.3F)).texOffs(22, 47)
						.addBox(-5.0F, -7.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.3F)).texOffs(0, 28).addBox(-5.0F, -8.5F, -5.0F, 1.0F, 8.0F, 10.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition hat_r1 = Helmet.addOrReplaceChild("hat_r1",
				CubeListBuilder.create().texOffs(34, 84).addBox(3.0F, -24.8F, -4.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).texOffs(26, 84).addBox(3.0F, -23.5F, -4.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).texOffs(82, 54)
						.addBox(3.0F, -22.2F, -4.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).texOffs(40, 69).addBox(3.5F, -24.5F, -4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(-4.0F, 25.0F, -5.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition hat_r2 = Helmet.addOrReplaceChild("hat_r2",
				CubeListBuilder.create().texOffs(84, 10).addBox(-5.0F, -27.5F, -5.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.2F)).texOffs(84, 4).addBox(4.0F, -27.5F, -5.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 26.0F, -10.4F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hat_r3 = Helmet.addOrReplaceChild("hat_r3", CubeListBuilder.create().texOffs(26, 79).addBox(1.0F, -34.5F, -5.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-25.1023F, 13.0F, -8.9F, -0.2849F, 0.274F, 0.7459F));
		PartDefinition hat_r4 = Helmet.addOrReplaceChild("hat_r4",
				CubeListBuilder.create().texOffs(10, 80).addBox(2.0F, -33.5F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(36, 7).addBox(1.0F, -34.5F, -5.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-25.1023F, 14.0F, -9.6F, -0.2849F, 0.274F, 0.7459F));
		PartDefinition Chestplate = partdefinition.addOrReplaceChild("Chestplate",
				CubeListBuilder.create().texOffs(0, 12).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(36, 0).addBox(-4.5F, 11.0F, -2.5F, 9.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(42, 30)
						.addBox(-4.5F, 11.0F, -2.4F, 9.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)).texOffs(64, 4).addBox(-0.5F, 11.5F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.55F)).texOffs(22, 30)
						.addBox(-3.0F, 0.0F, -2.0F, 6.0F, 12.0F, 4.0F, new CubeDeformation(0.4F)).texOffs(42, 37).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.55F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition body_r1 = Chestplate.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(16, 79).addBox(3.0F, -26.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.6F)).texOffs(36, 79)
				.addBox(3.0F, -21.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.7F)).texOffs(76, 78).addBox(-2.0F, -21.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.6F)),
				PartPose.offsetAndRotation(-16.9706F, 16.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition RightPlate = partdefinition.addOrReplaceChild("RightPlate",
				CubeListBuilder.create().texOffs(68, 4).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(66, 52).addBox(-3.0F, 1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.6F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition rightarm_r1 = RightPlate.addOrReplaceChild("rightarm_r1", CubeListBuilder.create().texOffs(40, 74).addBox(-8.0F, -25.0F, -2.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6F, 17.6F, -16.2635F, -0.7854F, 0.0F, 0.3927F));
		PartDefinition rightarm_r2 = RightPlate.addOrReplaceChild("rightarm_r2", CubeListBuilder.create().texOffs(52, 74).addBox(-8.0F, -25.0F, -2.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6F, 15.6F, -16.2635F, -0.7854F, 0.0F, 0.3927F));
		PartDefinition rightarm_r3 = RightPlate.addOrReplaceChild("rightarm_r3", CubeListBuilder.create().texOffs(64, 74).addBox(-8.0F, -25.0F, -2.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6F, 16.6F, -16.2635F, -0.7854F, 0.0F, 0.3927F));
		PartDefinition LeftPlate = partdefinition.addOrReplaceChild("LeftPlate",
				CubeListBuilder.create().texOffs(68, 11).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(70, 28).addBox(-1.0F, 1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.6F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition leftarm_r1 = LeftPlate.addOrReplaceChild("leftarm_r1", CubeListBuilder.create().texOffs(16, 69).addBox(7.0F, -25.0F, -2.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6F, 15.6F, -16.2635F, -0.7854F, 0.0F, -0.3927F));
		PartDefinition leftarm_r2 = LeftPlate.addOrReplaceChild("leftarm_r2", CubeListBuilder.create().texOffs(28, 69).addBox(7.0F, -25.0F, -2.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6F, 17.6F, -16.2635F, -0.7854F, 0.0F, -0.3927F));
		PartDefinition leftarm_r3 = LeftPlate.addOrReplaceChild("leftarm_r3", CubeListBuilder.create().texOffs(68, 18).addBox(7.0F, -25.0F, -2.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6F, 16.6F, -16.2635F, -0.7854F, 0.0F, -0.3927F));
		PartDefinition RightLegging = partdefinition.addOrReplaceChild("RightLegging",
				CubeListBuilder.create().texOffs(60, 58).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(82, 50).addBox(-0.9F, 5.0F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.35F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition LeftLegging = partdefinition.addOrReplaceChild("LeftLegging",
				CubeListBuilder.create().texOffs(44, 58).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.275F)).texOffs(76, 83).addBox(-1.1F, 5.0F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.35F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition LeftBoots = partdefinition.addOrReplaceChild("LeftBoots", CubeListBuilder.create().texOffs(0, 68).addBox(-2.1F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.325F)).texOffs(76, 63)
				.addBox(-2.1F, 8.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.4F)).texOffs(76, 73).addBox(-2.1F, 11.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.5F)), PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition leftboot_r1 = LeftBoots.addOrReplaceChild("leftboot_r1", CubeListBuilder.create().texOffs(82, 45).addBox(4.9F, -4.0F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.4F)),
				PartPose.offsetAndRotation(-2.1F, 11.5F, 6.0F, 0.3927F, 0.3927F, 0.0F));
		PartDefinition leftboot_r2 = LeftBoots.addOrReplaceChild("leftboot_r2", CubeListBuilder.create().texOffs(0, 80).addBox(4.9F, -4.0F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(-2.1F, 12.5F, 6.0F, 0.3927F, 0.3927F, 0.0F));
		PartDefinition RightBoots = partdefinition.addOrReplaceChild("RightBoots", CubeListBuilder.create().texOffs(66, 45).addBox(-1.9F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.325F)).texOffs(0, 75)
				.addBox(-1.9F, 8.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.4F)).texOffs(76, 68).addBox(-1.9F, 11.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.5F)), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition rightboot_r1 = RightBoots.addOrReplaceChild("rightboot_r1", CubeListBuilder.create().texOffs(80, 23).addBox(-5.9F, -4.0F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.4F)),
				PartPose.offsetAndRotation(2.1F, 11.5F, 6.0F, 0.3927F, -0.3927F, 0.0F));
		PartDefinition rightboot_r2 = RightBoots.addOrReplaceChild("rightboot_r2", CubeListBuilder.create().texOffs(80, 18).addBox(-5.9F, -4.0F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(2.1F, 12.5F, 6.0F, 0.3927F, -0.3927F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.LeftPlate.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.LeftBoots.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Helmet.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Helmet.xRot = headPitch / (180F / (float) Math.PI);
		this.RightBoots.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.RightLegging.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftLegging.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightPlate.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}