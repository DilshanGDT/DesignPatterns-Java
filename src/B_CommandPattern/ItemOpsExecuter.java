package B_CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class ItemOpsExecuter {

    List<ItemOps> itemOps = new ArrayList<>();

    public void queueOp(ItemOps itemOp) {
        itemOps.add(itemOp);
    }

    public void checkout() {
        itemOps.forEach(ItemOps::execute);
        itemOps.clear();
    }
}
