package com.example.shoppinglist.domain

interface ShopListRepository {

    fun addShopListItem(shopItem:ShopItem)

    fun getShopList (): List<ShopItem>

    fun deleteShopListItem (shopItem: ShopItem)

    fun getShopItemById(shopItemId:Int):ShopItem

    fun editShopItem(shopItem: ShopItem)

}