// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelPandemic<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "pandemic"), "main");
	private final ModelPart bone;
	private final ModelPart body;
	private final ModelPart arms;
	private final ModelPart head_animated;
	private final ModelPart head;
	private final ModelPart brim;
	private final ModelPart nose;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public ModelPandemic(ModelPart root) {
		this.bone = root.getChild("bone");
		this.body = this.bone.getChild("body");
		this.arms = this.body.getChild("arms");
		this.head_animated = this.body.getChild("head_animated");
		this.head = this.head_animated.getChild("head");
		this.brim = this.head.getChild("brim");
		this.nose = this.head.getChild("nose");
		this.RightLeg = this.bone.getChild("RightLeg");
		this.LeftLeg = this.bone.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = bone.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 38)
				.addBox(-4.0F, -13.3116F, -6.9697F, 8.0F, 18.0F, 6.0F, new CubeDeformation(0.5F)).texOffs(16, 20)
				.addBox(-4.0F, -13.3116F, -6.9697F, 8.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -9.0F, 4.0F));

		PartDefinition arms = body.addOrReplaceChild("arms",
				CubeListBuilder.create().texOffs(40, 38)
						.addBox(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 22)
						.addBox(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 22)
						.mirror().addBox(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -11.3116F, -3.9697F, -0.7854F, 0.0F, 0.0F));

		PartDefinition head_animated = body.addOrReplaceChild("head_animated", CubeListBuilder.create(),
				PartPose.offset(0.0F, -13.3116F, -3.9697F));

		PartDefinition head = head_animated.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition brim = head
				.addOrReplaceChild("brim",
						CubeListBuilder.create().texOffs(30, 47).addBox(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 1.0F,
								new CubeDeformation(0.1F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition nose = head.addOrReplaceChild("nose", CubeListBuilder.create(),
				PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition nose_r1 = nose.addOrReplaceChild("nose_r1",
				CubeListBuilder.create().texOffs(35, 0).addBox(-1.0F, -1.5F, -2.5F, 2.0F, 4.0F, 5.0F,
						new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(0.0F, -0.7209F, -10.1511F, 0.1745F, 0.0F, 0.0F));

		PartDefinition nose_r2 = nose.addOrReplaceChild("nose_r2",
				CubeListBuilder.create().texOffs(35, 0).addBox(-1.0F, -2.4F, -2.2F, 2.0F, 4.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -6.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition RightLeg = bone.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 22)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, -12.0F, 0.0F));

		PartDefinition LeftLeg = bone.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 22).mirror()
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.0F, -12.0F, 0.0F));

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