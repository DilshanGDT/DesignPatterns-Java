package C_AbstractFactoryPattern;

public class Bike {

    private HandleBars handleBars;
    private Pedals pedals;
    private Tire frontTire;
    private Tire backTire;

    public Bike(HandleBars handleBars, Pedals pedals, Tire frontTire, Tire backTire) {
        this.handleBars = handleBars;
        this.pedals = pedals;
        this.frontTire = frontTire;
        this.backTire = backTire;
    }

    public HandleBars getHandleBars() {
        return handleBars;
    }

    public Pedals getPedals() {
        return pedals;
    }

    public Tire getFrontTire() {
        return frontTire;
    }

    public Tire getBackTire() {
        return backTire;
    }

    public String toString() {
        return "Bike : Handlebars = " + handleBars.getType() + " Pedals " + pedals.getType() + " Front Tire = "
                + frontTire.getWidth()
                + " Back Tire " + backTire.getWidth();
    }
}
