package com.gmail.artemis.the.gr8.tutorialplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Enabling TutorialPlugin");
        super.onEnable();
    }
    @Override
    public void onDisable() {
        getLogger().info("Disabling TutorialPlugin");
        super.onDisable();
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("hello")) {
            if (args.length == 0) {
                sender.sendMessage(ChatColor.GOLD+"hello"+ ChatColor.RED +" w"+ChatColor.LIGHT_PURPLE+"o"+ChatColor.AQUA+"r"+ChatColor.GREEN+"l"+ChatColor.GOLD+"d");
                return true;
            }
        }
        return false;
    }
}
