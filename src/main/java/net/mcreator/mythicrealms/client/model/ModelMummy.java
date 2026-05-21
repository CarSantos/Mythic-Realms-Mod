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
public class ModelMummy extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mythicrealms", "model_mummy"), "main");
	public final ModelPart bone;
	public final ModelPart head;
	public final ModelPart Body;
	public final ModelPart leftarm;
	public final ModelPart rightarm;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;

	public ModelMummy(ModelPart root) {
		super(root);
		this.bone = root.getChild("bone");
		this.head = this.bone.getChild("head");
		this.Body = this.bone.getChild("Body");
		this.leftarm = this.Body.getChild("leftarm");
		this.rightarm = this.Body.getChild("rightarm");
		this.LeftLeg = this.Body.getChild("LeftLeg");
		this.RightLeg = this.Body.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(3.0F, 4.0F, 0.0F));
		PartDefinition head = bone.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(48, 24).addBox(-1.0F, -3.0F, -3.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 26).addBox(-4.0F, -10.0F, -1.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, -2.0F, 0.0F));
		PartDefinition Body = bone.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -3.0F, 0.0F, 9.0F, 20.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(30, 0).addBox(-4.0F, -3.0F, 1.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 1.0F, 0.0F));
		PartDefinition leftarm = Body.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offset(-6.0F, -1.0F, 1.0F));
		PartDefinition cube_r1 = leftarm.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(32, 24).addBox(-3.0F, -4.0F, -1.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 2.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition rightarm = Body.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offset(6.0F, -1.0F, 1.0F));
		PartDefinition cube_r2 = rightarm.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(32, 41).addBox(-1.0F, -2.5858F, 0.4142F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition LeftLeg = Body.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(0, 44).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 9.0F, 3.0F));
		PartDefinition RightLeg = Body.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(16, 44).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 9.0F, 3.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}