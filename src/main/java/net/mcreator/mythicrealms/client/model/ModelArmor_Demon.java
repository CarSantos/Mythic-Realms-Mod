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

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelArmor_Demon extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mythicrealms", "model_armor_demon"), "main");
	public final ModelPart Helmet;
	public final ModelPart Chestplate;
	public final ModelPart rightPlate;
	public final ModelPart leftPlate;
	public final ModelPart rightLegging;
	public final ModelPart leftLegging;
	public final ModelPart rightBoot;
	public final ModelPart leftBoot;

	public ModelArmor_Demon(ModelPart root) {
		super(root);
		this.Helmet = root.getChild("Helmet");
		this.Chestplate = root.getChild("Chestplate");
		this.rightPlate = root.getChild("rightPlate");
		this.leftPlate = root.getChild("leftPlate");
		this.rightLegging = root.getChild("rightLegging");
		this.leftLegging = root.getChild("leftLegging");
		this.rightBoot = root.getChild("rightBoot");
		this.leftBoot = root.getChild("leftBoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Helmet = partdefinition.addOrReplaceChild("Helmet",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -8.5F, -4.0F, 10.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 53).addBox(-4.0F, -8.5F, 4.0F, 8.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 30)
						.addBox(4.0F, -7.5F, -4.0F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.4F)).texOffs(0, 37).addBox(-5.0F, -7.5F, -4.0F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.4F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition head_2nd_layer_r1 = Helmet.addOrReplaceChild("head_2nd_layer_r1", CubeListBuilder.create().texOffs(38, 62).addBox(0.8137F, -5.7F, 2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(62, 36)
				.addBox(3.8137F, -5.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(34, 62).addBox(0.8137F, -6.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-0.9289F, 0.7F, -7.8F, 0.0F, -0.7854F, 0.0F));
		PartDefinition head_2nd_layer_r2 = Helmet.addOrReplaceChild("head_2nd_layer_r2", CubeListBuilder.create().texOffs(56, 7).addBox(1.1863F, -7.0F, 3.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.9289F, 0.7F, -5.9F, 0.188F, 0.828F, -0.0768F));
		PartDefinition head_2nd_layer_r3 = Helmet.addOrReplaceChild("head_2nd_layer_r3", CubeListBuilder.create().texOffs(12, 27).addBox(0.7863F, -3.5F, 7.3F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.9289F, 0.7F, -5.9F, -1.7952F, 1.2057F, -2.4765F));
		PartDefinition head_2nd_layer_r4 = Helmet.addOrReplaceChild("head_2nd_layer_r4", CubeListBuilder.create().texOffs(0, 27).addBox(-5.7863F, -3.5F, 7.3F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.9289F, 0.7F, -5.9F, -1.7952F, -1.2057F, 2.4765F));
		PartDefinition head_2nd_layer_r5 = Helmet.addOrReplaceChild("head_2nd_layer_r5", CubeListBuilder.create().texOffs(52, 28).addBox(-3.1863F, -7.0F, 3.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(-0.9289F, 0.7F, -5.9F, 0.188F, -0.828F, 0.0768F));
		PartDefinition head_2nd_layer_r6 = Helmet.addOrReplaceChild("head_2nd_layer_r6", CubeListBuilder.create().texOffs(26, 9).addBox(0.8137F, -8.0F, -0.5F, 7.0F, 3.0F, 7.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-0.9289F, 0.7F, -5.9F, 0.4754F, -0.7268F, -0.3295F));
		PartDefinition Chestplate = partdefinition.addOrReplaceChild("Chestplate", CubeListBuilder.create().texOffs(0, 9).addBox(-4.0F, -2.03F, -2.5F, 8.0F, 13.01F, 5.0F, new CubeDeformation(0.1F)).texOffs(0, 30)
				.addBox(-4.5F, 8.98F, -2.5F, 9.0F, 2.0F, 5.0F, new CubeDeformation(0.3F)).texOffs(26, 19).addBox(-4.0F, -2.03F, -2.5F, 8.0F, 6.0F, 5.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition rightPlate = partdefinition.addOrReplaceChild("rightPlate",
				CubeListBuilder.create().texOffs(54, 9).addBox(-3.49F, -2.0F, -2.5F, 4.99F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(56, 0).addBox(-3.49F, 1.0F, -2.5F, 4.99F, 2.0F, 5.0F, new CubeDeformation(0.3F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition right_arm_nd_layer_r1 = rightPlate.addOrReplaceChild("right_arm_nd_layer_r1", CubeListBuilder.create().texOffs(62, 28).addBox(2.7F, -24.0F, 5.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 19.3F, -6.5F, 0.0F, 0.0F, -0.1745F));
		PartDefinition right_arm_nd_layer_r2 = rightPlate.addOrReplaceChild("right_arm_nd_layer_r2", CubeListBuilder.create().texOffs(18, 41).addBox(4.5F, -22.0F, 5.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.5F, 19.3F, -6.5F, 0.0F, 0.0F, -0.2618F));
		PartDefinition leftPlate = partdefinition.addOrReplaceChild("leftPlate",
				CubeListBuilder.create().texOffs(36, 0).addBox(-1.5F, -2.0F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(54, 45).addBox(-1.5F, 1.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.3F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition left_arm_2nd_layer_r1 = leftPlate.addOrReplaceChild("left_arm_2nd_layer_r1", CubeListBuilder.create().texOffs(18, 37).addBox(-6.5F, -22.0F, 5.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(2.5F, 19.3F, -6.5F, 0.0F, 0.0F, 0.2618F));
		PartDefinition left_arm_nd_layer_r1 = leftPlate.addOrReplaceChild("left_arm_nd_layer_r1", CubeListBuilder.create().texOffs(62, 32).addBox(-4.7F, -24.0F, 5.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 19.3F, -6.5F, 0.0F, 0.0F, 0.1745F));
		PartDefinition rightLegging = partdefinition.addOrReplaceChild("rightLegging",
				CubeListBuilder.create().texOffs(18, 46).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(54, 59).addBox(-2.0F, 3.5F, -3.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.8F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition leftLegging = partdefinition.addOrReplaceChild("leftLegging",
				CubeListBuilder.create().texOffs(46, 30).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(18, 61).addBox(-2.0F, 3.5F, -3.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.8F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition rightBoot = partdefinition.addOrReplaceChild("rightBoot",
				CubeListBuilder.create().texOffs(34, 46).addBox(-2.5F, 8.0F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(54, 52).addBox(-2.5F, 8.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition leftBoot = partdefinition.addOrReplaceChild("leftBoot",
				CubeListBuilder.create().texOffs(52, 19).addBox(-2.5F, 8.0F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(34, 55).addBox(-2.5F, 8.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.leftPlate.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.leftLegging.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.Helmet.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Helmet.xRot = headPitch / (180F / (float) Math.PI);
		this.rightLegging.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightPlate.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftBoot.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rightBoot.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}