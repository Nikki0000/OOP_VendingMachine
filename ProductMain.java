import java.time.LocalDate;
import java.util.List;

import Product.Product;
import VendingMachine.VenndingMachine;
import impl.BottleOfWatter;
import impl.EPackage;
import impl.HotDringVandingMachine;
import impl.HotDrink;
import impl.WaterVendingMachine;

public class ProductMain {
    public static void main(String[] args) {
        
        Product bottle1 = new BottleOfWatter("Родники", 
                                            55, 
                                            LocalDate.of(2024, 5, 1));

        Product bottle2 = new BottleOfWatter("Газировка", 
                                            65, 
                                            LocalDate.of(2024, 4, 1), 
                                            true, 
                                            EPackage.GLASS.getMaterial(),
                                            0.5F);

        Product hotDrink1 = new HotDrink("Глинтвейн", 
                                        250, 
                                        LocalDate.of(2024, 5, 29), 
                                        1F,
                                        50);

        HotDrink hotDrink2 = new HotDrink("Чай", 
                                    100, 
                                    LocalDate.of(2024, 6 ,1), 
                                    0.3F, 
                                    90);


        // VenndingMachine vm = new WaterVendingMachine();

        // System.out.println(vm.getProducts());

        // System.out.println("");

        // vm.addProducts(List.of(bottle1, bottle2));

        // System.out.println(vm.getProducts());

        // System.out.println("");

        // vm.getProduct("Родники");

        // System.out.println(vm.getProducts());

        // System.out.println("");



        HotDringVandingMachine vm3 = new HotDringVandingMachine();
        System.out.println(vm3.getProducts());
        System.out.println("");
        vm3.addProducts(List.of(hotDrink1, hotDrink2, hotDrink2));
        System.out.println(vm3.getProducts());
        System.out.println("");
        vm3.getProduct("Глинтвейнн", 1F, 50);
        System.out.println(vm3.getProducts());


    }
}
