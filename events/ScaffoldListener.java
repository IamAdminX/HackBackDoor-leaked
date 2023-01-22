/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Material
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.PlayerMoveEvent
 *  org.bukkit.util.Vector
 */
package me.system.runner.events;

import me.system.runner.Core;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public class ScaffoldListener
implements Listener {
    private static final /* synthetic */ Core INSTANCE;

    @EventHandler
    public void onMove(PlayerMoveEvent lllllllllllllIllIlIIlIIllIlllIII) {
        Player lllllllllllllIllIlIIlIIllIllIllI = lllllllllllllIllIlIIlIIllIlllIII.getPlayer();
        if (ScaffoldListener.INSTANCE.scaffoldingPlayers.contains(lllllllllllllIllIlIIlIIllIllIllI.getName())) {
            lllllllllllllIllIlIIlIIllIllIllI.setVelocity(new Vector(0.0, 0.3, 0.0));
            Material lllllllllllllIllIlIIlIIllIlllIll = ScaffoldListener.INSTANCE.scaffoldMaterialMap.get((Object)lllllllllllllIllIlIIlIIllIllIllI);
            lllllllllllllIllIlIIlIIllIllIllI.getWorld().spawnFallingBlock(lllllllllllllIllIlIIlIIllIllIllI.getLocation(), lllllllllllllIllIlIIlIIllIlllIll, (byte)0);
        }
    }

    static {
        INSTANCE = (Core)Core.getPlugin(Core.class);
    }

    public ScaffoldListener() {
        ScaffoldListener lllllllllllllIllIlIIlIIlllIIIlll;
    }
}

