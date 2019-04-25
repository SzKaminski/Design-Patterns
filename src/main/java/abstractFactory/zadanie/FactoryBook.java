package abstractFactory.zadanie;

import java.time.LocalDate;
import java.util.Random;

public class FactoryBook implements ProductFactory {

    private static final String[] authors = {"Mati G", "Stieg Larsson", "Tolkien", "King"};
    private static final String[] titles = {"Autobiografia", "Wiedzmin", "Lotr"};
    private static final String[] publishers = {"SuperNova", "NowaEra", "Sowa"};

    @Override
    public Product getProduct(){
        Random random = new Random();
        String author = authors[random.nextInt(4)];
        String title = titles[random.nextInt(3)];
        String publisher = publishers[random.nextInt(3)];
        LocalDate date = LocalDate.now();
        date = date.minusYears(random.nextInt(100));
        return new Book(title, author, publisher, random.nextInt(10), date, random.nextInt(1000) + 100, random.nextDouble()*100);
    }
}
