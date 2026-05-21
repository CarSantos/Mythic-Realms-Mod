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
public class ModelArmor_Blood extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mythicrealms", "model_armor_blood"), "main");
	public final ModelPart Helmet;
	public final ModelPart Chestplate;
	public final ModelPart RightPlate;
	public final ModelPart LeftPlate;
	public final ModelPart RightLegging;
	public final ModelPart LeftLegging;
	public final ModelPart RightBoots;
	public final ModelPart LeftBoots;

	public ModelArmor_Blood(ModelPart root) {
		super(root);
		this.Helmet = root.getChild("Helmet");
		this.Chestplate = root.getChild("Chestplate");
		this.RightPlate = root.getChild("RightPlate");
		this.LeftPlate = root.getChild("LeftPlate");
		this.RightLegging = root.getChild("RightLegging");
		this.LeftLegging = root.getChild("LeftLegging");
		this.RightBoots = root.getChild("RightBoots");
		this.LeftBoots = root.getChild("LeftBoots");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Helmet = partdefinition.addOrReplaceChild("Helmet",
				CubeListBuilder.create().texOffs(24, 20).addBox(3.2F, -7.5F, -4.0F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.3F)).texOffs(32, 0).addBox(-4.2F, -7.5F, -4.0F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.3F)).texOffs(56, 32)
						.addBox(-2.5F, -7.5F, 2.0F, 5.0F, 8.0F, 2.0F, new CubeDeformation(0.7F)).texOffs(0, 0).addBox(-4.0F, -7.5F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.8F)).texOffs(20, 52)
						.addBox(-4.0F, -7.5F, -4.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(1.2F)).texOffs(38, 52).addBox(3.0F, -7.5F, -4.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(1.2F)).texOffs(0, 10)
						.addBox(-4.0F, -1.5F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.8F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Chestplate = partdefinition.addOrReplaceChild("Chestplate",
				CubeListBuilder.create().texOffs(0, 20).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(42, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.35F)).texOffs(0, 45)
						.addBox(-4.0F, 11.0F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.4F)).texOffs(26, 62).addBox(-1.0F, 10.5F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.5F)).texOffs(32, 16)
						.addBox(-3.0F, 10.5F, -2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 32).addBox(2.0F, 10.5F, -2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.55F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition RightPlate = partdefinition.addOrReplaceChild("RightPlate", CubeListBuilder.create().texOffs(0, 50).addBox(-5.0F, -3.0F, -2.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.35F)).texOffs(56, 59)
				.addBox(-4.5F, -3.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.6F)).texOffs(56, 42).addBox(-4.0F, 0.0F, -2.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.5F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftPlate = partdefinition.addOrReplaceChild("LeftPlate", CubeListBuilder.create().texOffs(50, 0).addBox(-1.0F, -3.0F, -2.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.35F)).texOffs(16, 62)
				.addBox(3.5F, -3.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.6F)).texOffs(56, 47).addBox(-1.0F, 0.0F, -2.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.5F)), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLegging = partdefinition.addOrReplaceChild("RightLegging", CubeListBuilder.create().texOffs(40, 36).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.275F)), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition LeftLegging = partdefinition.addOrReplaceChild("LeftLegging", CubeListBuilder.create().texOffs(24, 36).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.275F)), PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition RightBoots = partdefinition.addOrReplaceChild("RightBoots", CubeListBuilder.create().texOffs(50, 8).addBox(-1.9F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.325F)).texOffs(58, 15)
				.addBox(-1.9F, 11.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(0, 58).addBox(-1.9F, 8.4F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.5F)), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition LeftBoots = partdefinition.addOrReplaceChild("LeftBoots", CubeListBuilder.create().texOffs(56, 52).addBox(-2.1F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.325F)).texOffs(58, 20)
				.addBox(-2.1F, 11.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(58, 25).addBox(-2.1F, 8.4F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.5F)), PartPose.offset(2.0F, 12.0F, 0.0F));
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