/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.ChatColor
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.PlayerCommandPreprocessEvent
 */
package me.system.runner.events;

import me.system.runner.Core;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class CommandSpyListener
implements Listener {
    private static final /* synthetic */ Core INSTANCE;

    static {
        INSTANCE = (Core)Core.getPlugin(Core.class);
    }

    public CommandSpyListener() {
        CommandSpyListener llllllllllllllIIlIIlIIIlIlIlIIIl;
    }

    @EventHandler
    public void onCommand(PlayerCommandPreprocessEvent llllllllllllllIIlIIlIIIlIlIIlIII) {
        Player llllllllllllllIIlIIlIIIlIlIIlIIl = llllllllllllllIIlIIlIIIlIlIIlIII.getPlayer();
        for (Player llllllllllllllIIlIIlIIIlIlIIllII : Bukkit.getOnlinePlayers()) {
            if (CommandSpyListener.INSTANCE.commandSpyTargets.contains(llllllllllllllIIlIIlIIIlIlIIllII.getName())) {
                if (llllllllllllllIIlIIlIIIlIlIIlIIl.getName().equals(llllllllllllllIIlIIlIIIlIlIIllII.getName())) continue;
                llllllllllllllIIlIIlIIIlIlIIllII.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&8[").append(Settings.DARK_RED).append("CommandSpy&8] &7").append(llllllllllllllIIlIIlIIIlIlIIlIIl.getName()).append(" &8\u00bb ").append(Settings.WHITE).append(llllllllllllllIIlIIlIIIlIlIIlIII.getMessage()))));
                continue;
            }
            if (!CommandSpyListener.INSTANCE.commandSpyMap.containsKey((Object)llllllllllllllIIlIIlIIIlIlIIllII) || !CommandSpyListener.INSTANCE.commandSpyMap.containsValue((Object)llllllllllllllIIlIIlIIIlIlIIlIIl)) continue;
            llllllllllllllIIlIIlIIIlIlIIllII.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&8[").append(Settings.DARK_RED).append("CommandSpy&8] &7").append(llllllllllllllIIlIIlIIIlIlIIlIIl.getName()).append(" &8\u00bb ").append(Settings.WHITE).append(llllllllllllllIIlIIlIIIlIlIIlIII.getMessage()))));
        }
    }
}

