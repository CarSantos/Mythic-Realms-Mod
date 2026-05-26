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
public class ModelArmor_Nano extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mythicrealms", "model_armor_nano"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RIghtArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public ModelArmor_Nano(ModelPart root) {
		super(root);
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RIghtArm = root.getChild("RIghtArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 25).addBox(-4.0F, -8.0F, -4.0F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.3F)).texOffs(18, 35).addBox(3.0F, -8.0F, -4.0F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.3F)).texOffs(0, 16)
						.addBox(-3.0F, -8.1F, -4.0F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.35F)).texOffs(28, 16).addBox(-3.0F, -7.7F, 3.1F, 6.0F, 8.0F, 1.0F, new CubeDeformation(0.3F)).texOffs(16, 51)
						.addBox(-4.0F, -8.1F, -4.9F, 8.0F, 9.0F, 1.0F, new CubeDeformation(-0.3F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(42, 30).addBox(-4.0F, 11.0F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.45F)).texOffs(24, 0).addBox(-3.0F, 0.0F, -2.0F, 6.0F, 12.0F, 4.0F, new CubeDeformation(0.4F)).texOffs(18, 25)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(58, 24).addBox(-0.5F, 3.0F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.7F)).texOffs(0, 0)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition RIghtArm = partdefinition.addOrReplaceChild("RIghtArm",
				CubeListBuilder.create().texOffs(42, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(52, 35).addBox(-3.0F, 3.1F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.6F)).texOffs(52, 40)
						.addBox(-3.0F, 0.1F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.6F)).texOffs(58, 19).addBox(-3.0F, -2.9F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(1.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(44, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(52, 45).addBox(0.0F, 3.1F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.6F)).texOffs(0, 57)
						.addBox(0.0F, 0.1F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.6F)).texOffs(58, 14).addBox(0.0F, -2.9F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(1.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(36, 35).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(34, 51).addBox(-1.9F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.4F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 41).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(50, 51).addBox(-2.1F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.4F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.RIghtArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}