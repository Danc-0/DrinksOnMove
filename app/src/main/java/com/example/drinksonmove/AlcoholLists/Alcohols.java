package com.example.drinksonmove.AlcoholLists;

public class Alcohols {

    private String Type;
    private String Brand;

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    private String Origin;
    private String Quantity;

    public Alcohols(String type, String brand, String origin, String quantity) {
        Type = type;
        Brand = brand;
        Origin = origin;
        Quantity = quantity;
    }
}
