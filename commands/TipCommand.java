/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.ChatColor
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.methods.Tips;
import me.system.runner.utils.Settings;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class TipCommand
extends Command {
    public TipCommand() {
        TipCommand lllllllllllllllIlllIlIllIllIIIII;
    }

    @Override
    public boolean isBlatant() {
        return false;
    }

    @Override
    public void execute(Core lllllllllllllllIlllIlIllIlIlllII, String lllllllllllllllIlllIlIllIlIllIll, String[] lllllllllllllllIlllIlIllIlIllIlI, Player lllllllllllllllIlllIlIllIlIllIII) {
        lllllllllllllllIlllIlIllIlIllIII.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&8(").append(Settings.DARK_RED).append("Tip&8) l &7").append(Tips.getTip()))));
    }
}

