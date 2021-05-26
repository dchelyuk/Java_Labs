package com.store.dishware.models;

import com.store.dishware.enums.Category;
import com.store.dishware.enums.Country;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DishwareItem {
    private String name;
    public double price;
    private double weightInG;
    private String manufacturer;
    private Country countryOrigin;
    private long code;
    private Category category;
}
