package B_CommandPattern;

public class OnlineStore {

    public static void main(String[] args) {

        var item1 = new Item(1);
        var item2 = new Item(2);
        var item3 = new Item(3);

        /* item1.addToBasket(); */

        var itemOpsExecuter = new ItemOpsExecuter();
        itemOpsExecuter.queueOp(new AddItemToBasketOp(item1));
        itemOpsExecuter.queueOp(new AddItemToBasketOp(item2));
        itemOpsExecuter.queueOp(new AddItemToBasketOp(item3));

        itemOpsExecuter.queueOp(new RemoveItemFromBasketOp(item2));

        itemOpsExecuter.checkout();

    }
}
