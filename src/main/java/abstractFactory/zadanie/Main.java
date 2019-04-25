package abstractFactory.zadanie;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<ProductFactory> factories = new ArrayList<>();

        factories.add(new FactoryBook());
        for (ProductFactory factory : factories){
            cart(factory);
        }
    }

    private static void cart(ProductFactory factory){
        for (int i = 0; i < 10; i++) {
            Product product = factory.getProduct();
            System.out.println(product.getSummary());
            System.out.printf("price: %.2f\n", product.getPrice());
            System.out.println("##############################");
        }
    }
}
