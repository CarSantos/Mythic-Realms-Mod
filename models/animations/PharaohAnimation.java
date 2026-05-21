// Save this class in your mod and generate all required imports

/**
 * Made with Blockbench 5.0.7 Exported for Minecraft version 1.19 or later with
 * Mojang mappings
 * 
 * @author Author
 */
public class PharaohAnimation {
	public static final AnimationDefinition idle = AnimationDefinition.Builder.withLength(2.0F).looping()
			.addAnimation("Mummy",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("Head",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -7.5F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.0F, KeyframeAnimations.degreeVec(5.0F, 0.0F, -7.5F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -7.5F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("RightLeg",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.4583F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -2.5F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5417F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("Body",
					new AnimationChannel(AnimationChannel.Targets.SCALE,
							new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.0F, KeyframeAnimations.scaleVec(1.1F, 1.0F, 1.2F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("LeftArm",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 5.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("RightArm",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -5.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.build();

	public static final AnimationDefinition walk = AnimationDefinition.Builder.withLength(0.8333F).looping()
			.addAnimation("Mummy",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("Head",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 7.5F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -5.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.8333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 7.5F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("RightLeg",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(-9.9907F, -0.434F, -2.4621F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.2917F, KeyframeAnimations.degreeVec(7.7727F, 0.3383F, -2.477F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.5417F, KeyframeAnimations.degreeVec(-9.9907F, -0.434F, -2.4621F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.8333F, KeyframeAnimations.degreeVec(7.7727F, 0.3383F, -2.477F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("LeftArm",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(-52.226F, 0.9068F, 7.0085F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.4583F, KeyframeAnimations.degreeVec(-18.9344F, 10.7492F, 14.764F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.8333F, KeyframeAnimations.degreeVec(-52.226F, 0.9068F, 7.0085F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("RightArm",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(-29.9764F, -1.2497F, -2.1654F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.4583F, KeyframeAnimations.degreeVec(-51.0534F, -4.465F, -15.5786F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.8333F, KeyframeAnimations.degreeVec(-29.9764F, -1.2497F, -2.1654F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("LeftLeg",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(9.9627F, -0.8672F, 4.9244F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.2917F, KeyframeAnimations.degreeVec(-9.9907F, 0.434F, 2.4621F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.5417F, KeyframeAnimations.degreeVec(9.9627F, -0.8672F, 4.9244F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.8333F, KeyframeAnimations.degreeVec(-9.9907F, 0.434F, 2.4621F),
									AnimationChannel.Interpolations.LINEAR)))
			.build();

	public static final AnimationDefinition attack = AnimationDefinition.Builder.withLength(1.0F)
			.addAnimation("Mummy",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.3333F, KeyframeAnimations.degreeVec(5.7686F, 29.8742F, 2.8807F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("Mummy",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("Head",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.5F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("Head",
					new AnimationChannel(AnimationChannel.Targets.SCALE,
							new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.075F, 1.075F, 1.075F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("LeftArm",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(-65.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.3333F, KeyframeAnimations.degreeVec(-146.863F, 24.7575F, -61.0086F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5F, KeyframeAnimations.degreeVec(-20.2944F, -23.421F, 2.825F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.9583F, KeyframeAnimations.degreeVec(-65.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("LeftArm",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("RightArm",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(-65.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.3333F, KeyframeAnimations.degreeVec(-100.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5F, KeyframeAnimations.degreeVec(-23.89F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1.0F, KeyframeAnimations.degreeVec(-65.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("RightArm",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("Cape",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.0F, KeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.build();
}