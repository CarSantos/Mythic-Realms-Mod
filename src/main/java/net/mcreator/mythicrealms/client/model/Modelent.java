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
public class Modelent extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mythicrealms", "modelent"), "main");
	public final ModelPart ent;
	public final ModelPart body;
	public final ModelPart upperbody;
	public final ModelPart left_arm;
	public final ModelPart left_fore;
	public final ModelPart bone8;
	public final ModelPart bone9;
	public final ModelPart right_arm;
	public final ModelPart right_fore;
	public final ModelPart head_rot;
	public final ModelPart head;
	public final ModelPart upper_head;
	public final ModelPart eyelid;
	public final ModelPart bone2;
	public final ModelPart bone4;
	public final ModelPart bone;
	public final ModelPart bone3;
	public final ModelPart bone7;
	public final ModelPart bone6;
	public final ModelPart left_leg;
	public final ModelPart left_lower;
	public final ModelPart right_leg;
	public final ModelPart right_lower;

	public Modelent(ModelPart root) {
		super(root);
		this.ent = root.getChild("ent");
		this.body = this.ent.getChild("body");
		this.upperbody = this.body.getChild("upperbody");
		this.left_arm = this.upperbody.getChild("left_arm");
		this.left_fore = this.left_arm.getChild("left_fore");
		this.bone8 = this.left_arm.getChild("bone8");
		this.bone9 = this.left_arm.getChild("bone9");
		this.right_arm = this.upperbody.getChild("right_arm");
		this.right_fore = this.right_arm.getChild("right_fore");
		this.head_rot = this.upperbody.getChild("head_rot");
		this.head = this.head_rot.getChild("head");
		this.upper_head = this.head.getChild("upper_head");
		this.eyelid = this.upper_head.getChild("eyelid");
		this.bone2 = this.upper_head.getChild("bone2");
		this.bone4 = this.upper_head.getChild("bone4");
		this.bone = this.upper_head.getChild("bone");
		this.bone3 = this.upper_head.getChild("bone3");
		this.bone7 = this.upper_head.getChild("bone7");
		this.bone6 = this.upper_head.getChild("bone6");
		this.left_leg = this.ent.getChild("left_leg");
		this.left_lower = this.left_leg.getChild("left_lower");
		this.right_leg = this.ent.getChild("right_leg");
		this.right_lower = this.right_leg.getChild("right_lower");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition ent = partdefinition.addOrReplaceChild("ent", CubeListBuilder.create(), PartPose.offset(0.0F, -22.0F, 0.0F));
		PartDefinition body = ent.addOrReplaceChild("body", CubeListBuilder.create().texOffs(66, 82).addBox(-8.0F, -18.5F, -5.5F, 16.0F, 18.0F, 12.0F, new CubeDeformation(0.3F)), PartPose.offset(0.0F, 12.5F, -0.5F));
		PartDefinition upperbody = body.addOrReplaceChild("upperbody", CubeListBuilder.create().texOffs(0, 30).addBox(-12.0F, -14.5F, -7.5F, 24.0F, 14.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -18.0F, 0.0F));
		PartDefinition left_arm = upperbody.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(88, 112).addBox(-9.0F, -4.0F, -6.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 126).addBox(-7.0F, 5.6F, -4.0F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.4F)),
				PartPose.offset(-13.0F, -8.5F, 0.5F));
		PartDefinition left_fore = left_arm.addOrReplaceChild("left_fore", CubeListBuilder.create().texOffs(0, 101).addBox(-5.3523F, 2.0262F, -5.8799F, 10.8F, 14.4F, 10.8F, new CubeDeformation(0.0F)), PartPose.offset(-3.864F, 15.5347F, -0.9201F));
		PartDefinition bone8 = left_arm.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(-10.6236F, -3.5885F, 4.5564F, -0.2696F, 0.2316F, 0.4943F));
		PartDefinition bone9 = left_arm.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(-9.6654F, -2.3855F, -3.1755F));
		PartDefinition right_arm = upperbody.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(122, 82).addBox(0.7012F, -5.2005F, -4.2691F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(128, 0).addBox(2.7012F, 4.3995F, -2.2691F, 6.0F, 12.0F, 6.0F, new CubeDeformation(0.4F)),
				PartPose.offset(11.2988F, -7.2995F, -1.2309F));
		PartDefinition right_fore = right_arm.addOrReplaceChild("right_fore", CubeListBuilder.create().texOffs(44, 112).addBox(-6.254F, 0.267F, -4.8615F, 10.8F, 14.4F, 10.8F, new CubeDeformation(0.0F)), PartPose.offset(6.3716F, 16.0934F, -0.2075F));
		PartDefinition head_rot = upperbody.addOrReplaceChild("head_rot", CubeListBuilder.create(), PartPose.offset(0.0F, -11.4051F, -2.2136F));
		PartDefinition head = head_rot.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, -4.5F, -9.0F, 20.0F, 12.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.4949F, 1.7136F, 0.0873F, 0.0F, 0.0F));
		PartDefinition upper_head = head.addOrReplaceChild("upper_head",
				CubeListBuilder.create().texOffs(0, 80).addBox(-8.9868F, -3.2662F, -15.2695F, 18.0F, 6.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(44, 151).addBox(-1.9868F, -3.2662F, -17.2695F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.5651F, 10.3843F, -0.133F, -0.0019F, 0.019F));
		PartDefinition upper_head_r1 = upper_head.addOrReplaceChild("upper_head_r1", CubeListBuilder.create().texOffs(112, 144).addBox(-2.5F, -4.0F, -0.5F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0132F, -6.8409F, -17.1823F, -0.2182F, 0.0F, 0.0F));
		PartDefinition upper_head_r2 = upper_head.addOrReplaceChild("upper_head_r2", CubeListBuilder.create().texOffs(0, 144).addBox(-2.5F, -6.1F, -0.3F, 5.0F, 11.0F, 5.0F, new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(0.0132F, -13.535F, -13.6497F, -0.8727F, 0.0F, 0.0F));
		PartDefinition upper_head_r3 = upper_head.addOrReplaceChild("upper_head_r3", CubeListBuilder.create().texOffs(0, 58).addBox(-10.0F, -1.8F, -9.7F, 20.0F, 4.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0132F, -4.7662F, -7.7695F, 0.0873F, 0.0F, 0.0F));
		PartDefinition eyelid = upper_head.addOrReplaceChild("eyelid",
				CubeListBuilder.create().texOffs(56, 151).addBox(3.5F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 0).addBox(-7.5F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.1F, 0.1F, -15.1F));
		PartDefinition bone2 = upper_head.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(10.9277F, -9.8488F, -4.8551F, 0.0F, 0.0F, -0.2618F));
		PartDefinition bone2_r1 = bone2.addOrReplaceChild("bone2_r1", CubeListBuilder.create().texOffs(128, 66).addBox(-5.1142F, -5.4142F, -2.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4234F, 6.753F, -1.2144F, 0.0F, 0.0F, 1.0472F));
		PartDefinition bone2_r2 = bone2.addOrReplaceChild("bone2_r2", CubeListBuilder.create().texOffs(128, 52).addBox(-3.5152F, -5.3153F, -2.0428F, 6.0F, 8.0F, 6.0F, new CubeDeformation(-0.9F)),
				PartPose.offsetAndRotation(1.3662F, 1.4944F, -0.2144F, -0.213F, -0.9052F, 0.6921F));
		PartDefinition bone2_r3 = bone2.addOrReplaceChild("bone2_r3", CubeListBuilder.create().texOffs(44, 101).addBox(-2.316F, -5.44F, -1.6303F, 4.0F, 7.0F, 4.0F, new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(1.6605F, -2.1313F, 0.0846F, 1.2928F, 1.3936F, 1.3726F));
		PartDefinition bone4 = upper_head.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-10.9277F, -9.8488F, -4.8551F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone3_r1 = bone4.addOrReplaceChild("bone3_r1", CubeListBuilder.create().texOffs(48, 137).addBox(-0.8858F, -5.4142F, -2.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4234F, 6.753F, -1.2144F, 0.0F, 0.0F, -1.0472F));
		PartDefinition bone3_r2 = bone4.addOrReplaceChild("bone3_r2", CubeListBuilder.create().texOffs(24, 137).addBox(-2.4848F, -5.3153F, -2.0428F, 6.0F, 8.0F, 6.0F, new CubeDeformation(-0.9F)),
				PartPose.offsetAndRotation(-1.3662F, 1.4944F, -0.2144F, -0.213F, 0.9052F, -0.6921F));
		PartDefinition bone3_r3 = bone4.addOrReplaceChild("bone3_r3", CubeListBuilder.create().texOffs(24, 126).addBox(-1.684F, -5.44F, -1.6303F, 4.0F, 7.0F, 4.0F, new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(-1.6605F, -2.1313F, 0.0846F, 1.2928F, -1.3936F, -1.3726F));
		PartDefinition bone = upper_head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(11.0132F, -0.2662F, -13.0695F, 0.3927F, 0.3054F, 0.0F));
		PartDefinition bone_r1 = bone.addOrReplaceChild("bone_r1", CubeListBuilder.create().texOffs(128, 116).addBox(-5.3002F, -4.9239F, -1.2346F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0472F));
		PartDefinition bone_r2 = bone.addOrReplaceChild("bone_r2", CubeListBuilder.create().texOffs(128, 102).addBox(-5.4464F, -5.0002F, -2.6464F, 6.0F, 8.0F, 6.0F, new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(6.2154F, -5.1282F, 1.0F, 0.0F, 0.3927F, 0.5236F));
		PartDefinition bone_r3 = bone.addOrReplaceChild("bone_r3", CubeListBuilder.create().texOffs(148, 144).addBox(-2.6204F, -5.7622F, -1.0803F, 4.0F, 7.0F, 4.0F, new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(7.5396F, -10.0217F, 1.0F, 0.0F, -0.3927F, 0.3054F));
		PartDefinition bone3 = upper_head.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-11.0132F, -0.2662F, -13.0695F, 0.3927F, -0.3054F, 0.0F));
		PartDefinition bone_r4 = bone3.addOrReplaceChild("bone_r4", CubeListBuilder.create().texOffs(88, 132).addBox(-0.6998F, -4.9239F, -1.2346F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0472F));
		PartDefinition bone_r5 = bone3.addOrReplaceChild("bone_r5", CubeListBuilder.create().texOffs(128, 130).addBox(-0.5536F, -5.0002F, -2.6464F, 6.0F, 8.0F, 6.0F, new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(-6.2154F, -5.1282F, 1.0F, 0.0F, -0.3927F, -0.5236F));
		PartDefinition bone_r6 = bone3.addOrReplaceChild("bone_r6", CubeListBuilder.create().texOffs(72, 150).addBox(-1.3796F, -5.7622F, -1.0803F, 4.0F, 7.0F, 4.0F, new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(-7.5396F, -10.0217F, 1.0F, 0.0F, 0.3927F, -0.3054F));
		PartDefinition bone7 = upper_head.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5132F, -9.7683F, -4.8875F, 2.1536F, 1.2918F, 2.1224F));
		PartDefinition bone7_r1 = bone7.addOrReplaceChild("bone7_r1", CubeListBuilder.create().texOffs(20, 151).addBox(-1.9786F, -6.2473F, 7.0902F, 3.0F, 6.0F, 3.0F, new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(-4.1615F, 1.2128F, -4.7209F, 0.5018F, -0.007F, -0.4316F));
		PartDefinition bone7_r2 = bone7.addOrReplaceChild("bone7_r2", CubeListBuilder.create().texOffs(72, 137).addBox(-2.4786F, -2.4296F, -0.1317F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1615F, 1.2128F, -4.7209F, -0.1527F, -0.007F, -0.4316F));
		PartDefinition bone7_r3 = bone7.addOrReplaceChild("bone7_r3", CubeListBuilder.create().texOffs(112, 132).addBox(-2.4786F, -9.2939F, -1.3003F, 4.0F, 8.0F, 4.0F, new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(-4.1615F, 1.2128F, -4.7209F, -0.8072F, -0.007F, -0.4316F));
		PartDefinition bone6 = upper_head.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5132F, -9.7683F, -4.8875F, 2.1536F, -1.2918F, -2.1224F));
		PartDefinition bone8_r1 = bone6.addOrReplaceChild("bone8_r1", CubeListBuilder.create().texOffs(32, 151).addBox(-1.0214F, -6.2473F, 7.0902F, 3.0F, 6.0F, 3.0F, new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(4.1615F, 1.2128F, -4.7209F, 0.5018F, 0.007F, 0.4316F));
		PartDefinition bone8_r2 = bone6.addOrReplaceChild("bone8_r2", CubeListBuilder.create().texOffs(132, 144).addBox(-1.5214F, -2.4296F, -0.1317F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1615F, 1.2128F, -4.7209F, -0.1527F, 0.007F, 0.4316F));
		PartDefinition bone8_r3 = bone6.addOrReplaceChild("bone8_r3", CubeListBuilder.create().texOffs(88, 146).addBox(-1.5214F, -9.2939F, -1.3003F, 4.0F, 8.0F, 4.0F, new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(4.1615F, 1.2128F, -4.7209F, -0.8072F, 0.007F, 0.4316F));
		PartDefinition left_leg = ent.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(128, 18).addBox(-2.7232F, -1.3522F, -3.0F, 6.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(4.7232F, 12.3522F, 0.0F));
		PartDefinition left_lower = left_leg.addOrReplaceChild("left_lower", CubeListBuilder.create().texOffs(76, 0).addBox(-6.3255F, -3.0882F, -6.3F, 12.6F, 28.0F, 12.6F, new CubeDeformation(0.0F)), PartPose.offset(0.2768F, 9.6478F, 0.0F));
		PartDefinition right_leg = ent.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(128, 35).addBox(-3.2768F, -0.3522F, -3.0F, 6.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.7232F, 11.3522F, 0.0F));
		PartDefinition right_lower = right_leg.addOrReplaceChild("right_lower", CubeListBuilder.create().texOffs(76, 41).addBox(-6.2745F, -3.0882F, -6.3F, 12.6F, 28.0F, 12.6F, new CubeDeformation(0.0F)), PartPose.offset(-0.2768F, 10.6478F, 0.3F));
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