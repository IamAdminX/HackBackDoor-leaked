/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Material
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.block.BlockPlaceEvent
 */
package me.system.runner.events;

import me.system.runner.Core;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class ForceDirtListener
implements Listener {
    private static /* synthetic */ Core INSTANCE;

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent llllllllllllllllIIIIIllllIlIIlII) {
        if (ForceDirtListener.INSTANCE.forceDirtPlayers.contains(llllllllllllllllIIIIIllllIlIIlII.getPlayer().getName())) {
            llllllllllllllllIIIIIllllIlIIlII.getBlock().setType(Material.DIRT);
        }
    }

    static {
        INSTANCE = (Core)Core.getPlugin(Core.class);
    }

    public ForceDirtListener() {
        ForceDirtListener llllllllllllllllIIIIIllllIlIlIII;
    }
}

