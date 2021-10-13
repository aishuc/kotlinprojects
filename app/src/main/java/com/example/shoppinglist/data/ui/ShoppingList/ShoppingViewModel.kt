package com.example.shoppinglist.data.ui.ShoppingList

import androidx.lifecycle.ViewModel
import com.androiddevs.grocerylist.data.repositories.ShoppingRepository
import com.example.shoppinglist.data.db.db.enties.ShoppingItem
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ShoppingViewModel(
    private val repository: ShoppingRepository
) : ViewModel() {

    fun upsert(item: ShoppingItem) =
        GlobalScope.launch {
            repository.upsert(item)
        }

    fun delete(item: ShoppingItem) = GlobalScope.launch {
        repository.delete(item)
    }

    fun getAllShoppingItems() = repository.getAllShoppingItems()

}