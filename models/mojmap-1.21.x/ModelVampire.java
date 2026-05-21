// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelVampire<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "vampire"), "main");
	private final ModelPart bone;
	private final ModelPart head;
	private final ModelPart Body;
	private final ModelPart leftarm;
	private final ModelPart rightarm;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;

	public ModelVampire(ModelPart root) {
		this.bone = root.getChild("bone");
		this.head = this.bone.getChild("head");
		this.Body = this.bone.getChild("Body");
		this.leftarm = this.Body.getChild("leftarm");
		this.rightarm = this.Body.getChild("rightarm");
		this.LeftLeg = this.Body.getChild("LeftLeg");
		this.RightLeg = this.Body.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, 4.0F, 0.0F));

		PartDefinition head = bone.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(24, 50)
						.addBox(-4.0F, -3.7F, -6.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 18)
						.addBox(-7.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.0F, 3.0F));

		PartDefinition Body = bone.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-7.5F, 0.0F, 0.0F, 9.0F, 20.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-7.0F, 0.0F, 1.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition leftarm = Body.addOrReplaceChild("leftarm", CubeListBuilder.create(),
				PartPose.offset(0.0F, 2.0F, 1.0F));

		PartDefinition cube_r1 = leftarm.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(36, 49)
						.addBox(1.0F, 1.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 0)
						.addBox(-3.0F, -4.0F, -1.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 2.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition rightarm = Body.addOrReplaceChild("rightarm", CubeListBuilder.create(),
				PartPose.offset(-6.0F, 2.0F, 1.0F));

		PartDefinition cube_r2 = rightarm.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(46, 13)
						.addBox(-5.0F, 1.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 36)
						.addBox(-1.0F, -4.0F, -1.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 2.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition LeftLeg = Body.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(24, 36).addBox(
				-1.0F, 0.0F, 1.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 12.0F, 0.0F));

		PartDefinition RightLeg = Body.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(30, 0).addBox(
				-3.0F, 0.0F, -1.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.0F, 2.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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