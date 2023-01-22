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

public class BlatantCommand
extends Command {
    @Override
    public boolean isBlatant() {
        return false;
    }

    @Override
    public void execute(Core lllllllllllllIlllIlIIIIlIlllllll, String lllllllllllllIlllIlIIIIllIIIIIlI, String[] lllllllllllllIlllIlIIIIllIIIIIIl, Player lllllllllllllIlllIlIIIIllIIIIIII) {
        if (lllllllllllllIlllIlIIIIlIlllllll.blatant.contains(lllllllllllllIlllIlIIIIllIIIIIII.getName())) {
            lllllllllllllIlllIlIIIIlIlllllll.blatant.remove(lllllllllllllIlllIlIIIIllIIIIIII.getName());
            lllllllllllllIlllIlIIIIllIIIIIII.sendMessage(Settings.PREFIX("blatant mode is now disabled."));
        } else {
            lllllllllllllIlllIlIIIIlIlllllll.blatant.add(lllllllllllllIlllIlIIIIllIIIIIII.getName());
            lllllllllllllIlllIlIIIIllIIIIIII.sendMessage(Settings.PREFIX("blatant mode is now enabled!"));
        }
    }

    public BlatantCommand() {
        BlatantCommand lllllllllllllIlllIlIIIIllIIIlIII;
    }
}

