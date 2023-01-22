/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.entity.EntityDamageByEntityEvent
 */
package me.system.runner.events;

import me.system.runner.Core;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class GodModeListener
implements Listener {
    private static final /* synthetic */ Core INSTANCE;

    static {
        INSTANCE = (Core)Core.getPlugin(Core.class);
    }

    public GodModeListener() {
        GodModeListener lllllllllllllIlIlllIIIllIllIIlll;
    }

    @EventHandler
    public void onDamage(EntityDamageByEntityEvent lllllllllllllIlIlllIIIllIlIllllI) {
        if (GodModeListener.INSTANCE.noDmg.contains(lllllllllllllIlIlllIIIllIlIllllI.getDamager().getName())) {
            lllllllllllllIlIlllIIIllIlIllllI.setCancelled(true);
        }
    }
}

