package com.example.shoppinglist.domain

class GetShopItemByIdUseCase(private val shopListRepository: ShopListRepository) {


    fun getShopItemById(shopItemId:Int):ShopItem=shopListRepository.getShopItemById(shopItemId)

}