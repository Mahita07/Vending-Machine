package com.vendingmachine.inventory

import com.vendingmachine.models.Item
import com.vendingmachine.models.Product
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class InventoryTest(@Autowired val inventory: Inventory) {
    private lateinit var item : Item
    @BeforeAll
    fun setup() {
         item = Item(Product("Lux", 10.0), 1)
    }
    @Test
    fun ` should return true if an item is present in inventory`() {
        val inventory = Inventory(listOf(item))
        val expectedStatus = true

        val actualStatus = inventory.isItemInInventory(item)

        assertEquals(expectedStatus, actualStatus)
    }

    @Test
    fun `should return false if an item is not present in inventory`() {
        val expectedStatus = false

        val actualStatus = inventory.itemList.contains(item)

        assertEquals(expectedStatus,actualStatus)

    }
}