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
public class ModelPaladino_Armor extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mythicrealms", "model_paladino_armor"), "main");
	public final ModelPart Helmet;
	public final ModelPart Chestplate;
	public final ModelPart RightPlate;
	public final ModelPart LeftPlate;
	public final ModelPart RightLegging;
	public final ModelPart LeftLegging;
	public final ModelPart RightBoots;
	public final ModelPart LeftBoots;

	public ModelPaladino_Armor(ModelPart root) {
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
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.5F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.6F)).texOffs(0, 10).addBox(-4.0F, -6.5F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.81F)).texOffs(48, 17)
						.addBox(-0.5F, -7.5F, -4.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.9F)).texOffs(0, 35).addBox(3.5F, -4.5F, -4.0F, 1.0F, 5.0F, 8.0F, new CubeDeformation(0.2F)).texOffs(40, 28)
						.addBox(-4.5F, -4.5F, -4.0F, 1.0F, 5.0F, 8.0F, new CubeDeformation(0.2F)).texOffs(58, 32).addBox(-3.0F, -5.5F, 3.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.8F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition HatLayer_r1 = Helmet.addOrReplaceChild("HatLayer_r1", CubeListBuilder.create().texOffs(24, 61).addBox(-0.3162F, -0.5F, 0.6153F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-4.4F, -6.0F, -0.2F, 0.0F, -0.1745F, 0.0F));
		PartDefinition HatLayer_r2 = Helmet.addOrReplaceChild("HatLayer_r2", CubeListBuilder.create().texOffs(0, 63).addBox(-0.3162F, -0.5F, 0.6153F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(-4.4F, -6.0F, -0.2F, 0.2618F, -0.1745F, 0.0F));
		PartDefinition HatLayer_r3 = Helmet.addOrReplaceChild("HatLayer_r3", CubeListBuilder.create().texOffs(34, 63).addBox(-0.3162F, -0.5F, 0.6153F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.4F)),
				PartPose.offsetAndRotation(-4.4F, -6.0F, -0.2F, 0.5672F, -0.1745F, 0.0F));
		PartDefinition HatLayer_r4 = Helmet.addOrReplaceChild("HatLayer_r4", CubeListBuilder.create().texOffs(18, 35).addBox(-4.0F, -30.5F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(-1.4F, 24.0F, 4.0F, 0.0F, -0.1745F, 0.0F));
		PartDefinition HatLayer_r5 = Helmet.addOrReplaceChild("HatLayer_r5", CubeListBuilder.create().texOffs(14, 61).addBox(-0.6838F, -0.5F, 0.6153F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.4F)),
				PartPose.offsetAndRotation(4.4F, -6.0F, -0.2F, 0.5672F, 0.1745F, 0.0F));
		PartDefinition HatLayer_r6 = Helmet.addOrReplaceChild("HatLayer_r6", CubeListBuilder.create().texOffs(60, 44).addBox(-0.6838F, -0.5F, 0.6153F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(4.4F, -6.0F, -0.2F, 0.2618F, 0.1745F, 0.0F));
		PartDefinition HatLayer_r7 = Helmet.addOrReplaceChild("HatLayer_r7", CubeListBuilder.create().texOffs(60, 39).addBox(-0.6838F, -0.5F, 0.6153F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(4.4F, -6.0F, -0.2F, 0.0F, 0.1745F, 0.0F));
		PartDefinition HatLayer_r8 = Helmet.addOrReplaceChild("HatLayer_r8", CubeListBuilder.create().texOffs(32, 16).addBox(3.0F, -30.5F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(1.4F, 24.0F, 4.0F, 0.0F, 0.1745F, 0.0F));
		PartDefinition Chestplate = partdefinition.addOrReplaceChild("Chestplate",
				CubeListBuilder.create().texOffs(0, 19).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(48, 0).addBox(-4.0F, 11.0F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.45F)).texOffs(0, 48)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 3.0F, new CubeDeformation(0.4F)).texOffs(24, 19).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.6F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition RightPlate = partdefinition.addOrReplaceChild("RightPlate", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition armorRightArm_r1 = RightPlate.addOrReplaceChild("armorRightArm_r1", CubeListBuilder.create().texOffs(40, 41).addBox(-2.55F, -3.35F, -2.75F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-1.25F, 0.15F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition armorRightArm_r2 = RightPlate.addOrReplaceChild("armorRightArm_r2", CubeListBuilder.create().texOffs(48, 5).addBox(1.55F, -3.85F, -3.75F, 1.0F, 5.0F, 7.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-1.25F, 0.25F, 0.25F, 0.0F, 0.0F, -0.3927F));
		PartDefinition LeftPlate = partdefinition.addOrReplaceChild("LeftPlate", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition armorLeftArm_r1 = LeftPlate.addOrReplaceChild("armorLeftArm_r1", CubeListBuilder.create().texOffs(18, 44).addBox(-2.45F, -3.35F, -2.75F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(1.25F, 0.15F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition armorLeftArm_r2 = LeftPlate.addOrReplaceChild("armorLeftArm_r2", CubeListBuilder.create().texOffs(38, 51).addBox(-2.55F, -3.85F, -3.75F, 1.0F, 5.0F, 7.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(1.25F, 0.25F, 0.25F, 0.0F, 0.0F, 0.3927F));
		PartDefinition RightLegging = partdefinition.addOrReplaceChild("RightLegging", CubeListBuilder.create().texOffs(32, 0).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.275F)), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition LeftLegging = partdefinition.addOrReplaceChild("LeftLegging", CubeListBuilder.create().texOffs(24, 28).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.275F)), PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition RightBoots = partdefinition.addOrReplaceChild("RightBoots",
				CubeListBuilder.create().texOffs(14, 54).addBox(-1.9F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.325F)).texOffs(58, 27).addBox(-1.9F, 9.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition HatLayer_r9 = RightBoots.addOrReplaceChild("HatLayer_r9", CubeListBuilder.create().texOffs(52, 63).addBox(0.2664F, -0.4F, 0.5168F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(-2.4F, 9.4F, -0.1F, 0.5672F, -0.1745F, 0.0F));
		PartDefinition HatLayer_r10 = RightBoots.addOrReplaceChild("HatLayer_r10", CubeListBuilder.create().texOffs(44, 63).addBox(0.2664F, -0.4F, 0.5168F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.4F, 9.4F, -0.1F, 0.2618F, -0.1745F, 0.0F));
		PartDefinition HatLayer_r11 = RightBoots.addOrReplaceChild("HatLayer_r11", CubeListBuilder.create().texOffs(30, 54).addBox(0.2838F, 27.0F, 0.6153F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-2.4F, -18.0F, -0.2F, 0.0F, -0.1745F, 0.0F));
		PartDefinition HatLayer_r12 = RightBoots.addOrReplaceChild("HatLayer_r12", CubeListBuilder.create().texOffs(36, 16).addBox(-3.4F, -3.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.4F)),
				PartPose.offsetAndRotation(0.6F, 12.0F, 4.0F, 0.0F, -0.1745F, 0.0F));
		PartDefinition LeftBoots = partdefinition.addOrReplaceChild("LeftBoots",
				CubeListBuilder.create().texOffs(54, 51).addBox(-2.1F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.325F)).texOffs(54, 58).addBox(-2.1F, 9.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition HatLayer_r13 = LeftBoots.addOrReplaceChild("HatLayer_r13", CubeListBuilder.create().texOffs(64, 9).addBox(-1.2664F, -0.4F, 0.5168F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(2.4F, 9.4F, -0.1F, 0.5672F, 0.1745F, 0.0F));
		PartDefinition HatLayer_r14 = LeftBoots.addOrReplaceChild("HatLayer_r14", CubeListBuilder.create().texOffs(64, 5).addBox(-1.2664F, -0.4F, 0.5168F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(2.4F, 9.4F, -0.1F, 0.2618F, 0.1745F, 0.0F));
		PartDefinition HatLayer_r15 = LeftBoots.addOrReplaceChild("HatLayer_r15", CubeListBuilder.create().texOffs(60, 63).addBox(-1.2838F, 27.0F, 0.6153F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(2.4F, -18.0F, -0.2F, 0.0F, 0.1745F, 0.0F));
		PartDefinition HatLayer_r16 = LeftBoots.addOrReplaceChild("HatLayer_r16", CubeListBuilder.create().texOffs(18, 37).addBox(2.4F, -3.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.4F)),
				PartPose.offsetAndRotation(-0.6F, 12.0F, 4.0F, 0.0F, 0.1745F, 0.0F));
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