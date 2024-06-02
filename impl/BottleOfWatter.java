package impl;

import java.time.LocalDate;

import Product.Product;

public class BottleOfWatter extends Product {

    private float volume;

    private String pack;

    private boolean isSpark;

    public BottleOfWatter(String name, double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.isSpark = false;
        this.volume = 1;
        this.pack = EPackage.PLASTIC.getMaterial();
    }

    public BottleOfWatter(String name, double price, LocalDate releaseDate, boolean isSpark, String pack, float volume) {
        super(name, price, releaseDate);
        this.isSpark = isSpark;
        this.pack = pack;
        this.volume = volume;
    }
    
    public float getVolume() {
        return volume;
    }

    public String getPack() {
        return pack;
    }

    public boolean isSpark() {
        return isSpark;
    }


    @Override
    public String toString() {
        return "{" + 
                "name = '" + name + '\'' + 
                ", price = " + price + 
                ", releaseDate = " + releaseDate + 
                ", volume = " + volume +
                ", pack = " + pack + 
                ", isSpark = " + isSpark + '}';
    }

    
}
