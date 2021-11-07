package com.crashhascrashed.greylist;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        //Enable Listeners
        getServer().getPluginManager().registerEvents(new PlayerListener(), this);

        getLogger().info("onEnable is called!");
    }
    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }
}
