package abstractFactory.zadanie;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Apple extends Product {

    private String type;
    private String originCountry;
    private String color;
    private boolean sour;


    @Override
    public String getSummary() {
        String summary = String.format("%s, from %s\n" +
                        "color: %s",
                type, originCountry, color);

        summary += sour ? "sour" : "sweet";
        return summary;
    }
}
