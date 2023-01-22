/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.Location
 *  org.bukkit.Material
 *  org.bukkit.entity.Player
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.scheduler.BukkitRunnable
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
import org.bukkit.scheduler.BukkitRunnable;

public class PenisCommand
extends Command {
    private static /* synthetic */ int ID;

    @Override
    public boolean isBlatant() {
        return true;
    }

    public PenisCommand() {
        PenisCommand llllllllllllllIIIlIIIIIlIIlIllll;
    }

    @Override
    public void execute(Core llllllllllllllIIIlIIIIIlIIlIIlII, String llllllllllllllIIIlIIIIIlIIlIlIII, String[] llllllllllllllIIIlIIIIIlIIlIIlll, final Player llllllllllllllIIIlIIIIIlIIlIIllI) {
        if (ID == 0) {
            PenisCommand llllllllllllllIIIlIIIIIlIIlIlIlI;
            ID = new BukkitRunnable(){
                {
                    1 lllllllllllllllIlIlIIIIIllIIlIIl;
                }

                public void run() {
                    int lllllllllllllllIlIlIIIIIlIllIIII;
                    1 lllllllllllllllIlIlIIIIIlIllIIlI;
                    int lllllllllllllllIlIlIIIIIlIlIlllI = (int)lllllllllllllllIlIlIIIIIlIllIIlI.llllllllllllllIIIlIIIIIlIIlIIllI.getLocation().getX() + (int)(Math.random() * 100.0) - 50;
                    int lllllllllllllllIlIlIIIIIlIlIllIl = (int)lllllllllllllllIlIlIIIIIlIllIIlI.llllllllllllllIIIlIIIIIlIIlIIllI.getLocation().getY() + 50;
                    int lllllllllllllllIlIlIIIIIlIlIlIll = (int)lllllllllllllllIlIlIIIIIlIllIIlI.llllllllllllllIIIlIIIIIlIIlIIllI.getLocation().getZ() + (int)(Math.random() * 100.0) - 50;
                    for (lllllllllllllllIlIlIIIIIlIllIIII = 0; lllllllllllllllIlIlIIIIIlIllIIII < 3; ++lllllllllllllllIlIlIIIIIlIllIIII) {
                        lllllllllllllllIlIlIIIIIlIllIIlI.llllllllllllllIIIlIIIIIlIIlIIllI.getWorld().spawnFallingBlock(new Location(lllllllllllllllIlIlIIIIIlIllIIlI.llllllllllllllIIIlIIIIIlIIlIIllI.getWorld(), (double)(lllllllllllllllIlIlIIIIIlIlIlllI + lllllllllllllllIlIlIIIIIlIllIIII), (double)lllllllllllllllIlIlIIIIIlIlIllIl, (double)lllllllllllllllIlIlIIIIIlIlIlIll), Material.STAINED_CLAY, (byte)6);
                    }
                    for (lllllllllllllllIlIlIIIIIlIllIIII = 1; lllllllllllllllIlIlIIIIIlIllIIII < 4; ++lllllllllllllllIlIlIIIIIlIllIIII) {
                        lllllllllllllllIlIlIIIIIlIllIIlI.llllllllllllllIIIlIIIIIlIIlIIllI.getWorld().spawnFallingBlock(new Location(lllllllllllllllIlIlIIIIIlIllIIlI.llllllllllllllIIIlIIIIIlIIlIIllI.getWorld(), (double)(lllllllllllllllIlIlIIIIIlIlIlllI + 1), (double)(lllllllllllllllIlIlIIIIIlIlIllIl + lllllllllllllllIlIlIIIIIlIllIIII), (double)lllllllllllllllIlIlIIIIIlIlIlIll), Material.STAINED_CLAY, (byte)6);
                    }
                }
            }.runTaskTimer((Plugin)llllllllllllllIIIlIIIIIlIIlIIlII, 1L, 1L).getTaskId();
            llllllllllllllIIIlIIIIIlIIlIIllI.sendMessage(Settings.PREFIX("Started penis rain"));
        } else {
            Bukkit.getScheduler().cancelTask(ID);
            ID = 0;
            llllllllllllllIIIlIIIIIlIIlIIllI.sendMessage(Settings.PREFIX("Stopped penis rain"));
        }
    }
}

