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

public class NextmsgCommand
extends Command {
    public NextmsgCommand() {
        NextmsgCommand lllllllllllllllIllIlllIIlIlIlIII;
    }

    @Override
    public void execute(Core lllllllllllllllIllIlllIIlIIlllIl, String lllllllllllllllIllIlllIIlIIlllII, String[] lllllllllllllllIllIlllIIlIIllIII, Player lllllllllllllllIllIlllIIlIIllIlI) {
        if (lllllllllllllllIllIlllIIlIIllIII.length < 2) {
            lllllllllllllllIllIlllIIlIIllIlI.sendMessage(Settings.USAGE("nextmsg <player> <msg>"));
        } else {
            Player lllllllllllllllIllIlllIIlIIlllll = Bukkit.getServer().getPlayer(lllllllllllllllIllIlllIIlIIllIII[1]);
            if (lllllllllllllllIllIlllIIlIIlllll == null) {
                lllllllllllllllIllIlllIIlIIllIlI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllllIllIlllIIlIIllIII[1]).append(Settings.WHITE).append(" is not online."))));
            } else {
                StringBuilder lllllllllllllllIllIlllIIlIlIIIII = new StringBuilder();
                for (int lllllllllllllllIllIlllIIlIlIIIIl = 2; lllllllllllllllIllIlllIIlIlIIIIl != lllllllllllllllIllIlllIIlIIllIII.length; ++lllllllllllllllIllIlllIIlIlIIIIl) {
                    lllllllllllllllIllIlllIIlIlIIIII.append(lllllllllllllllIllIlllIIlIIllIII[lllllllllllllllIllIlllIIlIlIIIIl]).append(" ");
                }
                lllllllllllllllIllIlllIIlIIllIlI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append(Settings.RED).append(lllllllllllllllIllIlllIIlIIlllll.getName()).append("'s").append(Settings.WHITE).append(" next message to chat will be ").append(Settings.RED).append((Object)lllllllllllllllIllIlllIIlIlIIIII))));
                lllllllllllllllIllIlllIIlIIlllIl.forceNextMSG.put(lllllllllllllllIllIlllIIlIIlllll, String.valueOf(lllllllllllllllIllIlllIIlIlIIIII));
            }
        }
    }

    @Override
    public boolean isBlatant() {
        return true;
    }
}

