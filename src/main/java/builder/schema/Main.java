package builder.schema;

public class Main {

    public static void main(String[] args) {

        User user = new UserBuilderOne()
                .banned()
                .withName("Adam")
                .withAfricanEthnicity()
                .withNationality("Polish")
                .build();

        System.out.println(user);
    }
}
