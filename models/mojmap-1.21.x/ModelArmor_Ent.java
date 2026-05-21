// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelArmor_Ent<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "armor_ent"), "main");
	private final ModelPart Helmet;
	private final ModelPart Chestplate;
	private final ModelPart rightPlate;
	private final ModelPart leftPlate;
	private final ModelPart rightLegging;
	private final ModelPart leftLegging;
	private final ModelPart rightBoot;
	private final ModelPart leftBoot;

	public ModelArmor_Ent(ModelPart root) {
		this.Helmet = root.getChild("Helmet");
		this.Chestplate = root.getChild("Chestplate");
		this.rightPlate = root.getChild("rightPlate");
		this.leftPlate = root.getChild("leftPlate");
		this.rightLegging = root.getChild("rightLegging");
		this.leftLegging = root.getChild("leftLegging");
		this.rightBoot = root.getChild("rightBoot");
		this.leftBoot = root.getChild("leftBoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Helmet = partdefinition.addOrReplaceChild("Helmet",
				CubeListBuilder.create().texOffs(32, 33)
						.addBox(3.0F, -7.5F, -3.0F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.3F)).texOffs(18, 64)
						.addBox(2.5F, -7.0F, -2.4F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 30)
						.addBox(2.5F, -7.0F, 1.2F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 65)
						.addBox(2.5F, -7.0F, 2.9F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 64)
						.addBox(2.5F, -7.0F, -0.5F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 65)
						.addBox(-4.5F, -7.0F, 2.9F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 65)
						.addBox(-4.5F, -7.0F, -2.4F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 65)
						.addBox(-4.5F, -7.0F, 1.2F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 65)
						.addBox(-4.5F, -7.0F, -0.5F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(-3.0F, -7.5F, 3.0F, 6.0F, 7.0F, 1.0F, new CubeDeformation(0.4F)).texOffs(0, 16)
						.addBox(-3.0F, -7.8F, -3.0F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.35F)).texOffs(0, 41)
						.addBox(-4.0F, -7.5F, -3.0F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.3F)).texOffs(32, 21)
						.addBox(-5.0F, -9.5F, -5.0F, 10.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)).texOffs(62, 60)
						.addBox(1.5F, -10.5F, -5.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.3F)).texOffs(0, 63)
						.addBox(-3.5F, -10.5F, -5.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.3F)).texOffs(62, 9)
						.addBox(-1.0F, -10.9F, -5.5F, 2.0F, 7.0F, 3.0F, new CubeDeformation(-0.3F)).texOffs(68, 19)
						.addBox(3.0F, -10.5F, 1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).texOffs(66, 52)
						.addBox(3.0F, -10.5F, -3.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).texOffs(64, 38)
						.addBox(3.0F, -10.9F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).texOffs(8, 68)
						.addBox(-5.0F, -10.5F, -3.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).texOffs(66, 56)
						.addBox(-5.0F, -10.9F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).texOffs(68, 23)
						.addBox(-5.0F, -10.5F, 1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).texOffs(32, 27)
						.addBox(-5.0F, -9.5F, 3.0F, 10.0F, 4.0F, 2.0F, new CubeDeformation(-0.2F)).texOffs(44, 9)
						.addBox(3.0F, -9.5F, -3.5F, 2.0F, 4.0F, 7.0F, new CubeDeformation(-0.2F)).texOffs(16, 47)
						.addBox(-5.0F, -9.5F, -3.5F, 2.0F, 4.0F, 7.0F, new CubeDeformation(-0.2F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Chestplate = partdefinition.addOrReplaceChild("Chestplate",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -1.5F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(34, 47)
						.addBox(-4.0F, 9.5F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(26, 21)
						.addBox(-0.5F, 9.5F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.6F)).texOffs(24, 0)
						.addBox(-4.0F, -1.5F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.7F)).texOffs(26, 9)
						.addBox(-4.0F, -1.9F, 1.8F, 8.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition rightPlate = partdefinition.addOrReplaceChild("rightPlate",
				CubeListBuilder.create().texOffs(48, 0)
						.addBox(-3.0F, -1.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(48, 42)
						.addBox(-2.5F, -2.5F, -2.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 20)
						.addBox(-3.5F, -3.5F, -2.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.3F)).texOffs(64, 0)
						.addBox(-2.5F, -2.5F, 1.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition leftPlate = partdefinition.addOrReplaceChild("leftPlate",
				CubeListBuilder.create().texOffs(48, 33)
						.addBox(-1.0F, -1.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(64, 4)
						.addBox(-1.5F, -2.5F, -2.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 42)
						.addBox(2.5F, -3.5F, -2.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.3F)).texOffs(8, 64)
						.addBox(-1.5F, -2.5F, 1.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition rightLegging = partdefinition.addOrReplaceChild("rightLegging",
				CubeListBuilder.create().texOffs(0, 25)
						.addBox(-2.0F, 0.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(16, 41)
						.addBox(-2.0F, 4.5F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.4F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition leftLegging = partdefinition.addOrReplaceChild("leftLegging",
				CubeListBuilder.create().texOffs(16, 25)
						.addBox(-2.0F, 0.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(14, 58)
						.addBox(-2.0F, 4.5F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.4F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition rightBoot = partdefinition.addOrReplaceChild("rightBoot",
				CubeListBuilder.create().texOffs(34, 52)
						.addBox(-2.0F, 8.5F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.4F)).texOffs(30, 60)
						.addBox(-2.0F, 8.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition leftBoot = partdefinition.addOrReplaceChild("leftBoot",
				CubeListBuilder.create().texOffs(50, 52)
						.addBox(-2.0F, 8.5F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.4F)).texOffs(46, 60)
						.addBox(-2.0F, 8.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Helmet.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Chestplate.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightPlate.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftPlate.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLegging.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLegging.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.leftPlate.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.leftLegging.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Helmet.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Helmet.xRot = headPitch / (180F / (float) Math.PI);
		this.rightLegging.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightPlate.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftBoot.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rightBoot.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}