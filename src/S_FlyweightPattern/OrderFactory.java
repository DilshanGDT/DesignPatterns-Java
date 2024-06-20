package S_FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

/* Fliweight pattern */
public class OrderFactory {

    private static final Map<String, Order> orderCache = new HashMap<>();

    public static Order createOrder(String name) {
        if (orderCache.containsKey(name)) {
            return orderCache.get(name);
        }
        var order = new Order(name);
        orderCache.put(name, order);
        return order;

        /*
         * create a new order if there is already created the
         * same one, return by get method.
         */
    }
}
