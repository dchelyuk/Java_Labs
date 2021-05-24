package com.shops.dishwarestore.dishwareitem;

import com.shops.dishwarestore.enums.Category;
import com.shops.dishwarestore.enums.Country;
import com.shops.dishwarestore.enums.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public class Cutlery extends Dish {
    private String name;
    public double price;
    private double weightInG;
    private String manufacturer;
    private Country countryOrigin;
    private long code;
    private Category category;
    private Size size;

    Cutlery() {

    }
}
