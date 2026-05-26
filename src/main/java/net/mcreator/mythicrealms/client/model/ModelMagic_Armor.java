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
public class ModelMagic_Armor extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mythicrealms", "model_magic_armor"), "main");
	public final ModelPart Helmet;
	public final ModelPart Chestplate;
	public final ModelPart rightPlate;
	public final ModelPart leftPlate;
	public final ModelPart rightLegging;
	public final ModelPart leftLegging;
	public final ModelPart rightBoot;
	public final ModelPart leftBoot;

	public ModelMagic_Armor(ModelPart root) {
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
		PartDefinition Helmet = partdefinition.addOrReplaceChild("Helmet", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition head_r1 = Helmet.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(20, 71).addBox(-8.0F, -19.3F, 8.8F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 48).addBox(-8.5F, -19.5F, 2.8F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 0.491F, -9.5959F, -0.3491F, 0.0F, 0.0F));
		PartDefinition head_r2 = Helmet.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(0, 33).addBox(-13.0F, -13.5F, 2.7F, 9.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.5F, 0.1216F, -8.8966F, -0.2182F, 0.0F, 0.0F));
		PartDefinition head_2nd_layer_r1 = Helmet.addOrReplaceChild("head_2nd_layer_r1", CubeListBuilder.create().texOffs(0, 17).addBox(-2.5F, -8.0F, -7.5F, 4.0F, 2.0F, 14.0F, new CubeDeformation(0.5F)).texOffs(36, 35)
				.addBox(-7.5F, -8.0F, -2.5F, 14.0F, 2.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(0, 0).addBox(-7.5F, -8.0F, -7.5F, 14.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition Chestplate = partdefinition.addOrReplaceChild("Chestplate",
				CubeListBuilder.create().texOffs(36, 17).addBox(-4.0F, -2.03F, -2.5F, 8.0F, 13.01F, 5.0F, new CubeDeformation(0.0F)).texOffs(56, 0).addBox(-5.0F, 9.97F, -2.5F, 10.0F, 1.0F, 5.0F, new CubeDeformation(0.55F)).texOffs(54, 57)
						.addBox(-4.8F, 3.98F, -2.5F, 4.0F, 7.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(60, 41).addBox(0.8F, 3.98F, -2.5F, 4.0F, 7.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(54, 69)
						.addBox(0.8F, -2.02F, -2.5F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.4F)).texOffs(72, 77).addBox(-2.0F, -2.02F, 0.5F, 4.0F, 12.0F, 2.0F, new CubeDeformation(0.5F)).texOffs(62, 24)
						.addBox(-4.8F, -2.02F, -2.5F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.4F)).texOffs(36, 41).addBox(-4.0F, -1.5F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition body_2nd_layer_r1 = Chestplate.addOrReplaceChild("body_2nd_layer_r1", CubeListBuilder.create().texOffs(22, 48).addBox(5.6F, 12.68F, 9.1F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-7.5F, -2.0F, -8.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition body_2nd_layer_r2 = Chestplate.addOrReplaceChild("body_2nd_layer_r2", CubeListBuilder.create().texOffs(72, 67).addBox(8.6F, 13.38F, 5.5F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.02F)).texOffs(16, 80)
				.addBox(7.6F, 13.38F, 5.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(80, 24).addBox(8.6F, 18.38F, 5.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-7.5F, -2.0F, -8.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition body_2nd_layer_r3 = Chestplate.addOrReplaceChild("body_2nd_layer_r3", CubeListBuilder.create().texOffs(0, 80).addBox(-11.6F, 18.38F, 5.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(38, 71)
				.addBox(-11.6F, 13.38F, 5.5F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.02F)).texOffs(78, 41).addBox(-8.6F, 13.38F, 5.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(7.5F, -2.0F, -8.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition rightPlate = partdefinition.addOrReplaceChild("rightPlate",
				CubeListBuilder.create().texOffs(0, 71).addBox(-5.0991F, -2.5436F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.45F)).texOffs(76, 6).addBox(-5.299F, 0.9564F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.6F)),
				PartPose.offsetAndRotation(-5.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition leftPlate = partdefinition.addOrReplaceChild("leftPlate",
				CubeListBuilder.create().texOffs(56, 6).addBox(0.0991F, -2.5436F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.45F)).texOffs(72, 35).addBox(0.2991F, 0.9564F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.6F)),
				PartPose.offsetAndRotation(5.0F, 2.0F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition rightLegging = partdefinition.addOrReplaceChild("rightLegging", CubeListBuilder.create().texOffs(22, 57).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.4F)), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition leftLegging = partdefinition.addOrReplaceChild("leftLegging", CubeListBuilder.create().texOffs(38, 57).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.4F)), PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition rightBoot = partdefinition.addOrReplaceChild("rightBoot",
				CubeListBuilder.create().texOffs(0, 62).addBox(-2.5F, 8.0F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(72, 53).addBox(-2.5F, 10.2F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.2F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition leftBoot = partdefinition.addOrReplaceChild("leftBoot",
				CubeListBuilder.create().texOffs(62, 15).addBox(-2.5F, 8.0F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(72, 60).addBox(-2.5F, 10.2F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.2F)),
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
		this.leftLegging.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Helmet.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Helmet.xRot = headPitch / (180F / (float) Math.PI);
		this.rightLegging.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightPlate.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftBoot.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rightBoot.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}