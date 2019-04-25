package singleton.scheam;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        SimpleSingleton.INSTANCE.method();

        LazySingleton.getINSTANCE().method();
        EnumSingleton.INSTANCE.method();

        Constructor<SimpleSingleton> constructor = SimpleSingleton.class.getDeclaredConstructor();

        constructor.setAccessible(true);
        constructor.newInstance();


    }
}
