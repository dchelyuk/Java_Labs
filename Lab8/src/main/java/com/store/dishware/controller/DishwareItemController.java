package com.store.dishware.controller;

import com.store.dishware.models.DishwareItem;
import com.store.dishware.service.DishwareItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/dishware-item")
public class DishwareItemController {

    @Autowired
    private DishwareItemService dishwareItemService;

    @GetMapping(path = "/{id}")
    public DishwareItem getDishwareItem(@PathVariable(name = "id") Integer id) {
        return dishwareItemService.getDishwareItem(id);
    }

    @GetMapping
    public List<DishwareItem> getDishwareItems() {
        return dishwareItemService.getDishwareItems();
    }

    @PutMapping
    public DishwareItem createDishwareItem(@RequestBody DishwareItem dishwareItem) {
        return dishwareItemService.addDishwareItem(dishwareItem);
    }

    @PostMapping
    public ResponseEntity<DishwareItem> updateDishwareItem(@RequestBody DishwareItem dishwareItem) {
        if (dishwareItemService.getDishwareItem(dishwareItem.getId()) != null) {
            return new ResponseEntity<>(dishwareItemService.updateDishwareItem(dishwareItem),
                    HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
