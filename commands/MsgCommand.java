/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.ChatColor
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class MsgCommand
extends Command {
    @Override
    public boolean isBlatant() {
        return false;
    }

    @Override
    public void execute(Core lIllllIIIIIIIl, String lIllllIIIIIlII, String[] lIllllIIIIIIll, Player lIllllIIIIIIlI) {
        if (lIllllIIIIIIll.length < 3) {
            lIllllIIIIIIlI.sendMessage(Settings.USAGE("msg <player> <message>"));
        } else {
            Player lIllllIIIIIlll = Bukkit.getPlayerExact((String)lIllllIIIIIIll[1]);
            if (lIllllIIIIIlll == null) {
                lIllllIIIIIIlI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lIllllIIIIIIll[1]).append(Settings.WHITE).append(" is not online"))));
            } else {
                StringBuilder lIllllIIIIlIII = new StringBuilder();
                for (int lIllllIIIIlIIl = 2; lIllllIIIIlIIl != lIllllIIIIIIll.length; ++lIllllIIIIlIIl) {
                    lIllllIIIIlIII.append(lIllllIIIIIIll[lIllllIIIIlIIl]).append(" ");
                }
                lIllllIIIIIIIl.lastMsg.put(lIllllIIIIIlll, lIllllIIIIIIlI);
                lIllllIIIIIIlI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&8[").append(Settings.WHITE).append("You to ").append(Settings.DARK_RED).append(Bukkit.getPlayer((String)lIllllIIIIIIll[1]).getName()).append("&8] &7").append((Object)lIllllIIIIlIII))));
                lIllllIIIIIlll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&8[").append(Settings.DARK_RED).append(lIllllIIIIIIlI.getName()).append(Settings.WHITE).append(" to you&8] &7").append((Object)lIllllIIIIlIII))));
            }
        }
    }

    public MsgCommand() {
        MsgCommand lIllllIIlIlIII;
    }
}

