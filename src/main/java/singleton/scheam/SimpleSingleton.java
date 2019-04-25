package singleton.scheam;

public class SimpleSingleton {

    public static final SimpleSingleton INSTANCE = new SimpleSingleton();

    private SimpleSingleton(){
        if (INSTANCE != null){
            throw new IllegalStateException("You shall not pass!");
        }
        // inicjalizowanie danych
    }

    public void method(){
        System.out.println("simple singleton");
    }
}
