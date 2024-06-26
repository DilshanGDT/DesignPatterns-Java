package B_CommandPattern;

public class Item {

    private final int id;

    public Item(int id) {
        this.id = id;
    }

    public void addToBasket() {
        System.out.println("Item " + id + " added to the basket.");
    }

    public void removeFromBasket() {
        System.out.println("Item " + id + " remove from the basket.");
    }
}
