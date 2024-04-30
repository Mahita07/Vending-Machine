package com.vendingmachine.checkout

import com.vendingmachine.calculator.CostCalculator
import com.vendingmachine.cart.Cart
import com.vendingmachine.models.Item
import com.vendingmachine.models.Product
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class CheckoutServiceTest {

    @Mock
    private lateinit var costCalculator: CostCalculator

    @Test
    fun `checkout cart should return total cost of items in cart`() {
        val expectedItemList = listOf(
            Item(Product("Lux", 10.0), 2),
            Item(Product("Lifebouy", 30.0), 1)
        )
        val expectedCost = 50.0
        val cart = Cart(expectedItemList)
        val checkoutService = CheckoutService(cart, costCalculator)
        `when`(costCalculator.calculateTotalCost(cart.itemList)).thenReturn(expectedCost)
        val actualCost = checkoutService.checkoutCart()

        assertEquals(expectedCost, actualCost)
    }
}