package headfirst.factory.pizzaaf;

public class KimchiPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;


    public KimchiPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        kimchi = ingredientFactory.createKimchi();
    }
}
