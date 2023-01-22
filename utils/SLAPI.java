/*
 * Decompiled with CFR 0.150.
 */
package me.system.runner.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SLAPI {
    public static Object load(String llllllllllllllllIllIllllIlIIIIll) throws Exception {
        ObjectInputStream llllllllllllllllIllIllllIlIIIIlI = new ObjectInputStream(new FileInputStream(llllllllllllllllIllIllllIlIIIIll));
        Object llllllllllllllllIllIllllIlIIIIIl = llllllllllllllllIllIllllIlIIIIlI.readObject();
        llllllllllllllllIllIllllIlIIIIlI.close();
        return llllllllllllllllIllIllllIlIIIIIl;
    }

    public SLAPI() {
        SLAPI llllllllllllllllIllIllllIlIlIIIl;
    }

    public static void save(Object llllllllllllllllIllIllllIlIIllII, String llllllllllllllllIllIllllIlIIlIII) throws Exception {
        ObjectOutputStream llllllllllllllllIllIllllIlIIlIlI = new ObjectOutputStream(new FileOutputStream(llllllllllllllllIllIllllIlIIlIII));
        llllllllllllllllIllIllllIlIIlIlI.writeObject(llllllllllllllllIllIllllIlIIllII);
        llllllllllllllllIllIllllIlIIlIlI.flush();
        llllllllllllllllIllIllllIlIIlIlI.close();
    }
}

