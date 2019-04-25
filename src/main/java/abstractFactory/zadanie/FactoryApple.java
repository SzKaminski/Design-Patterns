package abstractFactory.zadanie;

public class FactoryApple implements  ProductFactory {


    @Override
    public Product getProduct() {
        return new Apple("McIntosh","Canada","Green", true);
    }

}
