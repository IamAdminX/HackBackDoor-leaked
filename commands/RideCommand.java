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

public class RideCommand
extends Command {
    @Override
    public boolean isBlatant() {
        return true;
    }

    @Override
    public void execute(Core lllllllllllllIllIlllIIlllIllIllI, String lllllllllllllIllIlllIIlllIllIlII, String[] lllllllllllllIllIlllIIlllIlIllll, Player lllllllllllllIllIlllIIlllIlIlllI) {
        if (lllllllllllllIllIlllIIlllIlIllll.length <= 1) {
            lllllllllllllIllIlllIIlllIlIlllI.sendMessage(Settings.USAGE("ride <player>"));
        } else {
            Player lllllllllllllIllIlllIIlllIlllIIl = Bukkit.getServer().getPlayer(lllllllllllllIllIlllIIlllIlIllll[1]);
            if (lllllllllllllIllIlllIIlllIlllIIl == null) {
                lllllllllllllIllIlllIIlllIlIlllI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllIllIlllIIlllIlIllll[1]).append(Settings.WHITE).append(" is not online."))));
            } else if (lllllllllllllIllIlllIIlllIlllIIl.getName().equals(lllllllllllllIllIlllIIlllIlIlllI.getName())) {
                lllllllllllllIllIlllIIlllIlIlllI.sendMessage(Settings.PREFIX("You cannot ride yourself!"));
            } else {
                lllllllllllllIllIlllIIlllIlllIIl.setPassenger((Entity)lllllllllllllIllIlllIIlllIlIlllI);
                lllllllllllllIllIlllIIlllIlIlllI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You are now riding ").append(Settings.RED).append(lllllllllllllIllIlllIIlllIlllIIl.getName()))));
            }
        }
    }

    public RideCommand() {
        RideCommand lllllllllllllIllIlllIIlllllIIIlI;
    }
}

