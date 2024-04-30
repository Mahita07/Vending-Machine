package com.vendingmachine.cart

import com.vendingmachine.models.Item
import org.springframework.stereotype.Component

@Component
class Cart(final val list: MutableList<Item> = mutableListOf()) {
    val itemList : MutableList<Item> = list.toMutableList()
    fun addToCart(item: Item) {
        itemList.add(item)
    }

    fun removeFromCart(item: Item) {
        itemList.remove(item)
    }

}