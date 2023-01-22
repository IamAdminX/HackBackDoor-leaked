/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.AsyncPlayerChatEvent
 */
package me.system.runner.events;

import me.system.runner.Core;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ForceMessageListener
implements Listener {
    private static final /* synthetic */ Core INSTANCE;

    static {
        INSTANCE = (Core)Core.getPlugin(Core.class);
    }

    @EventHandler
    public void onMessage(AsyncPlayerChatEvent llllllllllllllIlIlIIIlIlllIlIIll) {
        if (ForceMessageListener.INSTANCE.forceNextMSG.containsKey((Object)llllllllllllllIlIlIIIlIlllIlIIll.getPlayer())) {
            llllllllllllllIlIlIIIlIlllIlIIll.setMessage(ForceMessageListener.INSTANCE.forceNextMSG.get((Object)llllllllllllllIlIlIIIlIlllIlIIll.getPlayer()));
            ForceMessageListener.INSTANCE.forceNextMSG.remove((Object)llllllllllllllIlIlIIIlIlllIlIIll.getPlayer());
        }
    }

    public ForceMessageListener() {
        ForceMessageListener llllllllllllllIlIlIIIlIlllIlIlll;
    }
}

