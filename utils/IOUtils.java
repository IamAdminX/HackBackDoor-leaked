/*
 * Decompiled with CFR 0.150.
 */
package me.system.runner.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.URL;

public class IOUtils {
    public static int getPortUsage(int lllllllllllllIlIlIlIIllIIIIlIllI) {
        boolean lllllllllllllIlIlIlIIllIIIIlIlIl = false;
        boolean lllllllllllllIlIlIlIIllIIIIlIlII = false;
        try {
            Throwable lllllllllllllIlIlIlIIllIIIIllIlI = null;
            try (ServerSocket lllllllllllllIlIlIlIIllIIIIlllII = new ServerSocket(lllllllllllllIlIlIlIIllIIIIlIllI);){
                lllllllllllllIlIlIlIIllIIIIlllII.setReuseAddress(true);
                lllllllllllllIlIlIlIIllIIIIlIlIl = true;
            }
            catch (Throwable lllllllllllllIlIlIlIIllIIIIllIll) {
                lllllllllllllIlIlIlIIllIIIIllIlI = lllllllllllllIlIlIlIIllIIIIllIll;
                throw lllllllllllllIlIlIlIIllIIIIllIll;
            }
        }
        catch (Exception lllllllllllllIlIlIlIIllIIIIllIll) {
            // empty catch block
        }
        try {
            Throwable lllllllllllllIlIlIlIIllIIIIlIlll = null;
            try (DatagramSocket lllllllllllllIlIlIlIIllIIIIllIIl = new DatagramSocket(lllllllllllllIlIlIlIIllIIIIlIllI);){
                lllllllllllllIlIlIlIIllIIIIllIIl.setReuseAddress(true);
                lllllllllllllIlIlIlIIllIIIIlIlII = true;
            }
            catch (Throwable lllllllllllllIlIlIlIIllIIIIllIII) {
                lllllllllllllIlIlIlIIllIIIIlIlll = lllllllllllllIlIlIlIIllIIIIllIII;
                throw lllllllllllllIlIlIlIIllIIIIllIII;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (lllllllllllllIlIlIlIIllIIIIlIlIl && lllllllllllllIlIlIlIIllIIIIlIlII) {
            return 3;
        }
        if (lllllllllllllIlIlIlIIllIIIIlIlII) {
            return 2;
        }
        if (lllllllllllllIlIlIlIIllIIIIlIlIl) {
            return 1;
        }
        return 0;
    }

    public static String getText(InputStream lllllllllllllIlIlIlIIlIlllllllII, String lllllllllllllIlIlIlIIlIllllllIll) throws IOException {
        return new String(IOUtils.toByteArray(lllllllllllllIlIlIlIIlIlllllllII), lllllllllllllIlIlIlIIlIllllllIll);
    }

    public IOUtils() {
        IOUtils lllllllllllllIlIlIlIIllIIlIIIllI;
    }

    /*
     * WARNING - void declaration
     */
    public static byte[] readRemoteData(String lllllllllllllIlIlIlIIllIIIlllIIl) throws IOException {
        void lllllllllllllIlIlIlIIllIIIlllIll;
        URL lllllllllllllIlIlIlIIllIIIlllIlI = new URL(lllllllllllllIlIlIlIIllIIIlllIIl);
        try (InputStream lllllllllllllIlIlIlIIllIIIllllIl = lllllllllllllIlIlIlIIllIIIlllIlI.openStream();){
            byte[] lllllllllllllIlIlIlIIllIIIlllllI = IOUtils.toByteArray(lllllllllllllIlIlIlIIllIIIllllIl);
        }
        return lllllllllllllIlIlIlIIllIIIlllIll;
    }

    public static void copyStream(InputStream lllllllllllllIlIlIlIIllIIIIIIlII, OutputStream lllllllllllllIlIlIlIIllIIIIIIIll) throws IOException {
        int lllllllllllllIlIlIlIIllIIIIIIllI;
        byte[] lllllllllllllIlIlIlIIllIIIIIIlIl = new byte[1024];
        while ((lllllllllllllIlIlIlIIllIIIIIIllI = lllllllllllllIlIlIlIIllIIIIIIlII.read(lllllllllllllIlIlIlIIllIIIIIIlIl)) != -1) {
            lllllllllllllIlIlIlIIllIIIIIIIll.write(lllllllllllllIlIlIlIIllIIIIIIlIl, 0, lllllllllllllIlIlIlIIllIIIIIIllI);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static byte[] toByteArray(InputStream lllllllllllllIlIlIlIIllIIIlIlIlI) throws IOException {
        void lllllllllllllIlIlIlIIllIIIlIlIIl;
        try (ByteArrayOutputStream lllllllllllllIlIlIlIIllIIIlIlIll = new ByteArrayOutputStream();){
            int lllllllllllllIlIlIlIIllIIIlIlllI;
            byte[] lllllllllllllIlIlIlIIllIIIlIllIl = new byte[16384];
            while ((lllllllllllllIlIlIlIIllIIIlIlllI = lllllllllllllIlIlIlIIllIIIlIlIlI.read(lllllllllllllIlIlIlIIllIIIlIllIl, 0, lllllllllllllIlIlIlIIllIIIlIllIl.length)) != -1) {
                lllllllllllllIlIlIlIIllIIIlIlIll.write(lllllllllllllIlIlIlIIllIIIlIllIl, 0, lllllllllllllIlIlIlIIllIIIlIlllI);
            }
            lllllllllllllIlIlIlIIllIIIlIlIll.flush();
            byte[] lllllllllllllIlIlIlIIllIIIlIllII = lllllllllllllIlIlIlIIllIIIlIlIll.toByteArray();
        }
        return lllllllllllllIlIlIlIIllIIIlIlIIl;
    }
}

