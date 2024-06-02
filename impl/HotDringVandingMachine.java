package impl;

import java.util.List;

import Product.Product;
import VendingMachine.VenndingMachine;

public class HotDringVandingMachine extends VenndingMachine {
    
    public HotDringVandingMachine () {
        super();
    }

    public HotDringVandingMachine(List<Product> products) {
        super(products);
    }


    public HotDrink getProduct(String name, Float volume, Integer temperature) {
        // проходимся по list products 
        for (int i = 0; i < products.size(); i++) {
            //получаем текущий продукт и присваиваем его новому product
            Product product = products.get(i);
            //проверяем что текущий продукт
            if(product instanceof HotDrink) {
                //приводим к hotDrink
                HotDrink hotDrink = (HotDrink) product;
                //проверяем что по всем параметрам hotDrink есть в текущем списке
                if (hotDrink.getName().equals(name) && hotDrink.getVolume().equals(volume) && hotDrink.getTemperature().equals(temperature)) {
                    // выводим параметры найденного продукта
                    System.out.println("Product have name " + name + " with volume " + volume + " and temperature " + temperature);
                    System.out.println("");
                    //удаляем его из текущего списка
                    products.remove(i);
                    return hotDrink;
                }
            }
        }
        System.out.println("No such product " + name + " with volume " + volume + " and temperature " + temperature);
        System.out.println("");
        return null;
    }

    @Override
    public Product getProduct(String name) {
        return super.getProduct(name);
    }


}
