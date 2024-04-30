package com.vendingmachine.checkout

import com.vendingmachine.calculator.CostCalculator
import com.vendingmachine.cart.Cart
import org.springframework.beans.factory.annotation.Autowired

class CheckoutService(@Autowired val cart: Cart, @Autowired val costCalculator: CostCalculator) {
    fun checkoutCart(): Double {
        val totalCost = costCalculator.calculateTotalCost(cart.itemList)
        return totalCost
    }
}