package net.jakerulz31.shardbound.client;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.jakerulz31.shardbound.screen.ModScreenHandlers;
import net.jakerulz31.shardbound.client.screen.MyScreen;

public class ClientInit implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(ModScreenHandlers.MY_SCREEN_HANDLER, MyScreen::new);
    }
}