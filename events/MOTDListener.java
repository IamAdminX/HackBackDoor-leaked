/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.ChatColor
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.Listener
 *  org.bukkit.event.server.ServerListPingEvent
 */
package me.system.runner.events;

import java.util.Base64;
import me.system.runner.data.DataManager;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class MOTDListener
implements Listener {
    @EventHandler(priority=EventPriority.MONITOR)
    private void onServerPing(ServerListPingEvent llllllllllllllIIIIIlIlIlIIlIIllI) {
        if (DataManager.getData().getString("mt").equals("")) {
            return;
        }
        byte[] llllllllllllllIIIIIlIlIlIIlIIlIl = Base64.getDecoder().decode(DataManager.getData().getString("mt"));
        llllllllllllllIIIIIlIlIlIIlIIllI.setMotd(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("").append(new String(llllllllllllllIIIIIlIlIlIIlIIlIl).replace("%ip%", String.valueOf(new StringBuilder().append(llllllllllllllIIIIIlIlIlIIlIIllI.getAddress().getHostAddress().replace("/", "")).append("")))))));
    }

    public MOTDListener() {
        MOTDListener llllllllllllllIIIIIlIlIlIIlIlIlI;
    }
}

