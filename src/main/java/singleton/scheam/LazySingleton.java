package singleton.scheam;

public class LazySingleton {

    private static LazySingleton INSTANCE;

    private LazySingleton(){
    }

    public static LazySingleton getINSTANCE() {
        if (INSTANCE == null){
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

    public void method(){
        System.out.println("lazy singleton");
    }
}
