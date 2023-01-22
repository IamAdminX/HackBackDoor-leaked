/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.ChatColor
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl.premium;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class ThemeCommand
extends Command {
    public ThemeCommand() {
        ThemeCommand llllllllllllllllIIIlIIIIIIIlIlII;
    }

    @Override
    public void execute(Core llllllllllllllllIIIlIIIIIIIIllII, String llllllllllllllllIIIlIIIIIIIIlIll, String[] llllllllllllllllIIIlIIIIIIIIIlll, Player llllllllllllllllIIIlIIIIIIIIlIIl) {
        if (llllllllllllllllIIIlIIIIIIIIllII.premium.contains(llllllllllllllllIIIlIIIIIIIIlIIl.getName())) {
            if (llllllllllllllllIIIlIIIIIIIIIlll.length <= 1) {
                llllllllllllllllIIIlIIIIIIIIlIIl.sendMessage(Settings.USAGE("theme <blue | green | red | gold | purple>"));
            } else {
                String llllllllllllllllIIIlIIIIIIIIlllI = llllllllllllllllIIIlIIIIIIIIIlll[1];
                if (llllllllllllllllIIIlIIIIIIIIlllI.equalsIgnoreCase("red")) {
                    Settings.RED = ChatColor.translateAlternateColorCodes((char)'&', (String)"&c");
                    Settings.DARK_RED = ChatColor.translateAlternateColorCodes((char)'&', (String)"&4");
                    llllllllllllllllIIIlIIIIIIIIlIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("Colour theme has been set to ").append(Settings.RED).append("RED"))));
                } else if (llllllllllllllllIIIlIIIIIIIIlllI.equalsIgnoreCase("blue")) {
                    Settings.DARK_RED = ChatColor.translateAlternateColorCodes((char)'&', (String)"&9");
                    Settings.RED = ChatColor.translateAlternateColorCodes((char)'&', (String)"&b");
                    llllllllllllllllIIIlIIIIIIIIlIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("Colour theme has been set to ").append(Settings.RED).append("BLUE"))));
                } else if (llllllllllllllllIIIlIIIIIIIIlllI.equalsIgnoreCase("green")) {
                    Settings.DARK_RED = ChatColor.translateAlternateColorCodes((char)'&', (String)"&2");
                    Settings.RED = ChatColor.translateAlternateColorCodes((char)'&', (String)"&a");
                    llllllllllllllllIIIlIIIIIIIIlIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("Colour theme has been set to ").append(Settings.RED).append("GREEN"))));
                } else if (llllllllllllllllIIIlIIIIIIIIlllI.equalsIgnoreCase("gold")) {
                    Settings.DARK_RED = ChatColor.translateAlternateColorCodes((char)'&', (String)"&6");
                    Settings.RED = ChatColor.translateAlternateColorCodes((char)'&', (String)"&e");
                    llllllllllllllllIIIlIIIIIIIIlIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("Colour theme has been set to ").append(Settings.RED).append("GOLD"))));
                } else if (llllllllllllllllIIIlIIIIIIIIlllI.equalsIgnoreCase("purple")) {
                    Settings.DARK_RED = ChatColor.translateAlternateColorCodes((char)'&', (String)"&5");
                    Settings.RED = ChatColor.translateAlternateColorCodes((char)'&', (String)"&d");
                    llllllllllllllllIIIlIIIIIIIIlIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("Colour theme has been set to ").append(Settings.RED).append("PURPLE"))));
                } else if (llllllllllllllllIIIlIIIIIIIIlllI.equalsIgnoreCase("white")) {
                    Settings.DARK_RED = ChatColor.translateAlternateColorCodes((char)'&', (String)"&f");
                    Settings.RED = ChatColor.translateAlternateColorCodes((char)'&', (String)"&7");
                    llllllllllllllllIIIlIIIIIIIIlIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("Colour theme has been set to ").append(Settings.RED).append("WHITE"))));
                } else {
                    llllllllllllllllIIIlIIIIIIIIlIIl.sendMessage(Settings.USAGE("theme <blue | green | red | gold | purple>"));
                }
            }
        } else {
            llllllllllllllllIIIlIIIIIIIIlIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be a ").append(Settings.RED).append("premium user ").append(Settings.WHITE).append(" to execute this command"))));
        }
    }

    @Override
    public boolean isBlatant() {
        return false;
    }
}

