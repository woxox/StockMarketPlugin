package com.github.woxox.stockmarketplugin.controller;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public interface GuiController extends Listener {
    public void openInventory(Player player);
    public void closeInventory(Player player);
}
