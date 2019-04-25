package decorator.schema;

public class Main {
    public static void main(String[] args) {
        BaseInterface obj = new BaseClass();

        System.out.println(obj.getName());

        obj = new NameDecorator(obj);
        System.out.println(obj.getName());
    }
}
