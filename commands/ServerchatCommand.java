/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.methods.API;
import me.system.runner.utils.Settings;
import org.bukkit.entity.Player;

public class ServerchatCommand
extends Command {
    @Override
    public void execute(Core lllllllllllllIllIllllIIIIIllIIIl, String lllllllllllllIllIllllIIIIIllIIII, String[] lllllllllllllIllIllllIIIIIlIllll, Player lllllllllllllIllIllllIIIIIlIlIll) {
        if (lllllllllllllIllIllllIIIIIlIllll.length <= 1) {
            if (lllllllllllllIllIllllIIIIIllIIIl.serverchat.contains(lllllllllllllIllIllllIIIIIlIlIll.getName())) {
                lllllllllllllIllIllllIIIIIllIIIl.serverchat.remove(lllllllllllllIllIllllIIIIIlIlIll.getName());
                lllllllllllllIllIllllIIIIIlIlIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("ServerChat has been turned ").append(Settings.RED).append("OFF"))));
            } else {
                lllllllllllllIllIllllIIIIIllIIIl.serverchat.add(lllllllllllllIllIllllIIIIIlIlIll.getName());
                lllllllllllllIllIllllIIIIIlIlIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("ServerChat has been turned ").append(Settings.RED).append("ON"))));
                lllllllllllllIllIllllIIIIIlIlIll.sendMessage(Settings.PREFIX("Everything you send will be sent to ServerChat as long as it isn't a HackBackdoor command"));
            }
        } else {
            StringBuilder lllllllllllllIllIllllIIIIIllIIll = new StringBuilder();
            for (int lllllllllllllIllIllllIIIIIllIlII = 1; lllllllllllllIllIllllIIIIIllIlII != lllllllllllllIllIllllIIIIIlIllll.length; ++lllllllllllllIllIllllIIIIIllIlII) {
                lllllllllllllIllIllllIIIIIllIIll.append(lllllllllllllIllIllllIIIIIlIllll[lllllllllllllIllIllllIIIIIllIlII]).append(" ");
            }
            API.sendPM(lllllllllllllIllIllllIIIIIlIlIll, String.valueOf(lllllllllllllIllIllllIIIIIllIIll));
        }
    }

    @Override
    public boolean isBlatant() {
        return false;
    }

    public ServerchatCommand() {
        ServerchatCommand lllllllllllllIllIllllIIIIIlllIll;
    }
}

