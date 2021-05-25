package com.shops.dishwarestore.shopmanager;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.shops.dishwarestore.dishwareitem.DishwareItem;
import com.shops.dishwarestore.enums.Country;
import com.shops.dishwarestore.enums.SortOrder;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ShopManager {
    private final List<DishwareItem> goods;

    public List<DishwareItem> searchByCountry(Country searchedCountry) {
        List<DishwareItem> searchResult = new ArrayList<>();
        for (DishwareItem i : goods) {
            if (i.getCountryOrigin() == searchedCountry) {
                searchResult.add(i);
            }
        }
        return searchResult;
    }

    public List<DishwareItem> sortByCountry(SortOrder order) {
        List<DishwareItem> sorted = new ArrayList<>(goods);
        if (order == SortOrder.ASCENDING) {
            sorted.sort(Comparator.comparing(DishwareItem::getCountryOrigin));
        } else {
            sorted.sort(Comparator.comparing(DishwareItem::getCountryOrigin).reversed());
        }
        return sorted;
    }

    public List<DishwareItem> sortByCategory(SortOrder order) {
        List<DishwareItem> sorted = new ArrayList<>(goods);
        if (order == SortOrder.ASCENDING) {
            sorted.sort(Comparator.comparing(DishwareItem::getCategory));
        } else {
            sorted.sort(Comparator.comparing(DishwareItem::getCategory).reversed());
        }
        return sorted;
    }
}
