package net.jakerulz31.shardbound.client.screen;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.jakerulz31.shardbound.screen.MyScreenHandler;

public class MyScreen extends HandledScreen<MyScreenHandler> {
    private static final Identifier TEXTURE =
            Identifier.of("shardbound", "textures/gui/container/my_inventory.png");

    public MyScreen(MyScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
        this.backgroundWidth = 197;
        this.backgroundHeight = 166;
        this.titleX = 8;
        this.playerInventoryTitleX = 8;
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        int x = (this.width - this.backgroundWidth) / 2;
        int y = (this.height - this.backgroundHeight) / 2;
        context.drawTexture(TEXTURE, x, y, 0f, 0f,
                this.backgroundWidth, this.backgroundHeight,
                this.backgroundWidth, this.backgroundHeight);
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);
        this.drawMouseoverTooltip(context, mouseX, mouseY);
    }
}
