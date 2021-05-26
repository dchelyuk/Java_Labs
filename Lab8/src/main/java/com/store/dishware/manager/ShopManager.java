package com.store.dishware.manager;

import com.store.dishware.enums.Country;
import com.store.dishware.enums.SortOrder;
import com.store.dishware.models.DishwareItem;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class ShopManager {
    private final List<DishwareItem> goods;

    public List<DishwareItem> searchByCountry(Country searchedCountry) {
        List<DishwareItem> searchResult = new ArrayList<>();
        return goods.stream().filter(item -> item.getCountryOrigin() == searchedCountry).collect(Collectors.toList());
    }

    private List<DishwareItem> sortBy(SortOrder order, Comparator<DishwareItem> comparator) {
        List<DishwareItem> sorted = new ArrayList<>(goods);
        if (order == SortOrder.ASCENDING) {
            sorted.sort(comparator);
        } else {
            sorted.sort(comparator.reversed());
        }
        return sorted;
    }

    public List<DishwareItem> sortByCountry(SortOrder order) {
        return sortBy(order, Comparator.comparing(DishwareItem::getCountryOrigin));
    }

    public List<DishwareItem> sortByCategory(SortOrder order) {
        return sortBy(order, Comparator.comparing(DishwareItem::getCategory));
    }
}