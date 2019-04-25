package decorator.zadanie;

import java.util.Set;

public class BigDrinkDecorator implements BurgerInterface {

    private BurgerInterface actual;

    public BigDrinkDecorator(BurgerInterface actual) {
        this.actual = actual;
    }


    @Override
    public Set<Menu> getParts() {
        Set<Menu> menus = actual.getParts();
        menus.remove(Menu.MALY_NAPOJ);
        menus.remove(Menu.DUZY_NAPOJ);
        return menus;
    }

    @Override
    public double getPrice() {
        if (actual.getParts().contains(Menu.DUZY_NAPOJ)){
            return actual.getPrice();
        }
        return actual.getPrice() + 2;
    }
}
