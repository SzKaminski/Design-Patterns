package decorator.zadanie;


import java.util.Set;

public class LargeFriesDecorator implements BurgerInterface {

    private BurgerInterface actual;

    public LargeFriesDecorator(BurgerInterface actual) {
        this.actual = actual;
    }

    @Override
    public Set<Menu> getParts() {
        Set<Menu> menus = actual.getParts();
        menus.remove(Menu.MALE_FRYTKI);
        menus.add(Menu.DUZE_FRYTKI);
        return menus;
    }

    @Override
    public double getPrice() {
        if (actual.getParts().contains(Menu.DUZE_FRYTKI)){
            return actual.getPrice();
        }
        return actual.getPrice() + 1.5;
    }
}
