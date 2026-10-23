package com.enderdevelopment.economy;

import org.bukkit.plugin.java.JavaPlugin;

public class EconomyPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("EconomyPlugin has been enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("EconomyPlugin has been disabled!");
    }
}