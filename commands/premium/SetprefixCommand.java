/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl.premium;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.entity.Player;

public class SetprefixCommand
extends Command {
    @Override
    public boolean isBlatant() {
        return false;
    }

    @Override
    public void execute(Core lllllllllllllIlIIlIlllIlIlIlIlII, String lllllllllllllIlIIlIlllIlIlIlIIll, String[] lllllllllllllIlIIlIlllIlIlIlIIlI, Player lllllllllllllIlIIlIlllIlIlIlIIIl) {
        if (lllllllllllllIlIIlIlllIlIlIlIlII.premium.contains(lllllllllllllIlIIlIlllIlIlIlIIIl.getName())) {
            if (lllllllllllllIlIIlIlllIlIlIlIIlI.length <= 1) {
                lllllllllllllIlIIlIlllIlIlIlIIIl.sendMessage(Settings.USAGE("setprefix <prefix>"));
            } else {
                lllllllllllllIlIIlIlllIlIlIlIlII.prefix.put(lllllllllllllIlIIlIlllIlIlIlIIIl, lllllllllllllIlIIlIlllIlIlIlIIlI[1]);
                lllllllllllllIlIIlIlllIlIlIlIIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("Your new server chat prefix is ").append(Settings.RED).append(lllllllllllllIlIIlIlllIlIlIlIIlI[1]))));
            }
        } else {
            lllllllllllllIlIIlIlllIlIlIlIIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be an ").append(Settings.RED).append("premium ").append(Settings.WHITE).append("to execute this command"))));
        }
    }

    public SetprefixCommand() {
        SetprefixCommand lllllllllllllIlIIlIlllIlIlIllIlI;
    }
}

