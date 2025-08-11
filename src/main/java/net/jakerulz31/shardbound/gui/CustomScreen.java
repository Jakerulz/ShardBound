package net.jakerulz31.shardbound.gui;


import io.github.cottonmc.cotton.gui.ValidatedSlot;
import io.github.cottonmc.cotton.gui.client.CottonClientScreen;
import io.github.cottonmc.cotton.gui.GuiDescription;
import io.github.cottonmc.cotton.gui.widget.WPanel;
import io.github.cottonmc.cotton.gui.widget.WWidget;
import io.github.cottonmc.cotton.gui.widget.data.HorizontalAlignment;
import io.github.cottonmc.cotton.gui.widget.data.Vec2i;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.text.Text;
import org.jetbrains.annotations.Nullable;

public class CustomScreen extends CottonClientScreen {
    public CustomScreen(GenericContainerScreenHandler handler, PlayerInventory inventory, Text title) {
        super(new GuiDescription(handler, inventory, title));
    }
    }