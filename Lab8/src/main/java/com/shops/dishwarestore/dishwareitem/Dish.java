package com.shops.dishwarestore.dishwareitem;

import com.shops.dishwarestore.enums.Category;
import com.shops.dishwarestore.enums.Country;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Dish extends DishwareItem{
    private String name;
    public double price;
    private double weightInG;
    private String manufacturer;
    private Country countryOrigin;
    private long code;
    private Category category;
    private Material[] materials;

    Dish() {

    }
}
