/*
 * Decompiled with CFR 0.150.
 */
package me.system.runner.methods;

import java.util.Random;
import me.system.runner.utils.Settings;

public class Tips {
    public static String getTip() {
        String[] llllllllllllllllllIlIIIllIllIlIl = new String[]{String.valueOf(new StringBuilder().append("Remember to flood chat using ").append(Settings.RED).append("'flood'")), String.valueOf(new StringBuilder().append("Dont get banned by using ").append(Settings.RED).append("'togglecmds' & 'lockconsole'")), String.valueOf(new StringBuilder().append("Good griefing tools are ").append(Settings.RED).append("'bombs'")), String.valueOf(new StringBuilder().append("Talk to other").append(Settings.NAME).append(" users using ").append(Settings.RED).append("'sc <message>'")), String.valueOf(new StringBuilder().append("Talk in regular chat using ").append(Settings.RED).append("'chat <message>'")), String.valueOf(new StringBuilder().append("Enter file navigation using ").append(Settings.RED).append("'fn'")), String.valueOf(new StringBuilder().append("To make sure you don't get caught, use ").append(Settings.RED).append("'blatant'")), String.valueOf(new StringBuilder().append("Dupe your items with ").append(Settings.RED).append("'dupe'")), String.valueOf(new StringBuilder().append("Install other plugins with ").append(Settings.RED).append("'install'")), String.valueOf(new StringBuilder().append("Delete other plugins with ").append(Settings.RED).append("'delplugin'")), String.valueOf(new StringBuilder().append("Edit/delete files on the server using ").append(Settings.RED).append("'edit'")), String.valueOf(new StringBuilder().append("There are ").append(Settings.RED).append("over 100  forceop commands")), String.valueOf(new StringBuilder().append("Raid the servers discord using ").append(Settings.RED).append("'discordraider'")), String.valueOf(new StringBuilder().append("Change the theme of HackBackdoor using ").append(Settings.RED).append("'theme'")), String.valueOf(new StringBuilder().append("To test if you can use discord raider, use ").append(Settings.RED).append("'showtoken'")), String.valueOf(new StringBuilder().append("Use griefing wands with ").append(Settings.RED).append("'wands'")), String.valueOf(new StringBuilder().append("Connect to ").append(Settings.NAME).append(" console using ").append(Settings.RED).append("'consoleconnect'"))};
        Random llllllllllllllllllIlIIIllIllIlII = new Random();
        int llllllllllllllllllIlIIIllIllIIll = llllllllllllllllllIlIIIllIllIlII.nextInt(llllllllllllllllllIlIIIllIllIlIl.length);
        return llllllllllllllllllIlIIIllIllIlIl[llllllllllllllllllIlIIIllIllIIll];
    }

    public Tips() {
        Tips llllllllllllllllllIlIIIllIlllIlI;
    }
}

