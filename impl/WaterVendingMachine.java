package impl;

import java.util.List;

import Product.Product;
import VendingMachine.VenndingMachine;

public class WaterVendingMachine extends VenndingMachine {
    
    public WaterVendingMachine() {
        super();
    }

    public WaterVendingMachine(List<Product> products) {
        super(products);
    }
}
