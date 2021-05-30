package com.store.dishware.models;

import com.store.dishware.enums.Category;
import com.store.dishware.enums.Country;
import lombok.*;
import org.springframework.lang.NonNull;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DishwareItem {

    private Integer id;

    private String name;

    @NonNull
    public double price;

    @NonNull
    private double weightInG;
    
    private String manufacturer;

    private Country countryOrigin;

    @NonNull
    private long code;

    private Category category;
}
