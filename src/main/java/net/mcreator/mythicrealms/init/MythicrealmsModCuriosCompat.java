package net.mcreator.mythicrealms.init;

import top.theillusivec4.curios.api.type.capability.ICurio;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.CuriosCapability;

import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;

import net.minecraft.world.item.ItemStack;

import net.mcreator.mythicrealms.procedures.*;

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
		}, MythicrealmsModItems.MAGNET.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public void curioTick(SlotContext slotContext) {
				ChimeraGunWhileBaubleIsEquippedTickProcedure.execute(slotContext.entity());
			}
		}, MythicrealmsModItems.CHIMERA_GUN_ITEM.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}
		}, MythicrealmsModItems.TECH_JETPACK_ITEM.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}
		}, MythicrealmsModItems.TOMOE_RING_ITEM.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public void curioTick(SlotContext slotContext) {
				DruidAtributeProcedure.execute(slotContext.entity());
			}

			@Override
			public void onUnequip(SlotContext slotContext, ItemStack newStack) {
				BasicHumanProcedure.execute(slotContext.entity());
			}
		}, MythicrealmsModItems.DRUID_ROLE.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public void curioTick(SlotContext slotContext) {
				MonkAtributeProcedure.execute(slotContext.entity());
			}

			@Override
			public void onUnequip(SlotContext slotContext, ItemStack newStack) {
				BasicHumanProcedure.execute(slotContext.entity());
			}
		}, MythicrealmsModItems.MONK_ROLE.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public void curioTick(SlotContext slotContext) {
				SummonerAtributeProcedure.execute(slotContext.entity());
			}

			@Override
			public void onUnequip(SlotContext slotContext, ItemStack newStack) {
				BasicHumanProcedure.execute(slotContext.entity());
			}
		}, MythicrealmsModItems.SUMMONER_ROLE.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public void curioTick(SlotContext slotContext) {
				WizardAtributeProcedure.execute(slotContext.entity());
			}

			@Override
			public void onUnequip(SlotContext slotContext, ItemStack newStack) {
				BasicHumanProcedure.execute(slotContext.entity());
			}
		}, MythicrealmsModItems.WIZARD_ROLE.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public void curioTick(SlotContext slotContext) {
				AssassinAtributeProcedure.execute(slotContext.entity());
			}

			@Override
			public void onUnequip(SlotContext slotContext, ItemStack newStack) {
				BasicHumanProcedure.execute(slotContext.entity());
			}
		}, MythicrealmsModItems.ASSASSIN_ROLE.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public void curioTick(SlotContext slotContext) {
				BarbarianAtributeProcedure.execute(slotContext.entity());
			}

			@Override
			public void onUnequip(SlotContext slotContext, ItemStack newStack) {
				BasicHumanProcedure.execute(slotContext.entity());
			}
		}, MythicrealmsModItems.BARBARIAN_ROLE.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public void curioTick(SlotContext slotContext) {
				HunterAtributeProcedure.execute(slotContext.entity());
			}

			@Override
			public void onUnequip(SlotContext slotContext, ItemStack newStack) {
				BasicHumanProcedure.execute(slotContext.entity());
			}
		}, MythicrealmsModItems.HUNTER_ROLE.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public void curioTick(SlotContext slotContext) {
				InvestigatorAtributeProcedure.execute(slotContext.entity().level(), slotContext.entity().getX(), slotContext.entity().getY(), slotContext.entity().getZ(), slotContext.entity());
			}

			@Override
			public void onUnequip(SlotContext slotContext, ItemStack newStack) {
				BasicHumanProcedure.execute(slotContext.entity());
			}
		}, MythicrealmsModItems.INVESTIGATOR_ROLE.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public void curioTick(SlotContext slotContext) {
				SoldierAtributeProcedure.execute(slotContext.entity());
			}

			@Override
			public void onUnequip(SlotContext slotContext, ItemStack newStack) {
				BasicHumanProcedure.execute(slotContext.entity());
			}
		}, MythicrealmsModItems.SOLDIER_ROLE.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public void curioTick(SlotContext slotContext) {
				GiantAtributeProcedure.execute(slotContext.entity());
			}

			@Override
			public void onUnequip(SlotContext slotContext, ItemStack newStack) {
				BasicHumanProcedure.execute(slotContext.entity());
			}
		}, MythicrealmsModItems.GIANT_ROLE.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public void curioTick(SlotContext slotContext) {
				GuardianAtributeProcedure.execute(slotContext.entity());
			}

			@Override
			public void onUnequip(SlotContext slotContext, ItemStack newStack) {
				BasicHumanProcedure.execute(slotContext.entity());
			}
		}, MythicrealmsModItems.GUARDIAN_ROLE.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public void curioTick(SlotContext slotContext) {
				TankAtributeProcedure.execute(slotContext.entity());
			}

			@Override
			public void onUnequip(SlotContext slotContext, ItemStack newStack) {
				BasicHumanProcedure.execute(slotContext.entity());
			}
		}, MythicrealmsModItems.TANK_ROLE.get());
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}

			@Override
			public void curioTick(SlotContext slotContext) {
				EyeOfRaCuroisWhileBaubleIsEquippedTickProcedure.execute(slotContext.entity().level(), slotContext.entity().getX(), slotContext.entity().getY(), slotContext.entity().getZ(), slotContext.entity());
			}
		}, MythicrealmsModItems.EYE_OF_RA.get());
	}
}