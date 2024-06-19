package S_CompositePattern;

public class App {

    public static void main(String[] args) {

        CheckList checkList = new CheckList();
        var todoItem1 = new ToDoItem("Do this");
        var todoItem2 = new ToDoItem("Do that");
        var todoItem3 = new ToDoItem("Do something else");

        checkList.addTodoItems(todoItem1);
        checkList.addTodoItems(todoItem2);
        checkList.addTodoItems(todoItem3);

        todoItem1.complete();

        checkList.isCompleted();

    }
}
