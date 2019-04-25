package facade;

import abstractFactory.zadanie.Product;

public class BillingService {

    private ProductService productService;
    private BillingService billingService;
    private DeliveryService deliveryService;

    public void buyProduct(String name, String address, String creditCardNumber){
        Product product = productService.buyProduct(name);
    //    billingService.bill(creditCardNumber, product.getPrice());
    //    deliveryService.send(product, address);
    }
}
