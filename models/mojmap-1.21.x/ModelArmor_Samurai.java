// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelArmor_Samurai<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "armor_samurai"), "main");
	private final ModelPart Helmet;
	private final ModelPart Chestplate;
	private final ModelPart LeftPlate;
	private final ModelPart RightPlate;
	private final ModelPart RightLegging;
	private final ModelPart LeftLegging;
	private final ModelPart LeftBoots;
	private final ModelPart RightBoots;

	public ModelArmor_Samurai(ModelPart root) {
		this.Helmet = root.getChild("Helmet");
		this.Chestplate = root.getChild("Chestplate");
		this.LeftPlate = root.getChild("LeftPlate");
		this.RightPlate = root.getChild("RightPlate");
		this.RightLegging = root.getChild("RightLegging");
		this.LeftLegging = root.getChild("LeftLegging");
		this.LeftBoots = root.getChild("LeftBoots");
		this.RightBoots = root.getChild("RightBoots");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Helmet = partdefinition.addOrReplaceChild("Helmet", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.0F, -7.5F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.65F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition HatLayer_r1 = Helmet.addOrReplaceChild("HatLayer_r1",
				CubeListBuilder.create().texOffs(44, 26).addBox(14.8455F, -19.9806F, -4.0F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.0F, 15.0F, -7.0F, -0.1872F, -0.1841F, -0.7681F));

		PartDefinition HatLayer_r2 = Helmet.addOrReplaceChild("HatLayer_r2", CubeListBuilder.create().texOffs(48, 75)
				.addBox(-16.6545F, -19.5194F, -4.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.2F)).texOffs(32, 6)
				.addBox(-16.6545F, -16.5194F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(0.0F, 15.0F, -7.0F, -0.1872F, 0.1841F, 0.7681F));

		PartDefinition HatLayer_r3 = Helmet.addOrReplaceChild("HatLayer_r3",
				CubeListBuilder.create().texOffs(70, 68)
						.addBox(2.0F, -27.1F, 6.8F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(64, 23)
						.addBox(2.0F, -29.1F, 6.8F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(64, 21)
						.addBox(2.0F, -31.1F, 6.8F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(16, 61)
						.addBox(2.0F, -31.5F, 6.8F, 9.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.5F, 26.0F, -0.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition HatLayer_r4 = Helmet.addOrReplaceChild("HatLayer_r4",
				CubeListBuilder.create().texOffs(0, 26)
						.addBox(-4.0F, -3.5F, -4.0F, 1.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(36, 51)
						.addBox(-4.0F, -2.5F, -4.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.1F)).texOffs(52, 26)
						.addBox(-4.0F, -0.5F, -4.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.1F)).texOffs(52, 36)
						.addBox(-4.0F, 1.5F, -4.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-1.4F, -2.0F, -0.6F, 0.0F, 0.0F, 0.1745F));

		PartDefinition HatLayer_r5 = Helmet.addOrReplaceChild("HatLayer_r5",
				CubeListBuilder.create().texOffs(16, 51)
						.addBox(3.0F, 1.5F, -4.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.1F)).texOffs(44, 16)
						.addBox(3.0F, -0.5F, -4.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.1F)).texOffs(44, 6)
						.addBox(3.0F, -2.5F, -4.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.1F)).texOffs(24, 10)
						.addBox(3.0F, -3.5F, -4.0F, 1.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4F, -2.0F, -0.6F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Chestplate = partdefinition.addOrReplaceChild("Chestplate",
				CubeListBuilder.create().texOffs(0, 10)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(32, 0)
						.addBox(-4.0F, 10.0F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.35F)).texOffs(56, 0)
						.addBox(-4.0F, 8.0F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.35F)).texOffs(56, 51)
						.addBox(-4.0F, 6.0F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.35F)).texOffs(52, 46)
						.addBox(-4.0F, 11.0F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.45F)).texOffs(0, 42)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.4F)).texOffs(20, 26)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.6F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition LeftPlate = partdefinition.addOrReplaceChild("LeftPlate", CubeListBuilder.create()
				.texOffs(64, 13).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition LeftArmLayer_r1 = LeftPlate.addOrReplaceChild("LeftArmLayer_r1",
				CubeListBuilder.create().texOffs(36, 61)
						.addBox(6.0F, -19.3F, -3.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(56, 56)
						.addBox(5.0F, -23.7F, -3.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.1F)).texOffs(72, 40)
						.addBox(6.0F, -20.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.75F)).texOffs(72, 35)
						.addBox(6.0F, -23.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.75F)).texOffs(0, 70)
						.addBox(6.0F, -24.0F, -2.0F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.7F)),
				PartPose.offsetAndRotation(0.3F, 22.7F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition RightPlate = partdefinition.addOrReplaceChild("RightPlate", CubeListBuilder.create()
				.texOffs(16, 68).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition RightArmLayer_r1 = RightPlate.addOrReplaceChild("RightArmLayer_r1",
				CubeListBuilder.create().texOffs(64, 5)
						.addBox(-9.0F, -19.3F, -3.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(-7.0F, -23.7F, -3.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.1F)).texOffs(72, 61)
						.addBox(-8.0F, -20.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.75F)).texOffs(72, 56)
						.addBox(-8.0F, -23.5F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.75F)).texOffs(70, 70)
						.addBox(-8.0F, -24.0F, -2.0F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.7F)),
				PartPose.offsetAndRotation(-0.3F, 22.7F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition RightLegging = partdefinition.addOrReplaceChild("RightLegging", CubeListBuilder.create()
				.texOffs(36, 35).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.275F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition LeftLegging = partdefinition.addOrReplaceChild("LeftLegging", CubeListBuilder.create()
				.texOffs(20, 35).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.275F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition LeftBoots = partdefinition.addOrReplaceChild("LeftBoots",
				CubeListBuilder.create().texOffs(32, 69)
						.addBox(-2.1F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.325F)).texOffs(72, 25)
						.addBox(-2.1F, 9.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition RightBoots = partdefinition.addOrReplaceChild("RightBoots",
				CubeListBuilder.create().texOffs(54, 68)
						.addBox(-1.9F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.325F)).texOffs(72, 30)
						.addBox(-1.9F, 9.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Helmet.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Chestplate.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftPlate.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightPlate.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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