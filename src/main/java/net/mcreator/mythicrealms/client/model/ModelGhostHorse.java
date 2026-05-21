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
public class ModelGhostHorse extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mythicrealms", "model_ghost_horse"), "main");
	public final ModelPart Body;
	public final ModelPart Torso;
	public final ModelPart TailA;
	public final ModelPart Leg1A;
	public final ModelPart Leg2A;
	public final ModelPart Leg3A;
	public final ModelPart Leg4A;
	public final ModelPart Neck;
	public final ModelPart Head;
	public final ModelPart eyes;
	public final ModelPart mouth;
	public final ModelPart Ear1;
	public final ModelPart Ear2;

	public ModelGhostHorse(ModelPart root) {
		super(root);
		this.Body = root.getChild("Body");
		this.Torso = this.Body.getChild("Torso");
		this.TailA = this.Body.getChild("TailA");
		this.Leg1A = this.Body.getChild("Leg1A");
		this.Leg2A = this.Body.getChild("Leg2A");
		this.Leg3A = this.Body.getChild("Leg3A");
		this.Leg4A = this.Body.getChild("Leg4A");
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
		PartDefinition Torso = Body.addOrReplaceChild("Torso", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -21.0F, -11.0F, 10.0F, 10.0F, 22.0F, new CubeDeformation(0.3F)), PartPose.offset(0.0F, 13.0F, -9.0F));
		PartDefinition TailA = Body.addOrReplaceChild("TailA", CubeListBuilder.create().texOffs(40, 44).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.0F, 2.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition Leg1A = Body.addOrReplaceChild("Leg1A", CubeListBuilder.create().texOffs(0, 51).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 2.0F, 0.0F));
		PartDefinition Leg2A = Body.addOrReplaceChild("Leg2A", CubeListBuilder.create().texOffs(54, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 2.0F, 0.0F));
		PartDefinition Leg3A = Body.addOrReplaceChild("Leg3A", CubeListBuilder.create().texOffs(54, 45).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 2.0F, -18.0F));
		PartDefinition Leg4A = Body.addOrReplaceChild("Leg4A", CubeListBuilder.create().texOffs(54, 58).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 2.0F, -18.0F));
		PartDefinition Neck = Body.addOrReplaceChild("Neck",
				CubeListBuilder.create().texOffs(0, 32).addBox(-2.0F, -11.0F, -3.0F, 4.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(22, 44).addBox(-2.0F, -11.0F, -1.0F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(0, 64)
						.addBox(-1.0F, -16.0F, 4.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 0).addBox(-1.0F, -18.0F, -1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, -17.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition Head = Neck.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(22, 32).addBox(-3.0F, -5.0F, -6.0F, 6.0F, 5.0F, 7.0F, new CubeDeformation(0.1F)).texOffs(36, 62).addBox(-2.0F, -5.0F, -11.0F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -11.0F, 3.0F));
		PartDefinition eyes = Head.addOrReplaceChild("eyes", CubeListBuilder.create(), PartPose.offset(0.0F, 28.0F, 11.0F));
		PartDefinition mouth = Head.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(16, 61).addBox(-2.0F, -30.0F, -22.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, 28.0F, 11.0F));
		PartDefinition Ear1 = Head.addOrReplaceChild("Ear1", CubeListBuilder.create().texOffs(48, 32).addBox(-0.5F, -18.0F, 2.99F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.0F, -3.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition Ear2 = Head.addOrReplaceChild("Ear2", CubeListBuilder.create().texOffs(48, 36).addBox(-1.5F, -18.0F, 2.99F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.0F, -3.0F, 0.0F, 0.0F, -0.0873F));
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