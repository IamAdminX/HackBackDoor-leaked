/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.entity.Player;

public class GodCommand
extends Command {
    @Override
    public boolean isBlatant() {
        return true;
    }

    public GodCommand() {
        GodCommand lllllllllllllIlIIlIlIllIIlIIIIII;
    }

    @Override
    public void execute(Core lllllllllllllIlIIlIlIllIIIlllIll, String lllllllllllllIlIIlIlIllIIIlllIlI, String[] lllllllllllllIlIIlIlIllIIIlllIIl, Player lllllllllllllIlIIlIlIllIIIlllIII) {
        if (lllllllllllllIlIIlIlIllIIIlllIll.god.contains(lllllllllllllIlIIlIlIllIIIlllIII.getName())) {
            lllllllllllllIlIIlIlIllIIIlllIll.god.remove(lllllllllllllIlIIlIlIllIIIlllIII.getName());
            lllllllllllllIlIIlIlIllIIIlllIII.sendMessage(Settings.PREFIX("God mode is now disabled"));
        } else {
            lllllllllllllIlIIlIlIllIIIlllIll.god.add(lllllllllllllIlIIlIlIllIIIlllIII.getName());
            lllllllllllllIlIIlIlIllIIIlllIII.sendMessage(Settings.PREFIX("God mode is now enabled"));
        }
    }
}

