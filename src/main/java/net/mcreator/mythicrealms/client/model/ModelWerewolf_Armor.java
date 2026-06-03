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
public class ModelWerewolf_Armor extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mythicrealms", "model_werewolf_armor"), "main");
	public final ModelPart Helmet;
	public final ModelPart Chestplate;
	public final ModelPart rightPlate;
	public final ModelPart LeftPlate;
	public final ModelPart rightLegging;
	public final ModelPart leftLegging;
	public final ModelPart rightBoot;
	public final ModelPart leftBoot;

	public ModelWerewolf_Armor(ModelPart root) {
		super(root);
		this.Helmet = root.getChild("Helmet");
		this.Chestplate = root.getChild("Chestplate");
		this.rightPlate = root.getChild("rightPlate");
		this.LeftPlate = root.getChild("LeftPlate");
		this.rightLegging = root.getChild("rightLegging");
		this.leftLegging = root.getChild("leftLegging");
		this.rightBoot = root.getChild("rightBoot");
		this.leftBoot = root.getChild("leftBoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Helmet = partdefinition.addOrReplaceChild("Helmet",
				CubeListBuilder.create().texOffs(42, 17).addBox(-4.5F, -7.0F, 2.5F, 9.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).texOffs(20, 54).addBox(-4.5F, -7.0F, -3.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.2F)).texOffs(0, 55)
						.addBox(2.5F, -7.0F, -3.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.2F)).texOffs(52, 57).addBox(-4.5F, -7.0F, -4.5F, 9.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Chestplate = partdefinition.addOrReplaceChild("Chestplate",
				CubeListBuilder.create().texOffs(24, 0).addBox(-4.5F, 10.97F, -2.5F, 9.0F, 2.01F, 5.0F, new CubeDeformation(0.1F)).texOffs(0, 16).addBox(-4.0F, 0.97F, -2.5F, 8.0F, 5.01F, 5.0F, new CubeDeformation(0.3F)).texOffs(72, 43)
						.addBox(-1.0F, 1.98F, -3.2F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(74, 76).addBox(-1.0F, 1.98F, -2.5F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(0, 0)
						.addBox(-4.0F, 0.5F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(72, 14).addBox(-4.0F, -0.5F, -3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.5F)).texOffs(72, 22)
						.addBox(2.0F, -0.5F, -3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.5F)).texOffs(58, 39).addBox(-4.0F, -0.5F, 1.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.55F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition rightPlate = partdefinition.addOrReplaceChild("rightPlate",
				CubeListBuilder.create().texOffs(38, 33).addBox(-3.49F, -2.0F, -2.5F, 4.99F, 5.0F, 5.0F, new CubeDeformation(0.4F)).texOffs(0, 26).addBox(-4.0F, -3.5F, -3.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(76, 35)
						.addBox(-4.0F, -1.5F, 0.5F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(78, 38).addBox(-4.0F, -1.5F, -2.5F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(64, 14)
						.addBox(-2.0F, -5.5F, 1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 79).addBox(-2.0F, -5.5F, -3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 76)
						.addBox(-7.0F, -0.5156F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(26, 23).addBox(-7.0F, -0.5156F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.2F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftPlate = partdefinition.addOrReplaceChild("LeftPlate", CubeListBuilder.create().texOffs(42, 7).addBox(-1.5F, -2.0F, -2.5F, 4.99F, 5.0F, 5.0F, new CubeDeformation(0.4F)), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition left_arm_2nd_layer_r1 = LeftPlate.addOrReplaceChild("left_arm_2nd_layer_r1", CubeListBuilder.create().texOffs(38, 54).addBox(9.49F, -4.0F, 5.5F, 2.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.2F, 1.6F, -8.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition rightLegging = partdefinition.addOrReplaceChild("rightLegging",
				CubeListBuilder.create().texOffs(26, 7).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(70, 61).addBox(-2.0F, 5.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(72, 51)
						.addBox(-2.0F, 3.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(76, 30).addBox(-2.0F, 1.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(20, 42)
						.addBox(-2.7F, 0.0F, -2.5F, 3.0F, 6.0F, 5.0F, new CubeDeformation(-0.2F)).texOffs(52, 61).addBox(-2.7F, 5.0F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(-0.1F)).texOffs(18, 63)
						.addBox(-0.7F, 0.0F, -2.5F, 2.0F, 6.0F, 5.0F, new CubeDeformation(-0.1F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition right_leg_2nd_layer_r1 = rightLegging.addOrReplaceChild("right_leg_2nd_layer_r1", CubeListBuilder.create().texOffs(0, 71).addBox(3.5F, -9.0F, 5.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-7.2F, 9.0F, -8.0F, 0.0F, 0.0F, 0.096F));
		PartDefinition right_leg_2nd_layer_r2 = rightLegging.addOrReplaceChild("right_leg_2nd_layer_r2", CubeListBuilder.create().texOffs(0, 64).addBox(2.5F, -8.0F, 5.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.2F, 10.0F, -8.0F, 0.0F, 0.0F, 0.096F));
		PartDefinition right_leg_2nd_layer_r3 = rightLegging.addOrReplaceChild("right_leg_2nd_layer_r3", CubeListBuilder.create().texOffs(30, 74).addBox(4.5F, -9.0F, 5.5F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.2F, 9.0F, -8.0F, 0.0F, 0.0F, 0.096F));
		PartDefinition leftLegging = partdefinition.addOrReplaceChild("leftLegging",
				CubeListBuilder.create().texOffs(22, 26).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(72, 0).addBox(-2.0F, 5.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(74, 56)
						.addBox(-2.0F, 3.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(44, 76).addBox(-2.0F, 1.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(36, 43)
						.addBox(-0.3F, 0.0F, -2.5F, 3.0F, 6.0F, 5.0F, new CubeDeformation(-0.2F)).texOffs(58, 21).addBox(-1.3F, 0.0F, -2.5F, 2.0F, 6.0F, 5.0F, new CubeDeformation(-0.1F)).texOffs(58, 32)
						.addBox(-1.3F, 5.0F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(-0.1F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition left_leg_2nd_layer_r1 = leftLegging.addOrReplaceChild("left_leg_2nd_layer_r1", CubeListBuilder.create().texOffs(64, 68).addBox(-6.5F, -9.0F, 5.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(7.2F, 9.0F, -8.0F, 0.0F, 0.0F, -0.096F));
		PartDefinition left_leg_2nd_layer_r2 = leftLegging.addOrReplaceChild("left_leg_2nd_layer_r2", CubeListBuilder.create().texOffs(62, 7).addBox(-6.5F, -8.0F, 5.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.2F, 10.0F, -8.0F, 0.0F, 0.0F, -0.096F));
		PartDefinition left_leg_2nd_layer_r3 = leftLegging.addOrReplaceChild("left_leg_2nd_layer_r3", CubeListBuilder.create().texOffs(16, 74).addBox(-6.5F, -9.0F, 5.5F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.2F, 9.0F, -8.0F, 0.0F, 0.0F, -0.096F));
		PartDefinition rightBoot = partdefinition.addOrReplaceChild("rightBoot",
				CubeListBuilder.create().texOffs(32, 66).addBox(-2.0F, 8.5F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(0, 38).addBox(-2.5F, 8.0F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-0.2F)).texOffs(52, 0)
						.addBox(-2.5F, 8.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(-0.1F)).texOffs(52, 50).addBox(-2.5F, 11.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition leftBoot = partdefinition.addOrReplaceChild("leftBoot",
				CubeListBuilder.create().texOffs(48, 68).addBox(-2.0F, 8.5F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(38, 23).addBox(-2.5F, 8.0F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-0.2F)).texOffs(0, 48)
						.addBox(-2.5F, 8.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(-0.1F)).texOffs(52, 43).addBox(-2.5F, 11.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.LeftPlate.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.leftLegging.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Helmet.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Helmet.xRot = headPitch / (180F / (float) Math.PI);
		this.rightLegging.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightPlate.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftBoot.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rightBoot.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}