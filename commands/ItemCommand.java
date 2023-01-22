/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Material
 *  org.bukkit.entity.Player
 *  org.bukkit.inventory.ItemStack
 */
package me.system.runner.command.impl;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ItemCommand
extends Command {
    @Override
    public void execute(Core lIlIIlIIIllII, String lIlIIlIIIlIll, String[] lIlIIlIIIlIII, Player lIlIIlIIIlIIl) {
        if (lIlIIlIIIlIII.length <= 1) {
            lIlIIlIIIlIIl.sendMessage(Settings.USAGE("i <item> <amount>"));
        } else if (Material.getMaterial((String)lIlIIlIIIlIII[1].toUpperCase()) != null) {
            ItemStack lIlIIlIIIlllI = lIlIIlIIIlIII.length <= 2 ? new ItemStack(Material.valueOf((String)lIlIIlIIIlIII[1].toUpperCase()), 1) : new ItemStack(Material.valueOf((String)lIlIIlIIIlIII[1].toUpperCase()), Integer.parseInt(lIlIIlIIIlIII[2]));
            lIlIIlIIIlIIl.getInventory().addItem(new ItemStack[]{lIlIIlIIIlllI});
        } else {
            lIlIIlIIIlIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The item ").append(Settings.RED).append(lIlIIlIIIlIII[1].toUpperCase()).append(Settings.WHITE).append(" doesn't seem to exist"))));
        }
    }

    @Override
    public boolean isBlatant() {
        return false;
    }

    public ItemCommand() {
        ItemCommand lIlIIlIIlIIlI;
    }
}

