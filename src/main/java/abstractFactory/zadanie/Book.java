package abstractFactory.zadanie;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Book extends Product {

    private String title;
    private String author;
    private String publisher;
    private int releaseNumber;
    private LocalDate dateofRelease;
    private int numberOfPages;

    public Book(String title, String author, String publisher, int releaseNumber, LocalDate dateofRelease, int numberOfPages, double price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.releaseNumber = releaseNumber;
        this.dateofRelease = dateofRelease;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    @Override
    public String getSummary() {
        return String.format("%s: %s\n " +
                "%s\n" +
                "%s - %s\n" +
                "%s",
                author,title,
                publisher,
                releaseNumber, dateofRelease,
                numberOfPages);
    }

}
