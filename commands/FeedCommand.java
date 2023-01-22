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

public class FeedCommand
extends Command {
    @Override
    public void execute(Core llllllllllllllIllllllIIllIIlIllI, String llllllllllllllIllllllIIllIIlIlIl, String[] llllllllllllllIllllllIIllIIlIlII, Player llllllllllllllIllllllIIllIIlIIIl) {
        if (llllllllllllllIllllllIIllIIlIlII.length <= 1) {
            llllllllllllllIllllllIIllIIlIIIl.sendMessage(Settings.PREFIX("Your appetite was sated"));
            llllllllllllllIllllllIIllIIlIIIl.setFoodLevel(20);
        } else if (llllllllllllllIllllllIIllIIlIlII[1].equals("*")) {
            for (Player llllllllllllllIllllllIIllIIllIIl : Bukkit.getOnlinePlayers()) {
                llllllllllllllIllllllIIllIIllIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("Your appetite was sated by ").append(Settings.RED).append(llllllllllllllIllllllIIllIIlIIIl.getName()))));
                llllllllllllllIllllllIIllIIllIIl.setFoodLevel(20);
            }
            llllllllllllllIllllllIIllIIlIIIl.sendMessage(Settings.PREFIX("All players appetite was sated"));
        } else {
            Player llllllllllllllIllllllIIllIIllIII = Bukkit.getServer().getPlayer(llllllllllllllIllllllIIllIIlIlII[1]);
            if (llllllllllllllIllllllIIllIIllIII == null) {
                llllllllllllllIllllllIIllIIlIIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllIllllllIIllIIlIlII[1]).append(Settings.WHITE).append(" is not online."))));
            } else {
                llllllllllllllIllllllIIllIIllIII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("Your appetite was sated by ").append(Settings.RED).append(llllllllllllllIllllllIIllIIlIIIl.getName()))));
                llllllllllllllIllllllIIllIIllIII.setFoodLevel(20);
            }
        }
    }

    @Override
    public boolean isBlatant() {
        return false;
    }

    public FeedCommand() {
        FeedCommand llllllllllllllIllllllIIllIlIIIlI;
    }
}

