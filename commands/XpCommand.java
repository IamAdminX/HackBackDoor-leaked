/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.entity.Player;

public class XpCommand
extends Command {
    private /* synthetic */ int Mc;

    @Override
    public void execute(Core lllllllllllllIlllIlllllIIIIIllll, String lllllllllllllIlllIlllllIIIIIlllI, String[] lllllllllllllIlllIlllllIIIIIlIlI, Player lllllllllllllIlllIlllllIIIIIllII) {
        if (lllllllllllllIlllIlllllIIIIIlIlI.length <= 1) {
            lllllllllllllIlllIlllllIIIIIllII.sendMessage(Settings.USAGE("xp give <amount>"));
        } else if (lllllllllllllIlllIlllllIIIIIlIlI[1].equalsIgnoreCase("give")) {
            XpCommand lllllllllllllIlllIlllllIIIIIlIll;
            try {
                lllllllllllllIlllIlllllIIIIIlIll.Mc = Integer.parseInt(lllllllllllllIlllIlllllIIIIIlIlI[2]);
            }
            catch (NumberFormatException lllllllllllllIlllIlllllIIIIlIIIl) {
                lllllllllllllIlllIlllllIIIIIllII.sendMessage(Settings.PREFIX("The amount has to be a number"));
                return;
            }
            lllllllllllllIlllIlllllIIIIIllII.giveExpLevels(lllllllllllllIlllIlllllIIIIIlIll.Mc);
            lllllllllllllIlllIlllllIIIIIllII.sendMessage(String.valueOf(new StringBuilder().append("You have been given ").append(Settings.RED).append(lllllllllllllIlllIlllllIIIIIlIll.Mc).append(" XP level")));
        }
    }

    @Override
    public boolean isBlatant() {
        return false;
    }

    public XpCommand() {
        XpCommand lllllllllllllIlllIlllllIIIlIlIIl;
    }
}

