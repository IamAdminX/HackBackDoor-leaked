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
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class SpamCommand
extends Command {
    public SpamCommand() {
        SpamCommand lllllllllllllIlIIlIllIIlIlllllIl;
    }

    @Override
    public void execute(Core lllllllllllllIlIIlIllIIlIlllIlIl, String lllllllllllllIlIIlIllIIlIlllIlII, String[] lllllllllllllIlIIlIllIIlIlllIIII, Player lllllllllllllIlIIlIllIIlIlllIIlI) {
        StringBuilder lllllllllllllIlIIlIllIIlIlllIIIl = new StringBuilder();
        for (int lllllllllllllIlIIlIllIIlIllllIII = 1; lllllllllllllIlIIlIllIIlIllllIII != lllllllllllllIlIIlIllIIlIlllIIII.length; ++lllllllllllllIlIIlIllIIlIllllIII) {
            lllllllllllllIlIIlIllIIlIlllIIIl.append(lllllllllllllIlIIlIllIIlIlllIIII[lllllllllllllIlIIlIllIIlIllllIII]).append(" ");
        }
        for (int lllllllllllllIlIIlIllIIlIlllIlll = 0; lllllllllllllIlIIlIllIIlIlllIlll <= 20; ++lllllllllllllIlIIlIllIIlIlllIlll) {
            Bukkit.broadcastMessage((String)ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(lllllllllllllIlIIlIllIIlIlllIIIl)));
        }
    }

    @Override
    public boolean isBlatant() {
        return true;
    }
}

