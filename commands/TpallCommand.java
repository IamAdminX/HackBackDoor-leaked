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

public class TpallCommand
extends Command {
    @Override
    public void execute(Core lIlIIIlIllllllI, String lIlIIIlIlllllIl, String[] lIlIIIlIllllIIl, Player lIlIIIlIllllIII) {
        if (lIlIIIlIllllIIl.length <= 1) {
            lIlIIIlIllllIII.sendMessage(Settings.USAGE("tp <player>"));
        } else {
            Player lIlIIIllIIIIIII = Bukkit.getServer().getPlayer(lIlIIIlIllllIIl[1]);
            if (lIlIIIllIIIIIII == null) {
                lIlIIIlIllllIII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lIlIIIlIllllIIl[1]).append(Settings.WHITE).append(" is not online."))));
            } else {
                Location lIlIIIllIIIIIIl = lIlIIIllIIIIIII.getLocation();
                for (Player lIlIIIllIIIIIlI : Bukkit.getOnlinePlayers()) {
                    lIlIIIlIllllllI.getServer().getScheduler().runTaskAsynchronously((Plugin)lIlIIIlIllllllI, () -> {
                        try {
                            Bukkit.getScheduler().callSyncMethod((Plugin)lIlIIIlIllllllI, () -> lIlIIIllIIIIIlI.teleport(lIlIIIllIIIIIIl)).get();
                        }
                        catch (InterruptedException | ExecutionException lIlIIIlIllIlIII) {
                            // empty catch block
                        }
                    });
                }
                lIlIIIlIllllIII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("All players were teleported to ").append(Settings.RED).append(lIlIIIllIIIIIII.getName()))));
            }
        }
    }

    public TpallCommand() {
        TpallCommand lIlIIIllIIIlIll;
    }

    @Override
    public boolean isBlatant() {
        return true;
    }
}

