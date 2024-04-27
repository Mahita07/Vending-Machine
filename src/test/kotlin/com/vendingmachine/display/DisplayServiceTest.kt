package com.vendingmachine.display

import com.vendingmachine.inventory.Inventory
import com.vendingmachine.models.Item
import com.vendingmachine.models.Product
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class DisplayServiceTest {
    @Test
    fun `displayProducts should display product list`(): Unit {
        val expectedItem1 = Item(Product("Lux", 10.0), 1)
        val expectedItem2 = Item(Product("Lifebouy", 20.0), 1)
        val expectedItemList =
            listOf(
                expectedItem1,expectedItem2
            )
        val inventory = Inventory(
            listOf(
                expectedItem1, expectedItem2
            )
        )
        val displayService = DisplayService(inventory)

        val itemList = displayService.displayItems()


        assertThat(expectedItemList).hasSameElementsAs(itemList)
    }
}