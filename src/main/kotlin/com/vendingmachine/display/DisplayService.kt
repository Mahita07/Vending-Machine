package com.vendingmachine.display

import com.vendingmachine.models.Product
import com.vendingmachine.inventory.Inventory

class DisplayService(private val inventory: Inventory) {
    fun viewProducts(): List<Product> {
        return inventory.productList
    }
}