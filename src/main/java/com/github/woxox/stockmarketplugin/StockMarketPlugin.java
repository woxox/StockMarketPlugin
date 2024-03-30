package com.github.woxox.stockmarketplugin;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.github.woxox.stockmarketplugin.commands.StockListCommand;
import com.github.woxox.stockmarketplugin.commands.Test2Command;
import com.github.woxox.stockmarketplugin.commands.TestCommand;

public final class StockMarketPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("StackMarketPlugin Enabled");

        getCommand("stock").setExecutor(new StockListCommand());

        // Test commands
        getCommand("test").setExecutor(new TestCommand());
        getCommand("test2").setExecutor(new Test2Command());

        // getServer().getPluginManager().registerEvents(new ExampleGuiController(),
        // this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("StackMarketPlugin Disabled");
    }
}
