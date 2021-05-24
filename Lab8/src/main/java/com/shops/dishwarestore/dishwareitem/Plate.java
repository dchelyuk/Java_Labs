package com.shops.dishwarestore.dishwareitem;

import com.shops.dishwarestore.enums.Category;
import com.shops.dishwarestore.enums.Country;
import com.shops.dishwarestore.enums.Shape;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Plate extends Dish {
    private String name;
    public double price;
    private double weightInG;
    private String manufacturer;
    private Country countryOrigin;
    private long code;
    private Category category;
    private List<Material> materials;
    private Shape shape;
    private int diameterInMm;
    private String colour;

    @Override
    public String toString() {
        return "Name: " + this.name + "\nPrice: " + this.price + "\nWeight in grams: " + this.weightInG
                + "\nManufacturer: " + this.manufacturer + "\nCountry of origin: " + this.countryOrigin
                + "\nBarcode: " + this.code + "\nCategory: " + this.category + "\nMaterials: " + this.materials
                + "\nShape: " + this.shape + "\nDiameter in mm: " + this.diameterInMm
                + "\n Colour: " + this.colour
                +"\n-------------------------------\n";
    }
}
