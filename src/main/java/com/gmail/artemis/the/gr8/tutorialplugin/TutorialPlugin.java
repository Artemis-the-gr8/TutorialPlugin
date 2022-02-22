package com.gmail.artemis.the.gr8.tutorialplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class TutorialPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Enabling TutorialPlugin");
    }
    @Override
    public void onDisable() {
        getLogger().info("Disabling TutorialPlugin");
    }


}
