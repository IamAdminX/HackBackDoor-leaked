/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl.premium.bot;

import com.minecraftforceop.jda.jda.api.entities.Activity;
import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.entity.Player;

public class SetstatusCommand
extends Command {
    public SetstatusCommand() {
        SetstatusCommand lllllllllllllIlIIIIlIlIlIIlIllIl;
    }

    @Override
    public boolean isBlatant() {
        return true;
    }

    @Override
    public void execute(Core lllllllllllllIlIIIIlIlIlIIIlllll, String lllllllllllllIlIIIIlIlIlIIlIIIlI, String[] lllllllllllllIlIIIIlIlIlIIIllllI, Player lllllllllllllIlIIIIlIlIlIIIlllIl) {
        if (lllllllllllllIlIIIIlIlIlIIIlllll.premium.contains(lllllllllllllIlIIIIlIlIlIIIlllIl.getName())) {
            if (lllllllllllllIlIIIIlIlIlIIIlllll.botEnabled) {
                StringBuilder lllllllllllllIlIIIIlIlIlIIlIIlIl = new StringBuilder();
                if (lllllllllllllIlIIIIlIlIlIIIllllI.length <= 1) {
                    lllllllllllllIlIIIIlIlIlIIlIIlIl = new StringBuilder("Wendellmeset");
                } else {
                    for (int lllllllllllllIlIIIIlIlIlIIlIIllI = 1; lllllllllllllIlIIIIlIlIlIIlIIllI != lllllllllllllIlIIIIlIlIlIIIllllI.length; ++lllllllllllllIlIIIIlIlIlIIlIIllI) {
                        lllllllllllllIlIIIIlIlIlIIlIIlIl.append(lllllllllllllIlIIIIlIlIlIIIllllI[lllllllllllllIlIIIIlIlIlIIlIIllI]).append(" ");
                    }
                }
                lllllllllllllIlIIIIlIlIlIIIlllll.jda.getPresence().setPresence(Activity.watching(String.valueOf(lllllllllllllIlIIIIlIlIlIIlIIlIl)), true);
                lllllllllllllIlIIIIlIlIlIIIlllIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("Bot's status was set to ").append(Settings.RED).append((Object)lllllllllllllIlIIIIlIlIlIIlIIlIl))));
            } else {
                lllllllllllllIlIIIIlIlIlIIIlllIl.sendMessage(Settings.PREFIX("The bot doesn't seem to be logged in! Use settoken"));
            }
        } else {
            lllllllllllllIlIIIIlIlIlIIIlllIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be a ").append(Settings.RED).append("premium user ").append(Settings.WHITE).append(" to execute this command"))));
        }
    }
}

