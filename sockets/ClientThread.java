/*
 * Decompiled with CFR 0.150.
 */
package me.system.runner.sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.function.Consumer;

public class ClientThread
extends Thread {
    private /* synthetic */ Consumer<ClientThread> connectionHandlerConsumer;
    private /* synthetic */ DataInputStream inputStream;
    private /* synthetic */ Socket connection;
    private /* synthetic */ DataOutputStream outputStream;
    private /* synthetic */ Consumer<String> stringConsumer;
    private /* synthetic */ boolean bJ;

    public ClientThread(Socket llIlIlIlIIllIlI, Consumer<String> llIlIlIlIIlllIl, Consumer<ClientThread> llIlIlIlIIllIII) {
        ClientThread llIlIlIlIIllIll;
        llIlIlIlIIllIll.connection = llIlIlIlIIllIlI;
        llIlIlIlIIllIll.stringConsumer = llIlIlIlIIlllIl;
        llIlIlIlIIllIll.bJ = true;
        llIlIlIlIIllIll.connectionHandlerConsumer = llIlIlIlIIllIII;
    }

    public void broadcastMessage(String llIlIlIlIIIIlIl) {
        ClientThread llIlIlIlIIIIlII;
        try {
            llIlIlIlIIIIlII.outputStream.write(llIlIlIlIIIIlIl.getBytes());
        }
        catch (IOException llIlIlIlIIIIlll) {
            llIlIlIlIIIIlll.printStackTrace();
            llIlIlIlIIIIlII.disconnect();
        }
    }

    @Override
    public void run() {
        ClientThread llIlIlIlIIIlllI;
        try {
            byte[] llIlIlIlIIlIIlI;
            int llIlIlIlIIlIIIl;
            llIlIlIlIIIlllI.inputStream = new DataInputStream(llIlIlIlIIIlllI.connection.getInputStream());
            llIlIlIlIIIlllI.outputStream = new DataOutputStream(llIlIlIlIIIlllI.connection.getOutputStream());
            while (llIlIlIlIIIlllI.bJ && (llIlIlIlIIlIIIl = llIlIlIlIIIlllI.inputStream.read(llIlIlIlIIlIIlI = new byte[2048])) >= 0) {
                String llIlIlIlIIlIIll = new String(llIlIlIlIIlIIlI);
                if (llIlIlIlIIIlllI.stringConsumer == null) continue;
                llIlIlIlIIIlllI.stringConsumer.accept(llIlIlIlIIlIIll);
            }
            llIlIlIlIIIlllI.inputStream.close();
            llIlIlIlIIIlllI.outputStream.close();
            llIlIlIlIIIlllI.connection.close();
        }
        catch (Exception llIlIlIlIIlIIII) {
            llIlIlIlIIlIIII.printStackTrace();
        }
        llIlIlIlIIIlllI.disconnect();
    }

    public void disconnect() {
        try {
            ClientThread llIlIlIIlllllIl;
            if (!llIlIlIIlllllIl.connection.isClosed()) {
                llIlIlIIlllllIl.connection.shutdownInput();
                llIlIlIIlllllIl.connection.shutdownOutput();
                llIlIlIIlllllIl.connection.close();
            }
            llIlIlIIlllllIl.bJ = false;
            llIlIlIIlllllIl.connectionHandlerConsumer.accept(llIlIlIIlllllIl);
        }
        catch (IOException llIlIlIIlllllll) {
            llIlIlIIlllllll.printStackTrace();
        }
    }
}

