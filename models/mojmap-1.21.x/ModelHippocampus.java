// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelHippocampus<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "hippocampus"), "main");
	private final ModelPart Body;
	private final ModelPart Torso;
	private final ModelPart Leg3A;
	private final ModelPart Leg4A;
	private final ModelPart Tail;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart Neck;
	private final ModelPart Head;
	private final ModelPart eyes;
	private final ModelPart mouth;
	private final ModelPart Ear1;
	private final ModelPart Ear2;

	public ModelHippocampus(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Torso = this.Body.getChild("Torso");
		this.Leg3A = this.Body.getChild("Leg3A");
		this.Leg4A = this.Body.getChild("Leg4A");
		this.Tail = this.Body.getChild("Tail");
		this.tail1 = this.Tail.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.Neck = this.Body.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.eyes = this.Head.getChild("eyes");
		this.mouth = this.Head.getChild("mouth");
		this.Ear1 = this.Head.getChild("Ear1");
		this.Ear2 = this.Head.getChild("Ear2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 11.0F, 9.0F));

		PartDefinition Torso = Body.addOrReplaceChild("Torso", CubeListBuilder.create(),
				PartPose.offset(0.0F, -6.0F, -21.0F));

		PartDefinition Body_r1 = Torso
				.addOrReplaceChild("Body_r1",
						CubeListBuilder.create().texOffs(0, 29).addBox(-5.0F, -2.0F, 3.0F, 10.0F, 10.0F, 22.0F,
								new CubeDeformation(0.3F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Leg3A = Body.addOrReplaceChild("Leg3A",
				CubeListBuilder.create().texOffs(68, 99)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(92, 104)
						.addBox(-2.0F, 8.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.3F)),
				PartPose.offset(3.0F, 2.0F, -18.0F));

		PartDefinition Leg4A = Body.addOrReplaceChild("Leg4A",
				CubeListBuilder.create().texOffs(104, 55)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(104, 79)
						.addBox(-2.0F, 8.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.3F)),
				PartPose.offset(-3.0F, 2.0F, -18.0F));

		PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create(),
				PartPose.offset(-3.0F, 4.0F, 1.0F));

		PartDefinition cube_r1 = Tail.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 61).addBox(-2.0F, -19.3F, 9.1F, 10.0F, 10.0F, 16.0F,
						new CubeDeformation(-1.0F)),
				PartPose.offsetAndRotation(0.0F, 10.5F, -19.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail1 = Tail.addOrReplaceChild("tail1", CubeListBuilder.create(),
				PartPose.offset(0.0F, 3.0F, 9.0F));

		PartDefinition cube_r2 = tail1.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(52, 61).addBox(-2.0F, -15.8F, 23.1F, 10.0F, 10.0F, 16.0F,
						new CubeDeformation(-2.0F)),
				PartPose.offsetAndRotation(0.0F, 7.5F, -28.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2",
				CubeListBuilder.create().texOffs(64, 29)
						.addBox(-2.0F, -4.5F, -4.6F, 10.0F, 10.0F, 16.0F, new CubeDeformation(-3.0F)).texOffs(0, 0)
						.addBox(-5.0F, -4.5F, -1.6F, 16.0F, 10.0F, 19.0F, new CubeDeformation(-4.0F)),
				PartPose.offset(0.0F, 1.5F, 11.0F));

		PartDefinition cube_r3 = tail2.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 87).addBox(24.8F, -6.4F, 33.7F, 7.0F, 2.0F, 16.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 6.0F, -39.0F, 0.0F, -0.7418F, 0.0F));

		PartDefinition cube_r4 = tail2.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(70, 0).addBox(-31.8F, -6.4F, 33.7F, 7.0F, 2.0F, 16.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, -39.0F, 0.0F, 0.7418F, 0.0F));

		PartDefinition Neck = Body.addOrReplaceChild("Neck",
				CubeListBuilder.create().texOffs(46, 87)
						.addBox(-2.0F, -11.0F, -3.0F, 4.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(94, 87)
						.addBox(-2.0F, -11.0F, -1.0F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(84, 99)
						.addBox(-1.0F, -16.0F, 4.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(104, 70)
						.addBox(-1.0F, -18.0F, -1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -17.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Head = Neck.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(68, 87)
						.addBox(-3.0F, -5.0F, -6.0F, 6.0F, 5.0F, 7.0F, new CubeDeformation(0.1F)).texOffs(90, 18)
						.addBox(-2.0F, -5.0F, -11.0F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -11.0F, 3.2F));

		PartDefinition eyes = Head.addOrReplaceChild("eyes", CubeListBuilder.create(),
				PartPose.offset(0.0F, 28.0F, 11.0F));

		PartDefinition mouth = Head.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(70, 18).addBox(-2.0F,
				-1.0F, -5.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, -1.0F, -6.0F));

		PartDefinition Ear1 = Head
				.addOrReplaceChild("Ear1",
						CubeListBuilder.create().texOffs(82, 55).addBox(-0.3257F, -16.2745F, -4.0062F, 2.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 9.0F, 2.8F, 0.0F, 0.0F, 0.0873F));

		PartDefinition Ear2 = Head
				.addOrReplaceChild("Ear2",
						CubeListBuilder.create().texOffs(88, 55).addBox(-1.6743F, -16.2745F, -4.0062F, 2.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 9.0F, 2.8F, 0.0F, 0.0F, -0.0873F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}