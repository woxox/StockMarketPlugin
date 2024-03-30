package com.github.woxox.stockmarketplugin.ui;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class StockListGui extends Gui {
  public StockListGui() {
    super(54, "Stock List");

    initializeInventoryItems();
  }

  private void initializeInventoryItems() {
    placeItemIntoInventory(45, Material.PLAYER_HEAD, "내 주식", "내 주식 목록을 열람합니다.");
  }

  private void placeItemIntoInventory(int index, Material material, String name, String... lore) {
    final ItemStack itemStack = new ItemStack(material, 1);
    final ItemMeta itemMeta = itemStack.getItemMeta();

    itemMeta.setDisplayName(name);
    itemMeta.setLore(Arrays.asList(lore));

    itemStack.setItemMeta(itemMeta);

    inventory.setItem(index, itemStack);
  }
}
