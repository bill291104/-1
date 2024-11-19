package headfirst.factory.pizzaaf;

public class SeoulPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new RiceDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new CheddarCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(),
                new Onion(),
                new Mushroom(),
                new RedPepper(),
                new BlackOlives(),
                new Spinach(),
                new Eggplant()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new PenShell();
    }

    @Override
    public Kimchi createKimchi() {
        return new Kimchi();
    }


}
