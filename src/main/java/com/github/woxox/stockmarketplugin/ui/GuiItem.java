package com.github.woxox.stockmarketplugin.ui;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.inventory.ItemStack;


@Getter
@Setter
public abstract class GuiItem<T extends BaseItemType> {
    private ItemStack itemStack;
    private T itemType;
}
