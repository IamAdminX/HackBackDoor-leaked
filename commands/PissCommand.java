/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.Material
 *  org.bukkit.entity.Player
 *  org.bukkit.util.Vector
 */
package me.system.runner.command.impl;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class PissCommand
extends Command {
    @Override
    public boolean isBlatant() {
        return true;
    }

    public PissCommand() {
        PissCommand llllllllllllllllIlIlIIIlIIIIllIl;
    }

    @Override
    public void execute(Core llllllllllllllllIlIlIIIlIIIIIlII, String llllllllllllllllIlIlIIIlIIIIIIll, String[] llllllllllllllllIlIlIIIIllllllll, Player llllllllllllllllIlIlIIIlIIIIIIIl) {
        if (llllllllllllllllIlIlIIIIllllllll.length <= 1) {
            llllllllllllllllIlIlIIIlIIIIIIIl.sendMessage(Settings.USAGE("piss <player> <block>"));
        } else {
            Player llllllllllllllllIlIlIIIlIIIIIllI = Bukkit.getServer().getPlayer(llllllllllllllllIlIlIIIIllllllll[1]);
            if (llllllllllllllllIlIlIIIlIIIIIllI == null) {
                llllllllllllllllIlIlIIIlIIIIIIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllllIlIlIIIIllllllll[1]).append(Settings.WHITE).append(" is not online."))));
            } else if (llllllllllllllllIlIlIIIlIIIIIlII.scaffoldingPlayers.contains(llllllllllllllllIlIlIIIlIIIIIIIl.getName())) {
                llllllllllllllllIlIlIIIlIIIIIlII.scaffoldingPlayers.remove(llllllllllllllllIlIlIIIlIIIIIllI.getName());
                llllllllllllllllIlIlIIIlIIIIIllI.setVelocity(new Vector(0.0, 0.5, 0.0));
                llllllllllllllllIlIlIIIlIIIIIIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllllIlIlIIIlIIIIIllI.getName()).append(Settings.WHITE).append(" is no longer pissing"))));
            } else if (!llllllllllllllllIlIlIIIlIIIIIlII.scaffoldingPlayers.contains(llllllllllllllllIlIlIIIlIIIIIIIl.getName())) {
                if (llllllllllllllllIlIlIIIIllllllll.length <= 2) {
                    llllllllllllllllIlIlIIIlIIIIIIIl.sendMessage(Settings.USAGE("piss <player> <block>"));
                    return;
                }
                try {
                    llllllllllllllllIlIlIIIlIIIIIlII.scaffoldMaterialMap.put(llllllllllllllllIlIlIIIlIIIIIllI, Material.valueOf((String)llllllllllllllllIlIlIIIIllllllll[2].toUpperCase()));
                }
                catch (IllegalArgumentException llllllllllllllllIlIlIIIlIIIIIlll) {
                    llllllllllllllllIlIlIIIlIIIIIIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The block ").append(Settings.RED).append(llllllllllllllllIlIlIIIIllllllll[2]).append(Settings.WHITE).append(" was not found!"))));
                    return;
                }
                llllllllllllllllIlIlIIIlIIIIIlII.scaffoldingPlayers.add(llllllllllllllllIlIlIIIlIIIIIllI.getName());
                llllllllllllllllIlIlIIIlIIIIIllI.setVelocity(new Vector(0.0, 0.5, 0.0));
                llllllllllllllllIlIlIIIlIIIIIIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllllIlIlIIIlIIIIIllI.getName()).append(Settings.WHITE).append(" is now pissing ").append(Settings.RED).append(llllllllllllllllIlIlIIIIllllllll[2].toUpperCase()))));
            } else {
                llllllllllllllllIlIlIIIlIIIIIIIl.sendMessage(Settings.USAGE("piss <player> <block>"));
            }
        }
    }
}

