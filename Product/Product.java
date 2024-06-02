package Product;

import java.time.LocalDate;

public class Product {
    
    
    protected String name;

    protected double price;

    protected LocalDate releaseDate;

    // конструктор класса product
    public Product(String name, double price, LocalDate releaseDate) {
        this.name = name;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    // сеттер
    public void setPrice(double price) {
        this.price = price;
    }

    //геттер
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    /// переопределяем toString()
    @Override
    public String toString() {
        return "{" + 
                "name='" + name + '\'' + 
                ", price" + price + 
                ", releaseDate=" + releaseDate + '}';
    }


}
