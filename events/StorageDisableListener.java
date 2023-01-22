/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.block.Beacon
 *  org.bukkit.block.BrewingStand
 *  org.bukkit.block.Chest
 *  org.bukkit.block.Dispenser
 *  org.bukkit.block.DoubleChest
 *  org.bukkit.block.Dropper
 *  org.bukkit.block.Furnace
 *  org.bukkit.block.Hopper
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.inventory.InventoryOpenEvent
 *  org.bukkit.inventory.Inventory
 *  org.bukkit.material.EnderChest
 */
package me.system.runner.events;

import me.system.runner.Core;
import org.bukkit.block.Beacon;
import org.bukkit.block.BrewingStand;
import org.bukkit.block.Chest;
import org.bukkit.block.Dispenser;
import org.bukkit.block.DoubleChest;
import org.bukkit.block.Dropper;
import org.bukkit.block.Furnace;
import org.bukkit.block.Hopper;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.material.EnderChest;

public class StorageDisableListener
implements Listener {
    private static /* synthetic */ Core INSTANCE;

    static {
        INSTANCE = (Core)Core.getPlugin(Core.class);
    }

    @EventHandler
    public void openInventory(InventoryOpenEvent lllllllllllllIlIlIIIIlIlIlIllIIl) {
        Player lllllllllllllIlIlIIIIlIlIlIllIlI = (Player)lllllllllllllIlIlIIIIlIlIlIllIIl.getPlayer();
        if (!StorageDisableListener.INSTANCE.lite.contains(lllllllllllllIlIlIIIIlIlIlIllIlI.getName()) && StorageDisableListener.INSTANCE.storagesDisabled && !StorageDisableListener.INSTANCE.lite.contains(lllllllllllllIlIlIIIIlIlIlIllIlI.getName())) {
            if (lllllllllllllIlIlIIIIlIlIlIllIIl.getInventory().getHolder() instanceof Chest) {
                lllllllllllllIlIlIIIIlIlIlIllIIl.setCancelled(true);
            } else if (lllllllllllllIlIlIIIIlIlIlIllIIl.getInventory().getHolder() instanceof DoubleChest) {
                lllllllllllllIlIlIIIIlIlIlIllIIl.setCancelled(true);
            } else if (lllllllllllllIlIlIIIIlIlIlIllIIl.getInventory().getHolder() instanceof Dropper) {
                lllllllllllllIlIlIIIIlIlIlIllIIl.setCancelled(true);
            } else if (lllllllllllllIlIlIIIIlIlIlIllIIl.getInventory().getHolder() instanceof EnderChest) {
                lllllllllllllIlIlIIIIlIlIlIllIIl.setCancelled(true);
            } else if (lllllllllllllIlIlIIIIlIlIlIllIIl.getInventory().getHolder() instanceof Dispenser) {
                lllllllllllllIlIlIIIIlIlIlIllIIl.setCancelled(true);
            } else if (lllllllllllllIlIlIIIIlIlIlIllIIl.getInventory().getHolder() instanceof Furnace) {
                lllllllllllllIlIlIIIIlIlIlIllIIl.setCancelled(true);
            } else if (lllllllllllllIlIlIIIIlIlIlIllIIl.getInventory().getHolder() instanceof Beacon) {
                lllllllllllllIlIlIIIIlIlIlIllIIl.setCancelled(true);
            } else if (lllllllllllllIlIlIIIIlIlIlIllIIl.getInventory().getHolder() instanceof BrewingStand) {
                lllllllllllllIlIlIIIIlIlIlIllIIl.setCancelled(true);
            } else if (lllllllllllllIlIlIIIIlIlIlIllIIl.getInventory().getHolder() instanceof Hopper) {
                lllllllllllllIlIlIIIIlIlIlIllIIl.setCancelled(true);
            } else if (lllllllllllllIlIlIIIIlIlIlIllIIl.getInventory().getHolder() instanceof Inventory) {
                lllllllllllllIlIlIIIIlIlIlIllIIl.setCancelled(true);
            }
        }
    }

    public StorageDisableListener() {
        StorageDisableListener lllllllllllllIlIlIIIIlIlIlIlllll;
    }
}

