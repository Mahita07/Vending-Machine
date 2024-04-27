package com.vendingmachine.inventory

import com.vendingmachine.models.Item
import org.springframework.stereotype.Component

@Component
data class Inventory(val itemList: List<Item>)