package com.github.woxox.stockmarketplugin.ui;

import lombok.Getter;
import org.bukkit.inventory.Inventory;

import java.util.Map;


@Getter
public abstract class Gui {
    Inventory inventory = null;
    Map<Integer, GuiItem<BaseItemType>> itemMap;


    void addItem(Integer index, GuiItem<BaseItemType> item) {
        itemMap.put(index, item);
        refresh();
    }

    void removeItem(Integer index) {
        itemMap.remove(index);
        refresh();
    }

    void refresh () {
        itemMap.forEach((index, item) -> {
            inventory.setItem(index, item.getItemStack());
        });
    }
}
