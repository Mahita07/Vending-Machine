package com.vendingmachine.display

import com.vendingmachine.inventory.Inventory
import com.vendingmachine.models.Product
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DisplayServiceTest {
    @Test
    fun `viewProducts should display product list`() {
        val inventory = Inventory(listOf(
            Product("Lux", 10, 10.0),
            Product("Lifebouy", 5, 20.0)
        ))
        val displayService = DisplayService(inventory)

        val productList = displayService.viewProducts()

        val expectedProductList = listOf(
            Product("Lux", 10, 10.0),
            Product("Lifebouy", 5, 20.0)
            )
        assertEquals(expectedProductList,productList)
    }
}