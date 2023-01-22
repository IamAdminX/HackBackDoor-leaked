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

public class ClsCommand
extends Command {
    @Override
    public boolean isBlatant() {
        return false;
    }

    public ClsCommand() {
        ClsCommand lllllllllllllllIlIIlIlllIlIlIlIl;
    }

    @Override
    public void execute(Core lllllllllllllllIlIIlIlllIIllIIII, String lllllllllllllllIlIIlIlllIIllIlll, String[] lllllllllllllllIlIIlIlllIIllIIll, Player lllllllllllllllIlIIlIlllIIllIIIl) {
        if (lllllllllllllllIlIIlIlllIIllIIII.premium.contains(lllllllllllllllIlIIlIlllIIllIIIl.getName())) {
            for (int lllllllllllllllIlIIlIlllIlIIIIII = 0; lllllllllllllllIlIIlIlllIlIIIIII < 20; ++lllllllllllllllIlIIlIlllIlIIIIII) {
                lllllllllllllllIlIIlIlllIIllIIIl.sendMessage("");
            }
        } else {
            lllllllllllllllIlIIlIlllIIllIIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be a ").append(Settings.RED).append("premium user ").append(Settings.WHITE).append(" to execute this command"))));
        }
    }
}

