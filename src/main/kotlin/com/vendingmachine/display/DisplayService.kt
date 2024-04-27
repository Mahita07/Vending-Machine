package com.vendingmachine.display

import com.vendingmachine.inventory.Inventory
import com.vendingmachine.models.Item

class DisplayService(private val inventory: Inventory) {
    fun displayItems(): List<Item> {
        return inventory.itemList
    }
}