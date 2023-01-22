/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.plugin.Plugin
 */
package me.system.runner.utils;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public class PluginUtils {
    public static Plugin getPluginByName(String llllllllllllllIIIlIllllIllIIIlIl) {
        for (Plugin llllllllllllllIIIlIllllIllIIlIII : Bukkit.getPluginManager().getPlugins()) {
            if (!llllllllllllllIIIlIllllIllIIIlIl.equalsIgnoreCase(llllllllllllllIIIlIllllIllIIlIII.getName())) continue;
            return llllllllllllllIIIlIllllIllIIlIII;
        }
        return null;
    }

    public PluginUtils() {
        PluginUtils llllllllllllllIIIlIllllIllIllIlI;
    }
}

