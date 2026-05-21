// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelArmor_pharaoh<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "armor_pharaoh"), "main");
	private final ModelPart Helmet;
	private final ModelPart Chestplate;
	private final ModelPart RightPlate;
	private final ModelPart LeftPlate;
	private final ModelPart RightLegging;
	private final ModelPart LeftLegging;
	private final ModelPart LeftBoots;
	private final ModelPart RightBoots;

	public ModelArmor_pharaoh(ModelPart root) {
		this.Helmet = root.getChild("Helmet");
		this.Chestplate = root.getChild("Chestplate");
		this.RightPlate = root.getChild("RightPlate");
		this.LeftPlate = root.getChild("LeftPlate");
		this.RightLegging = root.getChild("RightLegging");
		this.LeftLegging = root.getChild("LeftLegging");
		this.LeftBoots = root.getChild("LeftBoots");
		this.RightBoots = root.getChild("RightBoots");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Helmet = partdefinition.addOrReplaceChild("Helmet",
				CubeListBuilder.create().texOffs(0, 12)
						.addBox(4.0F, -8.5F, -5.0F, 1.0F, 10.0F, 10.0F, new CubeDeformation(0.2F)).texOffs(0, 0)
						.addBox(-4.0F, -8.5F, -5.0F, 8.0F, 2.0F, 10.0F, new CubeDeformation(0.25F)).texOffs(64, 4)
						.addBox(-4.0F, -8.5F, -3.5F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.35F)).texOffs(68, 21)
						.addBox(-4.0F, -8.5F, -0.5F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.35F)).texOffs(0, 70)
						.addBox(-4.0F, -8.5F, 2.5F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.35F)).texOffs(44, 24)
						.addBox(-4.0F, -7.5F, 2.0F, 8.0F, 9.0F, 3.0F, new CubeDeformation(0.25F)).texOffs(64, 0)
						.addBox(-4.0F, -7.5F, 2.0F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.35F)).texOffs(66, 40)
						.addBox(-4.0F, -4.5F, 2.0F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.35F)).texOffs(66, 44)
						.addBox(-4.0F, -1.5F, 2.0F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.35F)).texOffs(44, 36)
						.addBox(4.0F, -7.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.3F)).texOffs(44, 47)
						.addBox(4.0F, -4.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.3F)).texOffs(0, 48)
						.addBox(4.0F, -1.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.3F)).texOffs(0, 59)
						.addBox(-5.0F, -1.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.3F)).texOffs(44, 58)
						.addBox(-5.0F, -4.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.3F)).texOffs(22, 48)
						.addBox(-5.0F, -7.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.3F)).texOffs(22, 12)
						.addBox(-5.0F, -8.5F, -5.0F, 1.0F, 10.0F, 10.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition HatLayer_r1 = Helmet.addOrReplaceChild("HatLayer_r1",
				CubeListBuilder.create().texOffs(8, 78)
						.addBox(3.0F, -24.8F, -4.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).texOffs(0, 78)
						.addBox(3.0F, -23.5F, -4.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).texOffs(36, 7)
						.addBox(3.0F, -22.2F, -4.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).texOffs(18, 70)
						.addBox(3.5F, -24.5F, -4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(-4.0F, 25.0F, -5.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition HatLayer_r2 = Helmet.addOrReplaceChild("HatLayer_r2",
				CubeListBuilder.create().texOffs(38, 62)
						.addBox(3.0F, -33.1F, -5.6F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(38, 65)
						.addBox(3.0F, -33.1F, -1.6F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(38, 59)
						.addBox(3.0F, -33.1F, -3.6F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(54, 74)
						.addBox(3.5F, -32.5F, -6.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(-4.0F, 24.0F, -4.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Chestplate = partdefinition.addOrReplaceChild("Chestplate",
				CubeListBuilder.create().texOffs(0, 32)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(36, 0)
						.addBox(-4.5F, 11.0F, -2.5F, 9.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(44, 7)
						.addBox(-4.5F, 11.0F, -2.4F, 9.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)).texOffs(36, 10)
						.addBox(-0.5F, 11.5F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.55F)).texOffs(24, 32)
						.addBox(-3.0F, 0.0F, -2.0F, 6.0F, 12.0F, 4.0F, new CubeDeformation(0.4F)).texOffs(44, 14)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightPlate = partdefinition.addOrReplaceChild("RightPlate",
				CubeListBuilder.create().texOffs(66, 62)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(38, 69)
						.addBox(-3.0F, 1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.6F)).texOffs(74, 74)
						.addBox(1.0F, -2.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.65F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftPlate = partdefinition.addOrReplaceChild("LeftPlate",
				CubeListBuilder.create().texOffs(68, 14)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(54, 69)
						.addBox(-1.0F, 1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.6F)).texOffs(66, 74)
						.addBox(-1.0F, -2.0F, -2.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.65F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightLegging = partdefinition.addOrReplaceChild("RightLegging",
				CubeListBuilder.create().texOffs(66, 24)
						.addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(16, 75)
						.addBox(-0.9F, 5.0F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.35F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition LeftLegging = partdefinition.addOrReplaceChild("LeftLegging",
				CubeListBuilder.create().texOffs(22, 59)
						.addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.275F)).texOffs(26, 75)
						.addBox(-1.1F, 5.0F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.35F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition LeftBoots = partdefinition.addOrReplaceChild("LeftBoots",
				CubeListBuilder.create().texOffs(66, 55)
						.addBox(-2.1F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.325F)).texOffs(72, 7)
						.addBox(-2.1F, 8.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.4F)).texOffs(38, 74)
						.addBox(-2.1F, 11.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition RightBoots = partdefinition.addOrReplaceChild("RightBoots",
				CubeListBuilder.create().texOffs(66, 48)
						.addBox(-1.9F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.325F)).texOffs(70, 69)
						.addBox(-1.9F, 8.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.4F)).texOffs(0, 73)
						.addBox(-1.9F, 11.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Helmet.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Chestplate.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightPlate.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftPlate.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLegging.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLegging.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftBoots.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightBoots.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftPlate.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.LeftBoots.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Helmet.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Helmet.xRot = headPitch / (180F / (float) Math.PI);
		this.RightBoots.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightLegging.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftLegging.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightPlate.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}