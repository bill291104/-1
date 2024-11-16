package headfirst.factory.pizzaaf;

public class SeoulPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new SeoulPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Seoul Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Seoul Style Veggie Pizza");

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Seoul Style Clam Pizza");

        } else if (item.equals("kimchi")) {

            pizza = new KimchiPizza(ingredientFactory);
            pizza.setName("Seoul Style Kimchi Pizza");

        }
        return pizza;
    }
}
