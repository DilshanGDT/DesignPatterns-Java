package C_AbstractFactoryPattern;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/* abstract factory method more. we can use this in main method for make that method more smaller */
public class FactoryMaker {

    private static final Map<String, Supplier<BikeFactory>> bikeTypes = new HashMap<>();

    static {
        bikeTypes.put("Road", RoadBikeFactory::new);
        bikeTypes.put("Mountain", MountainBikeFactory::new);
    }

    public static BikeFactory createFactory(String bikeType) {
        if (bikeTypes.get(bikeType) != null) {
            return bikeTypes.get(bikeType).get();
        } else {
            throw new IllegalArgumentException("Bike Type not supported");
        }
    }
}
