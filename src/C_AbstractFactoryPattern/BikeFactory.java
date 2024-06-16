package C_AbstractFactoryPattern;

public interface BikeFactory {

    HandleBars createHandleBars();

    Pedals createPedals();

    Tire createTire();
}
