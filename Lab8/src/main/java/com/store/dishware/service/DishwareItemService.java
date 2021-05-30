package com.store.dishware.service;

import com.store.dishware.models.DishwareItem;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Service
@ApplicationScope
public class DishwareItemService {

    private AtomicInteger id = new AtomicInteger(0);
    private Map<Integer, DishwareItem> dishwareItemsMap = new HashMap<>();

    public DishwareItem addDishwareItem(DishwareItem dishwareItem) {
        Integer dishwareItemId = id.incrementAndGet();
        dishwareItem.setId(dishwareItemId);
        dishwareItemsMap.put(dishwareItemId, dishwareItem);
        return dishwareItem;
    }

    public DishwareItem updateDishwareItem(DishwareItem dishwareItem) {
        return dishwareItemsMap.put(dishwareItem.getId(), dishwareItem);
    }

    public List<DishwareItem> getDishwareItems() {
        return dishwareItemsMap.values().stream().collect(Collectors.toList());
    }
    public DishwareItem getDishwareItem(Integer id) {
        return dishwareItemsMap.get(id);
    }
}
