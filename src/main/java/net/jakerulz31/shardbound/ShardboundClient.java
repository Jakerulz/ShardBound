package net.jakerulz31.shardbound;

import net.fabricmc.api.ClientModInitializer;
import net.jakerulz31.shardbound.gui.CustomInventoryScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.jakerulz31.shardbound.mixin.PlayerScreenHandlerMixin;

public class ShardboundClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(PlayerScreenHandlerMixin.getType(), CustomInventoryScreen::new);

    }
}
