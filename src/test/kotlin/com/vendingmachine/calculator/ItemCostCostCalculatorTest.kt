package com.vendingmachine.calculator

import com.vendingmachine.models.Item
import com.vendingmachine.models.Product
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ItemCostCostCalculatorTest {
    @Test
    fun `calculate item cost should return cost of an item`() {
        val itemCostCalculator = ItemCostCalculator()
        val item = Item(Product("Lux", 10.0),2)
        val expectedItemCost = 20.0

        val actualItemCost = itemCostCalculator.calculateItemCost(item)

        assertEquals(expectedItemCost,actualItemCost)

    }
}