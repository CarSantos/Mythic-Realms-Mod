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
public class ModelTechGoogles extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mythicrealms", "model_tech_googles"), "main");
	public final ModelPart TechGoogles;

	public ModelTechGoogles(ModelPart root) {
		super(root);
		this.TechGoogles = root.getChild("TechGoogles");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition TechGoogles = partdefinition.addOrReplaceChild("TechGoogles",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -30.9F, -3.9F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 6).addBox(-3.0F, -29.4F, -4.6F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 6)
						.addBox(1.0F, -29.4F, -4.6F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 9).addBox(1.0F, -29.4F, -4.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(0, 9)
						.addBox(-3.0F, -29.4F, -4.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 24.8F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.TechGoogles.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.TechGoogles.xRot = headPitch / (180F / (float) Math.PI);
	}
}