package com.vendingmachine.vendingmachine

import com.vendingmachine.calculator.CostCalculator
import com.vendingmachine.cart.Cart
import com.vendingmachine.checkout.CheckoutService
import com.vendingmachine.display.DisplayService
import com.vendingmachine.models.Item
import org.springframework.beans.factory.annotation.Autowired

class VendingMachine(
    @Autowired private val displayService: DisplayService,
    @Autowired val cart: Cart,
    @Autowired val checkoutService: CheckoutService
) {
    fun displayItems(): List<Item> {
        return displayService.displayItems()
    }

    fun addToCart(item: Item) {
        cart.addToCart(item)
    }

    fun removeFromCart(item: Item) {
        cart.removeFromCart(item)
    }

    fun checkout(): Double {
        return checkoutService.checkoutCart()
    }
}