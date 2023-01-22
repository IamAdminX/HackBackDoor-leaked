/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.ChatColor
 *  org.bukkit.Material
 *  org.bukkit.entity.Player
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.inventory.meta.ItemMeta
 */
package me.system.runner.command.impl;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class RenameCommand
extends Command {
    @Override
    public void execute(Core lllllllllllllIlIIIlllllIlIIIllIl, String lllllllllllllIlIIIlllllIlIIIlIll, String[] lllllllllllllIlIIIlllllIlIIIIlII, Player lllllllllllllIlIIIlllllIlIIIIllI) {
        ItemStack lllllllllllllIlIIIlllllIlIIIIlIl = lllllllllllllIlIIIlllllIlIIIIllI.getItemInHand();
        if (lllllllllllllIlIIIlllllIlIIIIlIl.getType() == Material.AIR) {
            lllllllllllllIlIIIlllllIlIIIIllI.sendMessage(Settings.PREFIX("You aren't holding anything!"));
        } else {
            StringBuilder lllllllllllllIlIIIlllllIlIIlIIll = new StringBuilder();
            for (int lllllllllllllIlIIIlllllIlIIlIlIl = 1; lllllllllllllIlIIIlllllIlIIlIlIl != lllllllllllllIlIIIlllllIlIIIIlII.length; ++lllllllllllllIlIIIlllllIlIIlIlIl) {
                lllllllllllllIlIIIlllllIlIIlIIll.append(lllllllllllllIlIIIlllllIlIIIIlII[lllllllllllllIlIIIlllllIlIIlIlIl]).append(" ");
            }
            ItemMeta lllllllllllllIlIIIlllllIlIIlIIIl = lllllllllllllIlIIIlllllIlIIIIlIl.getItemMeta();
            if (lllllllllllllIlIIIlllllIlIIlIIIl != null) {
                lllllllllllllIlIIIlllllIlIIlIIIl.setDisplayName(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(lllllllllllllIlIIIlllllIlIIlIIll)));
                lllllllllllllIlIIIlllllIlIIIIlIl.setItemMeta(lllllllllllllIlIIIlllllIlIIlIIIl);
                lllllllllllllIlIIIlllllIlIIIIllI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The new name has been set to ").append(Settings.RED).append((Object)lllllllllllllIlIIIlllllIlIIlIIll))));
            }
        }
    }

    @Override
    public boolean isBlatant() {
        return true;
    }

    public RenameCommand() {
        RenameCommand lllllllllllllIlIIIlllllIlIlIIlIl;
    }
}

