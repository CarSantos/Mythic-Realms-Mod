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
public class ModelHippocampus extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mythicrealms", "model_hippocampus"), "main");
	public final ModelPart Body;
	public final ModelPart Torso;
	public final ModelPart Leg3A;
	public final ModelPart Leg4A;
	public final ModelPart Tail;
	public final ModelPart tail1;
	public final ModelPart tail2;
	public final ModelPart Neck;
	public final ModelPart Head;
	public final ModelPart eyes;
	public final ModelPart mouth;
	public final ModelPart Ear1;
	public final ModelPart Ear2;

	public ModelHippocampus(ModelPart root) {
		super(root);
		this.Body = root.getChild("Body");
		this.Torso = this.Body.getChild("Torso");
		this.Leg3A = this.Body.getChild("Leg3A");
		this.Leg4A = this.Body.getChild("Leg4A");
		this.Tail = this.Body.getChild("Tail");
		this.tail1 = this.Tail.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.Neck = this.Body.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.eyes = this.Head.getChild("eyes");
		this.mouth = this.Head.getChild("mouth");
		this.Ear1 = this.Head.getChild("Ear1");
		this.Ear2 = this.Head.getChild("Ear2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 11.0F, 9.0F));
		PartDefinition Torso = Body.addOrReplaceChild("Torso", CubeListBuilder.create(), PartPose.offset(0.0F, -6.0F, -21.0F));
		PartDefinition Body_r1 = Torso.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(0, 29).addBox(-5.0F, -2.0F, 3.0F, 10.0F, 10.0F, 22.0F, new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3054F, 0.0F, 0.0F));
		PartDefinition Leg3A = Body.addOrReplaceChild("Leg3A",
				CubeListBuilder.create().texOffs(68, 99).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(92, 104).addBox(-2.0F, 8.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.3F)),
				PartPose.offset(3.0F, 2.0F, -18.0F));
		PartDefinition Leg4A = Body.addOrReplaceChild("Leg4A",
				CubeListBuilder.create().texOffs(104, 55).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(104, 79).addBox(-2.0F, 8.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.3F)),
				PartPose.offset(-3.0F, 2.0F, -18.0F));
		PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(-3.0F, 4.0F, 1.0F));
		PartDefinition cube_r1 = Tail.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 61).addBox(-2.0F, -19.3F, 9.1F, 10.0F, 10.0F, 16.0F, new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(0.0F, 10.5F, -19.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition tail1 = Tail.addOrReplaceChild("tail1", CubeListBuilder.create(), PartPose.offset(0.0F, 3.0F, 9.0F));
		PartDefinition cube_r2 = tail1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(52, 61).addBox(-2.0F, -15.8F, 23.1F, 10.0F, 10.0F, 16.0F, new CubeDeformation(-2.0F)),
				PartPose.offsetAndRotation(0.0F, 7.5F, -28.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition tail2 = tail1.addOrReplaceChild("tail2",
				CubeListBuilder.create().texOffs(64, 29).addBox(-2.0F, -4.5F, -4.6F, 10.0F, 10.0F, 16.0F, new CubeDeformation(-3.0F)).texOffs(0, 0).addBox(-5.0F, -4.5F, -1.6F, 16.0F, 10.0F, 19.0F, new CubeDeformation(-4.0F)),
				PartPose.offset(0.0F, 1.5F, 11.0F));
		PartDefinition cube_r3 = tail2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 87).addBox(24.8F, -6.4F, 33.7F, 7.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 6.0F, -39.0F, 0.0F, -0.7418F, 0.0F));
		PartDefinition cube_r4 = tail2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(70, 0).addBox(-31.8F, -6.4F, 33.7F, 7.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, -39.0F, 0.0F, 0.7418F, 0.0F));
		PartDefinition Neck = Body.addOrReplaceChild("Neck",
				CubeListBuilder.create().texOffs(46, 87).addBox(-2.0F, -11.0F, -3.0F, 4.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(94, 87).addBox(-2.0F, -11.0F, -1.0F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(84, 99)
						.addBox(-1.0F, -16.0F, 4.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(104, 70).addBox(-1.0F, -18.0F, -1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -17.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition Head = Neck.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(68, 87).addBox(-3.0F, -5.0F, -6.0F, 6.0F, 5.0F, 7.0F, new CubeDeformation(0.1F)).texOffs(90, 18).addBox(-2.0F, -5.0F, -11.0F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -11.0F, 3.2F));
		PartDefinition eyes = Head.addOrReplaceChild("eyes", CubeListBuilder.create(), PartPose.offset(0.0F, 28.0F, 11.0F));
		PartDefinition mouth = Head.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(70, 18).addBox(-2.0F, -1.0F, -5.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, -1.0F, -6.0F));
		PartDefinition Ear1 = Head.addOrReplaceChild("Ear1", CubeListBuilder.create().texOffs(82, 55).addBox(-0.3257F, -16.2745F, -4.0062F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.0F, 2.8F, 0.0F, 0.0F, 0.0873F));
		PartDefinition Ear2 = Head.addOrReplaceChild("Ear2", CubeListBuilder.create().texOffs(88, 55).addBox(-1.6743F, -16.2745F, -4.0062F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.0F, 2.8F, 0.0F, 0.0F, -0.0873F));
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