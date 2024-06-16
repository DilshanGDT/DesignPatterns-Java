package C_AbstractFactoryPattern;

public class BikeManufacture {

    private static Bike buildBike(String bikeType) {
        if (bikeType.equalsIgnoreCase("Road")) {
            var roadBikefactory = new RoadBikeFactory();
            var handleBars = roadBikefactory.createHandleBars();
            var pedals = roadBikefactory.createPedals();
            var frontTire = roadBikefactory.createTire();
            var backTire = roadBikefactory.createTire();
            return new Bike(handleBars, pedals, frontTire, backTire);
        } else if (bikeType.equalsIgnoreCase("Mountain")) {
            var mountainBikefactory = new MountainBikeFactory();
            var handleBars = mountainBikefactory.createHandleBars();
            var pedals = mountainBikefactory.createPedals();
            var frontTire = mountainBikefactory.createTire();
            var backTire = mountainBikefactory.createTire();
            return new Bike(handleBars, pedals, frontTire, backTire);
        } else {
            throw new IllegalArgumentException("Bike type not supported");
        }
    }

    public static void main(String[] args) {

        Bike roadBike = buildBike("Road");
        Bike mountainBike = buildBike("Mountain");

        System.out.println(roadBike);
        System.out.println(mountainBike);
    }
}
