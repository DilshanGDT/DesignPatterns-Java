package B_CommandPattern;

public class RemoveItemFromBasketOp implements ItemOps {

    private final Item item;

    public RemoveItemFromBasketOp(Item item) {
        this.item = item;
    }

    @Override
    public void execute() {
        item.removeFromBasket();
    }

}