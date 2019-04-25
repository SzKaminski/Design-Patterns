package abstractFactory.schema;

public class FactoryB implements AbstractFactory {

    public AbstractClass buildClass() {
        return new ClassB();
    }
}
