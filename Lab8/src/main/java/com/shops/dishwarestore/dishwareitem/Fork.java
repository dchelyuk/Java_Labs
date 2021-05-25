package com.shops.dishwarestore.dishwareitem;

import com.shops.dishwarestore.enums.Category;
import com.shops.dishwarestore.enums.Country;
import com.shops.dishwarestore.enums.Purpose;
import com.shops.dishwarestore.enums.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
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
                + "\nManufacturer: " + this.manufacturer + "\nCountry of origin: " + this.countryOrigin
                + "\nBarcode: " + this.code + "\nCategory: " + this.category + "\nSize: " + this.size
                + "\nPurpose: " + this.purpose
                + "\n-------------------------------\n";
    }
}
