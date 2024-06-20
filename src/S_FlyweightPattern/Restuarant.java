package S_FlyweightPattern;

public class Restuarant {

    public static void main(String[] args) {

        var pizza1 = OrderFactory.createOrder("Pizza");
        var pizza2 = OrderFactory.createOrder("Pizza");
        var pizza3 = OrderFactory.createOrder("Pizza");

        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);

        var burger1 = OrderFactory.createOrder("burger");
        var burger2 = OrderFactory.createOrder("burger");
        var burger3 = OrderFactory.createOrder("burger");

        System.out.println(burger1);
        System.out.println(burger2);
        System.out.println(burger3);

    }
}
