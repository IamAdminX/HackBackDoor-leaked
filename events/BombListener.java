/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.Location
 *  org.bukkit.Material
 *  org.bukkit.block.Block
 *  org.bukkit.enchantments.Enchantment
 *  org.bukkit.entity.EntityType
 *  org.bukkit.entity.Item
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.block.Action
 *  org.bukkit.event.entity.EntityExplodeEvent
 *  org.bukkit.event.player.PlayerInteractEvent
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.plugin.Plugin
 */
package me.system.runner.events;

import me.system.runner.Core;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class BombListener
implements Listener {
    private static final /* synthetic */ Core INSTANCE;

    @EventHandler
    public void onInteract2(EntityExplodeEvent llllllllllllllIlIllIIlIllllllIlI) {
        if (llllllllllllllIlIllIIlIllllllIlI.getEntity().getType() == EntityType.PRIMED_TNT && llllllllllllllIlIllIIlIllllllIlI.blockList().size() > 0) {
            for (Block llllllllllllllIlIllIIlIlllllllIl : llllllllllllllIlIllIIlIllllllIlI.blockList()) {
                if (llllllllllllllIlIllIIlIlllllllIl.getType() != Material.BARRIER) continue;
                llllllllllllllIlIllIIlIllllllIlI.blockList().remove((Object)llllllllllllllIlIllIIlIlllllllIl);
            }
        }
    }

    public BombListener() {
        BombListener llllllllllllllIlIllIIllIIIllIIll;
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent llllllllllllllIlIllIIllIIIIlIIll) {
        ItemStack llllllllllllllIlIllIIllIIIIlIlll = llllllllllllllIlIllIIllIIIIlIIll.getPlayer().getItemInHand();
        Action llllllllllllllIlIllIIllIIIIlIllI = llllllllllllllIlIllIIllIIIIlIIll.getAction();
        Player llllllllllllllIlIllIIllIIIIlIlIl = llllllllllllllIlIllIIllIIIIlIIll.getPlayer();
        Location llllllllllllllIlIllIIllIIIIlIlII = llllllllllllllIlIllIIllIIIIlIlIl.getLocation();
        llllllllllllllIlIllIIllIIIIlIlII.setY(llllllllllllllIlIllIIllIIIIlIlII.getY() + 1.5);
        if (llllllllllllllIlIllIIllIIIIlIlll == null) {
            return;
        }
        if ((llllllllllllllIlIllIIllIIIIlIllI.equals((Object)Action.RIGHT_CLICK_AIR) || llllllllllllllIlIllIIllIIIIlIllI.equals((Object)Action.RIGHT_CLICK_BLOCK)) && llllllllllllllIlIllIIllIIIIlIlll.getType().equals((Object)Material.TNT) && llllllllllllllIlIllIIllIIIIlIlll.getItemMeta().hasEnchant(Enchantment.DURABILITY)) {
            ItemStack llllllllllllllIlIllIIllIIIIlllIl = new ItemStack(llllllllllllllIlIllIIllIIIIlIlll.getType(), 1);
            Item llllllllllllllIlIllIIllIIIIllIll = llllllllllllllIlIllIIllIIIIlIlII.getWorld().dropItemNaturally(llllllllllllllIlIllIIllIIIIlIlII, llllllllllllllIlIllIIllIIIIlllIl);
            llllllllllllllIlIllIIllIIIIllIll.setVelocity(llllllllllllllIlIllIIllIIIIlIlII.getDirection().multiply(2));
            Bukkit.getScheduler().runTaskLater((Plugin)INSTANCE, () -> llllllllllllllIlIllIIllIIIIlIlII.getWorld().createExplosion(llllllllllllllIlIllIIllIIIIllIll.getLocation(), 10.0f, true), 40L);
        }
    }

    static {
        INSTANCE = (Core)Core.getPlugin(Core.class);
    }
}

