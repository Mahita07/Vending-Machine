package com.vendingmachine.calculator

import com.vendingmachine.models.Item
import com.vendingmachine.models.Product
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CostCalculatorTest {
    @Test
    fun `calculate total cost should return correct total cost of all items present in cart`() {
        val calculator = CostCalculator()
        val itemList = listOf(
            Item(Product("Lux", 10.0), 2),
            Item(Product("Lifebouy", 30.0), 1)
        )
        val expectedTotalCost = 50.0

        val actualTotalCost = calculator.calculateTotalCost(itemList)

        assertEquals(expectedTotalCost, actualTotalCost)
    }
}