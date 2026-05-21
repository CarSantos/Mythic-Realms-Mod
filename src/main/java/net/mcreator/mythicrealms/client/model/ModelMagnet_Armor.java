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
public class ModelMagnet_Armor extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mythicrealms", "model_magnet_armor"), "main");
	public final ModelPart Helmet;
	public final ModelPart Chestplate;
	public final ModelPart leftPlate;
	public final ModelPart rightPlate;
	public final ModelPart leftLegging;
	public final ModelPart rightLegging;
	public final ModelPart leftBoot;
	public final ModelPart rightBoot;

	public ModelMagnet_Armor(ModelPart root) {
		super(root);
		this.Helmet = root.getChild("Helmet");
		this.Chestplate = root.getChild("Chestplate");
		this.leftPlate = root.getChild("leftPlate");
		this.rightPlate = root.getChild("rightPlate");
		this.leftLegging = root.getChild("leftLegging");
		this.rightLegging = root.getChild("rightLegging");
		this.leftBoot = root.getChild("leftBoot");
		this.rightBoot = root.getChild("rightBoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Helmet = partdefinition.addOrReplaceChild("Helmet",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -8.0F, -4.5F, 9.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(32, 37).addBox(-4.5F, -5.0F, -3.5F, 1.0F, 5.0F, 8.0F, new CubeDeformation(-0.1F)).texOffs(52, 56)
						.addBox(-4.5F, -5.0F, 3.5F, 9.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(48, 10).addBox(3.5F, -5.0F, -3.5F, 1.0F, 5.0F, 8.0F, new CubeDeformation(-0.1F)).texOffs(24, 13)
						.addBox(1.5F, -8.0F, -4.5F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.3F)).texOffs(24, 25).addBox(-4.5F, -8.0F, -4.5F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.3F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition head_2nd_layer_r1 = Helmet.addOrReplaceChild("head_2nd_layer_r1",
				CubeListBuilder.create().texOffs(16, 29).addBox(-10.5F, -9.0F, 3.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F)).texOffs(22, 53).addBox(-7.5F, -9.0F, 3.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(8.0F, -2.8F, -9.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition head_2nd_layer_r2 = Helmet.addOrReplaceChild("head_2nd_layer_r2", CubeListBuilder.create().texOffs(30, 64).addBox(-10.5F, -7.0F, 3.5F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -1.8F, -9.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition Chestplate = partdefinition.addOrReplaceChild("Chestplate",
				CubeListBuilder.create().texOffs(50, 33).addBox(-4.0F, 11.98F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(36, 0).addBox(-4.0F, -0.03F, -2.5F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.3F)).texOffs(0, 13)
						.addBox(-4.0F, 0.5F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(0, 59).addBox(-4.0F, 9.9F, -1.0F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.3F)).texOffs(62, 0)
						.addBox(-4.0F, 7.9F, -1.0F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.3F)).texOffs(22, 60).addBox(-4.0F, 5.9F, -1.0F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.3F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leftPlate = partdefinition.addOrReplaceChild("leftPlate",
				CubeListBuilder.create().texOffs(48, 23).addBox(-1.5F, -2.0F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(60, 62).addBox(-0.5F, -2.0F, -1.5F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.5F)).texOffs(50, 38)
						.addBox(-1.5F, 1.0F, -2.5F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(50, 44).addBox(-1.5F, -1.0F, -2.5F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition rightPlate = partdefinition.addOrReplaceChild("rightPlate",
				CubeListBuilder.create().texOffs(32, 50).addBox(-3.5F, -2.0F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 63).addBox(-3.5F, -2.0F, -1.5F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.5F)).texOffs(52, 50)
						.addBox(-4.5F, 1.0F, -2.5F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(0, 53).addBox(-4.5F, -1.0F, -2.5F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition leftLegging = partdefinition.addOrReplaceChild("leftLegging",
				CubeListBuilder.create().texOffs(0, 29).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(66, 9).addBox(-1.0F, 3.7F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.4F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition rightLegging = partdefinition.addOrReplaceChild("rightLegging",
				CubeListBuilder.create().texOffs(16, 37).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(66, 13).addBox(-1.0F, 3.7F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.4F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition leftBoot = partdefinition.addOrReplaceChild("leftBoot",
				CubeListBuilder.create().texOffs(0, 45).addBox(-2.0F, 8.5F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(62, 4).addBox(-2.0F, 8.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition rightBoot = partdefinition.addOrReplaceChild("rightBoot",
				CubeListBuilder.create().texOffs(44, 62).addBox(-2.0F, 8.5F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(14, 64).addBox(-2.0F, 8.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
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