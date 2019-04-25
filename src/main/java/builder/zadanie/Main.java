package builder.zadanie;

public class Main {
    public static void main(String[] args) {

        Sandwich sandwich = new SandwichBuilder()
                .withHoneyBun()
                .withLettuce()
                .withChicken()
                .withBBQSauce()
                .withParmezan()
                .withTomatoes()
                .withCucumber()
                .withOlies()
                .withPepper()
                .withSault()
                .build();

        System.out.println(sandwich);
    }
}
