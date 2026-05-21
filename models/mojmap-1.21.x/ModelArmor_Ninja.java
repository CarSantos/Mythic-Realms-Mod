// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelArmor_Ninja<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "armor_ninja"), "main");
	private final ModelPart Helmet;
	private final ModelPart Chestplate;
	private final ModelPart RightPlate;
	private final ModelPart LeftPlate;
	private final ModelPart RightLegging;
	private final ModelPart LeftLegging;
	private final ModelPart LeftBoots;
	private final ModelPart RightBoots;

	public ModelArmor_Ninja(ModelPart root) {
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
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(4.0F, -8.5F, -5.0F, 1.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(-5.0F, -8.5F, -5.0F, 1.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(32, 53)
						.addBox(-3.5F, -1.5F, -4.2F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.7F)).texOffs(0, 46)
						.addBox(-3.5F, -7.5F, 3.1F, 7.0F, 8.0F, 1.0F, new CubeDeformation(1.0F)).texOffs(22, 16)
						.addBox(-3.0F, -7.8F, -4.2F, 6.0F, 1.0F, 8.0F, new CubeDeformation(1.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Chestplate = partdefinition.addOrReplaceChild("Chestplate",
				CubeListBuilder.create().texOffs(22, 0)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(0, 41)
						.addBox(-4.0F, 11.0F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.4F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightPlate = partdefinition.addOrReplaceChild("RightPlate",
				CubeListBuilder.create().texOffs(40, 41)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.35F)).texOffs(46, 8)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftPlate = partdefinition.addOrReplaceChild("LeftPlate",
				CubeListBuilder.create().texOffs(24, 41)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.35F)).texOffs(46, 0)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightLegging = partdefinition.addOrReplaceChild("RightLegging", CubeListBuilder.create()
				.texOffs(38, 25).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.275F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition LeftLegging = partdefinition.addOrReplaceChild("LeftLegging", CubeListBuilder.create()
				.texOffs(22, 25).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.275F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition LeftBoots = partdefinition.addOrReplaceChild("LeftBoots", CubeListBuilder.create()
				.texOffs(16, 53).addBox(-2.1F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition RightBoots = partdefinition.addOrReplaceChild("RightBoots", CubeListBuilder.create()
				.texOffs(50, 16).addBox(-1.9F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.5F)),
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