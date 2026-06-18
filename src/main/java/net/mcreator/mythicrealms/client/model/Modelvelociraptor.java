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
public class Modelvelociraptor extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mythicrealms", "modelvelociraptor"), "main");
	public final ModelPart bone;
	public final ModelPart lowerBody;
	public final ModelPart upperBody;
	public final ModelPart neck;
	public final ModelPart head;
	public final ModelPart upperJaw;
	public final ModelPart lowerJaw;
	public final ModelPart eat_pos;
	public final ModelPart upperCrest;
	public final ModelPart lowerCrest;
	public final ModelPart head_hitbox;
	public final ModelPart rightUpperArm;
	public final ModelPart rightLowerArm;
	public final ModelPart rightLowerArmWing;
	public final ModelPart rightLowerArmWing2;
	public final ModelPart leftUpperArm;
	public final ModelPart leftLowerArm;
	public final ModelPart leftLowerArmWing;
	public final ModelPart leftLowerArmWing2;
	public final ModelPart tail1;
	public final ModelPart tail2;
	public final ModelPart tail3;
	public final ModelPart tailFeather1;
	public final ModelPart tailFeather2;
	public final ModelPart rightToeClaw3;
	public final ModelPart tailFeather3;
	public final ModelPart tailFeather4;
	public final ModelPart tail_hitbox;
	public final ModelPart rider_pos;
	public final ModelPart leftThigh;
	public final ModelPart leftLeg;
	public final ModelPart leftFoot;
	public final ModelPart leftToeClaw1;
	public final ModelPart leftToeClaw2;
	public final ModelPart rightThigh;
	public final ModelPart rightLeg;
	public final ModelPart rightFoot;
	public final ModelPart rightToeClaw1;
	public final ModelPart rightToeClaw2;
	public final ModelPart body_hitbox;

	public Modelvelociraptor(ModelPart root) {
		super(root);
		this.bone = root.getChild("bone");
		this.lowerBody = this.bone.getChild("lowerBody");
		this.upperBody = this.lowerBody.getChild("upperBody");
		this.neck = this.upperBody.getChild("neck");
		this.head = this.neck.getChild("head");
		this.upperJaw = this.head.getChild("upperJaw");
		this.lowerJaw = this.head.getChild("lowerJaw");
		this.eat_pos = this.lowerJaw.getChild("eat_pos");
		this.upperCrest = this.head.getChild("upperCrest");
		this.lowerCrest = this.head.getChild("lowerCrest");
		this.head_hitbox = this.head.getChild("head_hitbox");
		this.rightUpperArm = this.upperBody.getChild("rightUpperArm");
		this.rightLowerArm = this.rightUpperArm.getChild("rightLowerArm");
		this.rightLowerArmWing = this.rightLowerArm.getChild("rightLowerArmWing");
		this.rightLowerArmWing2 = this.rightLowerArm.getChild("rightLowerArmWing2");
		this.leftUpperArm = this.upperBody.getChild("leftUpperArm");
		this.leftLowerArm = this.leftUpperArm.getChild("leftLowerArm");
		this.leftLowerArmWing = this.leftLowerArm.getChild("leftLowerArmWing");
		this.leftLowerArmWing2 = this.leftLowerArm.getChild("leftLowerArmWing2");
		this.tail1 = this.lowerBody.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tailFeather1 = this.tail3.getChild("tailFeather1");
		this.tailFeather2 = this.tail3.getChild("tailFeather2");
		this.rightToeClaw3 = this.tail2.getChild("rightToeClaw3");
		this.tailFeather3 = this.tail2.getChild("tailFeather3");
		this.tailFeather4 = this.tail1.getChild("tailFeather4");
		this.tail_hitbox = this.tail1.getChild("tail_hitbox");
		this.rider_pos = this.lowerBody.getChild("rider_pos");
		this.leftThigh = this.bone.getChild("leftThigh");
		this.leftLeg = this.leftThigh.getChild("leftLeg");
		this.leftFoot = this.leftLeg.getChild("leftFoot");
		this.leftToeClaw1 = this.leftFoot.getChild("leftToeClaw1");
		this.leftToeClaw2 = this.leftToeClaw1.getChild("leftToeClaw2");
		this.rightThigh = this.bone.getChild("rightThigh");
		this.rightLeg = this.rightThigh.getChild("rightLeg");
		this.rightFoot = this.rightLeg.getChild("rightFoot");
		this.rightToeClaw1 = this.rightFoot.getChild("rightToeClaw1");
		this.rightToeClaw2 = this.rightToeClaw1.getChild("rightToeClaw2");
		this.body_hitbox = this.bone.getChild("body_hitbox");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition lowerBody = bone.addOrReplaceChild("lowerBody", CubeListBuilder.create().texOffs(38, 0).addBox(-3.5F, -2.4458F, -6.1571F, 7.0F, 8.0F, 9.0F, new CubeDeformation(0.001F)),
				PartPose.offsetAndRotation(0.0F, -13.7F, 4.1F, -0.0911F, 0.0F, 0.0F));
		PartDefinition upperBody = lowerBody.addOrReplaceChild("upperBody", CubeListBuilder.create().texOffs(40, 32).addBox(-3.0F, -1.8F, -5.5F, 6.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.3458F, -6.6571F, 0.1367F, 0.0F, 0.0F));
		PartDefinition neck = upperBody.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(40, 17).addBox(-2.0F, -3.0F, -9.0F, 4.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.6F, -5.2F, -1.3203F, 0.0F, 0.0F));
		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(54, 57).addBox(-3.0F, -2.0F, -4.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8F, -8.23F, 1.457F, 0.0F, 0.0F));
		PartDefinition upperJaw = head.addOrReplaceChild("upperJaw", CubeListBuilder.create().texOffs(16, 71).addBox(-2.0F, -2.4F, -3.7F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, -3.93F, 0.0592F, 0.0F, 0.0F));
		PartDefinition lowerJaw = head.addOrReplaceChild("lowerJaw", CubeListBuilder.create().texOffs(70, 27).addBox(-2.0F, -0.5F, -3.9F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.03F)),
				PartPose.offsetAndRotation(0.0F, 1.9F, -3.63F, -0.0456F, 0.0F, 0.0F));
		PartDefinition eat_pos = lowerJaw.addOrReplaceChild("eat_pos", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.0F));
		PartDefinition upperCrest = head.addOrReplaceChild("upperCrest", CubeListBuilder.create().texOffs(42, 58).addBox(-0.5F, -1.5F, 0.6F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.51F, -0.2F, -1.83F, 0.2731F, 0.0F, 0.0F));
		PartDefinition lowerCrest = head.addOrReplaceChild("lowerCrest", CubeListBuilder.create().texOffs(30, 71).addBox(-0.5F, -1.5F, 0.6F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.5F, -0.93F, -0.3643F, 0.0F, 0.0F));
		PartDefinition head_hitbox = head.addOrReplaceChild("head_hitbox", CubeListBuilder.create(), PartPose.offset(0.0F, 3.65F, -4.7F));
		PartDefinition rightUpperArm = upperBody.addOrReplaceChild("rightUpperArm", CubeListBuilder.create().texOffs(74, 53).addBox(0.0F, -1.0F, -1.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(2.0F, 2.3F, -3.5F, 1.1383F, 0.2276F, -0.4554F));
		PartDefinition rightLowerArm = rightUpperArm.addOrReplaceChild("rightLowerArm", CubeListBuilder.create().texOffs(70, 11).addBox(-1.1F, 0.5F, -8.8F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(1.2F, 2.0F, 2.8F, 0.0911F, 0.0F, 0.0F));
		PartDefinition rightLowerArmWing = rightLowerArm.addOrReplaceChild("rightLowerArmWing", CubeListBuilder.create().texOffs(60, 67).addBox(-0.5F, 0.0F, -8.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.5F, -0.3F, 0.5F, 0.3187F, 0.0F, 0.0F));
		PartDefinition rightLowerArmWing2 = rightLowerArm.addOrReplaceChild("rightLowerArmWing2", CubeListBuilder.create().texOffs(16, 60).addBox(-0.55F, -0.5F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.5F, 2.9F, -7.1F, -0.2094F, 0.0F, 0.0F));
		PartDefinition leftUpperArm = upperBody.addOrReplaceChild("leftUpperArm", CubeListBuilder.create().texOffs(74, 62).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-2.0F, 2.3F, -3.5F, 1.1383F, -0.2276F, 0.4554F));
		PartDefinition leftLowerArm = leftUpperArm.addOrReplaceChild("leftLowerArm", CubeListBuilder.create().texOffs(70, 19).addBox(-0.9F, 0.5F, -8.8F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-1.2F, 2.0F, 2.8F, 0.0911F, 0.0F, 0.0F));
		PartDefinition leftLowerArmWing = leftLowerArm.addOrReplaceChild("leftLowerArmWing", CubeListBuilder.create().texOffs(70, 0).addBox(-0.5F, 0.0F, -8.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-0.5F, -0.3F, 0.5F, 0.3187F, 0.0F, 0.0F));
		PartDefinition leftLowerArmWing2 = leftLowerArm.addOrReplaceChild("leftLowerArmWing2", CubeListBuilder.create().texOffs(0, 73).addBox(-0.45F, -0.5F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(-0.5F, 2.9F, -7.1F, -0.2094F, 0.0F, 0.0F));
		PartDefinition tail1 = lowerBody.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(54, 46).addBox(-2.0F, -1.0F, -0.6F, 4.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0458F, 2.3429F, 0.1396F, 0.0F, 0.0F));
		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(30, 46).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, 4.8F, 0.0349F, 0.0F, 0.0F));
		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 7.3F, -0.0698F, 0.0F, 0.0F));
		PartDefinition tailFeather1 = tail3.addOrReplaceChild("tailFeather1", CubeListBuilder.create().texOffs(0, 32).addBox(-4.5F, 0.5F, 9.1F, 9.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.2F, 1.5F, -0.0049F, 0.0F, 0.0F));
		PartDefinition tailFeather2 = tail3.addOrReplaceChild("tailFeather2", CubeListBuilder.create().texOffs(0, 19).addBox(-4.0F, 0.5F, 0.1F, 8.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.2F, -1.3F, -0.0049F, 0.0F, 0.0F));
		PartDefinition rightToeClaw3 = tail2.addOrReplaceChild("rightToeClaw3", CubeListBuilder.create().texOffs(30, 44).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.2F, -2.5F, -1.7628F, 0.0F, 0.0F));
		PartDefinition tailFeather3 = tail2.addOrReplaceChild("tailFeather3", CubeListBuilder.create().texOffs(0, 44).addBox(-3.5F, 0.0F, -0.9F, 7.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0456F, 0.0F, 0.0F));
		PartDefinition tailFeather4 = tail1.addOrReplaceChild("tailFeather4", CubeListBuilder.create().texOffs(0, 53).addBox(-3.5F, 0.1F, 0.0F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.0001F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition tail_hitbox = tail1.addOrReplaceChild("tail_hitbox", CubeListBuilder.create(), PartPose.offset(0.0F, 4.8F, 7.45F));
		PartDefinition rider_pos = lowerBody.addOrReplaceChild("rider_pos", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, -5.0F));
		PartDefinition leftThigh = bone.addOrReplaceChild("leftThigh", CubeListBuilder.create().texOffs(26, 58).addBox(0.0F, -2.5F, -2.0F, 3.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -11.4F, 4.0F, -0.3604F, 0.0F, 0.0F));
		PartDefinition leftLeg = leftThigh.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(66, 32).addBox(-1.0F, 0.4F, -7.2F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3F, 3.2F, 2.0F, 1.7757F, 0.0F, 0.0F));
		PartDefinition leftFoot = leftLeg.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(74, 41).addBox(-1.5F, 0.0F, -3.1F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.2F, 0.9F, -5.6F, -1.4114F, 0.0F, 0.0F));
		PartDefinition leftToeClaw1 = leftFoot.addOrReplaceChild("leftToeClaw1", CubeListBuilder.create().texOffs(66, 41).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-0.9F, 0.2F, 0.4F, -0.8727F, 0.0F, 0.0F));
		PartDefinition leftToeClaw2 = leftToeClaw1.addOrReplaceChild("leftToeClaw2", CubeListBuilder.create().texOffs(34, 44).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.4F, -2.5F));
		PartDefinition rightThigh = bone.addOrReplaceChild("rightThigh", CubeListBuilder.create().texOffs(0, 60).addBox(-3.0F, -2.5F, -2.0F, 3.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -11.4F, 4.0F, -0.3604F, 0.0F, 0.0F));
		PartDefinition rightLeg = rightThigh.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(42, 67).addBox(-1.0F, 0.4F, -7.2F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3F, 3.2F, 2.1F, 1.7757F, 0.0F, 0.0F));
		PartDefinition rightFoot = rightLeg.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(74, 47).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-0.2F, 0.9F, -5.6F, -1.4114F, 0.0F, 0.0F));
		PartDefinition rightToeClaw1 = rightFoot.addOrReplaceChild("rightToeClaw1", CubeListBuilder.create().texOffs(74, 71).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.9F, 0.2F, 0.4F, -0.8727F, 0.0F, 0.0F));
		PartDefinition rightToeClaw2 = rightToeClaw1.addOrReplaceChild("rightToeClaw2", CubeListBuilder.create().texOffs(26, 53).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.4F, -2.5F));
		PartDefinition body_hitbox = bone.addOrReplaceChild("body_hitbox", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -1.2F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}