package decorator.zadanie;

public class Main {
    public static void main(String[] args) {

        BurgerInterface burgerInterface = new BaseMealSet();

        System.out.println(burgerInterface.getParts());
        System.out.println(burgerInterface.getPrice());

        burgerInterface = new LargeFriesDecorator(burgerInterface);
        System.out.println(burgerInterface.getParts());
        System.out.println(burgerInterface.getPrice());

    }
}
