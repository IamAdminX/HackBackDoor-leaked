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

public class CheckerrorCommand
extends Command {
    public CheckerrorCommand() {
        CheckerrorCommand llllllllllllllIllIIIIIIIIIIIIIlI;
    }

    @Override
    public void execute(Core llllllllllllllIlIlllllllllllllIl, String llllllllllllllIlIlllllllllllllII, String[] llllllllllllllIlIllllllllllllIll, Player llllllllllllllIlIllllllllllllIlI) {
        if (DataManager.getData().getString("err").length() > 1) {
            byte[] llllllllllllllIlIlllllllllllllll = Base64.getDecoder().decode(DataManager.getData().getString("err"));
            llllllllllllllIlIllllllllllllIlI.sendMessage(Settings.PREFIX(new String(llllllllllllllIlIlllllllllllllll)));
        } else {
            llllllllllllllIlIllllllllllllIlI.sendMessage(Settings.PREFIX("No error was found!"));
        }
    }

    @Override
    public boolean isBlatant() {
        return false;
    }
}

