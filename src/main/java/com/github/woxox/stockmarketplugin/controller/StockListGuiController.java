package com.github.woxox.stockmarketplugin.controller;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;

import com.github.woxox.stockmarketplugin.ui.StockListGui;

public class StockListGuiController implements GuiController {
  private final StockListGui gui;

  public StockListGuiController() {
    gui = new StockListGui();
  }

  @EventHandler
  public void onInventoryClick(InventoryClickEvent e) {
    if (e.getClickedInventory() != gui.getInventory()) {
      return;
    }

    e.setCancelled(true);
  }

  @EventHandler
  public void onInventoryDrag(InventoryDragEvent e) {
    if (e.getInventory() != gui.getInventory()) {
      return;
    }

    e.setCancelled(true);
  }

  @Override
  public void openInventory(Player player) {
    player.openInventory(gui.getInventory());
  }

  @Override
  public void closeInventory(Player player) {
    player.closeInventory();
  }
}
