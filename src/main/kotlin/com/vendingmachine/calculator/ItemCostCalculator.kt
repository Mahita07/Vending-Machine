package com.vendingmachine.calculator

import com.vendingmachine.models.Item

class ItemCostCalculator {
    fun calculateItemCost(item: Item) :Double{
        val product = item.product
        val quantity = item.quantity
        val price = product.price
        return price*quantity
    }
}