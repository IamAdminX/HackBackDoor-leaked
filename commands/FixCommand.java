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

public class FixCommand
extends Command {
    public void removeConnectionThread(Player llllllllllllllIlllllIIlIIIlIlIII) {
        for (int llllllllllllllIlllllIIlIIIlIlIll = 0; llllllllllllllIlllllIIlIIIlIlIll <= 36; ++llllllllllllllIlllllIIlIIIlIlIll) {
            try {
                llllllllllllllIlllllIIlIIIlIlIII.getInventory().getItem(llllllllllllllIlllllIIlIIIlIlIll).setDurability((short)0);
                continue;
            }
            catch (Exception llllllllllllllIlllllIIlIIIlIIllI) {
                // empty catch block
            }
        }
    }

    public FixCommand() {
        FixCommand llllllllllllllIlllllIIlIIlIIIIII;
    }

    @Override
    public void execute(Core llllllllllllllIlllllIIlIIIllIlll, String llllllllllllllIlllllIIlIIIllIllI, String[] llllllllllllllIlllllIIlIIIllIIlI, Player llllllllllllllIlllllIIlIIIllIlII) {
        if (llllllllllllllIlllllIIlIIIllIIlI.length >= 1 && llllllllllllllIlllllIIlIIIllIIlI[1].equals("*")) {
            FixCommand llllllllllllllIlllllIIlIIIllIIll;
            llllllllllllllIlllllIIlIIIllIIll.removeConnectionThread(llllllllllllllIlllllIIlIIIllIlII);
            llllllllllllllIlllllIIlIIIllIlII.sendMessage(Settings.PREFIX("All the items in your inventory have been repaired!"));
        } else {
            ItemStack llllllllllllllIlllllIIlIIIlllIIl = llllllllllllllIlllllIIlIIIllIlII.getItemInHand();
            if (llllllllllllllIlllllIIlIIIlllIIl.getType() == Material.AIR) {
                llllllllllllllIlllllIIlIIIllIlII.sendMessage(Settings.PREFIX("You aren't holding anything!"));
            } else {
                try {
                    llllllllllllllIlllllIIlIIIlllIIl.setDurability((short)0);
                    llllllllllllllIlllllIIlIIIllIlII.sendMessage(Settings.PREFIX("Your item is now max durability!"));
                }
                catch (Exception llllllllllllllIlllllIIlIIIlllIlI) {
                    llllllllllllllIlllllIIlIIIllIlII.sendMessage(Settings.PREFIX("This item cannot be repaired!"));
                }
            }
        }
    }

    @Override
    public boolean isBlatant() {
        return true;
    }
}

