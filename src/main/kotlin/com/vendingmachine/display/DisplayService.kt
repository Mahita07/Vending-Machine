package com.vendingmachine.display

import com.vendingmachine.inventory.Inventory
import com.vendingmachine.models.Item
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class DisplayService(@Autowired private val inventory: Inventory) {
    fun displayItems(): List<Item> {
        return inventory.itemList
    }
}