/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.entity.Player;

public class VersionCommand
extends Command {
    @Override
    public void execute(Core lllllllllllllllIIIIllIlIlIlllIIl, String lllllllllllllllIIIIllIlIlIllIlll, String[] lllllllllllllllIIIIllIlIlIllIlIl, Player lllllllllllllllIIIIllIlIlIlIIIIl) {
        lllllllllllllllIIIIllIlIlIlIIIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append(Settings.NAME).append("'s version is ").append(Settings.RED).append("2.5.4"))));
        lllllllllllllllIIIIllIlIlIlIIIIl.sendMessage(Settings.INFO(String.valueOf(new StringBuilder().append("Made By ").append(Settings.RED).append("Wendellmeset!"))));
    }

    public VersionCommand() {
        VersionCommand lllllllllllllllIIIIllIlIlIllllll;
    }

    @Override
    public boolean isBlatant() {
        return false;
    }
}

