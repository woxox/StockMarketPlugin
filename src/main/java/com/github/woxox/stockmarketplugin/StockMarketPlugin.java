package com.github.woxox.stockmarketplugin;

import com.github.woxox.stockmarketplugin.commands.TestCommand;
import com.github.woxox.stockmarketplugin.ui.ExampleGui;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class StockMarketPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("StackMarketPlugin Enabled");

        getCommand("test").setExecutor(new TestCommand());

        ExampleGui exampleGui = new ExampleGui();
        getServer().getPluginManager().registerEvents(exampleGui, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("StackMarketPlugin Disabled");
    }
}
