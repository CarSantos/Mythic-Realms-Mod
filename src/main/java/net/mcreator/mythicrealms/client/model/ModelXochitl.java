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

// Made with Blockbench 5.1.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelXochitl extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mythicrealms", "model_xochitl"), "main");
	public final ModelPart yveltal;
	public final ModelPart body;
	public final ModelPart torso;
	public final ModelPart chest;
	public final ModelPart scarf;
	public final ModelPart scarf2;
	public final ModelPart scarf3;
	public final ModelPart scarf4;
	public final ModelPart neck;
	public final ModelPart neck2;
	public final ModelPart head;
	public final ModelPart bone;
	public final ModelPart bone2;
	public final ModelPart eye_right;
	public final ModelPart eyelid_right;
	public final ModelPart eye_left;
	public final ModelPart eyelid_left;
	public final ModelPart jaw;
	public final ModelPart arm_left;
	public final ModelPart hand_left;
	public final ModelPart finger_left;
	public final ModelPart finger_right2;
	public final ModelPart finger_left3;
	public final ModelPart finger_left4;
	public final ModelPart finger_left5;
	public final ModelPart finger_left6;
	public final ModelPart finger_left7;
	public final ModelPart finger_left8;
	public final ModelPart finger_left9;
	public final ModelPart arm_right;
	public final ModelPart hand_right;
	public final ModelPart finger_right;
	public final ModelPart finger_left2;
	public final ModelPart finger_right3;
	public final ModelPart finger_right4;
	public final ModelPart finger_right5;
	public final ModelPart finger_right6;
	public final ModelPart finger_right7;
	public final ModelPart finger_right8;
	public final ModelPart finger_right9;
	public final ModelPart tail;
	public final ModelPart tail2;
	public final ModelPart tail3;
	public final ModelPart tail_finger;
	public final ModelPart tail_finger2;
	public final ModelPart tail_finger3;
	public final ModelPart tail_finger_left;
	public final ModelPart tail_finger_left2;
	public final ModelPart tail_finger_left3;
	public final ModelPart tail_finger_right;
	public final ModelPart tail_finger_right2;
	public final ModelPart tail_finger_right3;
	public final ModelPart leg_left;
	public final ModelPart leg_left2;
	public final ModelPart leg_left3;
	public final ModelPart foot_left;
	public final ModelPart toe_left;
	public final ModelPart claw_left;
	public final ModelPart toe_left2;
	public final ModelPart claw_left2;
	public final ModelPart toe_left3;
	public final ModelPart claw_left3;
	public final ModelPart leg_right;
	public final ModelPart leg_right2;
	public final ModelPart leg_right3;
	public final ModelPart foot_right;
	public final ModelPart toe_right;
	public final ModelPart claw_right;
	public final ModelPart toe_right2;
	public final ModelPart claw_right2;
	public final ModelPart toe_right3;
	public final ModelPart claw_right3;

	public ModelXochitl(ModelPart root) {
		super(root);
		this.yveltal = root.getChild("yveltal");
		this.body = this.yveltal.getChild("body");
		this.torso = this.body.getChild("torso");
		this.chest = this.torso.getChild("chest");
		this.scarf = this.chest.getChild("scarf");
		this.scarf2 = this.scarf.getChild("scarf2");
		this.scarf3 = this.scarf2.getChild("scarf3");
		this.scarf4 = this.chest.getChild("scarf4");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.bone = this.head.getChild("bone");
		this.bone2 = this.head.getChild("bone2");
		this.eye_right = this.head.getChild("eye_right");
		this.eyelid_right = this.eye_right.getChild("eyelid_right");
		this.eye_left = this.head.getChild("eye_left");
		this.eyelid_left = this.eye_left.getChild("eyelid_left");
		this.jaw = this.head.getChild("jaw");
		this.arm_left = this.chest.getChild("arm_left");
		this.hand_left = this.arm_left.getChild("hand_left");
		this.finger_left = this.hand_left.getChild("finger_left");
		this.finger_right2 = this.finger_left.getChild("finger_right2");
		this.finger_left3 = this.finger_right2.getChild("finger_left3");
		this.finger_left4 = this.hand_left.getChild("finger_left4");
		this.finger_left5 = this.finger_left4.getChild("finger_left5");
		this.finger_left6 = this.finger_left5.getChild("finger_left6");
		this.finger_left7 = this.hand_left.getChild("finger_left7");
		this.finger_left8 = this.finger_left7.getChild("finger_left8");
		this.finger_left9 = this.finger_left8.getChild("finger_left9");
		this.arm_right = this.chest.getChild("arm_right");
		this.hand_right = this.arm_right.getChild("hand_right");
		this.finger_right = this.hand_right.getChild("finger_right");
		this.finger_left2 = this.finger_right.getChild("finger_left2");
		this.finger_right3 = this.finger_left2.getChild("finger_right3");
		this.finger_right4 = this.hand_right.getChild("finger_right4");
		this.finger_right5 = this.finger_right4.getChild("finger_right5");
		this.finger_right6 = this.finger_right5.getChild("finger_right6");
		this.finger_right7 = this.hand_right.getChild("finger_right7");
		this.finger_right8 = this.finger_right7.getChild("finger_right8");
		this.finger_right9 = this.finger_right8.getChild("finger_right9");
		this.tail = this.torso.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail_finger = this.tail3.getChild("tail_finger");
		this.tail_finger2 = this.tail_finger.getChild("tail_finger2");
		this.tail_finger3 = this.tail_finger2.getChild("tail_finger3");
		this.tail_finger_left = this.tail3.getChild("tail_finger_left");
		this.tail_finger_left2 = this.tail_finger_left.getChild("tail_finger_left2");
		this.tail_finger_left3 = this.tail_finger_left2.getChild("tail_finger_left3");
		this.tail_finger_right = this.tail3.getChild("tail_finger_right");
		this.tail_finger_right2 = this.tail_finger_right.getChild("tail_finger_right2");
		this.tail_finger_right3 = this.tail_finger_right2.getChild("tail_finger_right3");
		this.leg_left = this.body.getChild("leg_left");
		this.leg_left2 = this.leg_left.getChild("leg_left2");
		this.leg_left3 = this.leg_left2.getChild("leg_left3");
		this.foot_left = this.leg_left3.getChild("foot_left");
		this.toe_left = this.foot_left.getChild("toe_left");
		this.claw_left = this.toe_left.getChild("claw_left");
		this.toe_left2 = this.foot_left.getChild("toe_left2");
		this.claw_left2 = this.toe_left2.getChild("claw_left2");
		this.toe_left3 = this.foot_left.getChild("toe_left3");
		this.claw_left3 = this.toe_left3.getChild("claw_left3");
		this.leg_right = this.body.getChild("leg_right");
		this.leg_right2 = this.leg_right.getChild("leg_right2");
		this.leg_right3 = this.leg_right2.getChild("leg_right3");
		this.foot_right = this.leg_right3.getChild("foot_right");
		this.toe_right = this.foot_right.getChild("toe_right");
		this.claw_right = this.toe_right.getChild("claw_right");
		this.toe_right2 = this.foot_right.getChild("toe_right2");
		this.claw_right2 = this.toe_right2.getChild("claw_right2");
		this.toe_right3 = this.foot_right.getChild("toe_right3");
		this.claw_right3 = this.toe_right3.getChild("claw_right3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition yveltal = partdefinition.addOrReplaceChild("yveltal", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition body = yveltal.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -10.0F, -8.0F));
		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(54, 54).addBox(-3.5F, -2.5F, -5.5F, 7.0F, 5.0F, 11.0F, new CubeDeformation(0.005F)), PartPose.offset(0.0F, 0.5F, 8.5F));
		PartDefinition chest = torso.addOrReplaceChild("chest",
				CubeListBuilder.create().texOffs(54, 38).addBox(-5.5F, -0.5F, -9.0F, 11.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(28, 70).addBox(-5.5F, -0.5F, -12.0F, 11.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.5F, -4.5F));
		PartDefinition scarf = chest.addOrReplaceChild("scarf", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5F, -12.0F));
		PartDefinition scarf2 = scarf.addOrReplaceChild("scarf2", CubeListBuilder.create(), PartPose.offset(0.0F, -9.0F, 1.5F));
		PartDefinition scarf3 = scarf2.addOrReplaceChild("scarf3", CubeListBuilder.create(), PartPose.offset(0.0F, -9.0F, 0.0F));
		PartDefinition scarf4 = chest.addOrReplaceChild("scarf4", CubeListBuilder.create(), PartPose.offset(0.0F, 6.5F, -10.0F));
		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(74, 70).addBox(-2.0F, -1.5F, -3.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.25F, -11.5F));
		PartDefinition neck2 = neck.addOrReplaceChild("neck2",
				CubeListBuilder.create().texOffs(0, 78).addBox(-2.0F, 0.5F, -5.0F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.001F)).texOffs(0, 87).addBox(-2.0F, 0.5F, -1.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.1F)),
				PartPose.offset(0.0F, -2.0F, -3.5F));
		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create().texOffs(62, 11).addBox(-3.0F, -1.5F, -9.0F, 6.0F, 4.0F, 9.0F, new CubeDeformation(0.05F)), PartPose.offset(0.0F, 1.5F, -4.0F));
		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2F, 15.25F, -24.1F, 0.0F, -0.2182F, 0.0F));
		PartDefinition head_r1 = bone.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(60, 83).addBox(0.5F, -11.75F, -29.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.3F)).texOffs(12, 87)
				.addBox(0.5F, -11.75F, -29.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.5F)).texOffs(72, 86).addBox(0.5F, -3.75F, -29.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.4F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.0741F, 0.1509F, 0.2666F));
		PartDefinition bone2 = head.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2F, 15.25F, -24.1F, 0.0F, 0.2182F, 0.0F));
		PartDefinition head_r2 = bone2.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(32, 86).addBox(-1.5F, -11.75F, -29.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.3F)).texOffs(18, 87)
				.addBox(-1.5F, -11.75F, -29.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.5F)).texOffs(84, 86).addBox(-1.5F, -3.75F, -29.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.4F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.0741F, -0.1509F, -0.2666F));
		PartDefinition eye_right = head.addOrReplaceChild("eye_right", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.01F, 0.1944F, -6.0792F, 0.1745F, 0.0F, 0.0F));
		PartDefinition eyelid_right = eye_right.addOrReplaceChild("eyelid_right", CubeListBuilder.create().texOffs(62, 24).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offset(0.1F, 0.0F, 0.0F));
		PartDefinition eye_left = head.addOrReplaceChild("eye_left", CubeListBuilder.create(), PartPose.offsetAndRotation(2.01F, 0.1944F, -6.0792F, 0.1745F, 0.0F, 0.0F));
		PartDefinition eyelid_left = eye_left.addOrReplaceChild("eyelid_left", CubeListBuilder.create().texOffs(70, 24).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offset(-0.1F, 0.0F, 0.0F));
		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(0, 67).addBox(-2.5F, 0.5F, -8.0F, 5.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, -1.0F));
		PartDefinition arm_left = chest.addOrReplaceChild("arm_left", CubeListBuilder.create().texOffs(0, 45).addBox(-1.5F, -1.0F, -4.0F, 19.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, -4.5F));
		PartDefinition hand_left = arm_left.addOrReplaceChild("hand_left", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, -5.5F, 20.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(16.5F, -1.5F, 0.0F));
		PartDefinition finger_left = hand_left.addOrReplaceChild("finger_left", CubeListBuilder.create(), PartPose.offsetAndRotation(19.5F, 1.5F, -3.0F, 0.0F, 0.1745F, 0.3927F));
		PartDefinition finger_right2 = finger_left.addOrReplaceChild("finger_right2", CubeListBuilder.create(), PartPose.offsetAndRotation(6.5F, 1.0F, 0.0F, 0.0F, 0.0F, -0.5672F));
		PartDefinition finger_left3 = finger_right2.addOrReplaceChild("finger_left3", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.829F));
		PartDefinition finger_left4 = hand_left.addOrReplaceChild("finger_left4", CubeListBuilder.create(), PartPose.offsetAndRotation(19.5F, 1.5F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition finger_left5 = finger_left4.addOrReplaceChild("finger_left5", CubeListBuilder.create(), PartPose.offsetAndRotation(6.5F, 1.0F, 0.0F, 0.0F, 0.0F, -0.5672F));
		PartDefinition finger_left6 = finger_left5.addOrReplaceChild("finger_left6", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.829F));
		PartDefinition finger_left7 = hand_left.addOrReplaceChild("finger_left7", CubeListBuilder.create(), PartPose.offsetAndRotation(19.5F, 1.5F, 3.0F, 0.0F, -0.1745F, 0.3927F));
		PartDefinition finger_left8 = finger_left7.addOrReplaceChild("finger_left8", CubeListBuilder.create(), PartPose.offsetAndRotation(6.5F, 1.0F, 0.0F, 0.0F, 0.0F, -0.5672F));
		PartDefinition finger_left9 = finger_left8.addOrReplaceChild("finger_left9", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.829F));
		PartDefinition arm_right = chest.addOrReplaceChild("arm_right", CubeListBuilder.create().texOffs(52, 28).addBox(-17.5F, -1.0F, -4.0F, 19.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, -4.5F));
		PartDefinition hand_right = arm_right.addOrReplaceChild("hand_right", CubeListBuilder.create().texOffs(0, 14).addBox(-20.0F, 0.0F, -5.5F, 20.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(-16.5F, -1.5F, 0.0F));
		PartDefinition finger_right = hand_right.addOrReplaceChild("finger_right", CubeListBuilder.create(), PartPose.offsetAndRotation(-19.5F, 1.5F, -3.0F, 0.0F, -0.1745F, -0.3927F));
		PartDefinition finger_left2 = finger_right.addOrReplaceChild("finger_left2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.5672F));
		PartDefinition finger_right3 = finger_left2.addOrReplaceChild("finger_right3", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.829F));
		PartDefinition finger_right4 = hand_right.addOrReplaceChild("finger_right4", CubeListBuilder.create(), PartPose.offsetAndRotation(-19.5F, 1.5F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition finger_right5 = finger_right4.addOrReplaceChild("finger_right5", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.5672F));
		PartDefinition finger_right6 = finger_right5.addOrReplaceChild("finger_right6", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.829F));
		PartDefinition finger_right7 = hand_right.addOrReplaceChild("finger_right7", CubeListBuilder.create(), PartPose.offsetAndRotation(-19.5F, 1.5F, 3.0F, 0.0F, 0.1745F, -0.3927F));
		PartDefinition finger_right8 = finger_right7.addOrReplaceChild("finger_right8", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.5672F));
		PartDefinition finger_right9 = finger_right8.addOrReplaceChild("finger_right9", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.829F));
		PartDefinition tail = torso.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 55).addBox(-3.5F, -1.0F, -1.0F, 7.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.5F, 5.5F));
		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(62, 0).addBox(-4.5F, -1.5F, -1.0F, 9.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 9.0F));
		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 28).addBox(-6.0F, 0.0F, 0.0F, 12.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.5F, 7.0F));
		PartDefinition tail_finger = tail3.addOrReplaceChild("tail_finger", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5F, 13.5F, -0.3927F, 0.0F, 0.0F));
		PartDefinition tail_finger2 = tail_finger.addOrReplaceChild("tail_finger2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, 6.5F, 0.5672F, 0.0F, 0.0F));
		PartDefinition tail_finger3 = tail_finger2.addOrReplaceChild("tail_finger3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, 5.0F, -0.829F, 0.0F, 0.0F));
		PartDefinition tail_finger_left = tail3.addOrReplaceChild("tail_finger_left", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 1.5F, 13.5F, -0.3927F, 0.1745F, 0.0F));
		PartDefinition tail_finger_left2 = tail_finger_left.addOrReplaceChild("tail_finger_left2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, 6.5F, 0.5672F, 0.0F, 0.0F));
		PartDefinition tail_finger_left3 = tail_finger_left2.addOrReplaceChild("tail_finger_left3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, 5.0F, -0.829F, 0.0F, 0.0F));
		PartDefinition tail_finger_right = tail3.addOrReplaceChild("tail_finger_right", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 1.5F, 13.5F, -0.3927F, -0.1745F, 0.0F));
		PartDefinition tail_finger_right2 = tail_finger_right.addOrReplaceChild("tail_finger_right2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, 6.5F, 0.5672F, 0.0F, 0.0F));
		PartDefinition tail_finger_right3 = tail_finger_right2.addOrReplaceChild("tail_finger_right3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.0F, 5.0F, -0.829F, 0.0F, 0.0F));
		PartDefinition leg_left = body.addOrReplaceChild("leg_left", CubeListBuilder.create().texOffs(34, 55).addBox(-1.0F, -2.0F, -2.5F, 4.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(3.5F, 1.0F, 9.0F));
		PartDefinition leg_left2 = leg_left.addOrReplaceChild("leg_left2", CubeListBuilder.create().texOffs(74, 79).addBox(-1.5F, -3.4F, 0.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(1.0F, 6.0F, 2.5F));
		PartDefinition leg_left3 = leg_left2.addOrReplaceChild("leg_left3", CubeListBuilder.create().texOffs(24, 87).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, 4.0F));
		PartDefinition foot_left = leg_left3.addOrReplaceChild("foot_left", CubeListBuilder.create().texOffs(32, 80).addBox(-1.5F, -0.5F, -3.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offset(0.0F, 4.5F, -0.5F));
		PartDefinition toe_left = foot_left.addOrReplaceChild("toe_left", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6645F, 0.5F, -2.5151F, 0.0F, 0.3491F, 0.0F));
		PartDefinition claw_left = toe_left.addOrReplaceChild("claw_left", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.0F));
		PartDefinition toe_left2 = foot_left.addOrReplaceChild("toe_left2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6645F, 0.5F, -2.5151F, 0.0F, -0.3491F, 0.0F));
		PartDefinition claw_left2 = toe_left2.addOrReplaceChild("claw_left2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.0F));
		PartDefinition toe_left3 = foot_left.addOrReplaceChild("toe_left3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5F, 1.0F));
		PartDefinition claw_left3 = toe_left3.addOrReplaceChild("claw_left3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.0F));
		PartDefinition leg_right = body.addOrReplaceChild("leg_right", CubeListBuilder.create().texOffs(56, 70).addBox(-3.0F, -2.0F, -2.5F, 4.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.5F, 1.0F, 9.0F));
		PartDefinition leg_right2 = leg_right.addOrReplaceChild("leg_right2", CubeListBuilder.create().texOffs(18, 80).addBox(-1.5F, -3.4F, 0.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offset(-1.0F, 6.0F, 2.5F));
		PartDefinition leg_right3 = leg_right2.addOrReplaceChild("leg_right3", CubeListBuilder.create().texOffs(44, 89).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, 4.0F));
		PartDefinition foot_right = leg_right3.addOrReplaceChild("foot_right", CubeListBuilder.create().texOffs(46, 83).addBox(-1.5F, -0.5F, -3.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offset(0.0F, 4.5F, -0.5F));
		PartDefinition toe_right = foot_right.addOrReplaceChild("toe_right", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6645F, 0.5F, -2.5151F, 0.0F, -0.3491F, 0.0F));
		PartDefinition claw_right = toe_right.addOrReplaceChild("claw_right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.0F));
		PartDefinition toe_right2 = foot_right.addOrReplaceChild("toe_right2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6645F, 0.5F, -2.5151F, 0.0F, 0.3491F, 0.0F));
		PartDefinition claw_right2 = toe_right2.addOrReplaceChild("claw_right2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.0F));
		PartDefinition toe_right3 = foot_right.addOrReplaceChild("toe_right3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5F, 1.0F));
		PartDefinition claw_right3 = toe_right3.addOrReplaceChild("claw_right3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.0F));
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