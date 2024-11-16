package headfirst.factory.pizzafm;

public class SeoulStyleClamPizza extends Pizza {
    public SeoulStyleClamPizza() {
        name = "Seoul Style Clam Pizza";
        dough = "Normal Dough";
        sauce = "Normal Tomato Sauce";

        toppings.add("Shredded Cheddar cheese");
        toppings.add("Boryung pen shell");
    }
}
