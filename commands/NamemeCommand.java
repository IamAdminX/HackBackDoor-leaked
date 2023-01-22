/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.ChatColor
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class NamemeCommand
extends Command {
    public NamemeCommand() {
        NamemeCommand llllllllllllllllIIIlIIllllllIIIl;
    }

    @Override
    public void execute(Core llllllllllllllllIIIlIIllllIlIllI, String llllllllllllllllIIIlIIllllIlIlIl, String[] llllllllllllllllIIIlIIllllIIllll, Player llllllllllllllllIIIlIIllllIIllIl) {
        if (llllllllllllllllIIIlIIllllIIllll.length <= 1) {
            llllllllllllllllIIIlIIllllIIllIl.sendMessage(Settings.USAGE("nameme <name>"));
        } else {
            StringBuilder llllllllllllllllIIIlIIllllIllIlI = new StringBuilder();
            for (int llllllllllllllllIIIlIIllllIlllII = 1; llllllllllllllllIIIlIIllllIlllII != llllllllllllllllIIIlIIllllIIllll.length; ++llllllllllllllllIIIlIIllllIlllII) {
                llllllllllllllllIIIlIIllllIllIlI.append(llllllllllllllllIIIlIIllllIIllll[llllllllllllllllIIIlIIllllIlllII]).append(" ");
            }
            llllllllllllllllIIIlIIllllIllIlI = new StringBuilder(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(llllllllllllllllIIIlIIllllIllIlI)));
            llllllllllllllllIIIlIIllllIIllIl.setDisplayName(String.valueOf(llllllllllllllllIIIlIIllllIllIlI));
            llllllllllllllllIIIlIIllllIIllIl.setCustomName(String.valueOf(llllllllllllllllIIIlIIllllIllIlI));
            llllllllllllllllIIIlIIllllIIllIl.setPlayerListName(String.valueOf(llllllllllllllllIIIlIIllllIllIlI));
            llllllllllllllllIIIlIIllllIIllIl.setCustomNameVisible(true);
            llllllllllllllllIIIlIIllllIIllIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("Your nickname is now ").append(Settings.RED).append((Object)llllllllllllllllIIIlIIllllIllIlI))));
        }
    }

    @Override
    public boolean isBlatant() {
        return true;
    }
}

