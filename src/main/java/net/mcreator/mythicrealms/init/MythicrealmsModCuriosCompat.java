package net.mcreator.mythicrealms.init;

import top.theillusivec4.curios.api.type.capability.ICurio;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.CuriosCapability;

import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;

import net.minecraft.world.item.ItemStack;

import net.mcreator.mythicrealms.procedures.TechGooglesWhileBaubleIsEquippedTickProcedure;
import net.mcreator.mythicrealms.procedures.MagnetPropulsorWhileBaubleIsEquippedTickProcedure;

public class MythicrealmsModCuriosCompat {
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public void curioTick(SlotContext slotContext) {
				TechGooglesWhileBaubleIsEquippedTickProcedure.execute(slotContext.entity());
			}
		}, MythicrealmsModItems.TECH_GOOGLES_ITEM.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public void curioTick(SlotContext slotContext) {
				MagnetPropulsorWhileBaubleIsEquippedTickProcedure.execute(slotContext.entity());
			}
		}, MythicrealmsModItems.MAGNET.get());
	}
}