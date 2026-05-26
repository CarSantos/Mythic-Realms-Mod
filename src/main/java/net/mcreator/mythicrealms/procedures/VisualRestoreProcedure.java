package net.mcreator.mythicrealms.procedures;

import net.neoforged.neoforge.client.event.RenderPlayerEvent;

import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.model.EntityModel;

public class VisualRestoreProcedure {
	public static void execute(EntityModel entityModel, RenderPlayerEvent playerRenderEvent) {
		if (entityModel == null || playerRenderEvent == null)
			return;
		((PlayerModel) entityModel).body.skipDraw = !(true);
		((PlayerModel) entityModel).hat.skipDraw = !(true);
		((PlayerModel) entityModel).head.skipDraw = !(true);
		((PlayerModel) entityModel).jacket.skipDraw = !(true);
		((PlayerModel) entityModel).leftArm.skipDraw = !(true);
		((PlayerModel) entityModel).leftLeg.skipDraw = !(true);
		((PlayerModel) entityModel).leftPants.skipDraw = !(true);
		((PlayerModel) entityModel).leftSleeve.skipDraw = !(true);
		((PlayerModel) entityModel).rightArm.skipDraw = !(true);
		((PlayerModel) entityModel).rightLeg.skipDraw = !(true);
		((PlayerModel) entityModel).rightPants.skipDraw = !(true);
		((PlayerModel) entityModel).rightSleeve.skipDraw = !(true);
	}
}