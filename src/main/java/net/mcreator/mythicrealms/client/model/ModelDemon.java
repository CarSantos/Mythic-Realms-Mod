package net.mcreator.mythicrealms.client.model;

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
public class ModelDemon extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mythicrealms", "model_demon"), "main");
	public final ModelPart spin;
	public final ModelPart bone;
	public final ModelPart Body;
	public final ModelPart cape;
	public final ModelPart RightArm;
	public final ModelPart right_fore;
	public final ModelPart LeftArm;
	public final ModelPart left_fore;
	public final ModelPart Head;
	public final ModelPart leftWingArm;
	public final ModelPart leftWingFArm;
	public final ModelPart leftWingClaw;
	public final ModelPart leftWingF;
	public final ModelPart leftWingF7;
	public final ModelPart leftWingF8;
	public final ModelPart leftWingF9;
	public final ModelPart leftWingF10;
	public final ModelPart leftWingF11;
	public final ModelPart rightWingArm;
	public final ModelPart rightWingFArm;
	public final ModelPart rightWingClaw;
	public final ModelPart rightWingF;
	public final ModelPart rightWingF7;
	public final ModelPart rightWingF8;
	public final ModelPart rightWingF9;
	public final ModelPart rightWingF10;
	public final ModelPart rightWingF11;
	public final ModelPart LeftLeg;
	public final ModelPart left_lower;
	public final ModelPart RightLeg;
	public final ModelPart right_lower;

	public ModelDemon(ModelPart root) {
		super(root);
		this.spin = root.getChild("spin");
		this.bone = this.spin.getChild("bone");
		this.Body = this.bone.getChild("Body");
		this.cape = this.Body.getChild("cape");
		this.RightArm = this.Body.getChild("RightArm");
		this.right_fore = this.RightArm.getChild("right_fore");
		this.LeftArm = this.Body.getChild("LeftArm");
		this.left_fore = this.LeftArm.getChild("left_fore");
		this.Head = this.Body.getChild("Head");
		this.leftWingArm = this.Body.getChild("leftWingArm");
		this.leftWingFArm = this.leftWingArm.getChild("leftWingFArm");
		this.leftWingClaw = this.leftWingFArm.getChild("leftWingClaw");
		this.leftWingF = this.leftWingFArm.getChild("leftWingF");
		this.leftWingF7 = this.leftWingF.getChild("leftWingF7");
		this.leftWingF8 = this.leftWingF7.getChild("leftWingF8");
		this.leftWingF9 = this.leftWingF8.getChild("leftWingF9");
		this.leftWingF10 = this.leftWingF9.getChild("leftWingF10");
		this.leftWingF11 = this.leftWingF10.getChild("leftWingF11");
		this.rightWingArm = this.Body.getChild("rightWingArm");
		this.rightWingFArm = this.rightWingArm.getChild("rightWingFArm");
		this.rightWingClaw = this.rightWingFArm.getChild("rightWingClaw");
		this.rightWingF = this.rightWingFArm.getChild("rightWingF");
		this.rightWingF7 = this.rightWingF.getChild("rightWingF7");
		this.rightWingF8 = this.rightWingF7.getChild("rightWingF8");
		this.rightWingF9 = this.rightWingF8.getChild("rightWingF9");
		this.rightWingF10 = this.rightWingF9.getChild("rightWingF10");
		this.rightWingF11 = this.rightWingF10.getChild("rightWingF11");
		this.LeftLeg = this.bone.getChild("LeftLeg");
		this.left_lower = this.LeftLeg.getChild("left_lower");
		this.RightLeg = this.bone.getChild("RightLeg");
		this.right_lower = this.RightLeg.getChild("right_lower");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition spin = partdefinition.addOrReplaceChild("spin", CubeListBuilder.create(), PartPose.offset(0.0F, 3.0F, 0.0F));
		PartDefinition bone = spin.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 17.9F, 0.0F));
		PartDefinition Body = bone.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 96).addBox(-4.0F, -11.9F, -2.4F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(96, 102).addBox(-4.0F, -11.9F, -2.4F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.4F)),
				PartPose.offset(0.0F, -11.4F, 0.0F));
		PartDefinition cape = Body.addOrReplaceChild("cape", CubeListBuilder.create(), PartPose.offset(-4.3F, -11.5F, 1.1F));
		PartDefinition RightArm = Body.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(100, 111).addBox(-2.8F, -1.7F, -1.9F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.3F)), PartPose.offset(-5.5F, -10.0F, 0.0F));
		PartDefinition right_fore = RightArm.addOrReplaceChild("right_fore", CubeListBuilder.create().texOffs(68, 104).addBox(-1.4F, -2.4F, -1.9F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.2F, 3.5F, 0.0F));
		PartDefinition LeftArm = Body.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(56, 116).addBox(-1.2F, -1.7F, -1.9F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.3F)), PartPose.offset(5.5F, -10.0F, 0.0F));
		PartDefinition left_fore = LeftArm.addOrReplaceChild("left_fore", CubeListBuilder.create().texOffs(84, 111).addBox(-2.6F, -2.4F, -1.9F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.2F, 3.5F, 0.0F));
		PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 80).addBox(-4.0F, -2.5F, -4.8F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -17.4F, 0.0F));
		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(40, 107).addBox(-5.8F, -31.8F, -5.8F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.7F, 22.0F, 10.0F, 0.4653F, 0.4028F, -0.0162F));
		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(16, 112).addBox(-7.1F, -31.8F, -12.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(8.7F, 22.0F, 10.0F, 0.2648F, 0.3917F, 0.0296F));
		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(84, 104).addBox(5.1F, -31.8F, -12.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-8.7F, 22.0F, 10.0F, 0.2648F, -0.3917F, -0.0296F));
		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(24, 96).addBox(3.8F, -31.8F, -5.8F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.7F, 22.0F, 10.0F, 0.4653F, -0.4028F, 0.0162F));
		PartDefinition leftWingArm = Body.addOrReplaceChild("leftWingArm", CubeListBuilder.create().texOffs(108, 87).addBox(-0.4655F, -0.505F, -0.9172F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(1.5F, -10.5F, 2.0F, -1.5708F, -0.3927F, 0.0F));
		PartDefinition leftWingArm_r1 = leftWingArm.addOrReplaceChild("leftWingArm_r1", CubeListBuilder.create().texOffs(32, 95).addBox(0.0F, 0.05F, 1.5F, 10.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4605F, 0.0F, -0.9222F, 0.0F, 0.2182F, 0.0F));
		PartDefinition leftWingFArm = leftWingArm.addOrReplaceChild("leftWingFArm", CubeListBuilder.create().texOffs(108, 84).addBox(0.5F, -1.0F, -1.5F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5395F, 0.5F, 1.0778F, 0.0F, 0.7505F, 0.0F));
		PartDefinition leftWingFArm_r1 = leftWingFArm.addOrReplaceChild("leftWingFArm_r1", CubeListBuilder.create().texOffs(72, 84).addBox(-5.0F, 0.0F, 2.0F, 11.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6891F, -0.5F, 0.7788F, 0.0F, 1.0472F, 0.0F));
		PartDefinition leftWingClaw = leftWingFArm.addOrReplaceChild("leftWingClaw", CubeListBuilder.create(), PartPose.offsetAndRotation(9.25F, 0.0F, -0.75F, 0.0F, 0.7854F, 0.0F));
		PartDefinition leftWingF = leftWingFArm.addOrReplaceChild("leftWingF",
				CubeListBuilder.create().texOffs(102, 91).addBox(-0.6057F, -1.0F, -0.2266F, 16.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(102, 95).addBox(1.2477F, -0.25F, -2.5164F, 11.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.75F, -0.275F, -1.0F, 0.0F, -2.0944F, 0.0F));
		PartDefinition leftWingF7 = leftWingF.addOrReplaceChild("leftWingF7", CubeListBuilder.create().texOffs(72, 80).addBox(-0.1057F, -1.0F, -0.2266F, 21.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.0125F, 0.0F, 0.0F, 0.3491F, 0.0F));
		PartDefinition leftWingF7_r1 = leftWingF7.addOrReplaceChild("leftWingF7_r1", CubeListBuilder.create().texOffs(78, 44).addBox(-6.1F, 0.5F, 4.0035F, 12.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.3238F, -0.75F, -8.1216F, 0.0F, -0.3491F, 0.0F));
		PartDefinition leftWingF8 = leftWingF7.addOrReplaceChild("leftWingF8", CubeListBuilder.create().texOffs(78, 40).addBox(-0.1057F, -1.0F, -0.2266F, 29.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.025F, 0.0F, 0.0F, 0.4363F, 0.0F));
		PartDefinition leftWingF8_r1 = leftWingF8.addOrReplaceChild("leftWingF8_r1", CubeListBuilder.create().texOffs(78, 0).addBox(-5.0043F, 0.0F, -6.0F, 17.0F, 0.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.1828F, -0.25F, -4.7658F, 0.0F, -0.7854F, 0.0F));
		PartDefinition leftWingF9 = leftWingF8.addOrReplaceChild("leftWingF9", CubeListBuilder.create().texOffs(78, 36).addBox(-0.6057F, -1.0F, -0.2266F, 36.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.025F, 0.0F, 0.0F, 0.3054F, 0.0F));
		PartDefinition leftWingF9_r1 = leftWingF9.addOrReplaceChild("leftWingF9_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-4.5022F, 0.0F, -14.25F, 13.0F, 0.0F, 26.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2603F, -0.25F, -1.0061F, 0.0F, -1.0908F, 0.0F));
		PartDefinition leftWingF10 = leftWingF9.addOrReplaceChild("leftWingF10", CubeListBuilder.create().texOffs(24, 102).addBox(0.3894F, -1.005F, -0.2216F, 17.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, -0.0125F, 0.0F, 0.0F, 0.3491F, 0.0F));
		PartDefinition leftWingF10_r1 = leftWingF10.addOrReplaceChild("leftWingF10_r1", CubeListBuilder.create().texOffs(0, 52).addBox(-5.0022F, 0.0F, -16.25F, 8.0F, 0.0F, 28.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.8668F, -0.25F, 3.5843F, 0.0F, -1.4399F, 0.0F));
		PartDefinition leftWingF11 = leftWingF10.addOrReplaceChild("leftWingF11", CubeListBuilder.create().texOffs(66, 98).addBox(-0.5057F, -1.0F, -0.0016F, 18.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.4F, 0.0F, 0.025F, 0.0F, -0.1309F, 0.0F));
		PartDefinition rightWingArm = Body.addOrReplaceChild("rightWingArm", CubeListBuilder.create().texOffs(116, 80).addBox(-6.5345F, -0.505F, -0.9172F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-1.5F, -10.5F, 2.0F, -1.5708F, 0.3927F, 0.0F));
		PartDefinition rightWingArm_r1 = rightWingArm.addOrReplaceChild("rightWingArm_r1", CubeListBuilder.create().texOffs(68, 91).addBox(-10.0F, 0.05F, 1.5F, 10.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4605F, 0.0F, -0.9222F, 0.0F, -0.2182F, 0.0F));
		PartDefinition rightWingFArm = rightWingArm.addOrReplaceChild("rightWingFArm", CubeListBuilder.create().texOffs(104, 98).addBox(-9.5F, -1.0F, -1.5F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.5395F, 0.5F, 1.0778F, 0.0F, -0.7505F, 0.0F));
		PartDefinition rightWingFArm_r1 = rightWingFArm.addOrReplaceChild("rightWingFArm_r1", CubeListBuilder.create().texOffs(32, 88).addBox(-6.0F, 0.0F, 2.0F, 11.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.6891F, -0.5F, 0.7788F, 0.0F, -1.0472F, 0.0F));
		PartDefinition rightWingClaw = rightWingFArm.addOrReplaceChild("rightWingClaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.25F, 0.0F, -0.75F, 0.0F, -0.7854F, 0.0F));
		PartDefinition rightWingF = rightWingFArm.addOrReplaceChild("rightWingF",
				CubeListBuilder.create().texOffs(102, 93).addBox(-15.3943F, -1.0F, -0.2266F, 16.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 104).addBox(-12.2477F, -0.25F, -2.5164F, 11.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.75F, -0.275F, -1.0F, 0.0F, 2.0944F, 0.0F));
		PartDefinition rightWingF7 = rightWingF.addOrReplaceChild("rightWingF7", CubeListBuilder.create().texOffs(72, 82).addBox(-20.8943F, -1.0F, -0.2266F, 21.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.0125F, 0.0F, 0.0F, -0.3491F, 0.0F));
		PartDefinition rightWingF8_r1 = rightWingF7.addOrReplaceChild("rightWingF8_r1", CubeListBuilder.create().texOffs(32, 80).addBox(-5.9F, 0.5F, 4.0035F, 12.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.3238F, -0.75F, -8.1216F, 0.0F, 0.3491F, 0.0F));
		PartDefinition rightWingF8 = rightWingF7.addOrReplaceChild("rightWingF8", CubeListBuilder.create().texOffs(78, 42).addBox(-28.8943F, -1.0F, -0.2266F, 29.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.025F, 0.0F, 0.0F, -0.4363F, 0.0F));
		PartDefinition rightWingF9_r1 = rightWingF8.addOrReplaceChild("rightWingF9_r1", CubeListBuilder.create().texOffs(78, 18).addBox(-11.9956F, 0.0F, -6.0F, 17.0F, 0.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.1828F, -0.25F, -4.7658F, 0.0F, 0.7854F, 0.0F));
		PartDefinition rightWingF9 = rightWingF8.addOrReplaceChild("rightWingF9", CubeListBuilder.create().texOffs(78, 38).addBox(-35.3943F, -1.0F, -0.2266F, 36.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.025F, 0.0F, 0.0F, -0.3054F, 0.0F));
		PartDefinition rightWingF10_r1 = rightWingF9.addOrReplaceChild("rightWingF10_r1", CubeListBuilder.create().texOffs(0, 26).addBox(-8.4978F, 0.0F, -14.25F, 13.0F, 0.0F, 26.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.2603F, -0.25F, -1.0061F, 0.0F, 1.0908F, 0.0F));
		PartDefinition rightWingF10 = rightWingF9.addOrReplaceChild("rightWingF10", CubeListBuilder.create().texOffs(60, 102).addBox(-17.3893F, -1.005F, -0.2216F, 17.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, -0.0125F, 0.0F, 0.0F, -0.3491F, 0.0F));
		PartDefinition rightWingF11_r1 = rightWingF10.addOrReplaceChild("rightWingF11_r1", CubeListBuilder.create().texOffs(72, 52).addBox(-2.9978F, 0.0F, -16.25F, 8.0F, 0.0F, 28.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.8668F, -0.25F, 3.5843F, 0.0F, 1.4399F, 0.0F));
		PartDefinition rightWingF11 = rightWingF10.addOrReplaceChild("rightWingF11", CubeListBuilder.create().texOffs(66, 100).addBox(-17.4943F, -1.0F, -0.0016F, 18.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.4F, 0.0F, 0.025F, 0.0F, 0.1309F, 0.0F));
		PartDefinition LeftLeg = bone.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(52, 104).addBox(-2.28F, 3.2F, -2.5F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.28F, -14.5F, 0.1F));
		PartDefinition left_lower = LeftLeg.addOrReplaceChild("left_lower", CubeListBuilder.create().texOffs(0, 112).addBox(-2.28F, 1.5F, -2.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 9.9F, 0.0F));
		PartDefinition RightLeg = bone.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(24, 107).addBox(-1.72F, 3.2F, -2.5F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.28F, -14.5F, 0.1F));
		PartDefinition right_lower = RightLeg.addOrReplaceChild("right_lower", CubeListBuilder.create().texOffs(40, 116).addBox(-1.72F, 1.5F, -2.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 9.9F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}