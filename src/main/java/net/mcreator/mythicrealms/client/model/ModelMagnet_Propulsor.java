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
public class ModelMagnet_Propulsor extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mythicrealms", "model_magnet_propulsor"), "main");
	public final ModelPart Chestplate;

	public ModelMagnet_Propulsor(ModelPart root) {
		super(root);
		this.Chestplate = root.getChild("Chestplate");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Chestplate = partdefinition.addOrReplaceChild("Chestplate", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition head_2nd_layer_r1 = Chestplate.addOrReplaceChild("head_2nd_layer_r1",
				CubeListBuilder.create().texOffs(0, 6).addBox(-11.5F, 5.0F, 3.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(-0.1F)).texOffs(12, 6).addBox(-7.5F, 5.0F, 3.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(8.0F, -1.6F, -3.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition head_2nd_layer_r2 = Chestplate.addOrReplaceChild("head_2nd_layer_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-11.5F, 4.0F, 3.5F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -2.6F, -3.0F, 0.0873F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}