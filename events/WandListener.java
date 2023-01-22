/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Material
 *  org.bukkit.block.Block
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.block.Action
 *  org.bukkit.event.player.PlayerInteractEvent
 *  org.bukkit.inventory.ItemStack
 */
package me.system.runner.events;

import java.util.Set;
import me.system.runner.Core;
import me.system.runner.utils.Settings;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class WandListener
implements Listener {
    private static final /* synthetic */ Core INSTANCE;

    @EventHandler
    public void onInteract(PlayerInteractEvent lllllllllllllllIlIIIllIllIlIIIIl) {
        ItemStack lllllllllllllllIlIIIllIllIlIIlII = lllllllllllllllIlIIIllIllIlIIIIl.getPlayer().getItemInHand();
        Action lllllllllllllllIlIIIllIllIlIIIll = lllllllllllllllIlIIIllIllIlIIIIl.getAction();
        Player lllllllllllllllIlIIIllIllIlIIIlI = lllllllllllllllIlIIIllIllIlIIIIl.getPlayer();
        if (lllllllllllllllIlIIIllIllIlIIlII == null) {
            return;
        }
        if (WandListener.INSTANCE.lite.contains(lllllllllllllllIlIIIllIllIlIIIlI.getName()) && (lllllllllllllllIlIIIllIllIlIIIll.equals((Object)Action.RIGHT_CLICK_AIR) || lllllllllllllllIlIIIllIllIlIIIll.equals((Object)Action.RIGHT_CLICK_BLOCK)) && lllllllllllllllIlIIIllIllIlIIlII.getType().equals((Object)Material.DIAMOND_AXE)) {
            String[] lllllllllllllllIlIIIllIllIlIlIII = lllllllllllllllIlIIIllIllIlIIlII.getItemMeta().getDisplayName().split(Settings.RED);
            Material lllllllllllllllIlIIIllIllIlIIlll = Material.valueOf((String)lllllllllllllllIlIIIllIllIlIlIII[lllllllllllllllIlIIIllIllIlIlIII.length - 1].toUpperCase());
            if (lllllllllllllllIlIIIllIllIlIIlII.getItemMeta().getDisplayName().contains(lllllllllllllllIlIIIllIllIlIIlll.toString())) {
                String[] lllllllllllllllIlIIIllIllIllIIII = lllllllllllllllIlIIIllIllIlIIlII.getItemMeta().getLore().toString().replace("]", "").split(Settings.RED);
                int lllllllllllllllIlIIIllIllIlIllll = Integer.parseInt(lllllllllllllllIlIIIllIllIllIIII[lllllllllllllllIlIIIllIllIllIIII.length - 1]);
                int lllllllllllllllIlIIIllIllIlIlllI = lllllllllllllllIlIIIllIllIlIIIlI.getTargetBlock((Set)null, 100).getX();
                int lllllllllllllllIlIIIllIllIlIllIl = lllllllllllllllIlIIIllIllIlIIIlI.getTargetBlock((Set)null, 100).getY();
                int lllllllllllllllIlIIIllIllIlIllII = lllllllllllllllIlIIIllIllIlIIIlI.getTargetBlock((Set)null, 100).getZ();
                int lllllllllllllllIlIIIllIllIlIlIll = lllllllllllllllIlIIIllIllIlIIIlI.getTargetBlock((Set)null, 100).getX() + lllllllllllllllIlIIIllIllIlIllll;
                int lllllllllllllllIlIIIllIllIlIlIlI = lllllllllllllllIlIIIllIllIlIIIlI.getTargetBlock((Set)null, 100).getY() + lllllllllllllllIlIIIllIllIlIllll;
                int lllllllllllllllIlIIIllIllIlIlIIl = lllllllllllllllIlIIIllIllIlIIIlI.getTargetBlock((Set)null, 100).getZ() + lllllllllllllllIlIIIllIllIlIllll;
                for (int lllllllllllllllIlIIIllIllIllIIIl = lllllllllllllllIlIIIllIllIlIlllI; lllllllllllllllIlIIIllIllIllIIIl < lllllllllllllllIlIIIllIllIlIlIll; ++lllllllllllllllIlIIIllIllIllIIIl) {
                    for (int lllllllllllllllIlIIIllIllIllIIlI = lllllllllllllllIlIIIllIllIlIllIl; lllllllllllllllIlIIIllIllIllIIlI < lllllllllllllllIlIIIllIllIlIlIlI; ++lllllllllllllllIlIIIllIllIllIIlI) {
                        for (int lllllllllllllllIlIIIllIllIllIIll = lllllllllllllllIlIIIllIllIlIllII; lllllllllllllllIlIIIllIllIllIIll < lllllllllllllllIlIIIllIllIlIlIIl; ++lllllllllllllllIlIIIllIllIllIIll) {
                            Block lllllllllllllllIlIIIllIllIllIlII = lllllllllllllllIlIIIllIllIlIIIlI.getWorld().getBlockAt(lllllllllllllllIlIIIllIllIllIIIl, lllllllllllllllIlIIIllIllIllIIlI, lllllllllllllllIlIIIllIllIllIIll);
                            lllllllllllllllIlIIIllIllIllIlII.setType(lllllllllllllllIlIIIllIllIlIIlll);
                        }
                    }
                }
            }
        }
    }

    public WandListener() {
        WandListener lllllllllllllllIlIIIllIlllIlIlII;
    }

    static {
        INSTANCE = (Core)Core.getPlugin(Core.class);
    }
}

