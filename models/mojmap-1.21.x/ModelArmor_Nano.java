// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelArmor_Nano<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "armor_nano"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart Right Arm;
	private final ModelPart Left Arm;
	private final ModelPart Right Leg;
	private final ModelPart Left Leg;

	public ModelArmor_Nano(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.Right Arm = root.getChild("Right Arm");
		this.Left Arm = root.getChild("Left Arm");
		this.Right Leg = root.getChild("Right Leg");
		this.Left Leg = root.getChild("Left Leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 25).addBox(-4.0F, -8.0F, -4.0F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.3F))
		.texOffs(18, 35).addBox(3.0F, -8.0F, -4.0F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.3F))
		.texOffs(0, 16).addBox(-3.0F, -8.1F, -4.0F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.35F))
		.texOffs(52, 10).addBox(-3.0F, -7.7F, 3.1F, 6.0F, 8.0F, 1.0F, new CubeDeformation(0.3F))
		.texOffs(42, 21).addBox(-4.0F, -8.1F, -4.9F, 8.0F, 9.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(28, 16).addBox(-4.0F, 11.0F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.45F))
		.texOffs(24, 0).addBox(-3.0F, 0.0F, -2.0F, 6.0F, 12.0F, 4.0F, new CubeDeformation(0.4F))
		.texOffs(18, 25).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.5F))
		.texOffs(28, 21).addBox(-0.5F, 3.0F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.7F))
		.texOffs(0, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Right Arm = partdefinition.addOrReplaceChild("Right Arm", CubeListBuilder.create().texOffs(44, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.5F))
		.texOffs(52, 41).addBox(-3.0F, 3.1F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.6F))
		.texOffs(52, 46).addBox(-3.0F, 0.1F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.6F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition 3_r1 = Right Arm.addOrReplaceChild("3_r1", CubeListBuilder.create().texOffs(52, 31).addBox(-8.0F, -20.9F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.7F)), PartPose.offsetAndRotation(-5.4F, 18.3F, 0.0F, 0.0F, 0.0F, 0.48F));

		PartDefinition Left Arm = partdefinition.addOrReplaceChild("Left Arm", CubeListBuilder.create().texOffs(16, 51).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.5F))
		.texOffs(0, 57).addBox(0.0F, 3.1F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.6F))
		.texOffs(32, 58).addBox(0.0F, 0.1F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.6F)), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition 4_r1 = Left Arm.addOrReplaceChild("4_r1", CubeListBuilder.create().texOffs(52, 36).addBox(4.0F, -20.9F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.7F)), PartPose.offsetAndRotation(5.4F, 18.3F, 0.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition Right Leg = partdefinition.addOrReplaceChild("Right Leg", CubeListBuilder.create().texOffs(36, 35).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.3F))
		.texOffs(32, 51).addBox(-1.9F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.4F)), PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition Left Leg = partdefinition.addOrReplaceChild("Left Leg", CubeListBuilder.create().texOffs(0, 41).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.3F))
		.texOffs(48, 51).addBox(-2.1F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.4F)), PartPose.offset(2.0F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Right Arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Left Arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Right Leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Left Leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.Left.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Right.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}