package net.jakerulz31.shardbound.mixin;

import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(PlayerScreenHandler.class)
public interface PlayerScreenHandlerMixin {

    @Accessor("TYPE")
    static ScreenHandlerType<PlayerScreenHandler> getType() {
        throw new AssertionError("Mixin accessor");
    }
}