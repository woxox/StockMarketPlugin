package com.github.woxox.stockmarketplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.github.woxox.stockmarketplugin.controller.StockListGuiController;
import com.github.woxox.stockmarketplugin.manager.GuiManager;

public class StockListCommand implements CommandExecutor {
  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    if (sender instanceof Player) {
      GuiManager.getInstance().openGui((Player) sender, StockListGuiController::new);

      return true;
    }

    return false;
  }
}
