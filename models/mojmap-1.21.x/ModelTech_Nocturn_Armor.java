// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelTech_Nocturn_Armor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "tech_nocturn_armor"), "main");
	private final ModelPart Helmet;
	private final ModelPart Chestplate;
	private final ModelPart RightPlate;
	private final ModelPart LeftPlate;
	private final ModelPart RightLegging;
	private final ModelPart LeftLegging;
	private final ModelPart LeftBoots;
	private final ModelPart RightBoots;

	public ModelTech_Nocturn_Armor(ModelPart root) {
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
				CubeListBuilder.create().texOffs(18, 37)
						.addBox(3.3F, -7.3F, -4.0F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.1F)).texOffs(0, 36)
						.addBox(-4.3F, -7.3F, -4.0F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.1F)).texOffs(32, 0)
						.addBox(-4.0F, -7.3F, 2.3F, 8.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -8.3F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.2F)).texOffs(24, 10)
						.addBox(-3.0F, -2.3F, -4.0F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Chestplate = partdefinition.addOrReplaceChild("Chestplate",
				CubeListBuilder.create().texOffs(0, 10)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(52, 13)
						.addBox(-4.0F, 11.0F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.45F)).texOffs(24, 21)
						.addBox(-3.0F, 0.0F, -2.0F, 6.0F, 12.0F, 4.0F, new CubeDeformation(0.4F)).texOffs(0, 26)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(48, 58)
						.addBox(-0.5F, 3.0F, -2.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.55F)).texOffs(60, 18)
						.addBox(-0.5F, 3.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.7F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightPlate = partdefinition.addOrReplaceChild("RightPlate",
				CubeListBuilder.create().texOffs(52, 51)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(32, 53)
						.addBox(-3.0F, 1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.6F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftPlate = partdefinition.addOrReplaceChild("LeftPlate",
				CubeListBuilder.create().texOffs(16, 53)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.5F)).texOffs(32, 58)
						.addBox(-1.0F, 1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.6F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightLegging = partdefinition.addOrReplaceChild("RightLegging",
				CubeListBuilder.create().texOffs(36, 37)
						.addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.275F)).texOffs(0, 52)
						.addBox(-1.9F, 3.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(56, 58)
						.addBox(-0.4F, 4.0F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.5F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition LeftLegging = partdefinition.addOrReplaceChild("LeftLegging",
				CubeListBuilder.create().texOffs(44, 21)
						.addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.275F)).texOffs(52, 0)
						.addBox(-2.1F, 3.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(16, 60)
						.addBox(-0.6F, 4.0F, -1.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.5F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition LeftBoots = partdefinition.addOrReplaceChild("LeftBoots", CubeListBuilder.create()
				.texOffs(52, 44).addBox(-2.1F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.325F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition RightBoots = partdefinition.addOrReplaceChild("RightBoots", CubeListBuilder.create()
				.texOffs(52, 37).addBox(-1.9F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.325F)),
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
		this.LeftBoots.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Helmet.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Helmet.xRot = headPitch / (180F / (float) Math.PI);
		this.RightBoots.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.RightLegging.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftLegging.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightPlate.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}