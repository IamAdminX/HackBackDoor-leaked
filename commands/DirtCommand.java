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

public class DirtCommand
extends Command {
    public DirtCommand() {
        DirtCommand lllllllllllllIIlllIlIIIlIlllIllI;
    }

    @Override
    public boolean isBlatant() {
        return true;
    }

    @Override
    public void execute(Core lllllllllllllIIlllIlIIIlIllIIlll, String lllllllllllllIIlllIlIIIlIllIIllI, String[] lllllllllllllIIlllIlIIIlIllIIlIl, Player lllllllllllllIIlllIlIIIlIllIIlII) {
        if (lllllllllllllIIlllIlIIIlIllIIlIl.length <= 1) {
            lllllllllllllIIlllIlIIIlIllIIlII.sendMessage(Settings.USAGE("dirt <player>"));
        } else {
            Player lllllllllllllIIlllIlIIIlIllIlIIl = Bukkit.getServer().getPlayer(lllllllllllllIIlllIlIIIlIllIIlIl[1]);
            if (lllllllllllllIIlllIlIIIlIllIlIIl == null) {
                lllllllllllllIIlllIlIIIlIllIIlII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllIIlllIlIIIlIllIIlIl[1]).append(Settings.WHITE).append(" is not online."))));
            } else if (lllllllllllllIIlllIlIIIlIllIIlll.forceDirtPlayers.contains(lllllllllllllIIlllIlIIIlIllIlIIl.getName())) {
                lllllllllllllIIlllIlIIIlIllIIlll.forceDirtPlayers.remove(lllllllllllllIIlllIlIIIlIllIIlII.getName());
                lllllllllllllIIlllIlIIIlIllIIlII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllIIlllIlIIIlIllIlIIl.getName()).append(Settings.WHITE).append(" can now place whatever they like"))));
            } else {
                lllllllllllllIIlllIlIIIlIllIIlll.forceDirtPlayers.add(lllllllllllllIIlllIlIIIlIllIlIIl.getName());
                lllllllllllllIIlllIlIIIlIllIIlII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllIIlllIlIIIlIllIlIIl.getName()).append(Settings.WHITE).append(" can now only place dirt"))));
            }
        }
    }
}

