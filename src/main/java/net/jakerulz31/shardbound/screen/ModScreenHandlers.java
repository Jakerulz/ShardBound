package net.jakerulz31.shardbound.screen;

import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;

public class ModScreenHandlers {
    public static ScreenHandlerType<MyScreenHandler> MY_SCREEN_HANDLER;

    public static void register() {
        MY_SCREEN_HANDLER = Registry.register(
                Registries.SCREEN_HANDLER,
                Identifier.of("shardbound", "my_handler"),
                new ScreenHandlerType<>(MyScreenHandler::new, FeatureFlags.VANILLA_FEATURES)
        );
    }
}