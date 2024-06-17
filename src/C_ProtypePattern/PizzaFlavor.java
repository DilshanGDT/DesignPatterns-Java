package C_ProtypePattern;

public class PizzaFlavor {

    private String name;

    public PizzaFlavor(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
