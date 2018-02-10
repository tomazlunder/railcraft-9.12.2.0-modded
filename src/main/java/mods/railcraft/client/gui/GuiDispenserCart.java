/* 
 * Copyright (c) CovertJaguar, 2014 http://railcraft.info
 * 
 * This code is the property of CovertJaguar
 * and may only be used with explicit written
 * permission unless otherwise specified on the
 * license page at http://railcraft.info/wiki/info:license.
 */
package mods.railcraft.client.gui;

import net.minecraft.entity.player.InventoryPlayer;
import mods.railcraft.common.blocks.machine.gamma.TileDispenserCart;
import mods.railcraft.common.core.RailcraftConstants;
import mods.railcraft.common.gui.containers.ContainerDispenserCart;

public class GuiDispenserCart extends TileGui
{

    private final String label;

    public GuiDispenserCart(InventoryPlayer inv, TileDispenserCart tile)
    {
        super(tile, new ContainerDispenserCart(inv, tile), RailcraftConstants.GUI_TEXTURE_FOLDER + "gui_dispenser_cart.png");
        xSize = 176;
        ySize = 140;
        label = tile.getName();
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
    {
        int sWidth = fontRendererObj.getStringWidth(label);
        int sPos = xSize / 2 - sWidth / 2;
        fontRendererObj.drawString(label, sPos, 6, 0x404040);
    }
}
