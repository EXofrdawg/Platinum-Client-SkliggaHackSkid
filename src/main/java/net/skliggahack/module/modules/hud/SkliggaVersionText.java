package net.skliggahack.module.modules.hud;

import net.minecraft.client.util.math.MatrixStack;
import net.skliggahack.event.events.RenderHudListener;
import net.skliggahack.module.Category;
import net.skliggahack.module.Module;

import static net.skliggahack.SkliggaHack.MC;

public class SkliggaVersionText extends Module implements RenderHudListener
{

	public SkliggaVersionText()
	{
		super("PlatinumVersionText", "Platinum 1.0.5", false, Category.hud);
	}

	@Override
	public void onEnable()
	{
		super.onEnable();
		eventManager.add(RenderHudListener.class, this);
	}

	@Override
	public void onDisable()
	{
		super.onDisable();
		eventManager.remove(RenderHudListener.class, this);
	}

	@Override
	public void onRenderHud(MatrixStack matrices, double partialTicks)
	{
		matrices.push();
		matrices.translate(10, 60, 0);
		MC.textRenderer.drawWithShadow(matrices, "Platinum 1.0.3", 0, 0, 0x00CC00);
		matrices.pop();
	}
}
