package com.shops.dishwarestore.dishwareitem;

import com.shops.dishwarestore.enums.Category;
import com.shops.dishwarestore.enums.Country;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class DishwareItem {
    private String name;
    public double price;
    private double weightInG;
    private String manufacturer;
    private Country countryOrigin;
    private long code;
    private Category category;

    DishwareItem() {

    }

}
