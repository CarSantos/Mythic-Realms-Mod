// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelJoker<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "joker"), "main");
	private final ModelPart body;
	private final ModelPart Helmet;
	private final ModelPart bone3;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart Chestplate;
	private final ModelPart rightPlate;
	private final ModelPart leftPlate;
	private final ModelPart rightLegging;
	private final ModelPart rightBoot;
	private final ModelPart leftLegging;
	private final ModelPart leftBoot;

	public ModelJoker(ModelPart root) {
		this.body = root.getChild("body");
		this.Helmet = this.body.getChild("Helmet");
		this.bone3 = this.Helmet.getChild("bone3");
		this.bone = this.Helmet.getChild("bone");
		this.bone2 = this.Helmet.getChild("bone2");
		this.Chestplate = this.body.getChild("Chestplate");
		this.rightPlate = this.body.getChild("rightPlate");
		this.leftPlate = this.body.getChild("leftPlate");
		this.rightLegging = this.body.getChild("rightLegging");
		this.rightBoot = this.rightLegging.getChild("rightBoot");
		this.leftLegging = this.body.getChild("leftLegging");
		this.leftBoot = this.leftLegging.getChild("leftBoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 25.0F, 0.0F));

		PartDefinition Helmet = body.addOrReplaceChild("Helmet",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -7.5F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-4.5F, -7.6F, -4.5F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.2F)).texOffs(52, 26)
						.addBox(0.5F, -4.6F, -1.5F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
						.addBox(-4.5F, -4.6F, -1.5F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(24, 28)
						.addBox(-2.5F, -7.6F, -4.5F, 5.0F, 3.0F, 9.0F, new CubeDeformation(0.4F)).texOffs(72, 33)
						.addBox(-2.5F, -4.6F, 1.5F, 5.0F, 6.0F, 3.0F, new CubeDeformation(0.3F)),
				PartPose.offset(0.0F, -25.0F, 0.0F));

		PartDefinition bone3 = Helmet.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(36, 26).addBox(-9.0F,
				-2.5F, 3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.3F)), PartPose.offset(8.0F, 0.0F, -8.0F));

		PartDefinition bone = Helmet.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(-1.6F, -7.0F, 1.8F));

		PartDefinition head_2nd_layer_r1 = bone.addOrReplaceChild("head_2nd_layer_r1",
				CubeListBuilder.create().texOffs(32, 75)
						.addBox(4.0F, -7.0F, 11.8F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 74)
						.addBox(3.5F, -5.0F, 11.4F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, -8.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition head_2nd_layer_r2 = bone.addOrReplaceChild("head_2nd_layer_r2",
				CubeListBuilder.create().texOffs(32, 0).addBox(3.5F, -8.0F, 7.5F, 4.0F, 4.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, -8.0F, 0.1745F, -0.7854F, 0.0F));

		PartDefinition bone2 = Helmet.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(1.6F, -7.0F, 2.8F));

		PartDefinition head_2nd_layer_r3 = bone2.addOrReplaceChild("head_2nd_layer_r3",
				CubeListBuilder.create().texOffs(68, 74)
						.addBox(-7.5F, -6.0F, 11.4F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 76)
						.addBox(-7.0F, -8.0F, 11.8F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.0F, -9.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition head_2nd_layer_r4 = bone2.addOrReplaceChild("head_2nd_layer_r4",
				CubeListBuilder.create().texOffs(36, 13).addBox(-7.5F, -8.0F, 7.5F, 4.0F, 4.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, -9.0F, 0.1745F, 0.7854F, 0.0F));

		PartDefinition Chestplate = body.addOrReplaceChild("Chestplate",
				CubeListBuilder.create().texOffs(24, 40)
						.addBox(-13.0F, -23.02F, 5.5F, 9.0F, 3.0F, 5.0F, new CubeDeformation(-0.1F)).texOffs(0, 28)
						.addBox(-12.0F, -23.5F, 6.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 44)
						.addBox(-8.5F, -22.0F, 6.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.5F)).texOffs(64, 58)
						.addBox(-8.5F, -19.0F, 6.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.3F)).texOffs(72, 42)
						.addBox(-8.5F, -16.0F, 6.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.3F)).texOffs(0, 60)
						.addBox(-12.2F, -23.5F, 6.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(16, 64)
						.addBox(-7.8F, -23.5F, 6.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(8.0F, -1.0F, -8.0F));

		PartDefinition rightPlate = body.addOrReplaceChild("rightPlate",
				CubeListBuilder.create().texOffs(0, 44)
						.addBox(-3.0F, -2.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 64)
						.addBox(-3.5F, -3.0F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, -22.0F, 0.0F));

		PartDefinition leftPlate = body.addOrReplaceChild("leftPlate",
				CubeListBuilder.create().texOffs(16, 48)
						.addBox(-1.0F, -2.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(72, 23)
						.addBox(-1.5F, -3.0F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, -22.0F, 0.0F));

		PartDefinition rightLegging = body.addOrReplaceChild("rightLegging",
				CubeListBuilder.create().texOffs(32, 48)
						.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(62, 12)
						.addBox(-2.5F, -3.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(44, 75)
						.addBox(-0.5F, 1.0F, -2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.3F)),
				PartPose.offset(-2.0F, -10.0F, 0.0F));

		PartDefinition rightBoot = rightLegging.addOrReplaceChild("rightBoot",
				CubeListBuilder.create().texOffs(72, 58)
						.addBox(-12.0F, -3.5F, 6.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(52, 38)
						.addBox(-12.5F, -4.0F, 5.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.1F)),
				PartPose.offset(10.0F, 9.0F, -8.0F));

		PartDefinition leftLegging = body.addOrReplaceChild("leftLegging",
				CubeListBuilder.create().texOffs(48, 48)
						.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 64)
						.addBox(-2.5F, -3.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(78, 0)
						.addBox(-0.5F, 1.0F, -2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.3F)),
				PartPose.offset(2.0F, -10.0F, 0.0F));

		PartDefinition leftBoot = leftLegging.addOrReplaceChild("leftBoot",
				CubeListBuilder.create().texOffs(72, 66)
						.addBox(-8.0F, -3.5F, 6.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(64, 48)
						.addBox(-8.5F, -4.0F, 5.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.1F)),
				PartPose.offset(6.0F, 9.0F, -8.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}