package B_CommandPattern;

public class AddItemToBasketOp implements ItemOps {

    private final Item item;

    public AddItemToBasketOp(Item item) {
        this.item = item;
    }

    @Override
    public void execute() {
        item.addToBasket();
    }

}
