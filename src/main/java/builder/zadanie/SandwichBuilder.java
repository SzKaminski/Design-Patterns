package builder.zadanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SandwichBuilder {

    private Sandwich sandwich;

    public SandwichBuilder() {
        sandwich = new Sandwich();
        sandwich.setPrice(14.99);
        sandwich.setSpices(new ArrayList<>());
        sandwich.setAddons(new ArrayList<>());
    }

    public SandwichBuilder withCheeseOreganoBun(){
        sandwich.setBun(BunType.CHEESE_OREGANO);
        return this;
    }

    public SandwichBuilder withHoneyBun(){
        sandwich.setBun(BunType.HONEY);
        return this;
    }

    public SandwichBuilder withWholeMealBun(){
        sandwich.setBun(BunType.WHOLEMEAL);
        return this;
    }


    public SandwichBuilder withBBQSauce(){
        sandwich.setSauce(Sauce.BBQ);
        return this;
    }
    public SandwichBuilder withCesarSauce(){
        sandwich.setSauce(Sauce.CESAR);
        return this;
    }
    public SandwichBuilder withChilliSauce(){
        sandwich.setSauce(Sauce.CHILLI);
        return this;
    }
    public SandwichBuilder withGarlicSauce(){
        sandwich.setSauce(Sauce.GARLIC);
        return this;
    }

    public SandwichBuilder withSweetChilliSauce(){
        sandwich.setSauce(Sauce.SWEET_CHILLI);
        return this;
    }

    public SandwichBuilder withBeef(){
        sandwich.setMeat(MeatType.BEEF);
        return this;
    }

    public SandwichBuilder withChicken(){
        sandwich.setMeat(MeatType.CHICKEN);
        return this;
    }

    public SandwichBuilder withFalafel(){
        sandwich.setMeat(MeatType.FALAFEL);
        return this;
    }

    public SandwichBuilder withPork(){
        sandwich.setMeat(MeatType.PORK);
        return this;
    }

    public SandwichBuilder withRibs(){
        sandwich.setMeat(MeatType.RIBS_NNQ);
        return this;
    }

    public SandwichBuilder withParmezan(){
        sandwich.getSpices().add(Spices.PARMEZAN);
        return this;
    }

    public SandwichBuilder withPepper(){
        sandwich.getSpices().add(Spices.PEPPER);
        return this;
    }

    public SandwichBuilder withSault(){
        sandwich.getSpices().add(Spices.SAULT);
        return this;
    }

    public SandwichBuilder withLettuce(){
        sandwich.getAddons().add(Addon.LETTUCE);
        return this;
    }

    public SandwichBuilder withCucumber(){
        sandwich.getAddons().add(Addon.CUCUMBER);
        return this;
    }

    public SandwichBuilder withOlies(){
        sandwich.getAddons().add(Addon.OLIES);
        return this;
    }

    public SandwichBuilder withTomatoes(){
        sandwich.getAddons().add(Addon.TOMATOES);
        return this;
    }

    public Sandwich build(){
        return sandwich;
    }
}
