package headfirst.factory.pizzafm;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
 		PizzaStore seoulStore = new SeoulPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza("clam");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("clam");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza("pepperoni");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza("veggie");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = seoulStore.orderPizza("cheese");
		System.out.println("Gang-Hyun ordered a " + pizza.getName() + "\n");

		pizza = seoulStore.orderPizza("veggie");
		System.out.println("Gang-Hyun ordered a " + pizza.getName() + "\n");

		pizza = seoulStore.orderPizza("clam");
		System.out.println("Gang-Hyun ordered a " + pizza.getName() + "\n");

		pizza = seoulStore.orderPizza("kimchi");
		System.out.println("Gang-Hyun ordered a " + pizza.getName() + "\n");
	}
}
