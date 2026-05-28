// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelChimera_Gun<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "chimera_gun"), "main");
	private final ModelPart Chestplate;

	public ModelChimera_Gun(ModelPart root) {
		this.Chestplate = root.getChild("Chestplate");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Chestplate = partdefinition.addOrReplaceChild("Chestplate",
				CubeListBuilder.create().texOffs(30, 26)
						.addBox(-8.9F, -7.0F, -4.0F, 4.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 44)
						.addBox(-8.9F, -10.0F, -4.0F, 4.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(28, 36)
						.addBox(-8.9F, -9.0F, -4.0F, 4.0F, 2.0F, 8.0F, new CubeDeformation(0.5F)).texOffs(24, 46)
						.addBox(4.9F, -7.0F, -4.0F, 4.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(48, 46)
						.addBox(4.9F, -10.0F, -4.0F, 4.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(52, 36)
						.addBox(4.9F, -9.0F, -4.0F, 4.0F, 2.0F, 8.0F, new CubeDeformation(0.5F)).texOffs(54, 14)
						.addBox(-1.5F, -1.5F, -4.0F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.2F)).texOffs(30, 14)
						.addBox(-2.1F, -2.0F, -4.0F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition cube_r1 = Chestplate.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -8.0F, -17.0F, 2.0F, 2.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.8498F, 0.0F, -1.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r2 = Chestplate.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 15).addBox(-1.0F, -8.0F, -17.0F, 2.0F, 2.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.8498F, 0.0F, -1.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r3 = Chestplate.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(34, 56).addBox(-2.0F, -9.0F, -15.0F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(12.6033F, 0.0F, -1.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r4 = Chestplate.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(56, 56)
						.addBox(-1.0F, -6.0F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 24)
						.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(2.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r5 = Chestplate.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(30, 0).addBox(-2.0F, -9.0F, -4.0F, 4.0F, 4.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9503F, 0.0F, -1.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r6 = Chestplate.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(20, 56).addBox(-1.0F, -9.0F, -15.0F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(-12.6033F, 0.0F, -1.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r7 = Chestplate.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(48, 56)
						.addBox(-1.0F, -6.0F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 54)
						.addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r8 = Chestplate.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 30).addBox(-2.0F, -9.0F, -4.0F, 4.0F, 4.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9503F, 0.0F, -1.0F, 0.0F, 0.0F, -0.7854F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Chestplate.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}