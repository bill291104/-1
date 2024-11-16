package headfirst.factory.pizzafm;

public class SeoulPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new SeoulStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new SeoulStyleCheesePizza();
        } else if (item.equals("clam")) {
            return new SeoulStyleClamPizza();
        } else if (item.equals("kimchi")) {
            return new SeoulStyleKimchiPizza();
        } else return null;
    }
}
