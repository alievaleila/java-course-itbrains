package org.example.onlinestoresystem;

import java.util.StringJoiner;

public class Clothing extends Product{
    private String size;
    private String season;

    public Clothing(String name, double basePrice, String size, String season) {
        super(name, basePrice);
        this.size = size;
        this.season = season;
    }

    public String getSize() {
        return size;
    }

    public String getSeason() {
        return season;
    }


    @Override
    double calculatePrice() {
        if(season.equalsIgnoreCase("WINTER")){
            return getBasePrice()+ getBasePrice()/10;

        }else{
            return getBasePrice();
        }
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "name='" + super.getName() + '\''+
                ", price='" + super.getBasePrice() + '\''+
                ", season='" + season + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
