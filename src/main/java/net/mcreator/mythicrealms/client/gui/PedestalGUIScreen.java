package net.mcreator.mythicrealms.client.gui;

import net.neoforged.neoforge.client.network.ClientPacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.mythicrealms.world.inventory.PedestalGUIMenu;
import net.mcreator.mythicrealms.network.PedestalGUIButtonMessage;
import net.mcreator.mythicrealms.init.MythicrealmsModScreens;

public class PedestalGUIScreen extends AbstractContainerScreen<PedestalGUIMenu> implements MythicrealmsModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private Button button_rit;

	public PedestalGUIScreen(PedestalGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("mythicrealms:textures/screens/pedestal_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("mythicrealms:textures/screens/arrow1.png"), this.leftPos + 80, this.topPos + 29, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("mythicrealms:textures/screens/centri1.png"), this.leftPos + 53, this.topPos + 47, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("mythicrealms:textures/screens/centri2.png"), this.leftPos + 16, this.topPos + 47, 0, 0, 16, 16, 16, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("mythicrealms:textures/screens/pedestal_craft.png"), this.leftPos + 80, this.topPos + 29, 0, 0, 16, 16, 16, 128);
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		button_rit = Button.builder(Component.translatable("gui.mythicrealms.pedestal_gui.button_rit"), e -> {
			int x = PedestalGUIScreen.this.x;
			int y = PedestalGUIScreen.this.y;
			if (true) {
				ClientPacketDistributor.sendToServer(new PedestalGUIButtonMessage(0, x, y, z));
				PedestalGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 107, this.topPos + 56, 40, 20).build();
		this.addRenderableWidget(button_rit);
	}
}