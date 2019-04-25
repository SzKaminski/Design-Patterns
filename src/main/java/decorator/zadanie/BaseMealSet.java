package decorator.zadanie;

import java.util.HashSet;
import java.util.Set;

public class BaseMealSet implements BurgerInterface{



    @Override
    public Set<Menu> getParts() {
        Set<Menu> menus = new HashSet<>();
        menus.add(Menu.MALE_FRYTKI);
        menus.add(Menu.MALY_NAPOJ);
        menus.add(Menu.BIGMAC);
        return menus;
    }

    @Override
    public double getPrice() {
        return 15;
    }

}
