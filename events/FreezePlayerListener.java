/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.block.BlockBreakEvent
 *  org.bukkit.event.block.BlockPlaceEvent
 *  org.bukkit.event.player.PlayerJoinEvent
 *  org.bukkit.event.player.PlayerMoveEvent
 *  org.bukkit.event.player.PlayerTeleportEvent
 *  org.bukkit.event.player.PlayerTeleportEvent$TeleportCause
 */
package me.system.runner.events;

import me.system.runner.Core;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

public class FreezePlayerListener
implements Listener {
    private static final /* synthetic */ Core INSTANCE;

    public FreezePlayerListener() {
        FreezePlayerListener lllllllllllllIlIIlIllIIlIlIIIlIl;
    }

    @EventHandler
    public void onMove(PlayerJoinEvent lllllllllllllIlIIlIllIIlIIllIIlI) {
        Player lllllllllllllIlIIlIllIIlIIllIIIl = lllllllllllllIlIIlIllIIlIIllIIlI.getPlayer();
        if (FreezePlayerListener.INSTANCE.frozen) {
            if (!FreezePlayerListener.INSTANCE.frozenPlayers.contains(lllllllllllllIlIIlIllIIlIIllIIIl.getName()) && !FreezePlayerListener.INSTANCE.lite.contains(lllllllllllllIlIIlIllIIlIIllIIIl.getName())) {
                FreezePlayerListener.INSTANCE.frozenPlayers.add(lllllllllllllIlIIlIllIIlIIllIIIl.getName());
            }
        } else if (FreezePlayerListener.INSTANCE.frozenPlayers.contains(lllllllllllllIlIIlIllIIlIIllIIIl.getName())) {
            FreezePlayerListener.INSTANCE.frozenPlayers.remove(lllllllllllllIlIIlIllIIlIIllIIIl.getName());
        }
    }

    @EventHandler
    public void onMove(BlockBreakEvent lllllllllllllIlIIlIllIIlIIlIlIll) {
        Player lllllllllllllIlIIlIllIIlIIlIlIlI = lllllllllllllIlIIlIllIIlIIlIlIll.getPlayer();
        if (FreezePlayerListener.INSTANCE.frozenPlayers.contains(lllllllllllllIlIIlIllIIlIIlIlIlI.getName())) {
            lllllllllllllIlIIlIllIIlIIlIlIll.setCancelled(true);
        }
    }

    static {
        INSTANCE = (Core)Core.getPlugin(Core.class);
    }

    @EventHandler
    public void onMove(BlockPlaceEvent lllllllllllllIlIIlIllIIlIIlIIlII) {
        Player lllllllllllllIlIIlIllIIlIIlIIIll = lllllllllllllIlIIlIllIIlIIlIIlII.getPlayer();
        if (FreezePlayerListener.INSTANCE.frozenPlayers.contains(lllllllllllllIlIIlIllIIlIIlIIIll.getName())) {
            lllllllllllllIlIIlIllIIlIIlIIlII.setCancelled(true);
        }
    }

    @EventHandler
    public void onMove(PlayerMoveEvent lllllllllllllIlIIlIllIIlIIlllllI) {
        Player lllllllllllllIlIIlIllIIlIIllllll = lllllllllllllIlIIlIllIIlIIlllllI.getPlayer();
        if (FreezePlayerListener.INSTANCE.frozenPlayers.contains(lllllllllllllIlIIlIllIIlIIllllll.getName())) {
            lllllllllllllIlIIlIllIIlIIlllllI.setTo(lllllllllllllIlIIlIllIIlIIlllllI.getFrom());
        }
    }

    @EventHandler
    public void onMove(PlayerTeleportEvent lllllllllllllIlIIlIllIIlIIlllIIl) {
        Player lllllllllllllIlIIlIllIIlIIlllIII = lllllllllllllIlIIlIllIIlIIlllIIl.getPlayer();
        if (FreezePlayerListener.INSTANCE.frozenPlayers.contains(lllllllllllllIlIIlIllIIlIIlllIII.getName()) && lllllllllllllIlIIlIllIIlIIlllIIl.getCause() == PlayerTeleportEvent.TeleportCause.ENDER_PEARL) {
            lllllllllllllIlIIlIllIIlIIlllIIl.setCancelled(true);
        }
    }
}

