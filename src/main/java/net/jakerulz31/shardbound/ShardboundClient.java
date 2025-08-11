package net.jakerulz31.shardbound;

import net.fabricmc.api.ClientModInitializer;
import net.jakerulz31.shardbound.gui.CustomScreen;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.text.Text;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class ShardboundClient implements ClientModInitializer {

    private static final Map<ScreenHandlerType<?>, BiFunction<ScreenHandler, Text, Screen>> registry = new HashMap<>();

    @Override
    public void onInitializeClient() {
        register(ScreenHandlerType.GENERIC_9X3, (handler, title) -> new CustomScreen(handler, MinecraftClient.getInstance().player.getInventory(), title));
    }

    public static <T extends ScreenHandler> void register(ScreenHandlerType<T> type, BiFunction<T, Text, Screen> factory) {
        registry.put(type, (BiFunction<ScreenHandler, Text, Screen>) factory);
    }

    public static Screen create(ScreenHandler handler, Text title) {
        BiFunction<ScreenHandler, Text, Screen> factory = registry.get(handler.getType());
        if (factory != null) {
            return factory.apply(handler, title);
        }
        return null;
    }
}