package net.jakerulz31.shardbound.gui.CustomInventory;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class CustomInventoryGUI extends HandledScreen<ScreenHandler> {
    private static final Identifier CUSTOM_TEXTURE;

    static {
        CUSTOM_TEXTURE = Identifier.of("shardbound", "textures/gui/container/custom_inventory.png");
    }

    public CustomInventoryGUI(ScreenHandler handler, PlayerInventory playerInventory, Text title) {
        super(handler, playerInventory, title);
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        RenderSystem.setShaderTexture(0, CUSTOM_TEXTURE);
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;
        context.drawTexture(CUSTOM_TEXTURE, x, y, 0, 0, backgroundWidth, backgroundHeight);
    }
}
