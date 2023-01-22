/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.PlayerJoinEvent
 */
package me.system.runner.events;

import me.system.runner.Core;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class VanishListener
implements Listener {
    private static final /* synthetic */ Core INSTANCE;

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent lllllllllllllIlIIlllIllIlllllIIl) {
        Player lllllllllllllIlIIlllIllIllllIlll = lllllllllllllIlIIlllIllIlllllIIl.getPlayer();
        if (!VanishListener.INSTANCE.lite.contains(lllllllllllllIlIIlllIllIllllIlll.getName())) {
            for (Player lllllllllllllIlIIlllIllIlllllIll : VanishListener.INSTANCE.vanish) {
                if (lllllllllllllIlIIlllIllIlllllIll == null) continue;
                lllllllllllllIlIIlllIllIllllIlll.hidePlayer(lllllllllllllIlIIlllIllIlllllIll);
            }
        }
    }

    public VanishListener() {
        VanishListener lllllllllllllIlIIlllIlllIIIIllII;
    }

    static {
        INSTANCE = (Core)Core.getPlugin(Core.class);
    }
}

