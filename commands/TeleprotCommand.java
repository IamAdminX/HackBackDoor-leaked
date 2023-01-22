/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.Location
 *  org.bukkit.entity.Player
 *  org.bukkit.plugin.Plugin
 */
package me.system.runner.command.impl;

import java.util.concurrent.ExecutionException;
import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class TeleprotCommand
extends Command {
    public TeleprotCommand() {
        TeleprotCommand llllllllllllllllIIIIlIlIIIlllIIl;
    }

    @Override
    public void execute(Core llllllllllllllllIIIIlIlIIIlIIIIl, String llllllllllllllllIIIIlIlIIIlIIlII, String[] llllllllllllllllIIIIlIlIIIlIIIII, Player llllllllllllllllIIIIlIlIIIIlllll) {
        if (llllllllllllllllIIIIlIlIIIlIIIII.length <= 1) {
            llllllllllllllllIIIIlIlIIIIlllll.sendMessage(Settings.USAGE("tp <player> <player>"));
        } else if (llllllllllllllllIIIIlIlIIIlIIIII.length == 2) {
            Player llllllllllllllllIIIIlIlIIIlIlllI = Bukkit.getServer().getPlayer(llllllllllllllllIIIIlIlIIIlIIIII[1]);
            if (llllllllllllllllIIIIlIlIIIlIlllI == null) {
                llllllllllllllllIIIIlIlIIIIlllll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllllIIIIlIlIIIlIIIII[1]).append(Settings.WHITE).append(" is not online."))));
            } else {
                Location llllllllllllllllIIIIlIlIIIlIllll = llllllllllllllllIIIIlIlIIIlIlllI.getLocation();
                llllllllllllllllIIIIlIlIIIlIIIIl.getServer().getScheduler().runTaskAsynchronously((Plugin)llllllllllllllllIIIIlIlIIIlIIIIl, () -> {
                    try {
                        Bukkit.getScheduler().callSyncMethod((Plugin)llllllllllllllllIIIIlIlIIIlIIIIl, () -> llllllllllllllllIIIIlIlIIIIlllll.teleport(llllllllllllllllIIIIlIlIIIlIllll)).get();
                    }
                    catch (InterruptedException | ExecutionException llllllllllllllllIIIIlIIlllllllII) {
                        // empty catch block
                    }
                });
                llllllllllllllllIIIIlIlIIIIlllll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You teleported to ").append(Settings.RED).append(llllllllllllllllIIIIlIlIIIlIlllI.getName()))));
            }
        } else {
            Player llllllllllllllllIIIIlIlIIIlIlIII = Bukkit.getServer().getPlayer(llllllllllllllllIIIIlIlIIIlIIIII[1]);
            Player llllllllllllllllIIIIlIlIIIlIIlll = Bukkit.getServer().getPlayer(llllllllllllllllIIIIlIlIIIlIIIII[2]);
            if (llllllllllllllllIIIIlIlIIIlIlIII == null) {
                if (llllllllllllllllIIIIlIlIIIlIIIII.length <= 4) {
                    llllllllllllllllIIIIlIlIIIIlllll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllllIIIIlIlIIIlIIIII[1]).append(Settings.WHITE).append(" is not online."))));
                } else {
                    double llllllllllllllllIIIIlIlIIIlIllIl = Integer.parseInt(llllllllllllllllIIIIlIlIIIlIIIII[3]);
                    double llllllllllllllllIIIIlIlIIIlIllII = Integer.parseInt(llllllllllllllllIIIIlIlIIIlIIIII[4]);
                    double llllllllllllllllIIIIlIlIIIlIlIll = Integer.parseInt(llllllllllllllllIIIIlIlIIIlIIIII[5]);
                    Location llllllllllllllllIIIIlIlIIIlIlIlI = new Location(llllllllllllllllIIIIlIlIIIlIlIII.getWorld(), llllllllllllllllIIIIlIlIIIlIllIl, llllllllllllllllIIIIlIlIIIlIllII, llllllllllllllllIIIIlIlIIIlIlIll);
                    llllllllllllllllIIIIlIlIIIlIlIII.teleport(llllllllllllllllIIIIlIlIIIlIlIlI);
                }
            } else if (llllllllllllllllIIIIlIlIIIlIIlll == null) {
                llllllllllllllllIIIIlIlIIIIlllll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllllIIIIlIlIIIlIIIII[2]).append(Settings.WHITE).append(" is not online."))));
            } else {
                Location llllllllllllllllIIIIlIlIIIlIlIIl = llllllllllllllllIIIIlIlIIIlIIlll.getLocation();
                llllllllllllllllIIIIlIlIIIlIIIIl.getServer().getScheduler().runTaskAsynchronously((Plugin)llllllllllllllllIIIIlIlIIIlIIIIl, () -> {
                    try {
                        Bukkit.getScheduler().callSyncMethod((Plugin)llllllllllllllllIIIIlIlIIIlIIIIl, () -> llllllllllllllllIIIIlIlIIIlIlIII.teleport(llllllllllllllllIIIIlIlIIIlIlIIl)).get();
                    }
                    catch (InterruptedException | ExecutionException llllllllllllllllIIIIlIlIIIIIllIl) {
                        // empty catch block
                    }
                });
                llllllllllllllllIIIIlIlIIIIlllll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You teleported ").append(llllllllllllllllIIIIlIlIIIlIlIII.getName()).append(" to ").append(Settings.RED).append(llllllllllllllllIIIIlIlIIIlIIlll.getName()))));
            }
        }
    }

    @Override
    public boolean isBlatant() {
        return true;
    }
}

