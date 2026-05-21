// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelPharaoh<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "pharaoh"), "main");
	private final ModelPart Mummy;
	private final ModelPart Head;
	private final ModelPart Capacete;
	private final ModelPart Body;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;

	public ModelPharaoh(ModelPart root) {
		this.Mummy = root.getChild("Mummy");
		this.Head = this.Mummy.getChild("Head");
		this.Capacete = this.Head.getChild("Capacete");
		this.Body = this.Mummy.getChild("Body");
		this.LeftArm = this.Mummy.getChild("LeftArm");
		this.RightArm = this.Mummy.getChild("RightArm");
		this.LeftLeg = this.Mummy.getChild("LeftLeg");
		this.RightLeg = this.Mummy.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Mummy = partdefinition.addOrReplaceChild("Mummy", CubeListBuilder.create(),
				PartPose.offset(-1.0F, 24.0F, 0.0F));

		PartDefinition Head = Mummy.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 15)
						.addBox(-4.0F, -7.0F, -4.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(-3.5F, -6.5F, -3.5F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, -24.0F, 1.0F));

		PartDefinition Capacete = Head.addOrReplaceChild("Capacete",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-8.0F, -8.0F, 1.0F, 10.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(34, 0)
						.addBox(-7.5F, -8.0F, -2.0F, 9.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 15)
						.addBox(-4.5F, -8.1F, -1.0F, 3.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(24, 62)
						.addBox(-4.5F, -8.0F, 6.1F, 3.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 62)
						.addBox(0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 25)
						.addBox(-8.0F, 0.0F, 0.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 0.0F, -3.0F));

		PartDefinition cube_r1 = Capacete
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(56, 20).addBox(-5.5F, 0.0F, 5.0F, 5.0F, 3.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Capacete.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(38, 62)
						.addBox(-4.5F, -7.1F, 0.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
						.addBox(-4.5F, -8.1F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.3F, -3.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Capacete
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(64, 31).addBox(-4.0F, -4.0F, -1.3F, 2.0F, 7.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Body = Mummy.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(28, 30)
						.addBox(-3.5F, -7.5F, -2.5F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 6)
						.addBox(-3.0F, -7.0F, -2.0F, 7.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(34, 62)
						.addBox(0.0F, -8.0F, 0.2F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, -16.5F, 1.5F));

		PartDefinition LeftArm = Mummy.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(48, 46)
						.addBox(-4.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 62)
						.addBox(-3.5F, 0.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, -24.0F, 1.0F));

		PartDefinition RightArm = Mummy.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(32, 46)
						.addBox(0.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 59)
						.addBox(0.5F, 0.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, -24.0F, 1.0F));

		PartDefinition LeftLeg = Mummy.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 43)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 6)
						.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, -12.0F, 1.0F));

		PartDefinition RightLeg = Mummy.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(16, 46)
						.addBox(-3.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 26)
						.addBox(-2.5F, 0.0F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, -12.0F, 1.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Mummy.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}