package builder.zadanie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sandwich {

    private BunType bun;
    private Sauce sauce;
    private MeatType meat;
    private List<Spices> spices;
    private List<Addon> addons;
    private double price;

}
