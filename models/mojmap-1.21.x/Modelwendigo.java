// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelwendigo<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "wendigo"), "main");
	private final ModelPart wendigo;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart kneck;
	private final ModelPart kneck_hair;
	private final ModelPart head;
	private final ModelPart head2;
	private final ModelPart rightAntler;
	private final ModelPart leftAntler;
	private final ModelPart jaw;
	private final ModelPart left_arm;
	private final ModelPart left_forearm;
	private final ModelPart left_arm_hair;
	private final ModelPart left_hand;
	private final ModelPart left_claws;
	private final ModelPart right_arm;
	private final ModelPart right_forearm;
	private final ModelPart right_arm_hair;
	private final ModelPart right_hand;
	private final ModelPart right_claws;
	private final ModelPart right_leg;
	private final ModelPart right_leg_part_two;
	private final ModelPart left_leg;
	private final ModelPart left_leg_part_two;

	public Modelwendigo(ModelPart root) {
		this.wendigo = root.getChild("wendigo");
		this.body = this.wendigo.getChild("body");
		this.chest = this.body.getChild("chest");
		this.kneck = this.chest.getChild("kneck");
		this.kneck_hair = this.kneck.getChild("kneck_hair");
		this.head = this.kneck.getChild("head");
		this.head2 = this.head.getChild("head2");
		this.rightAntler = this.head2.getChild("rightAntler");
		this.leftAntler = this.head2.getChild("leftAntler");
		this.jaw = this.head.getChild("jaw");
		this.left_arm = this.chest.getChild("left_arm");
		this.left_forearm = this.left_arm.getChild("left_forearm");
		this.left_arm_hair = this.left_forearm.getChild("left_arm_hair");
		this.left_hand = this.left_forearm.getChild("left_hand");
		this.left_claws = this.left_hand.getChild("left_claws");
		this.right_arm = this.chest.getChild("right_arm");
		this.right_forearm = this.right_arm.getChild("right_forearm");
		this.right_arm_hair = this.right_forearm.getChild("right_arm_hair");
		this.right_hand = this.right_forearm.getChild("right_hand");
		this.right_claws = this.right_hand.getChild("right_claws");
		this.right_leg = this.body.getChild("right_leg");
		this.right_leg_part_two = this.right_leg.getChild("right_leg_part_two");
		this.left_leg = this.body.getChild("left_leg");
		this.left_leg_part_two = this.left_leg.getChild("left_leg_part_two");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition wendigo = partdefinition.addOrReplaceChild("wendigo", CubeListBuilder.create(),
				PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition body = wendigo.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 87).addBox(-5.0F,
				-20.0F, -5.0F, 10.0F, 20.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(0, 34).addBox(-9.0F,
				-13.0F, -7.0F, 18.0F, 13.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -18.0F, 0.0F));

		PartDefinition kneck = chest.addOrReplaceChild("kneck", CubeListBuilder.create().texOffs(0, 61).addBox(-5.0F,
				-5.0F, -10.0F, 10.0F, 11.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -13.0F, -1.0F));

		PartDefinition kneck_hair = kneck.addOrReplaceChild("kneck_hair", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-5.5F, -3.0F, 0.0F, 11.0F, 14.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.0F, -11.0F));

		PartDefinition head = kneck.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(126, 70)
						.addBox(-4.0F, -6.0F, -10.0F, 8.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(82, 149)
						.addBox(-3.5F, 2.0F, -9.5F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(128, 132)
						.addBox(-2.5F, -4.0F, -18.0F, 5.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(40, 95)
						.addBox(2.0F, -9.0F, -4.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 133)
						.addBox(-4.0F, -9.0F, -4.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -8.0F));

		PartDefinition head2 = head.addOrReplaceChild("head2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 3.0F, -4.5F));

		PartDefinition head_r1 = head2.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(72, 150)
						.addBox(-1.0F, -3.2F, -2.4F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.3F)).texOffs(40, 87)
						.addBox(5.0F, -3.2F, -2.4F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(-3.0F, -16.5834F, 1.0395F, 0.48F, 0.0F, 0.0F));

		PartDefinition head_r2 = head2.addOrReplaceChild("head_r2",
				CubeListBuilder.create().texOffs(28, 125)
						.addBox(-5.0F, -24.6F, -0.8F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 117)
						.addBox(1.0F, -24.6F, -0.8F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 10.0F, 2.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightAntler = head2.addOrReplaceChild("rightAntler", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-16.2516F, -21.7653F, 5.6725F, 0.0F, 0.3054F, 0.2182F));

		PartDefinition rightAntler_r1 = rightAntler.addOrReplaceChild("rightAntler_r1",
				CubeListBuilder.create().texOffs(150, 32).addBox(-3.5666F, -1.9528F, -0.2653F, 8.0F, 2.0F, 2.0F,
						new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(1.7353F, -3.377F, 1.2329F, 0.0436F, 0.2182F, 1.789F));

		PartDefinition rightAntler_r2 = rightAntler.addOrReplaceChild("rightAntler_r2",
				CubeListBuilder.create().texOffs(128, 151).addBox(-0.8782F, -3.0751F, -2.8996F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(-0.8154F, -1.3813F, -2.5975F, -0.3054F, 0.0F, 1.1083F));

		PartDefinition rightAntler_r3 = rightAntler.addOrReplaceChild("rightAntler_r3",
				CubeListBuilder.create().texOffs(52, 145).addBox(-8.6782F, -2.0162F, -0.5661F, 12.0F, 2.0F, 3.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, 0.0F, 1.1083F));

		PartDefinition rightAntler_r4 = rightAntler.addOrReplaceChild("rightAntler_r4",
				CubeListBuilder.create().texOffs(64, 50).addBox(-0.2605F, -1.6371F, -1.7826F, 2.0F, 2.0F, 8.0F,
						new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(4.5774F, 0.4434F, -5.2584F, -0.48F, 0.2443F, 0.2793F));

		PartDefinition rightAntler_r5 = rightAntler.addOrReplaceChild("rightAntler_r5",
				CubeListBuilder.create().texOffs(64, 40).addBox(-0.1646F, -5.5478F, -0.9542F, 2.0F, 2.0F, 8.0F,
						new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(9.3021F, 5.0089F, -7.9924F, -0.48F, 0.0F, 0.2793F));

		PartDefinition rightAntler_r6 = rightAntler.addOrReplaceChild("rightAntler_r6",
				CubeListBuilder.create().texOffs(28, 139).addBox(-5.3646F, -1.6515F, -0.6864F, 14.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.6516F, 4.0937F, 0.0087F, 0.0436F, 0.0F, 0.2793F));

		PartDefinition leftAntler = head2.addOrReplaceChild("leftAntler", CubeListBuilder.create(),
				PartPose.offsetAndRotation(16.2516F, -21.7653F, 5.6725F, 0.0F, -0.3054F, -0.2182F));

		PartDefinition leftAntler_r1 = leftAntler.addOrReplaceChild("leftAntler_r1",
				CubeListBuilder.create().texOffs(150, 36).addBox(-4.4334F, -1.9528F, -0.2653F, 8.0F, 2.0F, 2.0F,
						new CubeDeformation(-0.4F)),
				PartPose.offsetAndRotation(-1.7353F, -3.377F, 1.2329F, 0.0436F, -0.2182F, -1.789F));

		PartDefinition leftAntler_r2 = leftAntler.addOrReplaceChild("leftAntler_r2",
				CubeListBuilder.create().texOffs(144, 151).addBox(-1.1218F, -3.0751F, -2.8996F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(-0.6F)),
				PartPose.offsetAndRotation(0.8154F, -1.3813F, -2.5975F, -0.3054F, 0.0F, -1.1083F));

		PartDefinition leftAntler_r3 = leftAntler.addOrReplaceChild("leftAntler_r3",
				CubeListBuilder.create().texOffs(126, 146).addBox(-3.3218F, -2.0162F, -0.5661F, 12.0F, 2.0F, 3.0F,
						new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, 0.0F, -1.1083F));

		PartDefinition leftAntler_r4 = leftAntler.addOrReplaceChild("leftAntler_r4",
				CubeListBuilder.create().texOffs(108, 151).addBox(-1.7395F, -1.6371F, -1.7826F, 2.0F, 2.0F, 8.0F,
						new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(-4.5774F, 0.4434F, -5.2584F, -0.48F, -0.2443F, -0.2793F));

		PartDefinition leftAntler_r5 = leftAntler.addOrReplaceChild("leftAntler_r5",
				CubeListBuilder.create().texOffs(52, 150).addBox(-1.8354F, -5.5478F, -0.9542F, 2.0F, 2.0F, 8.0F,
						new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(-9.3021F, 5.0089F, -7.9924F, -0.48F, 0.0F, -0.2793F));

		PartDefinition leftAntler_r6 = leftAntler.addOrReplaceChild("leftAntler_r6",
				CubeListBuilder.create().texOffs(62, 140).addBox(-8.6354F, -1.6515F, -0.6864F, 14.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.6516F, 4.0937F, 0.0087F, 0.0436F, 0.0F, -0.2793F));

		PartDefinition jaw = head.addOrReplaceChild("jaw",
				CubeListBuilder.create().texOffs(28, 144)
						.addBox(-2.0F, -2.0F, -15.0F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(100, 138)
						.addBox(-2.5F, -5.0F, -6.5F, 5.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 3.0F, -2.0F));

		PartDefinition left_arm = chest.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(100, 102).addBox(
				0.0F, -2.0F, -4.0F, 6.0F, 28.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, -10.0F, 0.0F));

		PartDefinition left_forearm = left_arm.addOrReplaceChild("left_forearm", CubeListBuilder.create()
				.texOffs(50, 61).addBox(-4.0F, 0.0F, -5.0F, 8.0F, 30.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 26.0F, 0.0F));

		PartDefinition left_arm_hair = left_forearm.addOrReplaceChild("left_arm_hair", CubeListBuilder.create(),
				PartPose.offset(4.0F, 27.0F, 0.0F));

		PartDefinition left_arm_hair_r1 = left_arm_hair.addOrReplaceChild(
				"left_arm_hair_r1", CubeListBuilder.create().texOffs(128, 88).addBox(-6.0F, -14.0F, -4.0F, 6.0F, 14.0F,
						8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition left_hand = left_forearm.addOrReplaceChild("left_hand", CubeListBuilder.create().texOffs(126, 40)
				.addBox(-4.5F, 0.0F, -5.5F, 9.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 30.0F, 0.0F));

		PartDefinition left_claws = left_hand.addOrReplaceChild("left_claws",
				CubeListBuilder.create().texOffs(100, 0)
						.addBox(-5.0F, -5.0F, 0.0F, 10.0F, 5.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(150, 8)
						.addBox(-5.0F, -10.0F, 12.0F, 10.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 8.0F, -5.5F));

		PartDefinition right_arm = chest.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(0, 117)
				.addBox(-6.0F, -2.0F, -4.0F, 6.0F, 28.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-9.0F, -10.0F, 0.0F));

		PartDefinition right_forearm = right_arm.addOrReplaceChild("right_forearm", CubeListBuilder.create()
				.texOffs(64, 0).addBox(-4.0F, 0.0F, -5.0F, 8.0F, 30.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 26.0F, 0.0F));

		PartDefinition right_arm_hair = right_forearm.addOrReplaceChild("right_arm_hair", CubeListBuilder.create(),
				PartPose.offset(-4.0F, 27.0F, 0.0F));

		PartDefinition right_arm_hair_r1 = right_arm_hair.addOrReplaceChild(
				"right_arm_hair_r1", CubeListBuilder.create().texOffs(128, 110).addBox(0.0F, -14.0F, -4.0F, 6.0F, 14.0F,
						8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition right_hand = right_forearm.addOrReplaceChild("right_hand", CubeListBuilder.create()
				.texOffs(126, 55).addBox(-4.5F, 0.0F, -5.5F, 9.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 30.0F, 0.0F));

		PartDefinition right_claws = right_hand.addOrReplaceChild("right_claws",
				CubeListBuilder.create().texOffs(100, 20)
						.addBox(-5.0F, -5.0F, 0.0F, 10.0F, 5.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(150, 24)
						.addBox(-5.0F, -10.0F, 12.0F, 10.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 8.0F, -5.5F));

		PartDefinition right_leg = body.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(86, 40)
				.addBox(-6.0F, -2.0F, -6.0F, 8.0F, 19.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 0.0F, 0.0F));

		PartDefinition right_leg_part_two = right_leg.addOrReplaceChild("right_leg_part_two", CubeListBuilder.create()
				.texOffs(40, 101).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 29.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 14.0F, 7.0F));

		PartDefinition left_leg = body.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(86, 71).addBox(
				-2.0F, -2.0F, -6.0F, 8.0F, 19.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 0.0F, 0.0F));

		PartDefinition left_leg_part_two = left_leg.addOrReplaceChild("left_leg_part_two", CubeListBuilder.create()
				.texOffs(70, 102).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 29.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 14.0F, 7.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		wendigo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}