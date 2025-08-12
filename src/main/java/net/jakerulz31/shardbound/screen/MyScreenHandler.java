package net.jakerulz31.shardbound.screen;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;

public class MyScreenHandler extends ScreenHandler {
    public MyScreenHandler(int syncId, PlayerInventory playerInventory) {
        super(ModScreenHandlers.MY_SCREEN_HANDLER, syncId);
        // Add slots here if needed
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int slot) {
        return null;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return true;
    }
}
