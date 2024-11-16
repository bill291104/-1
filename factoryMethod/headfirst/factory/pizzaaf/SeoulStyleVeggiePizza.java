package headfirst.factory.pizzafm;

public class SeoulStyleVeggiePizza extends Pizza {
    public SeoulStyleVeggiePizza() {
        name = "Seoul Style Veggie Pizza";
        dough = "Normal Dough";
        sauce = "Normal Tomato Sauce";

        toppings.add("Shredded Cheddar cheese");
        toppings.add("PyengChang fried potato");
    }
}
