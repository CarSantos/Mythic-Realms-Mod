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
public class ModelXochitl_Armor extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mythicrealms", "model_xochitl_armor"), "main");
	public final ModelPart Helmet;
	public final ModelPart Chestplate;
	public final ModelPart rightPlate;
	public final ModelPart leftPlate;
	public final ModelPart rightLegging;
	public final ModelPart leftLegging;
	public final ModelPart rightBoot;
	public final ModelPart leftBoot;

	public ModelXochitl_Armor(ModelPart root) {
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
				CubeListBuilder.create().texOffs(0, 38).addBox(3.0F, -7.5F, -4.0F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.2F)).texOffs(18, 40).addBox(-4.0F, -7.5F, -4.0F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.2F)).texOffs(32, 65)
						.addBox(-3.0F, -7.5F, 3.0F, 6.0F, 8.0F, 1.0F, new CubeDeformation(0.4F)).texOffs(24, 22).addBox(-3.0F, -7.5F, -4.0F, 6.0F, 2.0F, 8.0F, new CubeDeformation(0.41F)).texOffs(0, 12)
						.addBox(-4.0F, -7.5F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.3F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition head_r1 = Helmet.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(18, 38).addBox(3.5F, 0.5F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.4F)).texOffs(40, 20)
				.addBox(3.5F, 0.5F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.4F)).texOffs(0, 53).addBox(3.5F, -1.3F, -3.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(-8.0F, -7.5F, -3.0F, -0.1705F, 0.0168F, -0.3117F));
		PartDefinition head_r2 = Helmet.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(52, 49).addBox(-4.5F, -1.3F, -3.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.5F)).texOffs(36, 20)
				.addBox(-4.5F, 0.5F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.4F)).texOffs(32, 20).addBox(-4.5F, 0.5F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.4F)),
				PartPose.offsetAndRotation(8.0F, -7.5F, -3.0F, -0.1705F, -0.0168F, 0.3117F));
		PartDefinition Chestplate = partdefinition.addOrReplaceChild("Chestplate", CubeListBuilder.create().texOffs(0, 22).addBox(-4.0F, -1.5F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(42, 0)
				.addBox(-4.0F, 9.5F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(36, 40).addBox(-4.0F, -1.5F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.3F)), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition tail3_r1 = Chestplate.addOrReplaceChild("tail3_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -4.8F, 17.0F, 12.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.0F, -9.0F, -0.3054F, 0.0F, 0.0F));
		PartDefinition tail2_r1 = Chestplate.addOrReplaceChild("tail2_r1", CubeListBuilder.create().texOffs(32, 12).addBox(-4.5F, -9.1F, 11.0F, 9.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.0F, -9.0F, -0.5672F, 0.0F, 0.0F));
		PartDefinition tail_r1 = Chestplate.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(24, 32).addBox(-3.5F, -12.0F, 2.0F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.0F, -9.0F, -0.9163F, 0.0F, 0.0F));
		PartDefinition rightPlate = partdefinition.addOrReplaceChild("rightPlate", CubeListBuilder.create().texOffs(42, 5).addBox(-5.0F, -1.5F, -2.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition right_arm_r1 = rightPlate.addOrReplaceChild("right_arm_r1", CubeListBuilder.create().texOffs(60, 36).addBox(2.0F, -23.5F, 6.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.15F)),
				PartPose.offsetAndRotation(-8.0F, 23.0F, -8.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition right_arm_r2 = rightPlate.addOrReplaceChild("right_arm_r2", CubeListBuilder.create().texOffs(60, 11).addBox(1.7F, -23.5F, 6.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-8.0F, 22.0F, -8.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition leftPlate = partdefinition.addOrReplaceChild("leftPlate", CubeListBuilder.create().texOffs(52, 58).addBox(-1.0F, -1.5F, -2.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition left_arm_r1 = leftPlate.addOrReplaceChild("left_arm_r1", CubeListBuilder.create().texOffs(0, 62).addBox(-6.0F, -23.5F, 6.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.15F)),
				PartPose.offsetAndRotation(8.0F, 23.0F, -8.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition left_arm_r2 = leftPlate.addOrReplaceChild("left_arm_r2", CubeListBuilder.create().texOffs(18, 55).addBox(-5.7F, -23.5F, 6.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(8.0F, 22.0F, -8.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition rightLegging = partdefinition.addOrReplaceChild("rightLegging", CubeListBuilder.create().texOffs(36, 49).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition leftLegging = partdefinition.addOrReplaceChild("leftLegging", CubeListBuilder.create().texOffs(52, 20).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition rightBoot = partdefinition.addOrReplaceChild("rightBoot", CubeListBuilder.create().texOffs(16, 64).addBox(-2.0F, 8.5F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition leftBoot = partdefinition.addOrReplaceChild("leftBoot", CubeListBuilder.create().texOffs(52, 64).addBox(-2.0F, 8.5F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.leftPlate.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.leftLegging.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Helmet.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Helmet.xRot = headPitch / (180F / (float) Math.PI);
		this.rightLegging.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightPlate.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftBoot.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rightBoot.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}