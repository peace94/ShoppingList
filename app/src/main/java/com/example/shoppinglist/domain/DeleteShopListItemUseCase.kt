package com.example.shoppinglist.domain

class DeleteShopListItemUseCase(private val shopListRepository: ShopListRepository) {



    fun deleteShopListItem (shopItem: ShopItem){
        shopListRepository.deleteShopListItem(shopItem)
    }
}