// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelWendigo_Armor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "wendigo_armor"), "main");
	private final ModelPart Helmet;
	private final ModelPart Chestplate;
	private final ModelPart rightPlate;
	private final ModelPart leftPlate;
	private final ModelPart rightLegging;
	private final ModelPart leftLegging;
	private final ModelPart rightBoot;
	private final ModelPart leftBoot;

	public ModelWendigo_Armor(ModelPart root) {
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
				CubeListBuilder.create().texOffs(32, 44)
						.addBox(3.0F, -7.5F, -4.0F, 1.0F, 8.0F, 7.0F, new CubeDeformation(0.25F)).texOffs(48, 44)
						.addBox(-4.0F, -7.5F, -4.0F, 1.0F, 8.0F, 7.0F, new CubeDeformation(0.25F)).texOffs(64, 40)
						.addBox(-4.0F, -7.5F, 3.0F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(0, 0)
						.addBox(-4.0F, -7.5F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.5F)).texOffs(24, 20)
						.addBox(-3.0F, -8.1F, -4.0F, 6.0F, 2.0F, 8.0F, new CubeDeformation(0.3F)).texOffs(0, 30)
						.addBox(-4.0F, -4.7F, -2.0F, 8.0F, 3.0F, 6.0F, new CubeDeformation(0.4F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition rightAntler_r1 = Helmet.addOrReplaceChild("rightAntler_r1",
				CubeListBuilder.create().texOffs(24, 10).addBox(-5.3646F, -1.6515F, -0.6864F, 14.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.6F, -7.6716F, -0.8188F, 0.0436F, 0.0F, 0.2793F));

		PartDefinition leftAntler_r1 = Helmet.addOrReplaceChild("leftAntler_r1",
				CubeListBuilder.create().texOffs(58, 15).addBox(-4.4334F, -1.9528F, -0.2653F, 8.0F, 2.0F, 2.0F,
						new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(16.5163F, -15.1423F, 0.4054F, 0.0436F, -0.2182F, -1.789F));

		PartDefinition leftAntler_r2 = Helmet.addOrReplaceChild("leftAntler_r2",
				CubeListBuilder.create().texOffs(32, 69).addBox(-1.1218F, -3.0751F, -2.8996F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(19.0671F, -13.1466F, -3.425F, -0.3054F, 0.0F, -1.1083F));

		PartDefinition leftAntler_r3 = Helmet.addOrReplaceChild("leftAntler_r3",
				CubeListBuilder.create().texOffs(32, 0).addBox(-3.3218F, -2.0162F, -0.5661F, 12.0F, 2.0F, 3.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(18.2516F, -11.7653F, -0.8275F, 0.0436F, 0.0F, -1.1083F));

		PartDefinition leftAntler_r4 = Helmet.addOrReplaceChild("leftAntler_r4",
				CubeListBuilder.create().texOffs(32, 59).addBox(-1.7395F, -1.6371F, -1.7826F, 2.0F, 2.0F, 8.0F,
						new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(13.6742F, -11.3219F, -6.0859F, -0.48F, -0.2443F, -0.2793F));

		PartDefinition leftAntler_r5 = Helmet.addOrReplaceChild("leftAntler_r5",
				CubeListBuilder.create().texOffs(58, 30).addBox(-1.8354F, -5.5478F, -0.9542F, 2.0F, 2.0F, 8.0F,
						new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(8.9496F, -6.7564F, -8.8199F, -0.48F, 0.0F, -0.2793F));

		PartDefinition leftAntler_r6 = Helmet.addOrReplaceChild("leftAntler_r6",
				CubeListBuilder.create().texOffs(24, 15).addBox(-8.6354F, -1.6515F, -0.6864F, 14.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.6F, -7.6716F, -0.8188F, 0.0436F, 0.0F, -0.2793F));

		PartDefinition rightAntler_r2 = Helmet.addOrReplaceChild("rightAntler_r2",
				CubeListBuilder.create().texOffs(52, 20).addBox(-0.1646F, -5.5478F, -0.9542F, 2.0F, 2.0F, 8.0F,
						new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(-8.9496F, -6.7564F, -8.8199F, -0.48F, 0.0F, 0.2793F));

		PartDefinition rightAntler_r3 = Helmet.addOrReplaceChild("rightAntler_r3",
				CubeListBuilder.create().texOffs(58, 5).addBox(-0.2605F, -1.6371F, -1.7826F, 2.0F, 2.0F, 8.0F,
						new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-13.6742F, -11.3219F, -6.0859F, -0.48F, 0.2443F, 0.2793F));

		PartDefinition rightAntler_r4 = Helmet.addOrReplaceChild("rightAntler_r4",
				CubeListBuilder.create().texOffs(28, 30).addBox(-8.6782F, -2.0162F, -0.5661F, 12.0F, 2.0F, 3.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-18.2516F, -11.7653F, -0.8275F, 0.0436F, 0.0F, 1.1083F));

		PartDefinition rightAntler_r5 = Helmet.addOrReplaceChild("rightAntler_r5",
				CubeListBuilder.create().texOffs(16, 69).addBox(-0.8782F, -3.0751F, -2.8996F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(-19.0671F, -13.1466F, -3.425F, -0.3054F, 0.0F, 1.1083F));

		PartDefinition rightAntler_r6 = Helmet.addOrReplaceChild("rightAntler_r6",
				CubeListBuilder.create().texOffs(0, 26).addBox(-3.5666F, -1.9528F, -0.2653F, 8.0F, 2.0F, 2.0F,
						new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-16.5163F, -15.1423F, 0.4054F, 0.0436F, 0.2182F, 1.789F));

		PartDefinition Chestplate = partdefinition.addOrReplaceChild("Chestplate",
				CubeListBuilder.create().texOffs(0, 10)
						.addBox(-4.0F, -1.5F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.35F)).texOffs(32, 5)
						.addBox(-4.0F, 9.5F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.4F)).texOffs(28, 35)
						.addBox(-4.0F, -1.5F, -2.0F, 8.0F, 4.0F, 5.0F, new CubeDeformation(0.45F)),
				PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition rightPlate = partdefinition.addOrReplaceChild("rightPlate",
				CubeListBuilder.create().texOffs(64, 49)
						.addBox(-3.0F, -1.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(0, 55)
						.addBox(-3.0F, 3.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.3F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition rightAntler_r7 = rightPlate.addOrReplaceChild("rightAntler_r7",
				CubeListBuilder.create().texOffs(70, 58).addBox(-0.1646F, -5.5478F, 2.0458F, 2.0F, 2.0F, 5.0F,
						new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(-8.9496F, -0.2564F, 1.7801F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition rightAntler_r8 = rightPlate.addOrReplaceChild("rightAntler_r8",
				CubeListBuilder.create().texOffs(52, 59).addBox(-1.1646F, -5.5478F, 1.0458F, 3.0F, 3.0F, 6.0F,
						new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(-8.9496F, 1.7436F, 0.2801F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition rightAntler_r9 = rightPlate.addOrReplaceChild("rightAntler_r9",
				CubeListBuilder.create().texOffs(18, 60).addBox(-0.1646F, -5.5478F, 2.0458F, 2.0F, 2.0F, 5.0F,
						new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(-8.9496F, -0.2564F, -0.2199F, 0.0F, 1.5708F, 0.7854F));

		PartDefinition leftPlate = partdefinition.addOrReplaceChild("leftPlate",
				CubeListBuilder.create().texOffs(52, 68)
						.addBox(-1.0F, -1.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(62, 0)
						.addBox(-1.0F, 3.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.3F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition leftAntler_r7 = leftPlate.addOrReplaceChild("leftAntler_r7",
				CubeListBuilder.create().texOffs(68, 76).addBox(-1.8354F, -5.5478F, 2.0458F, 2.0F, 2.0F, 5.0F,
						new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(8.9496F, -0.2564F, 1.7801F, 0.0F, -1.5708F, -0.7854F));

		PartDefinition leftAntler_r8 = leftPlate.addOrReplaceChild("leftAntler_r8",
				CubeListBuilder.create().texOffs(0, 60).addBox(-1.8354F, -5.5478F, 1.0458F, 3.0F, 3.0F, 6.0F,
						new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(8.9496F, 1.7436F, 0.2801F, 0.0F, -1.5708F, -0.7854F));

		PartDefinition leftAntler_r9 = leftPlate.addOrReplaceChild("leftAntler_r9",
				CubeListBuilder.create().texOffs(72, 19).addBox(-1.8354F, -5.5478F, 2.0458F, 2.0F, 2.0F, 5.0F,
						new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(8.9496F, -0.2564F, -0.2199F, 0.0F, -1.5708F, -0.7854F));

		PartDefinition rightLegging = partdefinition.addOrReplaceChild("rightLegging", CubeListBuilder.create()
				.texOffs(0, 39).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition leftLegging = partdefinition.addOrReplaceChild("leftLegging", CubeListBuilder.create()
				.texOffs(16, 44).addBox(-2.0F, 0.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition rightBoot = partdefinition.addOrReplaceChild("rightBoot", CubeListBuilder.create()
				.texOffs(68, 68).addBox(-2.0F, 8.5F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.3F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition leftBoot = partdefinition.addOrReplaceChild("leftBoot", CubeListBuilder.create().texOffs(0, 69)
				.addBox(-2.0F, 8.5F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.3F)),
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