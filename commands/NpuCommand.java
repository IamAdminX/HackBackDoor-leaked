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

public class NpuCommand
extends Command {
    public NpuCommand() {
        NpuCommand lllllllllllllIllIIIIlIlllllIIllI;
    }

    @Override
    public void execute(Core lllllllllllllIllIIIIlIllllIlllll, String lllllllllllllIllIIIIlIllllIllllI, String[] lllllllllllllIllIIIIlIllllIlllIl, Player lllllllllllllIllIIIIlIllllIlllII) {
        if (lllllllllllllIllIIIIlIllllIlllIl.length <= 1) {
            lllllllllllllIllIIIIlIllllIlllII.sendMessage(Settings.USAGE("npu <player>"));
        } else {
            Player lllllllllllllIllIIIIlIlllllIIIIl = Bukkit.getServer().getPlayer(lllllllllllllIllIIIIlIllllIlllIl[1]);
            if (lllllllllllllIllIIIIlIlllllIIIIl == null) {
                lllllllllllllIllIIIIlIllllIlllII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllIllIIIIlIllllIlllIl[1]).append(Settings.WHITE).append(" is not online."))));
            } else if (lllllllllllllIllIIIIlIllllIlllll.noPickupPlayers.contains(lllllllllllllIllIIIIlIlllllIIIIl.getName())) {
                lllllllllllllIllIIIIlIllllIlllll.noPickupPlayers.remove(lllllllllllllIllIIIIlIlllllIIIIl.getName());
                lllllllllllllIllIIIIlIllllIlllII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllIllIIIIlIlllllIIIIl.getName()).append(Settings.WHITE).append(" can now pick up items"))));
            } else {
                lllllllllllllIllIIIIlIllllIlllll.noPickupPlayers.add(lllllllllllllIllIIIIlIlllllIIIIl.getName());
                lllllllllllllIllIIIIlIllllIlllII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllIllIIIIlIlllllIIIIl.getName()).append(Settings.WHITE).append(" can no longer pick up items"))));
            }
        }
    }

    @Override
    public boolean isBlatant() {
        return true;
    }
}

