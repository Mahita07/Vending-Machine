package com.vendingmachine.vendingmachine

import com.vendingmachine.cart.Cart
import com.vendingmachine.checkout.CheckoutService
import com.vendingmachine.display.DisplayService
import com.vendingmachine.models.Item
import com.vendingmachine.models.Product
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.doNothing
import org.mockito.Mockito.verify
import org.mockito.Mockito.`when`
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class VendingMachineTest {
    @Mock
    private lateinit var displayService: DisplayService

    @Mock
    private lateinit var cart: Cart

    @Mock
    private lateinit var checkoutService: CheckoutService

    @InjectMocks
    private lateinit var vendingMachine: VendingMachine

    @Test
    fun `displayItems should return list of items`() {
        val expectedItemList = listOf(
            Item(Product("Lux", 10.0), 2),
            Item(Product("Lifebouy", 30.0), 1)
        )
        `when`(displayService.displayItems()).thenReturn(expectedItemList)

        val itemList = vendingMachine.displayItems()

        assertEquals(expectedItemList, itemList)
    }

    @Test
    fun `add to cart should call cart's  addToCart method`() {
        val item = Item(Product("Lux", 10.0), 2)
        doNothing().`when`(cart).addToCart(item)

        vendingMachine.addToCart(item)

        verify(cart).addToCart(item)
    }

    @Test
    fun `remove from cart should call cart's  removeFromCart method`() {
        val item = Item(Product("Lux", 10.0), 2)
        doNothing().`when`(cart).removeFromCart(item)

        vendingMachine.removeFromCart(item)

        verify(cart).removeFromCart(item)
    }

    @Test
    fun `checkout should return cost`() {
        `when`(checkoutService.checkoutCart()).thenReturn(0.0)

        val cost = vendingMachine.checkout()

        assertEquals(0.0,cost)


    }
}