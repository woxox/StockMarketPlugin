package com.github.woxox.stockmarketplugin.manager;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.github.woxox.stockmarketplugin.StockMarketPlugin;
import com.github.woxox.stockmarketplugin.controller.GuiController;

public class GuiManager {
    private final JavaPlugin plugin;
    private final static GuiManager instance = new GuiManager();
    private final Map<Player, GuiController> playerToGuiControllerMap = new HashMap<>();

    public GuiManager() {
        plugin = StockMarketPlugin.getPlugin(StockMarketPlugin.class);
    }

    public void openGui(Player player, Supplier<GuiController> guiControllerConstructor) {
        GuiController guiController = this.playerToGuiControllerMap.get(player);

        if (guiController == null) {
            guiController = guiControllerConstructor.get();
            this.playerToGuiControllerMap.put(player, guiController);
            plugin.getServer().getPluginManager().registerEvents(guiController, plugin);
        }

        guiController.openInventory(player);
    }

    // @EventHandler
    // public void onInventoryClick(InventoryClickEvent e) {
    // if (e.getClickedInventory() == null) return;
    // Player p = (Player) e.getWhoClicked();
    // p.performCommand()
    // }

    // @EventHandler
    // public void onInventoryClick(InventoryClickEvent e) {
    // if (e.getClickedInventory() == null) return;
    // final Player p = (Player) e.getWhoClicked();
    // ExampleGui playerGui = this.playerToGuiMap.get(p);
    //
    // if (!e.getClickedInventory().equals(playerGui.getInv())) {
    // p.sendMessage("not equal inv");
    // return;
    // }
    //
    // if (e.getClickedInventory().equals(p.getInventory())) return;
    //
    // ItemStack clickedItem = e.getCurrentItem();
    // if (clickedItem == null) return;
    //
    // p.sendMessage(String.format("You Clicked pos: %s, item: %s", e.getRawSlot(),
    // clickedItem.getTranslationKey()));
    //
    // }

    // @EventHandler
    // public void onInventoryDrag(final InventoryDragEvent e) {
    // final Player p = (Player) e.getWhoClicked();
    // ExampleGui playerGui = this.playerToGuiMap.get(p);
    // if (e.getInventory().equals(playerGui.getInv())) {
    // e.setCancelled(true);
    // }
    // }

    public static GuiManager getInstance() {
        return instance;
    }
}
