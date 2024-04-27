package com.vendingmachine.calculator

import com.vendingmachine.models.Item

class CostCalculator{
    private val itemCostCalculator = ItemCostCalculator()
    fun calculateTotalCost(itemList: List<Item>): Double {
        var totalCost = 0.0
        itemList.forEach{
            item ->
            totalCost+=itemCostCalculator.calculateItemCost(item)
        }
        return totalCost
    }

}