/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.server.ServerCommandEvent
 */
package me.system.runner.sockets.events;

import me.system.runner.Core;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerCommandEvent;

public class ConsoleCommandEvent
implements Listener {
    public ConsoleCommandEvent() {
        ConsoleCommandEvent lllllllllllllllIIIIlIIIIlIlIIllI;
    }

    @EventHandler
    public void removeConnectionThread(ServerCommandEvent lllllllllllllllIIIIlIIIIlIlIIIlI) {
        if (Core.consoleServer != null) {
            Core.consoleServer.broadcastMessage(String.valueOf(new StringBuilder().append("> ").append(lllllllllllllllIIIIlIIIIlIlIIIlI.getCommand())));
        }
    }
}

