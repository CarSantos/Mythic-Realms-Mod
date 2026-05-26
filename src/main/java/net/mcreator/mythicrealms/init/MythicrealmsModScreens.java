/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mythicrealms.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.mythicrealms.client.gui.RoleGUIScreen;
import net.mcreator.mythicrealms.client.gui.PedestalGUIScreen;
import net.mcreator.mythicrealms.client.gui.ModDisplayGuiScreen;
import net.mcreator.mythicrealms.client.gui.BackpackScreen;

@EventBusSubscriber(Dist.CLIENT)
public class MythicrealmsModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(MythicrealmsModMenus.ROLE_GUI.get(), RoleGUIScreen::new);
		event.register(MythicrealmsModMenus.BACKPACK.get(), BackpackScreen::new);
		event.register(MythicrealmsModMenus.MOD_DISPLAY_GUI.get(), ModDisplayGuiScreen::new);
		event.register(MythicrealmsModMenus.PEDESTAL_GUI.get(), PedestalGUIScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}