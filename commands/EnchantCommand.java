/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Material
 *  org.bukkit.enchantments.EnchantmentWrapper
 *  org.bukkit.entity.Player
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.inventory.meta.ItemMeta
 */
package me.system.runner.command.impl;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.Material;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class EnchantCommand
extends Command {
    private /* synthetic */ int level;

    @Override
    public void execute(Core lllllllllllllIIlllIIIllIIlIIlIll, String lllllllllllllIIlllIIIllIIlIIlIIl, String[] lllllllllllllIIlllIIIllIIlIIIlll, Player lllllllllllllIIlllIIIllIIlIIIIII) {
        if (lllllllllllllIIlllIIIllIIlIIIlll.length <= 2) {
            lllllllllllllIIlllIIIllIIlIIIIII.sendMessage(Settings.USAGE("enchant <enchantment> <level>"));
        } else {
            ItemStack lllllllllllllIIlllIIIllIIlIlIIlI = lllllllllllllIIlllIIIllIIlIIIIII.getItemInHand();
            if (lllllllllllllIIlllIIIllIIlIlIIlI.getType() == Material.AIR) {
                lllllllllllllIIlllIIIllIIlIIIIII.sendMessage(Settings.PREFIX("You aren't holding anything!"));
            } else {
                ItemMeta lllllllllllllIIlllIIIllIIlIlIlII = lllllllllllllIIlllIIIllIIlIlIIlI.getItemMeta();
                if (EnchantmentWrapper.getByName((String)lllllllllllllIIlllIIIllIIlIIIlll[1].toUpperCase()) == null) {
                    lllllllllllllIIlllIIIllIIlIIIIII.sendMessage(Settings.PREFIX("This enchantment wasn't found!"));
                } else {
                    EnchantCommand lllllllllllllIIlllIIIllIIlIIllIl;
                    try {
                        lllllllllllllIIlllIIIllIIlIIllIl.level = Integer.parseInt(lllllllllllllIIlllIIIllIIlIIIlll[2].toUpperCase());
                    }
                    catch (Exception lllllllllllllIIlllIIIllIIlIlIlIl) {
                        lllllllllllllIIlllIIIllIIlIIIIII.sendMessage(Settings.PREFIX("Invalid integer (Max: 32727)"));
                        return;
                    }
                    lllllllllllllIIlllIIIllIIlIlIlII.addEnchant(EnchantmentWrapper.getByName((String)lllllllllllllIIlllIIIllIIlIIIlll[1]), lllllllllllllIIlllIIIllIIlIIllIl.level, true);
                    lllllllllllllIIlllIIIllIIlIlIIlI.setItemMeta(lllllllllllllIIlllIIIllIIlIlIlII);
                    lllllllllllllIIlllIIIllIIlIIIIII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("Your item was enchanted with ").append(Settings.RED).append(lllllllllllllIIlllIIIllIIlIIIlll[1]).append(" ").append(lllllllllllllIIlllIIIllIIlIIllIl.level))));
                }
            }
        }
    }

    @Override
    public boolean isBlatant() {
        return false;
    }

    public EnchantCommand() {
        EnchantCommand lllllllllllllIIlllIIIllIIllIllIl;
    }
}

