package com.vendingmachine.cart

import com.vendingmachine.models.Item
import com.vendingmachine.models.Product
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CartTest {
    @Test
    fun `add to cart should add item of choice to cart`() {
        val cart = Cart()
        val item = Item(Product("Lux", 10.0), 1)
        cart.addToCart(item)
        assertThat(cart.list).hasSameElementsAs(listOf(item))
    }

    @Test
    fun `remove from cart should remove item from cart`() {
        val cart = Cart()
        val item = Item(Product("Lux",10.0),1)
        cart.removeFromCart(item)
        assertThat(cart.list).hasSameElementsAs(mutableListOf())
    }
}