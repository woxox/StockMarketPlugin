package com.github.woxox.stockmarketplugin.controller;

import com.github.woxox.stockmarketplugin.ui.ExampleGui;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class ExampleGuiController implements GuiController {
    private final ExampleGui exampleGui;

    public ExampleGuiController() {
        exampleGui = new ExampleGui();
    }


    // You can open the inventory with this
    public void openInventory(Player player) {
        player.openInventory(exampleGui.getInventory());
    }

    @Override
    public void closeInventory(Player player) {
        player.closeInventory();
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        final Player p = (Player) e.getWhoClicked();
        if (e.getClickedInventory() == null) return;

        if (!e.getClickedInventory().equals(this.exampleGui.getInventory())) return;

        e.setCancelled(true);
        ItemStack itemStack = e.getCurrentItem();
        if (itemStack == null || itemStack.getType().isAir()) return;

        p.sendMessage(itemStack.getType().name());
        p.performCommand("test2");
//        p.sendMessage("example gui event");
    }
}
