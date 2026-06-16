// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelTesla_Armor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "tesla_armor"), "main");
	private final ModelPart armorHead;
	private final ModelPart bipedBody;
	private final ModelPart bipedLeftArm;
	private final ModelPart bipedRightArm;
	private final ModelPart armorLeftLeg;
	private final ModelPart armorRightLeg;
	private final ModelPart armorLeftBoot;
	private final ModelPart armorRightBoot;

	public ModelTesla_Armor(ModelPart root) {
		this.armorHead = root.getChild("armorHead");
		this.bipedBody = root.getChild("bipedBody");
		this.bipedLeftArm = root.getChild("bipedLeftArm");
		this.bipedRightArm = root.getChild("bipedRightArm");
		this.armorLeftLeg = root.getChild("armorLeftLeg");
		this.armorRightLeg = root.getChild("armorRightLeg");
		this.armorLeftBoot = root.getChild("armorLeftBoot");
		this.armorRightBoot = root.getChild("armorRightBoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition armorHead = partdefinition.addOrReplaceChild("armorHead",
				CubeListBuilder.create().texOffs(44, 61)
						.addBox(-1.0F, -1.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.4F)).texOffs(0, 13)
						.addBox(-4.0F, -7.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.3F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bipedBody = partdefinition.addOrReplaceChild("bipedBody",
				CubeListBuilder.create().texOffs(0, 22)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(0, 0)
						.addBox(-4.5F, 0.1F, -2.7F, 9.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(24, 22)
						.addBox(-4.6F, 9.2F, -2.5F, 9.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition armorRightArm_r1 = bipedBody.addOrReplaceChild("armorRightArm_r1",
				CubeListBuilder.create().texOffs(56, 65)
						.addBox(4.5F, -4.0F, 1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.1F)).texOffs(52, 55)
						.addBox(4.0F, -3.0F, 1.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(56, 41)
						.addBox(4.0F, -5.0F, 1.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(44, 18)
						.addBox(5.0F, -6.0F, 2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-7.75F, 1.8F, 0.0F, -0.7734F, -0.1536F, -0.1555F));

		PartDefinition armorLeftArm_r1 = bipedBody.addOrReplaceChild("armorLeftArm_r1",
				CubeListBuilder.create().texOffs(16, 38)
						.addBox(-7.0F, -6.0F, 2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(56, 12)
						.addBox(-8.0F, -5.0F, 1.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(32, 18)
						.addBox(-7.5F, -4.0F, 1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.1F)).texOffs(0, 54)
						.addBox(-8.0F, -3.0F, 1.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(7.75F, 1.8F, 0.0F, -0.7734F, 0.1536F, 0.1555F));

		PartDefinition bipedLeftArm = partdefinition.addOrReplaceChild("bipedLeftArm",
				CubeListBuilder.create().texOffs(0, 64)
						.addBox(-0.5F, 8.0F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(1.05F)).texOffs(52, 18)
						.addBox(-1.5F, 8.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(32, 59)
						.addBox(-0.5F, -2.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(1.1F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition armorLeftArm_r2 = bipedLeftArm.addOrReplaceChild("armorLeftArm_r2",
				CubeListBuilder.create().texOffs(56, 46).addBox(4.5F, -14.0F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(1.1F)),
				PartPose.offsetAndRotation(-2.0F, 23.2F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition armorLeftArm_r3 = bipedLeftArm.addOrReplaceChild("armorLeftArm_r3",
				CubeListBuilder.create().texOffs(52, 25)
						.addBox(-2.1F, -6.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(32, 11)
						.addBox(-3.1F, -5.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.1F)).texOffs(54, 0)
						.addBox(-2.5F, -4.0F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(30, 0)
						.addBox(-3.0F, -3.0F, -3.0F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(1.85F, -0.2F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition bipedRightArm = partdefinition.addOrReplaceChild("bipedRightArm",
				CubeListBuilder.create().texOffs(44, 65)
						.addBox(-2.5F, 8.0F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(1.05F)).texOffs(52, 48)
						.addBox(-3.5F, 8.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(16, 62)
						.addBox(-2.5F, -2.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(1.1F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition armorRightArm_r2 = bipedRightArm.addOrReplaceChild(
				"armorRightArm_r2", CubeListBuilder.create().texOffs(44, 59).addBox(-7.5F, -14.0F, -0.5F, 3.0F, 1.0F,
						1.0F, new CubeDeformation(1.1F)),
				PartPose.offsetAndRotation(2.0F, 23.2F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition armorRightArm_r3 = bipedRightArm.addOrReplaceChild("armorRightArm_r3",
				CubeListBuilder.create().texOffs(16, 57)
						.addBox(-1.9F, -6.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(32, 41)
						.addBox(-2.9F, -5.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.1F)).texOffs(56, 6)
						.addBox(-2.5F, -4.0F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(24, 30)
						.addBox(-3.0F, -3.0F, -3.0F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-1.85F, -0.2F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition armorLeftLeg = partdefinition.addOrReplaceChild("armorLeftLeg", CubeListBuilder.create()
				.texOffs(0, 38).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition armorRightLeg = partdefinition.addOrReplaceChild("armorRightLeg", CubeListBuilder.create()
				.texOffs(16, 41).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition armorLeftBoot = partdefinition.addOrReplaceChild("armorLeftBoot", CubeListBuilder.create()
				.texOffs(48, 30).addBox(-2.5F, 6.5F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.25F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition armorRightBoot = partdefinition.addOrReplaceChild("armorRightBoot", CubeListBuilder.create()
				.texOffs(32, 48).addBox(-2.5F, 6.5F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		armorHead.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedLeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedRightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armorLeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armorRightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armorLeftBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armorRightBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.bipedRightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.armorHead.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.armorHead.xRot = headPitch / (180F / (float) Math.PI);
		this.armorRightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.bipedLeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.armorRightBoot.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.armorLeftBoot.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.armorLeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}