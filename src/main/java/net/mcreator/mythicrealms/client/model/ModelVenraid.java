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
public class ModelVenraid extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mythicrealms", "model_venraid"), "main");
	public final ModelPart scolipede;
	public final ModelPart body;
	public final ModelPart torso;
	public final ModelPart torso_rotation;
	public final ModelPart torso2;
	public final ModelPart torso3;
	public final ModelPart shell_spike2_left;
	public final ModelPart shell_spike2_right;
	public final ModelPart neck;
	public final ModelPart shell_spike3_left;
	public final ModelPart shell_spike3_right;
	public final ModelPart neck2;
	public final ModelPart shell_spike4_left;
	public final ModelPart shell_spike4_right;
	public final ModelPart neck3;
	public final ModelPart shell_spike5_left;
	public final ModelPart shell_spike5_right;
	public final ModelPart head;
	public final ModelPart head2;
	public final ModelPart eyes;
	public final ModelPart eye_left;
	public final ModelPart pupil_left;
	public final ModelPart eyelid_half_left;
	public final ModelPart eyelid_full_left;
	public final ModelPart eye_right;
	public final ModelPart pupil_right;
	public final ModelPart eyelid_half_right;
	public final ModelPart eyelid_full_right;
	public final ModelPart head_antennae2;
	public final ModelPart head_antenna_left3;
	public final ModelPart head_antenna_left4;
	public final ModelPart head_antennae3;
	public final ModelPart head_antenna_left2;
	public final ModelPart head_antenna_left5;
	public final ModelPart muzzle;
	public final ModelPart tail;
	public final ModelPart shell_spike1_left;
	public final ModelPart shell_spike1_right;
	public final ModelPart tail2;
	public final ModelPart tail_antennae_right;
	public final ModelPart tail_antennae_right2;
	public final ModelPart bone;
	public final ModelPart tail_antennae_right3;
	public final ModelPart tail_antennae_right4;
	public final ModelPart bone2;
	public final ModelPart tail3;
	public final ModelPart legs;
	public final ModelPart leg_front_left;
	public final ModelPart leg_front_left2;
	public final ModelPart leg_front_left3;
	public final ModelPart foot_front_left;
	public final ModelPart foot_front_left_rotation;
	public final ModelPart leg_front_right;
	public final ModelPart leg_front_right2;
	public final ModelPart leg_front_right3;
	public final ModelPart foot_front_right;
	public final ModelPart foot_front_right_rotation;
	public final ModelPart leg_back_left;
	public final ModelPart leg_back_left2;
	public final ModelPart leg_back_left3;
	public final ModelPart foot_back_left;
	public final ModelPart foot_back_left_rotation;
	public final ModelPart leg_back_right;
	public final ModelPart leg_back_right2;
	public final ModelPart leg_back_right3;
	public final ModelPart foot_back_right;
	public final ModelPart foot_back_right_rotation;

	public ModelVenraid(ModelPart root) {
		super(root);
		this.scolipede = root.getChild("scolipede");
		this.body = this.scolipede.getChild("body");
		this.torso = this.body.getChild("torso");
		this.torso_rotation = this.torso.getChild("torso_rotation");
		this.torso2 = this.torso_rotation.getChild("torso2");
		this.torso3 = this.torso2.getChild("torso3");
		this.shell_spike2_left = this.torso3.getChild("shell_spike2_left");
		this.shell_spike2_right = this.torso3.getChild("shell_spike2_right");
		this.neck = this.torso3.getChild("neck");
		this.shell_spike3_left = this.neck.getChild("shell_spike3_left");
		this.shell_spike3_right = this.neck.getChild("shell_spike3_right");
		this.neck2 = this.neck.getChild("neck2");
		this.shell_spike4_left = this.neck2.getChild("shell_spike4_left");
		this.shell_spike4_right = this.neck2.getChild("shell_spike4_right");
		this.neck3 = this.neck2.getChild("neck3");
		this.shell_spike5_left = this.neck3.getChild("shell_spike5_left");
		this.shell_spike5_right = this.neck3.getChild("shell_spike5_right");
		this.head = this.neck3.getChild("head");
		this.head2 = this.head.getChild("head2");
		this.eyes = this.head2.getChild("eyes");
		this.eye_left = this.eyes.getChild("eye_left");
		this.pupil_left = this.eye_left.getChild("pupil_left");
		this.eyelid_half_left = this.eye_left.getChild("eyelid_half_left");
		this.eyelid_full_left = this.eye_left.getChild("eyelid_full_left");
		this.eye_right = this.eyes.getChild("eye_right");
		this.pupil_right = this.eye_right.getChild("pupil_right");
		this.eyelid_half_right = this.eye_right.getChild("eyelid_half_right");
		this.eyelid_full_right = this.eye_right.getChild("eyelid_full_right");
		this.head_antennae2 = this.head2.getChild("head_antennae2");
		this.head_antenna_left3 = this.head_antennae2.getChild("head_antenna_left3");
		this.head_antenna_left4 = this.head_antenna_left3.getChild("head_antenna_left4");
		this.head_antennae3 = this.head2.getChild("head_antennae3");
		this.head_antenna_left2 = this.head_antennae3.getChild("head_antenna_left2");
		this.head_antenna_left5 = this.head_antenna_left2.getChild("head_antenna_left5");
		this.muzzle = this.head2.getChild("muzzle");
		this.tail = this.torso_rotation.getChild("tail");
		this.shell_spike1_left = this.tail.getChild("shell_spike1_left");
		this.shell_spike1_right = this.tail.getChild("shell_spike1_right");
		this.tail2 = this.tail.getChild("tail2");
		this.tail_antennae_right = this.tail2.getChild("tail_antennae_right");
		this.tail_antennae_right2 = this.tail_antennae_right.getChild("tail_antennae_right2");
		this.bone = this.tail_antennae_right2.getChild("bone");
		this.tail_antennae_right3 = this.tail2.getChild("tail_antennae_right3");
		this.tail_antennae_right4 = this.tail_antennae_right3.getChild("tail_antennae_right4");
		this.bone2 = this.tail_antennae_right4.getChild("bone2");
		this.tail3 = this.tail2.getChild("tail3");
		this.legs = this.body.getChild("legs");
		this.leg_front_left = this.legs.getChild("leg_front_left");
		this.leg_front_left2 = this.leg_front_left.getChild("leg_front_left2");
		this.leg_front_left3 = this.leg_front_left2.getChild("leg_front_left3");
		this.foot_front_left = this.leg_front_left3.getChild("foot_front_left");
		this.foot_front_left_rotation = this.foot_front_left.getChild("foot_front_left_rotation");
		this.leg_front_right = this.legs.getChild("leg_front_right");
		this.leg_front_right2 = this.leg_front_right.getChild("leg_front_right2");
		this.leg_front_right3 = this.leg_front_right2.getChild("leg_front_right3");
		this.foot_front_right = this.leg_front_right3.getChild("foot_front_right");
		this.foot_front_right_rotation = this.foot_front_right.getChild("foot_front_right_rotation");
		this.leg_back_left = this.legs.getChild("leg_back_left");
		this.leg_back_left2 = this.leg_back_left.getChild("leg_back_left2");
		this.leg_back_left3 = this.leg_back_left2.getChild("leg_back_left3");
		this.foot_back_left = this.leg_back_left3.getChild("foot_back_left");
		this.foot_back_left_rotation = this.foot_back_left.getChild("foot_back_left_rotation");
		this.leg_back_right = this.legs.getChild("leg_back_right");
		this.leg_back_right2 = this.leg_back_right.getChild("leg_back_right2");
		this.leg_back_right3 = this.leg_back_right2.getChild("leg_back_right3");
		this.foot_back_right = this.leg_back_right3.getChild("foot_back_right");
		this.foot_back_right_rotation = this.foot_back_right.getChild("foot_back_right_rotation");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition scolipede = partdefinition.addOrReplaceChild("scolipede", CubeListBuilder.create(), PartPose.offset(0.0F, 24.1642F, 4.6543F));
		PartDefinition body = scolipede.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, -3.6F, -4.7134F));
		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -14.0F, 3.9884F, 0.0F, 1.5708F, 0.0F));
		PartDefinition torso_rotation = torso.addOrReplaceChild("torso_rotation", CubeListBuilder.create().texOffs(56, 35).addBox(0.0F, -6.0F, -6.975F, 14.0F, 15.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition torso_rotation_r1 = torso_rotation.addOrReplaceChild("torso_rotation_r1", CubeListBuilder.create().texOffs(0, 35).addBox(0.6F, -2.5F, -8.9F, 10.0F, 12.0F, 18.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(1.0F, -5.0F, -0.075F, 0.0F, 0.0F, -0.0873F));
		PartDefinition torso2 = torso_rotation.addOrReplaceChild("torso2", CubeListBuilder.create().texOffs(56, 64).addBox(0.0F, -16.0F, -7.0F, 12.0F, 16.0F, 14.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(13.0F, 9.0F, 0.025F, 0.0F, 0.0F, -0.5236F));
		PartDefinition torso2_r1 = torso2.addOrReplaceChild("torso2_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -8.5F, -10.0F, 9.0F, 15.0F, 20.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(5.4F, -9.5F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition torso3 = torso2.addOrReplaceChild("torso3", CubeListBuilder.create().texOffs(0, 65).addBox(0.0F, -13.0F, -6.5F, 15.0F, 13.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8727F));
		PartDefinition torso3_r1 = torso3.addOrReplaceChild("torso3_r1", CubeListBuilder.create().texOffs(58, 0).addBox(-3.8F, -0.5F, -8.5F, 11.0F, 11.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.3F, -14.5F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition shell_spike2_left = torso3.addOrReplaceChild("shell_spike2_left", CubeListBuilder.create(), PartPose.offsetAndRotation(8.5F, -4.0F, 8.4F, -0.0873F, 0.0F, -0.0873F));
		PartDefinition shell_spike2_right = torso3.addOrReplaceChild("shell_spike2_right", CubeListBuilder.create(), PartPose.offsetAndRotation(8.5F, -4.0F, -8.4F, 0.0873F, 0.0F, -0.0873F));
		PartDefinition neck = torso3.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(112, 28).addBox(0.0F, -12.0F, -5.5F, 12.0F, 11.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.48F));
		PartDefinition neck_r1 = neck.addOrReplaceChild("neck_r1", CubeListBuilder.create().texOffs(52, 94).addBox(-0.8F, 0.7F, -7.5F, 8.0F, 11.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.3F, -15.0F, 0.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition shell_spike3_left = neck.addOrReplaceChild("shell_spike3_left", CubeListBuilder.create(), PartPose.offsetAndRotation(5.9F, -3.42F, 6.7F, -0.0873F, 0.0F, -0.0436F));
		PartDefinition shell_spike3_right = neck.addOrReplaceChild("shell_spike3_right", CubeListBuilder.create(), PartPose.offsetAndRotation(5.9F, -3.42F, -6.7F, 0.0873F, 0.0F, -0.0436F));
		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(86, 122).addBox(0.0F, 0.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0F, -12.0F, 0.0F, 0.0F, 0.0F, 0.2182F));
		PartDefinition neck2_r1 = neck2.addOrReplaceChild("neck2_r1", CubeListBuilder.create().texOffs(0, 120).addBox(-4.8F, -0.3F, -6.5F, 8.0F, 10.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.3F, -0.5F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition shell_spike4_left = neck2.addOrReplaceChild("shell_spike4_left", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8F, 8.675F, 6.4F, -0.0873F, 0.0F, -0.2182F));
		PartDefinition shell_spike4_right = neck2.addOrReplaceChild("shell_spike4_right", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8F, 8.675F, -6.4F, 0.0873F, 0.0F, -0.2182F));
		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(42, 140).addBox(0.0F, 1.0F, -4.0F, 9.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.6545F));
		PartDefinition neck3_r1 = neck3.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(42, 120).addBox(0.3F, -5.35F, -5.5F, 11.0F, 9.0F, 11.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-1.0F, 3.9F, 0.0F, 0.0F, 0.0F, 0.0436F));
		PartDefinition shell_spike5_left = neck3.addOrReplaceChild("shell_spike5_left", CubeListBuilder.create(), PartPose.offsetAndRotation(5.6F, 7.775F, 5.4F, -0.0873F, 0.0F, -0.4363F));
		PartDefinition shell_spike5_right = neck3.addOrReplaceChild("shell_spike5_right", CubeListBuilder.create(), PartPose.offsetAndRotation(5.6F, 7.775F, -5.4F, 0.0873F, 0.0F, -0.4363F));
		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create().texOffs(100, 142).addBox(0.0F, 1.0F, -4.0F, 7.0F, 7.0F, 8.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.9599F));
		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(114, 0).addBox(-5.6F, -2.75F, -5.5F, 14.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.3F, 1.6F, 0.0F, 0.0F, 0.0F, -0.0436F));
		PartDefinition head2 = head.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(112, 50).addBox(0.0F, 0.0F, -3.0F, 7.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition eyes = head2.addOrReplaceChild("eyes", CubeListBuilder.create(), PartPose.offset(0.1F, -0.025F, -0.0134F));
		PartDefinition eye_left = eyes.addOrReplaceChild("eye_left", CubeListBuilder.create(), PartPose.offset(4.3F, 2.9F, 3.0234F));
		PartDefinition pupil_left = eye_left.addOrReplaceChild("pupil_left", CubeListBuilder.create(), PartPose.offset(0.5F, 0.5F, 0.0F));
		PartDefinition eyelid_half_left = eye_left.addOrReplaceChild("eyelid_half_left", CubeListBuilder.create().texOffs(124, 89).addBox(-1.5F, -1.0F, -0.49F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, -0.8F, -0.5F));
		PartDefinition eyelid_full_left = eye_left.addOrReplaceChild("eyelid_full_left", CubeListBuilder.create().texOffs(100, 28).addBox(-1.5F, -1.5F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, 0.0F, -0.59F));
		PartDefinition eye_right = eyes.addOrReplaceChild("eye_right", CubeListBuilder.create(), PartPose.offset(4.3F, 2.9F, -2.9966F));
		PartDefinition pupil_right = eye_right.addOrReplaceChild("pupil_right", CubeListBuilder.create(), PartPose.offset(0.5F, 0.5F, 0.0F));
		PartDefinition eyelid_half_right = eye_right.addOrReplaceChild("eyelid_half_right", CubeListBuilder.create().texOffs(116, 89).addBox(-1.5F, -1.0F, -0.51F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, -0.8F, 0.5F));
		PartDefinition eyelid_full_right = eye_right.addOrReplaceChild("eyelid_full_right", CubeListBuilder.create().texOffs(108, 89).addBox(-1.5F, -1.5F, -0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, 0.0F, 0.59F));
		PartDefinition head_antennae2 = head2.addOrReplaceChild("head_antennae2", CubeListBuilder.create(), PartPose.offset(0.7F, 0.9F, 0.4F));
		PartDefinition head_antenna_left3 = head_antennae2.addOrReplaceChild("head_antenna_left3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7F, -0.4F, -2.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition head_antenna_left4 = head_antenna_left3.addOrReplaceChild("head_antenna_left4", CubeListBuilder.create(), PartPose.offsetAndRotation(10.0F, -10.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition head_antennae3 = head2.addOrReplaceChild("head_antennae3", CubeListBuilder.create(), PartPose.offset(0.7F, 0.9F, -0.4F));
		PartDefinition head_antenna_left2 = head_antennae3.addOrReplaceChild("head_antenna_left2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7F, -0.4F, 2.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition head_antenna_left5 = head_antenna_left2.addOrReplaceChild("head_antenna_left5", CubeListBuilder.create(), PartPose.offsetAndRotation(10.0F, -10.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition muzzle = head2.addOrReplaceChild("muzzle", CubeListBuilder.create().texOffs(150, 154).addBox(0.0F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, 1.4F, 0.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition tail = torso_rotation.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(108, 64).addBox(-10.0F, -13.0F, -6.0F, 10.0F, 13.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.15F, 0.025F, 0.0F, 0.0F, 0.1309F));
		PartDefinition tail_r1 = tail.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(0, 91).addBox(-2.0F, -7.5F, -8.5F, 9.0F, 12.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5F, -7.5F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition shell_spike1_left = tail.addOrReplaceChild("shell_spike1_left", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.4F, -3.15F, 8.4F, 0.0F, 0.0F, -0.0873F));
		PartDefinition shell_spike1_right = tail.addOrReplaceChild("shell_spike1_right", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.4F, -3.15F, -8.4F, 0.0F, 0.0F, -0.0873F));
		PartDefinition tail2 = tail.addOrReplaceChild("tail2",
				CubeListBuilder.create().texOffs(126, 122).addBox(-9.0F, 0.0F, -5.0F, 9.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(98, 94).addBox(-4.7F, -2.5F, -7.5F, 7.0F, 13.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.0F, -11.55F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition tail_antennae_right = tail2.addOrReplaceChild("tail_antennae_right", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.75F, 0.1F, -2.5F, 0.0F, 0.0F, -0.8727F));
		PartDefinition tail_antennae_right2 = tail_antennae_right.addOrReplaceChild("tail_antennae_right2", CubeListBuilder.create(), PartPose.offsetAndRotation(-10.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition bone = tail_antennae_right2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(27.75F, 30.9F, 3.2F));
		PartDefinition tail_antennae_right3 = tail2.addOrReplaceChild("tail_antennae_right3", CubeListBuilder.create().texOffs(142, 89).addBox(-10.975F, -10.0F, -6.9F, 10.0F, 10.0F, 6.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-7.75F, 0.1F, 3.9F, 0.0F, 0.0F, -0.8727F));
		PartDefinition tail_antennae_right4 = tail_antennae_right3.addOrReplaceChild("tail_antennae_right4", CubeListBuilder.create().texOffs(76, 142).addBox(-1.975F, -18.0F, -6.9F, 6.0F, 19.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition bone2 = tail_antennae_right4.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(27.75F, 30.9F, -3.2F));
		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(138, 50).addBox(-5.0F, 0.0F, -3.5F, 5.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1309F));
		PartDefinition legs = body.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(0.0F, -13.0F, 0.0F));
		PartDefinition leg_front_left = legs.addOrReplaceChild("leg_front_left", CubeListBuilder.create().texOffs(130, 142).addBox(-2.0F, 0.0F, -6.0F, 4.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.5F, -2.85F, -13.7866F, 1.0908F, 0.0F, -0.0436F));
		PartDefinition leg_front_left2 = leg_front_left.addOrReplaceChild("leg_front_left2", CubeListBuilder.create().texOffs(150, 142).addBox(-1.5F, 0.0F, -5.0F, 3.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.0F, -1.0F, -1.0908F, 0.0436F, 0.0F));
		PartDefinition leg_front_left3 = leg_front_left2.addOrReplaceChild("leg_front_left3", CubeListBuilder.create().texOffs(40, 156).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, -1.0F));
		PartDefinition foot_front_left = leg_front_left3.addOrReplaceChild("foot_front_left", CubeListBuilder.create(), PartPose.offset(0.0F, 4.0F, -0.5F));
		PartDefinition foot_front_left_rotation = foot_front_left.addOrReplaceChild("foot_front_left_rotation", CubeListBuilder.create().texOffs(86, 28).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offset(0.0F, 0.0F, -3.5F));
		PartDefinition leg_front_right = legs.addOrReplaceChild("leg_front_right", CubeListBuilder.create().texOffs(0, 143).addBox(-2.0F, 0.0F, -6.0F, 4.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, -2.85F, -13.7866F, 1.0908F, 0.0F, 0.0436F));
		PartDefinition leg_front_right2 = leg_front_right.addOrReplaceChild("leg_front_right2", CubeListBuilder.create().texOffs(152, 64).addBox(-1.5F, 0.0F, -5.0F, 3.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.0F, -1.0F, -1.0908F, -0.0436F, 0.0F));
		PartDefinition leg_front_right3 = leg_front_right2.addOrReplaceChild("leg_front_right3", CubeListBuilder.create().texOffs(54, 156).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, -1.0F));
		PartDefinition foot_front_right = leg_front_right3.addOrReplaceChild("foot_front_right", CubeListBuilder.create(), PartPose.offset(0.0F, 4.0F, -0.5F));
		PartDefinition foot_front_right_rotation = foot_front_right.addOrReplaceChild("foot_front_right_rotation", CubeListBuilder.create().texOffs(100, 157).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offset(0.0F, 0.0F, -3.5F));
		PartDefinition leg_back_left = legs.addOrReplaceChild("leg_back_left", CubeListBuilder.create().texOffs(142, 105).addBox(-2.0F, 0.0F, -6.0F, 4.0F, 11.0F, 6.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(5.3F, 1.6F, 10.7134F, 1.7017F, 0.0F, -0.0873F));
		PartDefinition leg_back_left_r1 = leg_back_left.addOrReplaceChild("leg_back_left_r1", CubeListBuilder.create().texOffs(114, 17).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.0F, -6.0F, -0.3403F, 0.0F, 0.0F));
		PartDefinition leg_back_left2 = leg_back_left.addOrReplaceChild("leg_back_left2", CubeListBuilder.create().texOffs(152, 76).addBox(-1.5F, 0.0F, -5.0F, 3.0F, 6.0F, 5.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 10.9F, -5.5F, -1.7017F, 0.0873F, 0.0F));
		PartDefinition leg_back_left3 = leg_back_left2.addOrReplaceChild("leg_back_left3", CubeListBuilder.create().texOffs(58, 28).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, -1.0F));
		PartDefinition foot_back_left = leg_back_left3.addOrReplaceChild("foot_back_left", CubeListBuilder.create(), PartPose.offset(0.0F, 3.0F, -0.5F));
		PartDefinition foot_back_left_rotation = foot_back_left.addOrReplaceChild("foot_back_left_rotation", CubeListBuilder.create().texOffs(114, 157).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offset(0.0F, 0.0F, -3.5F));
		PartDefinition leg_back_right = legs.addOrReplaceChild("leg_back_right", CubeListBuilder.create().texOffs(20, 143).addBox(-2.0F, 0.0F, -6.0F, 4.0F, 11.0F, 6.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-5.3F, 1.6F, 10.7134F, 1.7017F, 0.0F, 0.0873F));
		PartDefinition leg_back_right_r1 = leg_back_right.addOrReplaceChild("leg_back_right_r1", CubeListBuilder.create().texOffs(134, 17).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.0F, -6.0F, -0.3403F, 0.0F, 0.0F));
		PartDefinition leg_back_right2 = leg_back_right.addOrReplaceChild("leg_back_right2", CubeListBuilder.create().texOffs(154, 17).addBox(-1.5F, 0.0F, -5.0F, 3.0F, 6.0F, 5.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 10.9F, -5.5F, -1.7017F, -0.0873F, 0.0F));
		PartDefinition leg_back_right3 = leg_back_right2.addOrReplaceChild("leg_back_right3", CubeListBuilder.create().texOffs(72, 28).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, -1.0F));
		PartDefinition foot_back_right = leg_back_right3.addOrReplaceChild("foot_back_right", CubeListBuilder.create(), PartPose.offset(0.0F, 3.0F, -0.5F));
		PartDefinition foot_back_right_rotation = foot_back_right.addOrReplaceChild("foot_back_right_rotation", CubeListBuilder.create().texOffs(158, 28).addBox(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offset(0.0F, 0.0F, -3.5F));
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