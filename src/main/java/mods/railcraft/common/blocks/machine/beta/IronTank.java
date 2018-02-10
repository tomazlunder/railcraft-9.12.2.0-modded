/* 
 * Copyright (c) CovertJaguar, 2014 http://railcraft.info
 * 
 * This code is the property of CovertJaguar
 * and may only be used with explicit written
 * permission unless otherwise specified on the
 * license page at http://railcraft.info/wiki/info:license.
 */
package mods.railcraft.common.blocks.machine.beta;

import java.util.HashSet;
import java.util.Set;
import mods.railcraft.common.plugins.forge.LocalizationPlugin;
import net.minecraft.entity.Entity;

/**
 *
 * @author CovertJaguar <http://www.railcraft.info>
 */
public class IronTank extends MetalTank {

    private final Set<Integer> tankBlocks = new HashSet<Integer>();

    public IronTank() {
        tankBlocks.add(EnumMachineBeta.TANK_IRON_WALL.ordinal());
        tankBlocks.add(EnumMachineBeta.TANK_IRON_VALVE.ordinal());
        tankBlocks.add(EnumMachineBeta.TANK_IRON_GAUGE.ordinal());
    }

    @Override
    public String getTitle() {
        return LocalizationPlugin.translate("railcraft.gui.tank.iron");
    }

    @Override
    public boolean isTankBlock(int meta) {
        return tankBlocks.contains(meta);
    }

    @Override
    public boolean isWallBlock(int meta) {
        return meta == EnumMachineBeta.TANK_IRON_WALL.ordinal();
    }

    @Override
    public float getResistance(Entity exploder) {
        return 20F;
    }
}
