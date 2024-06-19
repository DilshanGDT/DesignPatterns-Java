package S_CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class CheckList implements Completable {

    List<ToDoItem> toDoItems = new ArrayList<>();

    public void addTodoItems(ToDoItem todoItem) {
        toDoItems.add(todoItem);
    }

    @Override
    public void isCompleted() {
        toDoItems.forEach(ToDoItem::isCompleted);
    }
}
