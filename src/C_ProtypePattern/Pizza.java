package C_ProtypePattern;

public class Pizza extends Meal {

    private PizzaFlavor flavor;

    public Pizza(int price, PizzaFlavor flavor) {
        super(price);
        this.flavor = flavor;
    }

    public PizzaFlavor getFlavor() {
        return this.flavor;
    }

    public void setFlavor(PizzaFlavor flavor) {
        this.flavor = flavor;
    }

    public String toString() {
        return "Pizza - Price = " + super.getPrice() + " Flavor = " + flavor;
    }

    @Override
    public Pizza clone() {
        return new Pizza(this.getPrice(), new PizzaFlavor(this.getFlavor().getName()));
    }
}
