package com.example.shoppinglist.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoppinglist.data.ShopListRepositoryImpl
import com.example.shoppinglist.domain.*

class MainViewModel : ViewModel() {

    private val shopListRepository = ShopListRepositoryImpl

    private val addShopListItemUseCase= AddShopListItemUseCase(shopListRepository)
    private val editShopItemUseCase = EditShopItemUseCase(shopListRepository)
    private val getShopListUseCase = GetShopListUseCase(shopListRepository)
    private val deleteShopListItemUseCase = DeleteShopListItemUseCase(shopListRepository)

     val shopList = MutableLiveData<List<ShopItem>>()

    fun getShopList(){
       val list = getShopListUseCase.getShopList()
        shopList.postValue(list)
    }

    fun deleteShopListItem (shopItem: ShopItem){
        deleteShopListItemUseCase.deleteShopListItem(shopItem)
        getShopList()
    }

    fun editShopItemUseCase (shopItem: ShopItem){
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
        getShopList()
    }


}