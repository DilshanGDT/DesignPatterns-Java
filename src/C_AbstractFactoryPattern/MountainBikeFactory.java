package C_AbstractFactoryPattern;

public class MountainBikeFactory implements BikeFactory {

    @Override
    public HandleBars createHandleBars() {
        return new MountainBikeHandleBars();
    }

    @Override
    public Pedals createPedals() {
        return new MountainBikePedals();
    }

    @Override
    public Tire createTire() {
        return new MountainBikeTire();
    }

}
