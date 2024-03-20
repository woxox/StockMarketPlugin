package com.github.woxox.stockmarketplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class StockMarketPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("StackMarketPlugin Enabled");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("StackMarketPlugin Disabled");
    }
}
