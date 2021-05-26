package com.store.dishware.models;

import com.store.dishware.enums.Category;
import com.store.dishware.enums.Country;
import com.store.dishware.enums.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Cutlery extends DishwareItem {
    private String name;
    public double price;
    private double weightInG;
    private String manufacturer;
    private Country countryOrigin;
    private long code;
    private Category category;
    private Size size;

}
