package com.store.dishware.models;

import com.store.dishware.enums.Category;
import com.store.dishware.enums.Country;
import com.store.dishware.enums.Shape;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
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
                + "\nManufacturer: " + this.manufacturer + "\nCountry of origin: " + this.countryOrigin.getCountry()
                + "\nBarcode: " + this.code + "\nCategory: " + this.category.getCategoryName()
                + "\nMaterials: " + this.materials + "\nShape: " + this.shape.getShape()
                + "\nDiameter in mm: " + this.diameterInMm + "\n Colour: " + this.colour
                + "\n-------------------------------\n";
    }
}