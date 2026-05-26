/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mythicrealms.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.mythicrealms.entity.*;
import net.mcreator.mythicrealms.MythicrealmsMod;

@EventBusSubscriber
public class MythicrealmsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, MythicrealmsMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<FireballProjectileEntity>> FIREBALL_PROJECTILE = register("fireball_projectile",
			EntityType.Builder.<FireballProjectileEntity>of(FireballProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<IceballProjectileEntity>> ICEBALL_PROJECTILE = register("iceball_projectile",
			EntityType.Builder.<IceballProjectileEntity>of(IceballProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<ThunderProjectileEntity>> THUNDER_PROJECTILE = register("thunder_projectile",
			EntityType.Builder.<ThunderProjectileEntity>of(ThunderProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<GhostHorseEntity>> GHOST_HORSE = register("ghost_horse",
			EntityType.Builder.<GhostHorseEntity>of(GhostHorseEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<NightmareHorseEntity>> NIGHTMARE_HORSE = register("nightmare_horse",
			EntityType.Builder.<NightmareHorseEntity>of(NightmareHorseEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(2f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HippocampusEntity>> HIPPOCAMPUS = register("hippocampus",
			EntityType.Builder.<HippocampusEntity>of(HippocampusEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MeteorProjectileEntity>> METEOR_PROJECTILE = register("meteor_projectile",
			EntityType.Builder.<MeteorProjectileEntity>of(MeteorProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.1f, 0.1f));
	public static final DeferredHolder<EntityType<?>, EntityType<MeteorEntity>> METEOR = register("meteor",
			EntityType.Builder.<MeteorEntity>of(MeteorEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(2f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<BlackHoleEntity>> BLACK_HOLE = register("black_hole",
			EntityType.Builder.<BlackHoleEntity>of(BlackHoleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<BlackHoleProjectileEntity>> BLACK_HOLE_PROJECTILE = register("black_hole_projectile",
			EntityType.Builder.<BlackHoleProjectileEntity>of(BlackHoleProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.3f, 0.3f));
	public static final DeferredHolder<EntityType<?>, EntityType<PandemicEntity>> PANDEMIC = register("pandemic",
			EntityType.Builder.<PandemicEntity>of(PandemicEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<YetiEntity>> YETI = register("yeti",
			EntityType.Builder.<YetiEntity>of(YetiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.8f, 3.2f));
	public static final DeferredHolder<EntityType<?>, EntityType<JokerEntity>> JOKER = register("joker",
			EntityType.Builder.<JokerEntity>of(JokerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<VampireEntity>> VAMPIRE = register("vampire",
			EntityType.Builder.<VampireEntity>of(VampireEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<DraculaEntity>> DRACULA = register("dracula",
			EntityType.Builder.<DraculaEntity>of(DraculaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 2.1f));
	public static final DeferredHolder<EntityType<?>, EntityType<LavaGolemEntity>> LAVA_GOLEM = register("lava_golem",
			EntityType.Builder.<LavaGolemEntity>of(LavaGolemEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(2.6f, 3f));
	public static final DeferredHolder<EntityType<?>, EntityType<MummyEntity>> MUMMY = register("mummy",
			EntityType.Builder.<MummyEntity>of(MummyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 2f));
	public static final DeferredHolder<EntityType<?>, EntityType<PharaohEntity>> PHARAOH = register("pharaoh",
			EntityType.Builder.<PharaohEntity>of(PharaohEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 2.1f));
	public static final DeferredHolder<EntityType<?>, EntityType<EntEntity>> ENT = register("ent", EntityType.Builder.<EntEntity>of(EntEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

			.sized(2.5f, 6f));
	public static final DeferredHolder<EntityType<?>, EntityType<KitsuneEntity>> KITSUNE = register("kitsune",
			EntityType.Builder.<KitsuneEntity>of(KitsuneEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(1.5f, 1.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<SturgeonEntity>> STURGEON = register("sturgeon",
			EntityType.Builder.<SturgeonEntity>of(SturgeonEntity::new, MobCategory.WATER_AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.1f, 0.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<VenraidEntity>> VENRAID = register("venraid",
			EntityType.Builder.<VenraidEntity>of(VenraidEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(3f, 3f));
	public static final DeferredHolder<EntityType<?>, EntityType<PumpkinProjectileEntity>> PUMPKIN_PROJECTILE = register("pumpkin_projectile",
			EntityType.Builder.<PumpkinProjectileEntity>of(PumpkinProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.7f, 0.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<AngelEntity>> ANGEL = register("angel",
			EntityType.Builder.<AngelEntity>of(AngelEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DemonEntity>> DEMON = register("demon",
			EntityType.Builder.<DemonEntity>of(DemonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<WendigoEntity>> WENDIGO = register("wendigo",
			EntityType.Builder.<WendigoEntity>of(WendigoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1.5f, 2.6f));
	public static final DeferredHolder<EntityType<?>, EntityType<XochitlEntity>> XOCHITL = register("xochitl",
			EntityType.Builder.<XochitlEntity>of(XochitlEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ToxicSlimeProjetileEntity>> TOXIC_SLIME_PROJETILE = register("toxic_slime_projetile",
			EntityType.Builder.<ToxicSlimeProjetileEntity>of(ToxicSlimeProjetileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(MythicrealmsMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		GhostHorseEntity.init(event);
		NightmareHorseEntity.init(event);
		HippocampusEntity.init(event);
		BlackHoleEntity.init(event);
		PandemicEntity.init(event);
		YetiEntity.init(event);
		JokerEntity.init(event);
		VampireEntity.init(event);
		DraculaEntity.init(event);
		LavaGolemEntity.init(event);
		MummyEntity.init(event);
		PharaohEntity.init(event);
		EntEntity.init(event);
		KitsuneEntity.init(event);
		SturgeonEntity.init(event);
		VenraidEntity.init(event);
		AngelEntity.init(event);
		DemonEntity.init(event);
		WendigoEntity.init(event);
		XochitlEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(GHOST_HORSE.get(), GhostHorseEntity.createAttributes().build());
		event.put(NIGHTMARE_HORSE.get(), NightmareHorseEntity.createAttributes().build());
		event.put(HIPPOCAMPUS.get(), HippocampusEntity.createAttributes().build());
		event.put(BLACK_HOLE.get(), BlackHoleEntity.createAttributes().build());
		event.put(PANDEMIC.get(), PandemicEntity.createAttributes().build());
		event.put(YETI.get(), YetiEntity.createAttributes().build());
		event.put(JOKER.get(), JokerEntity.createAttributes().build());
		event.put(VAMPIRE.get(), VampireEntity.createAttributes().build());
		event.put(DRACULA.get(), DraculaEntity.createAttributes().build());
		event.put(LAVA_GOLEM.get(), LavaGolemEntity.createAttributes().build());
		event.put(MUMMY.get(), MummyEntity.createAttributes().build());
		event.put(PHARAOH.get(), PharaohEntity.createAttributes().build());
		event.put(ENT.get(), EntEntity.createAttributes().build());
		event.put(KITSUNE.get(), KitsuneEntity.createAttributes().build());
		event.put(STURGEON.get(), SturgeonEntity.createAttributes().build());
		event.put(VENRAID.get(), VenraidEntity.createAttributes().build());
		event.put(ANGEL.get(), AngelEntity.createAttributes().build());
		event.put(DEMON.get(), DemonEntity.createAttributes().build());
		event.put(WENDIGO.get(), WendigoEntity.createAttributes().build());
		event.put(XOCHITL.get(), XochitlEntity.createAttributes().build());
	}
}