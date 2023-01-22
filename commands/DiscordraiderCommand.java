/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.ChatColor
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.methods.Tips;
import me.system.runner.utils.Settings;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class DiscordraiderCommand
extends Command {
    @Override
    public void execute(Core llllllllllllllIIllllllIIIIIlIIIl, String llllllllllllllIIllllllIIIIIlIIII, String[] llllllllllllllIIllllllIIIIIIllII, Player llllllllllllllIIllllllIIIIIIlllI) {
        int llllllllllllllIIllllllIIIIIIllIl = 1;
        if (llllllllllllllIIllllllIIIIIIllII.length <= 1) {
            llllllllllllllIIllllllIIIIIIlllI.sendMessage(Settings.USAGE(String.valueOf(new StringBuilder().append("discordraider <1-").append(llllllllllllllIIllllllIIIIIIllIl).append(">"))));
        } else if (llllllllllllllIIllllllIIIIIIllII[1].equalsIgnoreCase("1")) {
            llllllllllllllIIllllllIIIIIIlllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8&m----------------------------------"));
            llllllllllllllIIllllllIIIIIIlllI.sendMessage(String.valueOf(new StringBuilder().append("         ").append(Settings.DARK_RED).append(Settings.NAME).append(" by ").append("Wendellmeset")));
            llllllllllllllIIllllllIIIIIIlllI.sendMessage("");
            llllllllllllllIIllllllIIIIIIlllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7settoken &8l &fSet bots token and logins to bot"));
            llllllllllllllIIllllllIIIIIIlllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7setguild &8l &fSet guild ID"));
            llllllllllllllIIllllllIIIIIIlllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7delchannels &8l &fDeletes all channels in the guild"));
            llllllllllllllIIllllllIIIIIIlllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7createvc &8l &fCreates a voice channel"));
            llllllllllllllIIllllllIIIIIIlllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7createtc &8l &fCreates a text channel"));
            llllllllllllllIIllllllIIIIIIlllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7spamdiscord &8l &fSpams all channels"));
            llllllllllllllIIllllllIIIIIIlllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7dmall &8l &fPrivate messages all users"));
            llllllllllllllIIllllllIIIIIIlllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7kickusers &8l &fKicks all users from the guild"));
            llllllllllllllIIllllllIIIIIIlllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7banusers &8l &fBans all users from the guild"));
            llllllllllllllIIllllllIIIIIIlllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7setstatus &8l &fSets the bots playing status"));
            llllllllllllllIIllllllIIIIIIlllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7showtoken &8l &fShows the token of the discord bot"));
            llllllllllllllIIllllllIIIIIIlllI.sendMessage("");
            llllllllllllllIIllllllIIIIIIlllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&8(").append(Settings.DARK_RED).append("Tip&8) l &7").append(Tips.getTip()))));
            llllllllllllllIIllllllIIIIIIlllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8&m----------------------------------"));
        }
    }

    public DiscordraiderCommand() {
        DiscordraiderCommand llllllllllllllIIllllllIIIIIlIlll;
    }
}

