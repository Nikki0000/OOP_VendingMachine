package impl;

import java.time.LocalDate;

import Product.Product;

public class HotDrink extends Product {

    protected Integer temperature;

    protected Float volume;

    // конструктор экзмпляра HotDrink класса Product
    public HotDrink(String name, double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.volume = 0.5F;
        this.temperature = 22;
    }

    // конструктор экзмпляра HotDrink класса Product
    public HotDrink(String name, double price, LocalDate releaseDate, Float volume, Integer temperature) {
        super(name, price, releaseDate);
        this.volume = volume;
        this.temperature = temperature;
    }

    public Float getVolume() {
        return volume;
    }

    public Integer getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "{" + 
            "name = '" + name + '\'' + 
            ", price = " + price + 
            ", releaseDate = " + releaseDate + 
            ", volume = " + volume +
            ", temperature = " + temperature + '}';
    }
    
}
