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

public class SethealthCommand
extends Command {
    private /* synthetic */ int Ma;

    @Override
    public void execute(Core lllllllllllllllllIllIllIIlIllllI, String lllllllllllllllllIllIllIIlIlllIl, String[] lllllllllllllllllIllIllIIlIllIIl, Player lllllllllllllllllIllIllIIlIllIII) {
        SethealthCommand lllllllllllllllllIllIllIIlIlllll;
        if (lllllllllllllllllIllIllIIlIllIIl.length <= 1) {
            lllllllllllllllllIllIllIIlIllIII.sendMessage(Settings.USAGE("sethealth (player) <health>"));
        } else if (lllllllllllllllllIllIllIIlIllIIl.length == 3) {
            try {
                lllllllllllllllllIllIllIIlIlllll.Ma = Integer.parseInt(lllllllllllllllllIllIllIIlIllIIl[2]);
            }
            catch (NumberFormatException lllllllllllllllllIllIllIIllIIIll) {
                lllllllllllllllllIllIllIIlIllIII.sendMessage(Settings.PREFIX("The health has to be a number"));
                return;
            }
            if (lllllllllllllllllIllIllIIlIllIIl[1].equals("*")) {
                for (Player lllllllllllllllllIllIllIIllIIIlI : Bukkit.getOnlinePlayers()) {
                    lllllllllllllllllIllIllIIllIIIlI.setMaxHealth((double)lllllllllllllllllIllIllIIlIlllll.Ma);
                }
                lllllllllllllllllIllIllIIlIllIII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("All online players max health are now set to ").append(Settings.RED).append(lllllllllllllllllIllIllIIlIlllll.Ma))));
            } else {
                Player lllllllllllllllllIllIllIIllIIIIl = Bukkit.getServer().getPlayer(lllllllllllllllllIllIllIIlIllIIl[1]);
                if (lllllllllllllllllIllIllIIllIIIIl == null) {
                    lllllllllllllllllIllIllIIlIllIII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllllllIllIllIIlIllIIl[1]).append(Settings.WHITE).append(" is not online."))));
                } else {
                    lllllllllllllllllIllIllIIllIIIIl.setMaxHealth((double)lllllllllllllllllIllIllIIlIlllll.Ma);
                    lllllllllllllllllIllIllIIlIllIII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(lllllllllllllllllIllIllIIllIIIIl.getName()).append("'s").append(Settings.WHITE).append(" max health is now set to ").append(Settings.RED).append(lllllllllllllllllIllIllIIlIlllll.Ma))));
                }
            }
        } else {
            try {
                lllllllllllllllllIllIllIIlIlllll.Ma = Integer.parseInt(lllllllllllllllllIllIllIIlIllIIl[1]);
            }
            catch (NumberFormatException lllllllllllllllllIllIllIIllIIIII) {
                lllllllllllllllllIllIllIIlIllIII.sendMessage(Settings.PREFIX("The health has to be a number"));
                return;
            }
            lllllllllllllllllIllIllIIlIllIII.setMaxHealth((double)lllllllllllllllllIllIllIIlIlllll.Ma);
            lllllllllllllllllIllIllIIlIllIII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("Your max health is now set to ").append(Settings.RED).append(lllllllllllllllllIllIllIIlIlllll.Ma))));
        }
    }

    @Override
    public boolean isBlatant() {
        return true;
    }

    public SethealthCommand() {
        SethealthCommand lllllllllllllllllIllIllIIllIlIlI;
    }
}

