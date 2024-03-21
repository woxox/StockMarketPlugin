package com.github.woxox.stockmarketplugin.commands;

import com.github.woxox.stockmarketplugin.ui.ExampleGui;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;

public class TestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            ExampleGui exampleGui = new ExampleGui();
            exampleGui.openInventory((HumanEntity)commandSender);

            return true;
        }

        return false;
    }
}
