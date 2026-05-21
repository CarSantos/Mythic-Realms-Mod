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
public class Modelarmor_venraid extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mythicrealms", "modelarmor_venraid"), "main");
	public final ModelPart Helmet;
	public final ModelPart Chestplate;
	public final ModelPart RightPlate;
	public final ModelPart LeftPlate;
	public final ModelPart RightLegging;
	public final ModelPart LeftLegging;
	public final ModelPart LeftBoots;
	public final ModelPart RightBoots;

	public Modelarmor_venraid(ModelPart root) {
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
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.5F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.8F)).texOffs(24, 10).addBox(-2.0F, -7.5F, -4.0F, 4.0F, 2.0F, 8.0F, new CubeDeformation(1.0F)).texOffs(54, 26)
						.addBox(-3.0F, -4.5F, 3.0F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.9F)).texOffs(16, 36).addBox(3.6F, -5.5F, -4.0F, 1.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(34, 36)
						.addBox(-4.6F, -5.5F, -4.0F, 1.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Chestplate = partdefinition.addOrReplaceChild("Chestplate",
				CubeListBuilder.create().texOffs(0, 42).addBox(-4.0F, 0.0F, 2.0F, 8.0F, 12.0F, 0.0F, new CubeDeformation(0.7F)).texOffs(0, 10).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(32, 0)
						.addBox(-4.0F, 11.0F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(40, 20).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 3.0F, new CubeDeformation(0.4F)).texOffs(0, 54)
						.addBox(-4.5F, 0.0F, -2.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.5F)).texOffs(54, 17).addBox(0.5F, 0.0F, -2.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition RightPlate = partdefinition.addOrReplaceChild("RightPlate", CubeListBuilder.create().texOffs(48, 50).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.35F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition HatLayer_r1 = RightPlate.addOrReplaceChild("HatLayer_r1",
				CubeListBuilder.create().texOffs(16, 31).addBox(1.1F, -35.2F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(42, 58).addBox(1.6F, -32.5F, -1.0F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.7F, 27.9F, 0.3F, 0.0F, 0.0F, -0.3054F));
		PartDefinition RightArmLayer_r1 = RightPlate.addOrReplaceChild("RightArmLayer_r1", CubeListBuilder.create().texOffs(16, 50).addBox(-8.0F, -26.0F, -3.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(-14.5F, 20.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition LeftPlate = partdefinition.addOrReplaceChild("LeftPlate", CubeListBuilder.create().texOffs(32, 50).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.35F)), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition HatLayer_r2 = LeftPlate.addOrReplaceChild("HatLayer_r2",
				CubeListBuilder.create().texOffs(16, 26).addBox(-3.1F, -35.2F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(32, 58).addBox(-4.6F, -32.5F, -1.0F, 3.0F, 7.0F, 2.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.7F, 27.9F, 0.3F, 0.0F, 0.0F, 0.3054F));
		PartDefinition LeftArmLayer_r1 = LeftPlate.addOrReplaceChild("LeftArmLayer_r1", CubeListBuilder.create().texOffs(48, 5).addBox(6.0F, -26.0F, -3.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(14.5F, 20.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition RightLegging = partdefinition.addOrReplaceChild("RightLegging",
				CubeListBuilder.create().texOffs(0, 26).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.275F)).texOffs(32, 5).addBox(-0.9F, 4.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.4F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition LeftLegging = partdefinition.addOrReplaceChild("LeftLegging",
				CubeListBuilder.create().texOffs(24, 20).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.275F)).texOffs(38, 5).addBox(-1.1F, 4.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.4F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition LeftBoots = partdefinition.addOrReplaceChild("LeftBoots", CubeListBuilder.create().texOffs(52, 42).addBox(-2.1F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.325F)), PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition RightBoots = partdefinition.addOrReplaceChild("RightBoots", CubeListBuilder.create().texOffs(52, 35).addBox(-1.9F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.325F)), PartPose.offset(-2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.LeftPlate.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.LeftBoots.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Helmet.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Helmet.xRot = headPitch / (180F / (float) Math.PI);
		this.RightBoots.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightLegging.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftLegging.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightPlate.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}