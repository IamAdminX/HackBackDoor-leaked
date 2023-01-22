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

public class ReplyCommand
extends Command {
    public ReplyCommand() {
        ReplyCommand llIllllIIIIIIll;
    }

    @Override
    public boolean isBlatant() {
        return false;
    }

    @Override
    public void execute(Core llIlllIllIllIII, String llIlllIllIlIlll, String[] llIlllIllIlIllI, Player llIlllIllIlIlIl) {
        if (llIlllIllIlIllI.length < 2) {
            llIlllIllIlIlIl.sendMessage(Settings.USAGE("reply <message>"));
        } else {
            StringBuilder llIlllIllIllIll = new StringBuilder();
            for (int llIlllIllIlllll = 1; llIlllIllIlllll != llIlllIllIlIllI.length; ++llIlllIllIlllll) {
                llIlllIllIllIll.append(llIlllIllIlIllI[llIlllIllIlllll]).append(" ");
            }
            if (llIlllIllIllIII.lastMsg.get((Object)llIlllIllIlIlIl) == null) {
                llIlllIllIlIlIl.sendMessage(Settings.USAGE("You have no one to reply too!"));
            } else {
                Player llIlllIllIlllIl = llIlllIllIllIII.lastMsg.get((Object)llIlllIllIlIlIl);
                llIlllIllIlIlIl.sendMessage(String.valueOf(new StringBuilder().append("\u00a78[").append(Settings.WHITE).append("You to ").append(Settings.DARK_RED).append(llIlllIllIlllIl.getName()).append("\u00a78] \u00a77").append((Object)llIlllIllIllIll)));
                llIlllIllIlllIl.sendMessage(String.valueOf(new StringBuilder().append("\u00a78[").append(Settings.DARK_RED).append(llIlllIllIlIlIl.getName()).append(Settings.WHITE).append(" to you\u00a78] \u00a77").append((Object)llIlllIllIllIll)));
            }
        }
    }
}

