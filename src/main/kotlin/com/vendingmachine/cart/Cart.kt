package com.vendingmachine.cart

import com.vendingmachine.models.Item
import com.vendingmachine.models.Product

class Cart {
    val list: MutableList<Item> = mutableListOf()

    fun addToCart(item: Item) {
        list.add(item)
    }

    fun removeFromCart(item: Item) {
        list.remove(item)
    }

}