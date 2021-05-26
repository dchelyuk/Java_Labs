package com.store.dishware.models;

import com.store.dishware.enums.Category;
import com.store.dishware.enums.Country;
import com.store.dishware.enums.Purpose;
import com.store.dishware.enums.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Fork extends Cutlery {
    private String name;
    public double price;
    private double weightInG;
    private String manufacturer;
    private Country countryOrigin;
    private long code;
    private Category category;
    private Size size;
    private Purpose purpose;

    @Override
    public String toString() {
        return "Name: " + this.name + "\nPrice: " + this.price + "\nWeight in grams: " + this.weightInG
                + "\nManufacturer: " + this.manufacturer + "\nCountry of origin: " + this.countryOrigin.getCountry()
                + "\nBarcode: " + this.code + "\nCategory: " + this.category.getCategoryName()
                + "\nSize: " + this.size.getSize() + "\nPurpose: " + this.purpose.getPurpose()
                + "\n-------------------------------\n";
    }
}