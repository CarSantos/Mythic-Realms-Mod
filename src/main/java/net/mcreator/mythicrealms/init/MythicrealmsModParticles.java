/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mythicrealms.init;

import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.mythicrealms.client.particle.PoisonMagicParticleParticle;
import net.mcreator.mythicrealms.client.particle.MusicMagicParticleParticle;
import net.mcreator.mythicrealms.client.particle.FireMagicParticleParticle;

@EventBusSubscriber(Dist.CLIENT)
public class MythicrealmsModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(MythicrealmsModParticleTypes.FIRE_MAGIC_PARTICLE.get(), FireMagicParticleParticle::provider);
		event.registerSpriteSet(MythicrealmsModParticleTypes.MUSIC_MAGIC_PARTICLE.get(), MusicMagicParticleParticle::provider);
		event.registerSpriteSet(MythicrealmsModParticleTypes.POISON_MAGIC_PARTICLE.get(), PoisonMagicParticleParticle::provider);
	}
}