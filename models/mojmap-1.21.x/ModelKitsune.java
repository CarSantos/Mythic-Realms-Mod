// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelKitsune<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "kitsune"), "main");
	private final ModelPart bone;
	private final ModelPart tail6;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart leg0;
	private final ModelPart leg1;
	private final ModelPart leg2;
	private final ModelPart leg3;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail7;
	private final ModelPart tail3;
	private final ModelPart tail8;
	private final ModelPart tail4;
	private final ModelPart tail9;
	private final ModelPart tail5;

	public ModelKitsune(ModelPart root) {
		this.bone = root.getChild("bone");
		this.tail6 = this.bone.getChild("tail6");
		this.body = this.bone.getChild("body");
		this.head = this.bone.getChild("head");
		this.leg0 = this.bone.getChild("leg0");
		this.leg1 = this.bone.getChild("leg1");
		this.leg2 = this.bone.getChild("leg2");
		this.leg3 = this.bone.getChild("leg3");
		this.tail = this.bone.getChild("tail");
		this.tail2 = this.bone.getChild("tail2");
		this.tail7 = this.bone.getChild("tail7");
		this.tail3 = this.bone.getChild("tail3");
		this.tail8 = this.bone.getChild("tail8");
		this.tail4 = this.bone.getChild("tail4");
		this.tail9 = this.bone.getChild("tail9");
		this.tail5 = this.bone.getChild("tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(-0.125F, 12.0F, 10.5F));

		PartDefinition tail6 = bone.addOrReplaceChild("tail6",
				CubeListBuilder.create().texOffs(0, 74).addBox(-1.5F, 1.0F, -0.375F, 3.0F, 8.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 2.1872F, 0.7286F, 0.5922F));

		PartDefinition tail_r1 = tail6.addOrReplaceChild("tail_r1",
				CubeListBuilder.create().texOffs(54, 54).addBox(-1.75F, -3.75F, 9.875F, 4.0F, 10.0F, 5.0F,
						new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.0F, 13.65F, -9.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition tail_r2 = tail6.addOrReplaceChild("tail_r2",
				CubeListBuilder.create().texOffs(80, 82).addBox(-1.5F, -4.5F, 11.025F, 3.0F, 6.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.65F, -9.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition body = bone.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -4.85F, -4.65F, 9.0F, 17.0F, 9.0F,
						new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(0.125F, 0.0F, -10.5F, 1.5708F, 0.0F, 0.0F));

		PartDefinition head = bone.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 26)
						.addBox(-6.0F, -3.0F, -9.0F, 12.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(92, 36)
						.addBox(-6.0F, -8.0F, -7.5F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 93)
						.addBox(1.0F, -8.0F, -7.5F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 15)
						.addBox(-3.0F, 1.5F, -13.5F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(60, 23)
						.addBox(-3.05F, 2.95F, -13.45F, 6.0F, 3.0F, 5.0F, new CubeDeformation(-0.1F)).texOffs(60, 44)
						.addBox(-1.45F, 1.05F, -13.55F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)),
				PartPose.offset(0.125F, 0.0F, -15.0F));

		PartDefinition leg0 = bone.addOrReplaceChild("leg0", CubeListBuilder.create().texOffs(88, 44).addBox(-0.0075F,
				0.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.375F, 3.0F, -1.5F));

		PartDefinition leg1 = bone.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(88, 56).addBox(0.0075F,
				0.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(1.625F, 3.0F, -1.5F));

		PartDefinition leg2 = bone.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(92, 24).addBox(-0.0075F,
				0.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.375F, 3.0F, -12.0F));

		PartDefinition leg3 = bone.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(32, 93).addBox(0.0075F,
				0.0F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(1.625F, 3.0F, -12.0F));

		PartDefinition tail = bone
				.addOrReplaceChild("tail",
						CubeListBuilder.create().texOffs(60, 31).addBox(-1.5F, 1.0F, -0.375F, 3.0F, 8.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.25F, 0.0F, 0.0F, 2.2253F, 0.0F, 0.0F));

		PartDefinition tail_r3 = tail.addOrReplaceChild("tail_r3",
				CubeListBuilder.create().texOffs(42, 24).addBox(-2.25F, -3.75F, 9.875F, 4.0F, 10.0F, 5.0F,
						new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.0F, 13.65F, -9.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition tail_r4 = tail.addOrReplaceChild("tail_r4",
				CubeListBuilder.create().texOffs(72, 57).addBox(-1.5F, -4.5F, 11.025F, 3.0F, 6.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.65F, -9.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition tail2 = bone.addOrReplaceChild("tail2",
				CubeListBuilder.create().texOffs(36, 69).addBox(-1.5F, 1.0F, -0.375F, 3.0F, 8.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, 0.0F, 0.0F, 2.2046F, -0.2933F, -0.3479F));

		PartDefinition tail_r5 = tail2.addOrReplaceChild("tail_r5",
				CubeListBuilder.create().texOffs(42, 39).addBox(-2.25F, -3.75F, 9.875F, 4.0F, 10.0F, 5.0F,
						new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.0F, 13.65F, -9.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition tail_r6 = tail2.addOrReplaceChild("tail_r6",
				CubeListBuilder.create().texOffs(82, 13).addBox(-1.5F, -4.5F, 11.025F, 3.0F, 6.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.65F, -9.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition tail7 = bone.addOrReplaceChild("tail7",
				CubeListBuilder.create().texOffs(16, 74).addBox(-1.5F, 1.0F, -0.375F, 3.0F, 8.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 2.213F, 0.3283F, 0.3752F));

		PartDefinition tail_r7 = tail7.addOrReplaceChild("tail_r7",
				CubeListBuilder.create().texOffs(0, 59).addBox(-1.75F, -3.75F, 9.875F, 4.0F, 10.0F, 5.0F,
						new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.0F, 13.65F, -9.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition tail_r8 = tail7.addOrReplaceChild("tail_r8",
				CubeListBuilder.create().texOffs(84, 68).addBox(-1.5F, -4.5F, 11.025F, 3.0F, 6.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.65F, -9.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition tail3 = bone.addOrReplaceChild("tail3",
				CubeListBuilder.create().texOffs(52, 69).addBox(-1.5F, 1.0F, -0.375F, 3.0F, 8.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, 0.0F, 0.0F, 1.6229F, -0.1345F, -0.182F));

		PartDefinition tail_r9 = tail3.addOrReplaceChild("tail_r9",
				CubeListBuilder.create().texOffs(0, 44).addBox(-2.25F, -3.75F, 9.875F, 4.0F, 10.0F, 5.0F,
						new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.0F, 13.65F, -9.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition tail_r10 = tail3.addOrReplaceChild("tail_r10",
				CubeListBuilder.create().texOffs(32, 82).addBox(-1.5F, -4.5F, 11.025F, 3.0F, 6.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.65F, -9.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition tail8 = bone.addOrReplaceChild("tail8",
				CubeListBuilder.create().texOffs(76, 31).addBox(-1.5F, 1.0F, -0.375F, 3.0F, 8.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 1.6233F, 0.1781F, 0.1843F));

		PartDefinition tail_r11 = tail8.addOrReplaceChild("tail_r11",
				CubeListBuilder.create().texOffs(18, 59).addBox(-1.75F, -3.75F, 9.875F, 4.0F, 10.0F, 5.0F,
						new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.0F, 13.65F, -9.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition tail_r12 = tail8.addOrReplaceChild("tail_r12",
				CubeListBuilder.create().texOffs(0, 87).addBox(-1.5F, -4.5F, 11.025F, 3.0F, 6.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.65F, -9.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition tail4 = bone.addOrReplaceChild("tail4",
				CubeListBuilder.create().texOffs(68, 69).addBox(-1.5F, 1.0F, -0.375F, 3.0F, 8.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, 0.0F, 0.0F, 1.5441F, -0.6138F, -0.2068F));

		PartDefinition tail_r13 = tail4.addOrReplaceChild("tail_r13",
				CubeListBuilder.create().texOffs(18, 44).addBox(-2.25F, -3.75F, 9.875F, 4.0F, 10.0F, 5.0F,
						new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.0F, 13.65F, -9.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition tail_r14 = tail4.addOrReplaceChild("tail_r14",
				CubeListBuilder.create().texOffs(48, 82).addBox(-1.5F, -4.5F, 11.025F, 3.0F, 6.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.65F, -9.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition tail9 = bone.addOrReplaceChild("tail9",
				CubeListBuilder.create().texOffs(78, 0).addBox(-1.5F, 1.0F, -0.375F, 3.0F, 8.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 1.5432F, 0.6574F, 0.2053F));

		PartDefinition tail_r15 = tail9.addOrReplaceChild("tail_r15",
				CubeListBuilder.create().texOffs(60, 0).addBox(-1.75F, -3.75F, 9.875F, 4.0F, 10.0F, 5.0F,
						new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.0F, 13.65F, -9.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition tail_r16 = tail9.addOrReplaceChild("tail_r16",
				CubeListBuilder.create().texOffs(16, 87).addBox(-1.5F, -4.5F, 11.025F, 3.0F, 6.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.65F, -9.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition tail5 = bone.addOrReplaceChild("tail5",
				CubeListBuilder.create().texOffs(72, 44).addBox(-1.5F, 1.0F, -0.375F, 3.0F, 8.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, 0.0F, 0.0F, 2.1658F, -0.6928F, -0.5595F));

		PartDefinition tail_r17 = tail5.addOrReplaceChild("tail_r17",
				CubeListBuilder.create().texOffs(36, 54).addBox(-2.25F, -3.75F, 9.875F, 4.0F, 10.0F, 5.0F,
						new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.0F, 13.65F, -9.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition tail_r18 = tail5.addOrReplaceChild("tail_r18",
				CubeListBuilder.create().texOffs(64, 82).addBox(-1.5F, -4.5F, 11.025F, 3.0F, 6.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.65F, -9.0F, -0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}