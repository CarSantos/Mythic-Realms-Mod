// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelDracula<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "dracula"), "main");
	private final ModelPart spin;
	private final ModelPart bone;
	private final ModelPart Body;
	private final ModelPart cape;
	private final ModelPart RightArm;
	private final ModelPart right_fore;
	private final ModelPart LeftArm;
	private final ModelPart left_fore;
	private final ModelPart Head;
	private final ModelPart LeftLeg;
	private final ModelPart left_lower;
	private final ModelPart RightLeg;
	private final ModelPart right_lower;

	public ModelDracula(ModelPart root) {
		this.spin = root.getChild("spin");
		this.bone = this.spin.getChild("bone");
		this.Body = this.bone.getChild("Body");
		this.cape = this.Body.getChild("cape");
		this.RightArm = this.Body.getChild("RightArm");
		this.right_fore = this.RightArm.getChild("right_fore");
		this.LeftArm = this.Body.getChild("LeftArm");
		this.left_fore = this.LeftArm.getChild("left_fore");
		this.Head = this.Body.getChild("Head");
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
				CubeListBuilder.create().texOffs(24, 16)
						.addBox(-4.0F, -11.9F, -2.4F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
						.addBox(-4.0F, -11.9F, -2.4F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(0, 46)
						.addBox(-4.0F, -0.9F, -2.4F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(32, 0)
						.addBox(-4.5F, -11.7F, -1.0F, 9.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 40)
						.addBox(-4.5F, -11.9F, -2.4F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(38, 40)
						.addBox(1.5F, -11.9F, -2.4F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, -11.4F, 0.0F));

		PartDefinition cape = Body.addOrReplaceChild("cape", CubeListBuilder.create(),
				PartPose.offset(-4.3F, -11.5F, 1.1F));

		PartDefinition Body_r1 = cape.addOrReplaceChild("Body_r1",
				CubeListBuilder.create().texOffs(0, 16).addBox(-1.2F, -13.4F, -1.4F, 11.0F, 20.0F, 1.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, 12.7F, 3.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition RightArm = Body.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(56, 8)
				.addBox(-2.8F, -1.7F, -1.9F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.3F)),
				PartPose.offset(-5.5F, -10.0F, 0.0F));

		PartDefinition right_fore = RightArm.addOrReplaceChild("right_fore", CubeListBuilder.create().texOffs(52, 28)
				.addBox(-1.4F, -2.4F, -1.9F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.2F, 3.5F, 0.0F));

		PartDefinition LeftArm = Body.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(16, 56).addBox(
				-1.2F, -1.7F, -1.9F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.3F)), PartPose.offset(5.5F, -10.0F, 0.0F));

		PartDefinition left_fore = LeftArm.addOrReplaceChild("left_fore", CubeListBuilder.create().texOffs(52, 40)
				.addBox(-2.6F, -2.4F, -1.9F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.2F, 3.5F, 0.0F));

		PartDefinition Head = Body.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -2.5F, -4.8F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(24, 32)
						.addBox(-4.0F, 3.5F, -2.8F, 8.0F, 2.0F, 6.0F, new CubeDeformation(0.4F)),
				PartPose.offset(0.0F, -17.4F, 0.0F));

		PartDefinition LeftLeg = bone.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(48, 16)
				.addBox(-2.28F, 3.2F, -2.5F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.28F, -14.5F, 0.1F));

		PartDefinition left_lower = LeftLeg.addOrReplaceChild("left_lower", CubeListBuilder.create().texOffs(52, 52)
				.addBox(-2.28F, 1.5F, -2.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(0.0F, 9.9F, 0.0F));

		PartDefinition RightLeg = bone.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 52)
				.addBox(-1.72F, 3.2F, -2.5F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.28F, -14.5F, 0.1F));

		PartDefinition right_lower = RightLeg.addOrReplaceChild("right_lower", CubeListBuilder.create().texOffs(56, 0)
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