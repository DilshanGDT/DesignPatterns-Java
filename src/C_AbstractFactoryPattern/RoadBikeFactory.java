package C_AbstractFactoryPattern;

public class RoadBikeFactory implements BikeFactory {

    @Override
    public HandleBars createHandleBars() {
        return new RoadBikeHandleBars();
    }

    @Override
    public Pedals createPedals() {
        return new RoadBikePedals();
    }

    @Override
    public Tire createTire() {
        return new RoadBikeTire();
    }

}
