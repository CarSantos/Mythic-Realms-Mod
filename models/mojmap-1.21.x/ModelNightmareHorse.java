// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelNightmareHorse<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "nightmarehorse"), "main");
	private final ModelPart Body;
	private final ModelPart TailA;
	private final ModelPart Leg1A;
	private final ModelPart Leg2A;
	private final ModelPart Leg3A;
	private final ModelPart Leg4A;
	private final ModelPart Head;
	private final ModelPart mouth;
	private final ModelPart Ear1;
	private final ModelPart Ear2;
	private final ModelPart MuleEarL;
	private final ModelPart MuleEarR;
	private final ModelPart Neck;

	public ModelNightmareHorse(ModelPart root) {
		this.Body = root.getChild("Body");
		this.TailA = root.getChild("TailA");
		this.Leg1A = root.getChild("Leg1A");
		this.Leg2A = root.getChild("Leg2A");
		this.Leg3A = root.getChild("Leg3A");
		this.Leg4A = root.getChild("Leg4A");
		this.Head = root.getChild("Head");
		this.mouth = this.Head.getChild("mouth");
		this.Ear1 = root.getChild("Ear1");
		this.Ear2 = root.getChild("Ear2");
		this.MuleEarL = root.getChild("MuleEarL");
		this.MuleEarR = root.getChild("MuleEarR");
		this.Neck = root.getChild("Neck");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-5.0F, -8.0F, -20.0F, 10.0F, 10.0F, 22.0F, new CubeDeformation(0.3F)),
				PartPose.offset(0.0F, 11.0F, 9.0F));

		PartDefinition TailA = partdefinition
				.addOrReplaceChild("TailA",
						CubeListBuilder.create().texOffs(0, 51).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 14.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 4.0F, 11.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Leg1A = partdefinition.addOrReplaceChild("Leg1A",
				CubeListBuilder.create().texOffs(52, 57)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 24)
						.addBox(-2.0F, 7.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.3F)),
				PartPose.offset(3.0F, 13.0F, 9.0F));

		PartDefinition Leg2A = partdefinition.addOrReplaceChild("Leg2A",
				CubeListBuilder.create().texOffs(14, 61)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(68, 55)
						.addBox(-2.0F, 7.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.3F)),
				PartPose.offset(-3.0F, 13.0F, 9.0F));

		PartDefinition Leg3A = partdefinition.addOrReplaceChild("Leg3A",
				CubeListBuilder.create().texOffs(62, 32)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(68, 70)
						.addBox(-2.0F, 8.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.3F)),
				PartPose.offset(3.0F, 13.0F, -9.0F));

		PartDefinition Leg4A = partdefinition.addOrReplaceChild("Leg4A",
				CubeListBuilder.create().texOffs(64, 0)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(68, 63)
						.addBox(-2.0F, 8.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.3F)),
				PartPose.offset(-3.0F, 13.0F, -9.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(22, 32)
						.addBox(-3.0F, -5.0F, -6.0F, 6.0F, 5.0F, 7.0F, new CubeDeformation(0.1F)).texOffs(64, 15)
						.addBox(-2.0F, -5.0F, -11.0F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, -11.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition mouth = Head.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(62, 47).addBox(-2.0F,
				-30.0F, -22.0F, 4.0F, 2.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, 28.0F, 11.0F));

		PartDefinition Ear1 = partdefinition.addOrReplaceChild("Ear1",
				CubeListBuilder.create().texOffs(48, 32).addBox(-0.5F, -18.0F, 2.99F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, -8.0F, 0.5236F, 0.0F, 0.0873F));

		PartDefinition Ear2 = partdefinition.addOrReplaceChild("Ear2",
				CubeListBuilder.create().texOffs(48, 36).addBox(-1.5F, -18.0F, 2.99F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, -8.0F, 0.5236F, 0.0F, -0.0873F));

		PartDefinition MuleEarL = partdefinition.addOrReplaceChild("MuleEarL",
				CubeListBuilder.create().texOffs(0, 12).mirror()
						.addBox(-3.0F, -22.0F, 2.99F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 7.0F, -8.0F, 0.5236F, 0.0F, 0.2618F));

		PartDefinition MuleEarR = partdefinition.addOrReplaceChild("MuleEarR",
				CubeListBuilder.create().texOffs(0, 12).addBox(1.0F, -22.0F, 2.99F, 2.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, -8.0F, 0.5236F, 0.0F, -0.2618F));

		PartDefinition Neck = partdefinition.addOrReplaceChild("Neck",
				CubeListBuilder.create().texOffs(0, 32)
						.addBox(-2.0F, -11.0F, -3.0F, 4.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(22, 44)
						.addBox(-2.0F, -11.0F, -1.0F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.1F)).texOffs(40, 57)
						.addBox(-1.0F, -16.0F, 4.0F, 2.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 44)
						.addBox(-1.0F, -20.0F, -1.0F, 2.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, -8.0F, 0.5236F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		TailA.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg1A.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg2A.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg3A.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg4A.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Ear1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Ear2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		MuleEarL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		MuleEarR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Neck.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}