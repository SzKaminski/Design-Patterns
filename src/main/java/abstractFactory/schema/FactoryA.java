package abstractFactory.schema;

public class FactoryA implements AbstractFactory {

    public AbstractClass buildClass() {
        return new ClassA();
    }
}
