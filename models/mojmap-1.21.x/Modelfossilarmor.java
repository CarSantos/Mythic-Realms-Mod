// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelfossilarmor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "fossilarmor"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart Right_Arm;
	private final ModelPart Left_Arm;
	private final ModelPart Right_Leg;
	private final ModelPart Left_Leg;
	private final ModelPart Right_Boot;
	private final ModelPart Left_Boot;

	public Modelfossilarmor(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.Right_Arm = root.getChild("Right_Arm");
		this.Left_Arm = root.getChild("Left_Arm");
		this.Right_Leg = root.getChild("Right_Leg");
		this.Left_Leg = root.getChild("Left_Leg");
		this.Right_Boot = root.getChild("Right_Boot");
		this.Left_Boot = root.getChild("Left_Boot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(30, 13)
						.addBox(3.0F, -3.0F, -5.0F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(24, 37)
						.addBox(-5.0F, -3.0F, -5.0F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(66, 55)
						.addBox(3.5F, -4.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(66, 57)
						.addBox(-4.5F, -4.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(38, 5)
						.addBox(-5.0F, -4.0F, 3.3F, 10.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(0, 13).addBox(-5.0F, -31.0F, -1.0F, 10.0F, 9.0F, 5.0F,
						new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(0.0F, 20.0F, -6.3F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2",
				CubeListBuilder.create().texOffs(0, 67)
						.addBox(3.6F, -24.0F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F)).texOffs(66, 65)
						.addBox(-3.6F, -24.0F, -2.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F)).texOffs(66, 63)
						.addBox(-3.6F, -24.0F, -4.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F)).texOffs(66, 61)
						.addBox(3.6F, -24.0F, -4.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F)).texOffs(0, 0)
						.addBox(-4.0F, -27.0F, -6.0F, 9.0F, 3.0F, 10.0F, new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(-0.5F, 17.0F, -6.6F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(38, 0)
						.addBox(-4.0F, 11.0F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(66, 59)
						.addBox(-0.5F, 11.0F, -2.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F)).texOffs(24, 27)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.4F)).texOffs(16, 43)
						.addBox(-4.0F, 7.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2F)).texOffs(32, 49)
						.addBox(-4.0F, 9.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2F)).texOffs(38, 10)
						.addBox(-4.0F, 7.0F, -2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(14, 65)
						.addBox(1.0F, 9.0F, -2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(64, 32)
						.addBox(3.0F, 9.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2F)).texOffs(62, 49)
						.addBox(3.0F, 7.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.2F)).texOffs(62, 2)
						.addBox(1.0F, 7.0F, -2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(16, 47)
						.addBox(-4.0F, 9.0F, -2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(30, 25)
						.addBox(-4.0F, 7.0F, 1.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.4F)).texOffs(62, 0)
						.addBox(-4.0F, 9.0F, 1.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.4F)).texOffs(62, 60)
						.addBox(-0.5F, 0.0F, 1.2F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.5F)).texOffs(46, 10)
						.addBox(-0.5F, 8.7F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.55F)).texOffs(66, 28)
						.addBox(-0.5F, 6.2F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.55F)).texOffs(66, 30)
						.addBox(-0.5F, 1.2F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.55F)).texOffs(66, 53)
						.addBox(-0.5F, 3.7F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.55F)).texOffs(0, 27)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body_r1 = Body
				.addOrReplaceChild("Body_r1",
						CubeListBuilder.create().texOffs(26, 65).addBox(-1.0F, -5.7F, 7.4F, 1.0F, 4.0F, 1.0F,
								new CubeDeformation(0.3F)),
						PartPose.offsetAndRotation(0.5F, 24.0F, 2.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Body_r2 = Body
				.addOrReplaceChild("Body_r2",
						CubeListBuilder.create().texOffs(22, 65).addBox(-1.0F, -12.3F, 5.2F, 1.0F, 4.0F, 1.0F,
								new CubeDeformation(0.4F)),
						PartPose.offsetAndRotation(0.5F, 24.1F, 1.3F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Right_Arm = partdefinition.addOrReplaceChild("Right_Arm",
				CubeListBuilder.create().texOffs(16, 49)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(0, 59)
						.addBox(-2.0F, -3.0F, -2.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(48, 25)
						.addBox(-4.7F, -2.0F, -2.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition Left_Arm = partdefinition.addOrReplaceChild("Left_Arm",
				CubeListBuilder.create().texOffs(52, 10)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(32, 60)
						.addBox(-1.0F, -3.0F, -2.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.3F)).texOffs(32, 53)
						.addBox(-0.3F, -2.0F, -2.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition Right_Leg = partdefinition.addOrReplaceChild("Right_Leg",
				CubeListBuilder.create().texOffs(62, 37)
						.addBox(-1.5F, 3.0F, -2.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 5)
						.addBox(-2.0F, 4.6F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(46, 37)
						.addBox(-2.0F, 0.4F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 11.6F, 0.0F));

		PartDefinition rl_r1 = Right_Leg
				.addOrReplaceChild("rl_r1",
						CubeListBuilder.create().texOffs(40, 49).addBox(-2.9F, -8.5F, -0.4F, 1.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.4F, 10.4F, 2.6F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Left_Leg = partdefinition.addOrReplaceChild("Left_Leg",
				CubeListBuilder.create().texOffs(62, 43)
						.addBox(-1.5F, 3.0F, -2.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 60)
						.addBox(-2.0F, 4.6F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(0, 43)
						.addBox(-2.0F, 0.4F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 11.6F, 0.0F));

		PartDefinition ll_r1 = Left_Leg.addOrReplaceChild("ll_r1",
				CubeListBuilder.create().texOffs(46, 65).addBox(1.9F, -8.5F, -0.4F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4F, 10.4F, 2.6F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Right_Boot = partdefinition.addOrReplaceChild("Right_Boot",
				CubeListBuilder.create().texOffs(50, 53)
						.addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(48, 32)
						.addBox(-2.0F, 9.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition rb_r1 = Right_Boot.addOrReplaceChild("rb_r1",
				CubeListBuilder.create().texOffs(54, 65)
						.addBox(-3.1F, -1.5F, -1.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 65)
						.addBox(-1.1F, -1.5F, -1.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4F, 11.5F, -0.4F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Left_Boot = partdefinition.addOrReplaceChild("Left_Boot",
				CubeListBuilder.create().texOffs(16, 58)
						.addBox(-2.0F, 9.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(52, 19)
						.addBox(-2.0F, 9.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition lb_r1 = Left_Boot.addOrReplaceChild("lb_r1",
				CubeListBuilder.create().texOffs(66, 24)
						.addBox(2.1F, -1.5F, -1.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 65)
						.addBox(0.1F, -1.5F, -1.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4F, 11.5F, -0.4F, -0.7854F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Right_Arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Left_Arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Right_Leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Left_Leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Right_Boot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Left_Boot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Right_Boot.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.Right_Leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Left_Boot.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Right_Arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Left_Leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Left_Arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}