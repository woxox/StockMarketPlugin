package com.github.woxox.stockmarketplugin.ui;

import org.bukkit.inventory.ItemStack;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class GuiItem<T extends BaseItemType> {
    private ItemStack itemStack;
    private T itemType;
}
