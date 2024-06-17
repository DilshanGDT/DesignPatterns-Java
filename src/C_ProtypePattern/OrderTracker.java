package C_ProtypePattern;

import java.util.List;

public class OrderTracker {

    private static void placeOrder(List<Meal> meals) {
        System.out.println("Order Placed : ");
        meals.forEach(System.out::println);
    }

    public static void main(String arg[]) {

        /*
         * PizzaFlavor pepperoni = new PizzaFlavor("Pepperoni");
         * Pizza pepPizza1 = new Pizza(4, pepperoni);
         * Pizza pepPizza2 = new Pizza(4, pepperoni);
         * Pizza pepPizza3 = new Pizza(4, pepperoni);
         */

        PizzaFlavor pepperoni = new PizzaFlavor("Pepperoni");
        Pizza pepPizza1 = new Pizza(4, pepperoni);
        Pizza pepPizza2 = pepPizza1.clone();
        Pizza pepPizza3 = pepPizza1.clone();
        pepperoni.setName("Pepperoni with extra cheese");

        PizzaFlavor sausage = new PizzaFlavor("Sausage");
        Pizza sauPizza1 = new Pizza(5, sausage);
        Pizza sauPizza2 = sauPizza1.clone();

        List<Meal> order = List.of(pepPizza1, pepPizza2, pepPizza3, sauPizza1, sauPizza2);

        placeOrder(order);
    }

}
