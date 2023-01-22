/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.PlayerPickupItemEvent
 */
package me.system.runner.events;

import me.system.runner.Core;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;

public class NoPickupListener
implements Listener {
    private static final /* synthetic */ Core INSTANCE;

    public NoPickupListener() {
        NoPickupListener lllllllllllllIllllIllIIllIllllII;
    }

    static {
        INSTANCE = (Core)Core.getPlugin(Core.class);
    }

    @EventHandler
    public void onPickup(PlayerPickupItemEvent lllllllllllllIllllIllIIllIlIllIl) {
        Player lllllllllllllIllllIllIIllIlIlllI = lllllllllllllIllllIllIIllIlIllIl.getPlayer();
        if (NoPickupListener.INSTANCE.noPickupPlayers.contains(lllllllllllllIllllIllIIllIlIlllI.getName())) {
            lllllllllllllIllllIllIIllIlIllIl.setCancelled(true);
        }
    }
}

