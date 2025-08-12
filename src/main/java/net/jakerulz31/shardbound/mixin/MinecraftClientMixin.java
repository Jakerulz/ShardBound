package net.jakerulz31.shardbound.mixin;

import net.jakerulz31.shardbound.client.screen.MyScreen;
import net.jakerulz31.shardbound.screen.MyScreenHandler;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class MinecraftClientMixin {

    @Inject(method = "setScreen", at = @At("HEAD"), cancellable = true)
    private void onSetScreen(Screen screen, CallbackInfo ci) {
        if (screen instanceof InventoryScreen) {
            MinecraftClient client = MinecraftClient.getInstance();
            PlayerInventory inventory = client.player.getInventory();
            Text title = screen.getTitle();

            ci.cancel(); // Cancel the vanilla inventory screen
            client.setScreen(new MyScreen(new MyScreenHandler(0, inventory), inventory, title));
        }
    }
}

