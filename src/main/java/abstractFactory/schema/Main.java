package abstractFactory.schema;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<AbstractFactory> factories = new ArrayList<>();

        factories.add(new FactoryA());
        factories.add(new FactoryB());

        userInterface(factories);
    }


    private static void userInterface(List<AbstractFactory> factories) {
        factories.forEach(factory -> {
            AbstractClass clazz = factory.buildClass();
            System.out.println(clazz.method());
        });
    }
}
