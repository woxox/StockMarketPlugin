package com.github.woxox.stockmarketplugin.ui;

import java.util.Map;

import javax.annotation.Nullable;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

import lombok.Getter;

@Getter
public abstract class Gui {
    Inventory inventory = null;
    Map<Integer, GuiItem<BaseItemType>> itemMap;

    public Gui(int size, String title) {
        initializeInventory(null, size, title);
    }

    void initializeInventory(@Nullable InventoryHolder owner, int size, String title) {
        inventory = Bukkit.createInventory(owner, size, title);
    }

    void addItem(Integer index, GuiItem<BaseItemType> item) {
        itemMap.put(index, item);
        refresh();
    }

    void removeItem(Integer index) {
        itemMap.remove(index);
        refresh();
    }

    void refresh() {
        itemMap.forEach((index, item) -> {
            inventory.setItem(index, item.getItemStack());
        });
    }
}
