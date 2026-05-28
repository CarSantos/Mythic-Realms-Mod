// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelTomoe_Ring<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "tomoe_ring"), "main");
	private final ModelPart Chestplate;

	public ModelTomoe_Ring(ModelPart root) {
		this.Chestplate = root.getChild("Chestplate");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Chestplate = partdefinition.addOrReplaceChild("Chestplate",
				CubeListBuilder.create().texOffs(0, 8)
						.addBox(-15.0F, -32.7F, 10.0F, 6.0F, 6.0F, 5.0F, new CubeDeformation(-1.0F)).texOffs(0, 19)
						.addBox(-7.0F, -32.7F, 10.0F, 6.0F, 6.0F, 5.0F, new CubeDeformation(-1.0F)).texOffs(22, 30)
						.addBox(-7.0F, -21.7F, 7.0F, 6.0F, 6.0F, 5.0F, new CubeDeformation(-1.0F)).texOffs(0, 30)
						.addBox(-15.0F, -21.7F, 7.0F, 6.0F, 6.0F, 5.0F, new CubeDeformation(-1.0F)).texOffs(22, 8)
						.addBox(-5.0F, -27.3F, 8.75F, 6.0F, 6.0F, 5.0F, new CubeDeformation(-1.0F)).texOffs(22, 19)
						.addBox(-17.0F, -27.3F, 8.75F, 6.0F, 6.0F, 5.0F, new CubeDeformation(-1.0F)),
				PartPose.offset(8.0F, 24.0F, -8.0F));

		PartDefinition cube_r1 = Chestplate.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-7.0F, 4.5F, 0.0F, 14.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)).texOffs(8, 41)
						.addBox(5.0F, -6.0F, 0.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(-0.2F)).texOffs(0, 41)
						.addBox(-7.0F, -6.0F, 0.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(-0.2F)).texOffs(0, 4)
						.addBox(-7.0F, -7.0F, 0.0F, 14.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-8.0F, -24.0F, 10.0F, -0.3054F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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