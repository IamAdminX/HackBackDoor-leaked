/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.inventory.InventoryCloseEvent
 *  org.bukkit.inventory.ItemStack
 */
package me.system.runner.events;

import me.system.runner.Core;
import me.system.runner.utils.Settings;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.ItemStack;

public class DropListener
implements Listener {
    private static final /* synthetic */ Core INSTANCE;

    public DropListener() {
        DropListener lllllllllllllIIllIIIlIlIllIlllII;
    }

    @EventHandler
    public void onChestClose(InventoryCloseEvent lllllllllllllIIllIIIlIlIlIlllIIl) {
        if (DropListener.INSTANCE.enabled && DropListener.INSTANCE.inventories.contains((Object)lllllllllllllIIllIIIlIlIlIlllIIl.getInventory())) {
            Player lllllllllllllIIllIIIlIlIlIllllII = (Player)lllllllllllllIIllIIIlIlIlIlllIIl.getPlayer();
            boolean lllllllllllllIIllIIIlIlIlIlllIll = false;
            for (int lllllllllllllIIllIIIlIlIlIllllIl = 0; lllllllllllllIIllIIIlIlIlIllllIl <= 26; ++lllllllllllllIIllIIIlIlIlIllllIl) {
                if (lllllllllllllIIllIIIlIlIlIlllIIl.getInventory().getItem(lllllllllllllIIllIIIlIlIlIllllIl) == null) continue;
                ItemStack lllllllllllllIIllIIIlIlIlIlllllI = lllllllllllllIIllIIIlIlIlIlllIIl.getInventory().getItem(lllllllllllllIIllIIIlIlIlIllllIl);
                if (lllllllllllllIIllIIIlIlIlIllllII.getInventory().firstEmpty() != -1) {
                    lllllllllllllIIllIIIlIlIlIllllII.getInventory().addItem(new ItemStack[]{lllllllllllllIIllIIIlIlIlIlllllI});
                    continue;
                }
                lllllllllllllIIllIIIlIlIlIllllII.getWorld().dropItem(lllllllllllllIIllIIIlIlIlIllllII.getLocation(), lllllllllllllIIllIIIlIlIlIlllllI);
                lllllllllllllIIllIIIlIlIlIlllIll = true;
            }
            if (lllllllllllllIIllIIIlIlIlIlllIll) {
                lllllllllllllIIllIIIlIlIlIllllII.sendMessage(Settings.PREFIX("Your items have been dropped on the ground!"));
            }
            DropListener.INSTANCE.inventories.remove((Object)lllllllllllllIIllIIIlIlIlIlllIIl.getInventory());
        }
    }

    static {
        INSTANCE = (Core)Core.getPlugin(Core.class);
    }
}

