package com.github.woxox.stockmarketplugin.ui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.Map;

public class ExampleGui extends Gui {


    public ExampleGui() {
        // Create a new inventory, with no owner (as this isn't a real inventory), a size of nine, called example
        inventory = Bukkit.createInventory(null, 54, "Example");

        // Put the items into the inventory
//        initializeItems();
    }


//    // You can call this whenever you want to put the items in
//    public void initializeItems() {
//        inventory.setItem(2, createGuiItem(Material.DIAMOND_SWORD, "Example Sword", "First line of the lore", "Second line of the lore"));
//        inventory.setItem(4, createGuiItem(Material.IRON_HELMET, "Example Helmet", "First line of the lore", "Secnd line of the lore"));
//        inventory.setItem(0, createGuiItem(Material.PAPER, "Test2 Command"));
//    }

    // Nice little method to create a gui item with a custom name, and description
//    protected ItemStack createGuiItem(final Material material, final String name, final String... lore) {
//        final ItemStack item = new ItemStack(material, 1);
//        final ItemMeta meta = item.getItemMeta();
//
//        // Set the name of the item
//        meta.setDisplayName(name);
//        // Set the lore of the item
//        meta.setLore(Arrays.asList(lore));
//
//        item.setItemMeta(meta);
//
//        return item;
//    }
}