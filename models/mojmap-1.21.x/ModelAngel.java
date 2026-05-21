// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelAngel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "angel"), "main");
	private final ModelPart spin;
	private final ModelPart bone;
	private final ModelPart Body;
	private final ModelPart cape;
	private final ModelPart RightArm;
	private final ModelPart right_fore;
	private final ModelPart LeftArm;
	private final ModelPart left_fore;
	private final ModelPart Head;
	private final ModelPart ala;
	private final ModelPart ala2;
	private final ModelPart ala3;
	private final ModelPart ala4;
	private final ModelPart ala5;
	private final ModelPart ala6;
	private final ModelPart ala7;
	private final ModelPart ala8;
	private final ModelPart LeftLeg;
	private final ModelPart left_lower;
	private final ModelPart RightLeg;
	private final ModelPart right_lower;

	public ModelAngel(ModelPart root) {
		this.spin = root.getChild("spin");
		this.bone = this.spin.getChild("bone");
		this.Body = this.bone.getChild("Body");
		this.cape = this.Body.getChild("cape");
		this.RightArm = this.Body.getChild("RightArm");
		this.right_fore = this.RightArm.getChild("right_fore");
		this.LeftArm = this.Body.getChild("LeftArm");
		this.left_fore = this.LeftArm.getChild("left_fore");
		this.Head = this.Body.getChild("Head");
		this.ala = this.Body.getChild("ala");
		this.ala2 = this.ala.getChild("ala2");
		this.ala3 = this.ala2.getChild("ala3");
		this.ala4 = this.ala3.getChild("ala4");
		this.ala5 = this.Body.getChild("ala5");
		this.ala6 = this.ala5.getChild("ala6");
		this.ala7 = this.ala6.getChild("ala7");
		this.ala8 = this.ala7.getChild("ala8");
		this.LeftLeg = this.bone.getChild("LeftLeg");
		this.left_lower = this.LeftLeg.getChild("left_lower");
		this.RightLeg = this.bone.getChild("RightLeg");
		this.right_lower = this.RightLeg.getChild("right_lower");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition spin = partdefinition.addOrReplaceChild("spin", CubeListBuilder.create(),
				PartPose.offset(0.0F, 3.0F, 0.0F));

		PartDefinition bone = spin.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, 17.9F, 0.0F));

		PartDefinition Body = bone.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(60, 55)
						.addBox(-4.0F, -11.9F, -2.4F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(58, 71)
						.addBox(-4.0F, -11.9F, -2.4F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.4F)),
				PartPose.offset(0.0F, -11.4F, 0.0F));

		PartDefinition cape = Body.addOrReplaceChild("cape", CubeListBuilder.create(),
				PartPose.offset(-4.3F, -11.5F, 1.1F));

		PartDefinition RightArm = Body.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(90, 83)
				.addBox(-2.8F, -1.7F, -1.9F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.3F)),
				PartPose.offset(-5.5F, -10.0F, 0.0F));

		PartDefinition right_fore = RightArm.addOrReplaceChild("right_fore", CubeListBuilder.create().texOffs(22, 82)
				.addBox(-1.4F, -2.4F, -1.9F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.2F, 3.5F, 0.0F));

		PartDefinition LeftArm = Body.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(90, 91).addBox(
				-1.2F, -1.7F, -1.9F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.3F)), PartPose.offset(5.5F, -10.0F, 0.0F));

		PartDefinition left_fore = LeftArm.addOrReplaceChild("left_fore", CubeListBuilder.create().texOffs(84, 65)
				.addBox(-2.6F, -2.4F, -1.9F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.2F, 3.5F, 0.0F));

		PartDefinition Head = Body.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 32)
						.addBox(-4.0F, -2.5F, -4.8F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 79)
						.addBox(4.0F, -4.5F, -5.8F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(52, 80)
						.addBox(-5.0F, -4.5F, -5.8F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(64, 53)
						.addBox(-4.0F, -4.5F, 3.2F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 30)
						.addBox(-4.0F, -4.5F, -5.8F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -17.4F, 0.0F));

		PartDefinition ala = Body.addOrReplaceChild("ala", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.4821F, -9.75F, 1.786F, -1.5708F, -0.5236F, 0.0F));

		PartDefinition ala_r1 = ala.addOrReplaceChild("ala_r1",
				CubeListBuilder.create().texOffs(34, 23)
						.addBox(-1.5F, 0.0F, 0.75F, 9.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 72)
						.addBox(-2.0F, -1.25F, -2.75F, 9.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0179F, -0.5F, 0.464F, 0.0F, -0.3927F, 0.0F));

		PartDefinition ala2 = ala.addOrReplaceChild("ala2", CubeListBuilder.create(),
				PartPose.offset(6.5092F, -0.25F, 2.5536F));

		PartDefinition ala2_r1 = ala2.addOrReplaceChild("ala2_r1",
				CubeListBuilder.create().texOffs(32, 32)
						.addBox(-3.5016F, -0.3F, -0.5146F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 90)
						.addBox(-1.5016F, -0.8F, -2.5146F, 7.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2587F, -0.25F, -0.0897F, 0.0F, 0.48F, 0.0F));

		PartDefinition ala3 = ala2.addOrReplaceChild("ala3", CubeListBuilder.create(),
				PartPose.offset(5.0524F, 0.15F, -2.9303F));

		PartDefinition ala3_r1 = ala3.addOrReplaceChild("ala3_r1",
				CubeListBuilder.create().texOffs(66, 10)
						.addBox(4.9984F, -0.55F, 1.4854F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(92, 40)
						.addBox(4.9984F, -1.05F, -1.5146F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.7937F, -0.1F, 2.8407F, 0.0F, 0.48F, 0.0F));

		PartDefinition ala4 = ala3.addOrReplaceChild("ala4", CubeListBuilder.create(),
				PartPose.offset(4.0981F, 0.1F, -1.9204F));

		PartDefinition ala4_r1 = ala4.addOrReplaceChild("ala4_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.6063F, -0.75F, 0.3701F, 2.0F, 1.0F, 15.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6369F, 0.0F, 0.7037F, 0.0F, 2.0508F, 0.0F));

		PartDefinition ala4_r2 = ala4.addOrReplaceChild("ala4_r2",
				CubeListBuilder.create().texOffs(34, 10).addBox(0.1063F, 0.2F, 0.3701F, 3.0F, 0.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6369F, 0.0F, 0.7037F, 0.0F, 1.7453F, 0.0F));

		PartDefinition ala4_r3 = ala4.addOrReplaceChild("ala4_r3",
				CubeListBuilder.create().texOffs(0, 48).addBox(-0.9937F, -0.75F, -0.6299F, 3.0F, 1.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6369F, 0.0F, 0.7037F, 0.0F, 1.4835F, 0.0F));

		PartDefinition ala4_r4 = ala4.addOrReplaceChild("ala4_r4",
				CubeListBuilder.create().texOffs(0, 61).addBox(-2.3937F, 0.2F, -0.6299F, 3.0F, 0.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6369F, 0.0F, 0.7037F, 0.0F, 1.2654F, 0.0F));

		PartDefinition ala4_r5 = ala4.addOrReplaceChild("ala4_r5",
				CubeListBuilder.create().texOffs(68, 30).addBox(-2.3937F, 0.15F, -0.6299F, 3.0F, 0.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6369F, 0.0F, 0.7037F, 0.0F, 0.7854F, 0.0F));

		PartDefinition ala4_r6 = ala4.addOrReplaceChild("ala4_r6",
				CubeListBuilder.create().texOffs(38, 82).addBox(-0.6642F, -0.75F, -1.2635F, 4.0F, 1.0F, 2.0F,
						new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(-0.034F, 0.0F, 0.0924F, 0.0F, 1.1345F, 0.0F));

		PartDefinition ala5 = Body.addOrReplaceChild("ala5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.4821F, -9.75F, 1.786F, -1.5708F, 0.5236F, 0.0F));

		PartDefinition ala_r2 = ala5.addOrReplaceChild("ala_r2", CubeListBuilder.create().texOffs(34, 23).mirror()
				.addBox(-7.5F, 0.0F, 0.75F, 9.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 72)
				.mirror().addBox(-7.0F, -1.25F, -2.75F, 9.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0179F, -0.5F, 0.464F, 0.0F, 0.3927F, 0.0F));

		PartDefinition ala6 = ala5.addOrReplaceChild("ala6", CubeListBuilder.create(),
				PartPose.offset(-6.5092F, -0.25F, 2.5536F));

		PartDefinition ala3_r2 = ala6.addOrReplaceChild("ala3_r2",
				CubeListBuilder.create().texOffs(32, 32).mirror()
						.addBox(-5.4984F, -0.3F, -0.5146F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 90).mirror()
						.addBox(-5.4984F, -0.8F, -2.5146F, 7.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.2587F, -0.25F, -0.0897F, 0.0F, -0.48F, 0.0F));

		PartDefinition ala7 = ala6.addOrReplaceChild("ala7", CubeListBuilder.create(),
				PartPose.offset(-5.0524F, 0.15F, -2.9303F));

		PartDefinition ala4_r7 = ala7.addOrReplaceChild("ala4_r7",
				CubeListBuilder.create().texOffs(66, 10).mirror()
						.addBox(-9.9984F, -0.55F, 1.4854F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(92, 40).mirror()
						.addBox(-9.9984F, -1.05F, -1.5146F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.7937F, -0.1F, 2.8407F, 0.0F, -0.48F, 0.0F));

		PartDefinition ala8 = ala7.addOrReplaceChild("ala8", CubeListBuilder.create(),
				PartPose.offset(-4.0981F, 0.1F, -1.9204F));

		PartDefinition ala5_r1 = ala8.addOrReplaceChild("ala5_r1",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-2.6063F, -0.75F, 0.3701F, 2.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6369F, 0.0F, 0.7037F, 0.0F, -2.0508F, 0.0F));

		PartDefinition ala5_r2 = ala8.addOrReplaceChild("ala5_r2",
				CubeListBuilder.create().texOffs(34, 10).mirror()
						.addBox(-3.1063F, 0.2F, 0.3701F, 3.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6369F, 0.0F, 0.7037F, 0.0F, -1.7453F, 0.0F));

		PartDefinition ala5_r3 = ala8.addOrReplaceChild("ala5_r3",
				CubeListBuilder.create().texOffs(0, 48).mirror()
						.addBox(-2.0063F, -0.75F, -0.6299F, 3.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6369F, 0.0F, 0.7037F, 0.0F, -1.4835F, 0.0F));

		PartDefinition ala5_r4 = ala8.addOrReplaceChild("ala5_r4",
				CubeListBuilder.create().texOffs(0, 61).mirror()
						.addBox(-0.6063F, 0.2F, -0.6299F, 3.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6369F, 0.0F, 0.7037F, 0.0F, -1.2654F, 0.0F));

		PartDefinition ala5_r5 = ala8.addOrReplaceChild("ala5_r5",
				CubeListBuilder.create().texOffs(68, 30).mirror()
						.addBox(-0.6063F, 0.15F, -0.6299F, 3.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.6369F, 0.0F, 0.7037F, 0.0F, -0.7854F, 0.0F));

		PartDefinition ala5_r6 = ala8.addOrReplaceChild("ala5_r6",
				CubeListBuilder.create().texOffs(38, 82).mirror()
						.addBox(-3.3358F, -0.75F, -1.2635F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.3F)).mirror(false),
				PartPose.offsetAndRotation(0.034F, 0.0F, 0.0924F, 0.0F, -1.1345F, 0.0F));

		PartDefinition LeftLeg = bone.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(74, 80)
				.addBox(-2.28F, 3.2F, -2.5F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.28F, -14.5F, 0.1F));

		PartDefinition left_lower = LeftLeg.addOrReplaceChild("left_lower", CubeListBuilder.create().texOffs(38, 91)
				.addBox(-2.28F, 1.5F, -2.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 9.9F, 0.0F));

		PartDefinition RightLeg = bone.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(84, 53)
				.addBox(-1.72F, 3.2F, -2.5F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.28F, -14.5F, 0.1F));

		PartDefinition right_lower = RightLeg.addOrReplaceChild("right_lower", CubeListBuilder.create().texOffs(54, 91)
				.addBox(-1.72F, 1.5F, -2.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 9.9F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		spin.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}