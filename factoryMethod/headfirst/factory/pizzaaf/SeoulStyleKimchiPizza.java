package headfirst.factory.pizzafm;

public class SeoulStyleKimchiPizza extends Pizza {
    public SeoulStyleKimchiPizza() {
        name = "Seoul Style Kimchi Pizza";
        dough = "Rice Dough";
        sauce = "Normal Tomato Sauce";

        toppings.add("Shredded Cheddar cheese");
        toppings.add("kimchi");
    }
}
