package com.example.shoppinglist.data.ui.ShoppingList

import com.example.shoppinglist.data.db.db.enties.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}