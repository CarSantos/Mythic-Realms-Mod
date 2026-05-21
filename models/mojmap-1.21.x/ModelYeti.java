// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelYeti<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "yeti"), "main");
	private final ModelPart main;
	private final ModelPart rightLeg0;
	private final ModelPart rightLeg1;
	private final ModelPart leftLeg0;
	private final ModelPart leftLeg1;
	private final ModelPart body;
	private final ModelPart bodyUpper;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart rightHorn;
	private final ModelPart leftHorn;
	private final ModelPart beard;
	private final ModelPart beard2;
	private final ModelPart leftShoulder;
	private final ModelPart leftArm0;
	private final ModelPart leftArm1;
	private final ModelPart leftArm2;
	private final ModelPart leftArm3;
	private final ModelPart rightShoulder;
	private final ModelPart rightArm0;
	private final ModelPart rightArm1;
	private final ModelPart rightArm2;
	private final ModelPart rightArm3;

	public ModelYeti(ModelPart root) {
		this.main = root.getChild("main");
		this.rightLeg0 = this.main.getChild("rightLeg0");
		this.rightLeg1 = this.rightLeg0.getChild("rightLeg1");
		this.leftLeg0 = this.main.getChild("leftLeg0");
		this.leftLeg1 = this.leftLeg0.getChild("leftLeg1");
		this.body = this.main.getChild("body");
		this.bodyUpper = this.body.getChild("bodyUpper");
		this.neck = this.bodyUpper.getChild("neck");
		this.head = this.neck.getChild("head");
		this.rightHorn = this.head.getChild("rightHorn");
		this.leftHorn = this.head.getChild("leftHorn");
		this.beard = this.head.getChild("beard");
		this.beard2 = this.head.getChild("beard2");
		this.leftShoulder = this.bodyUpper.getChild("leftShoulder");
		this.leftArm0 = this.leftShoulder.getChild("leftArm0");
		this.leftArm1 = this.leftArm0.getChild("leftArm1");
		this.leftArm2 = this.leftArm1.getChild("leftArm2");
		this.leftArm3 = this.leftArm2.getChild("leftArm3");
		this.rightShoulder = this.bodyUpper.getChild("rightShoulder");
		this.rightArm0 = this.rightShoulder.getChild("rightArm0");
		this.rightArm1 = this.rightArm0.getChild("rightArm1");
		this.rightArm2 = this.rightArm1.getChild("rightArm2");
		this.rightArm3 = this.rightArm2.getChild("rightArm3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition rightLeg0 = main.addOrReplaceChild("rightLeg0",
				CubeListBuilder.create().texOffs(60, 120).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 12.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, -21.0F, 0.0F, -0.3927F, 0.5236F, 0.0F));

		PartDefinition rightLeg1 = rightLeg0.addOrReplaceChild("rightLeg1",
				CubeListBuilder.create().texOffs(44, 83)
						.addBox(-5.0F, -1.0F, -4.0F, 10.0F, 13.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 106)
						.addBox(-6.0F, 9.0F, -7.0F, 12.0F, 3.0F, 11.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 10.0F, -1.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition leftLeg0 = main.addOrReplaceChild("leftLeg0",
				CubeListBuilder.create().texOffs(124, 70).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 12.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -21.0F, 0.0F, -0.3927F, -0.5236F, 0.0F));

		PartDefinition leftLeg1 = leftLeg0.addOrReplaceChild("leftLeg1",
				CubeListBuilder.create().texOffs(84, 83)
						.addBox(-5.0F, -1.0F, -4.0F, 10.0F, 13.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(46, 106)
						.addBox(-6.0F, 9.0F, -7.0F, 12.0F, 3.0F, 11.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 10.0F, -1.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 26).addBox(-11.0F,
				-13.0F, -6.0F, 22.0F, 19.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -22.0F, 0.0F));

		PartDefinition body_r1 = body
				.addOrReplaceChild("body_r1",
						CubeListBuilder.create().texOffs(116, 52).addBox(0.0F, 0.0F, -6.0F, 8.0F, 8.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -6.0F, 1.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition bodyUpper = body.addOrReplaceChild("bodyUpper",
				CubeListBuilder.create().texOffs(0, 0).addBox(-13.0F, -12.0F, -7.0F, 26.0F, 12.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition neck = bodyUpper.addOrReplaceChild("neck",
				CubeListBuilder.create().texOffs(0, 83).addBox(-5.0F, 0.0F, -12.0F, 10.0F, 10.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -13.0F, 7.0F, -0.829F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(92, 106)
						.addBox(-5.0F, -6.0F, -10.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.01F)).texOffs(132, 123)
						.addBox(-2.0F, 0.0F, -11.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, -8.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(112, 51).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-2.5F, 3.0F, -9.5F, 0.7854F, 0.4363F, 0.0F));

		PartDefinition head_r2 = head.addOrReplaceChild("head_r2",
				CubeListBuilder.create().texOffs(112, 46).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(2.5F, 3.0F, -9.5F, 0.7854F, -0.4363F, 0.0F));

		PartDefinition head_r3 = head.addOrReplaceChild("head_r3",
				CubeListBuilder.create().texOffs(96, 51).addBox(-5.0F, -4.0F, 0.0F, 7.0F, 4.0F, 1.0F,
						new CubeDeformation(0.02F)),
				PartPose.offsetAndRotation(-2.0F, -1.0F, -10.0F, 0.1745F, 0.0F, 0.1745F));

		PartDefinition head_r4 = head.addOrReplaceChild("head_r4",
				CubeListBuilder.create().texOffs(96, 46).addBox(-2.0F, -4.0F, 0.0F, 7.0F, 4.0F, 1.0F,
						new CubeDeformation(0.02F)),
				PartPose.offsetAndRotation(2.0F, -1.0F, -10.0F, 0.1745F, 0.0F, -0.1745F));

		PartDefinition head_r5 = head.addOrReplaceChild("head_r5",
				CubeListBuilder.create().texOffs(60, 140).addBox(-5.0F, -43.0F, -11.0F, 10.0F, 8.0F, 4.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 30.0F, -14.1F, -0.6109F, 0.0F, 0.0F));

		PartDefinition head_r6 = head.addOrReplaceChild("head_r6",
				CubeListBuilder.create().texOffs(132, 104).addBox(-5.0F, -43.0F, -11.0F, 10.0F, 8.0F, 4.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 29.0F, -18.1F, -0.6109F, 0.0F, 0.0F));

		PartDefinition head_r7 = head.addOrReplaceChild("head_r7",
				CubeListBuilder.create().texOffs(68, 46).addBox(-5.0F, -41.0F, -11.0F, 10.0F, 6.0F, 4.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 29.0F, -21.1F, -0.6109F, 0.0F, 0.0F));

		PartDefinition rightHorn = head.addOrReplaceChild("rightHorn", CubeListBuilder.create(),
				PartPose.offset(-4.0F, -2.0F, -7.5F));

		PartDefinition rightHorn_r1 = rightHorn.addOrReplaceChild("rightHorn_r1",
				CubeListBuilder.create().texOffs(102, 24).addBox(-3.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.75F, -7.75F, 6.25F, 0.0F, 1.1345F, 2.2253F));

		PartDefinition rightHorn_r2 = rightHorn.addOrReplaceChild("rightHorn_r2",
				CubeListBuilder.create().texOffs(102, 20).addBox(-4.0F, -2.0F, -1.5F, 5.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.75F, -5.5F, 3.25F, -0.1745F, 1.0472F, 1.1345F));

		PartDefinition rightHorn_r3 = rightHorn.addOrReplaceChild("rightHorn_r3",
				CubeListBuilder.create().texOffs(80, 20).addBox(-8.0F, -3.0F, -1.5F, 8.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.829F));

		PartDefinition leftHorn = head.addOrReplaceChild("leftHorn", CubeListBuilder.create(),
				PartPose.offset(4.0F, -2.0F, -7.5F));

		PartDefinition leftHorn_r1 = leftHorn.addOrReplaceChild("leftHorn_r1",
				CubeListBuilder.create().texOffs(116, 70).addBox(0.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.75F, -7.75F, 6.25F, 0.0F, -1.1345F, -2.2253F));

		PartDefinition leftHorn_r2 = leftHorn.addOrReplaceChild("leftHorn_r2",
				CubeListBuilder.create().texOffs(112, 140).addBox(-1.0F, -2.0F, -1.5F, 5.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.75F, -5.5F, 3.25F, -0.1745F, -1.0472F, -1.1345F));

		PartDefinition leftHorn_r3 = leftHorn.addOrReplaceChild("leftHorn_r3",
				CubeListBuilder.create().texOffs(128, 14).addBox(0.0F, -3.0F, -1.5F, 8.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, -0.829F));

		PartDefinition beard = head.addOrReplaceChild("beard", CubeListBuilder.create(),
				PartPose.offset(0.0F, 3.0F, -10.0F));

		PartDefinition beard_r1 = beard.addOrReplaceChild("beard_r1",
				CubeListBuilder.create().texOffs(30, 120).addBox(0.0F, -9.0F, 0.0F, 9.0F, 18.0F, 6.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition beard_r2 = beard
				.addOrReplaceChild("beard_r2",
						CubeListBuilder.create().texOffs(0, 120).addBox(-9.0F, -9.0F, 0.0F, 9.0F, 18.0F, 6.0F,
								new CubeDeformation(0.01F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition beard2 = head.addOrReplaceChild("beard2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 1.0F, -9.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition leftShoulder = bodyUpper.addOrReplaceChild("leftShoulder", CubeListBuilder.create(),
				PartPose.offsetAndRotation(5.0F, -15.0F, 2.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition leftShoulder_r1 = leftShoulder.addOrReplaceChild(
				"leftShoulder_r1", CubeListBuilder.create().texOffs(0, 57).addBox(-4.3696F, -7.448F, -5.186F, 16.0F,
						13.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 3.0F, -2.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition leftArm0 = leftShoulder.addOrReplaceChild("leftArm0",
				CubeListBuilder.create().texOffs(116, 20).addBox(-3.0F, -4.0F, -4.0F, 12.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, 2.0F, -2.0F, 0.2618F, 0.0F, 0.4363F));

		PartDefinition leftArm1 = leftArm0.addOrReplaceChild("leftArm1",
				CubeListBuilder.create().texOffs(68, 26).addBox(-1.0F, -5.0F, -5.0F, 14.0F, 10.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.1745F));

		PartDefinition leftArm1_r1 = leftArm1.addOrReplaceChild("leftArm1_r1",
				CubeListBuilder.create().texOffs(132, 116).addBox(-1.0F, -2.0F, -3.0F, 9.0F, 4.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, 4.0F, -3.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition leftArm2 = leftArm1.addOrReplaceChild("leftArm2",
				CubeListBuilder.create().texOffs(124, 90).addBox(0.0F, 0.0F, -5.5F, 7.0F, 3.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition leftArm3 = leftArm2.addOrReplaceChild("leftArm3",
				CubeListBuilder.create().texOffs(92, 126).addBox(0.0F, 0.0F, -3.5F, 7.0F, 3.0F, 11.0F,
						new CubeDeformation(-0.01F)),
				PartPose.offsetAndRotation(7.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition rightShoulder = bodyUpper.addOrReplaceChild("rightShoulder", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-5.0F, -15.0F, 2.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition rightShoulder_r1 = rightShoulder.addOrReplaceChild("rightShoulder_r1",
				CubeListBuilder.create().texOffs(58, 57).addBox(-11.6304F, -7.448F, -5.186F, 16.0F, 13.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 3.0F, -2.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition rightArm0 = rightShoulder.addOrReplaceChild("rightArm0",
				CubeListBuilder.create().texOffs(116, 36).addBox(-9.0F, -4.0F, -4.0F, 12.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.0F, 2.0F, -2.0F, 0.2618F, 0.0F, -0.4363F));

		PartDefinition rightArm1 = rightArm0.addOrReplaceChild("rightArm1",
				CubeListBuilder.create().texOffs(80, 0).addBox(-13.0F, -5.0F, -5.0F, 14.0F, 10.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 0.0F, 0.0F, 0.0F, -0.3491F, -0.1745F));

		PartDefinition rightArm1_r1 = rightArm1.addOrReplaceChild("rightArm1_r1",
				CubeListBuilder.create().texOffs(88, 140).addBox(-8.0F, -2.0F, -3.0F, 9.0F, 4.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.0F, 4.0F, -3.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition rightArm2 = rightArm1.addOrReplaceChild("rightArm2",
				CubeListBuilder.create().texOffs(128, 0).addBox(-7.0F, 0.0F, -5.5F, 7.0F, 3.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0F, -5.0F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition rightArm3 = rightArm2.addOrReplaceChild("rightArm3",
				CubeListBuilder.create().texOffs(128, 126).addBox(-7.0F, 0.0F, -3.5F, 7.0F, 3.0F, 11.0F,
						new CubeDeformation(-0.01F)),
				PartPose.offsetAndRotation(-7.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.7854F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}