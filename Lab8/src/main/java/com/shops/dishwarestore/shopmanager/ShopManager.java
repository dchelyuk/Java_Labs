package com.shops.dishwarestore.shopmanager;

import java.util.ArrayList;
import java.util.List;

import com.shops.dishwarestore.dishwareitem.DishwareItem;
import com.shops.dishwarestore.enums.Country;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ShopManager {
    public List<DishwareItem> goods;

    public List<DishwareItem> searchByCountry(Country searchedCountry) {
       List<DishwareItem> searchResult = new ArrayList<>();
       for (DishwareItem i : goods) {
           if (i.getCountryOrigin() == searchedCountry) {
               searchResult.add(i);
           }
       }
       return searchResult;
    }
}
