package VendingMachine;

import java.util.ArrayList;
import java.util.List;

import Product.Product;

public class VenndingMachine {
    
    //Создаем list
    protected List<Product> products;
    
    //Инициализируем конструктор, с помощью нового списка
    public VenndingMachine() {
        this.products = new ArrayList<>();
    }

    //Инициализируем конструктор, с добавлением продуктов в list
    public VenndingMachine(List<Product> products) {
        this.products = products;
    }

    //Добавляет продукт в List products
    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }

    //Получаем Product
    public Product getProduct(String name) {
        //Проходим по списку
        for (Product product : products) {
            //если name переданного продукта равно переданному name
            if (product.getName().equals(name)) {
                //записываем его в новую переменную
                Product result = product;
                // выводим параметры найденного продукта
                System.out.println("Product have name " + name);
                System.out.println("");
                //удаляем найденный продукт из списка
                products.remove(product);
                //возвращаем найденный продукт
                return result;
            }
        }

        System.out.println("No such product " + name);
        System.out.println("");
        return null;
    }

    //геттер
    public List<Product> getProducts() {
        return products;
    }
    

    
}
