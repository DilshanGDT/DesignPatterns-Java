package S_CompositePattern;

public class ToDoItem implements Completable {

    private final String description;
    private boolean completed = false;

    public ToDoItem(String description) {
        this.description = description;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public void isCompleted() {
        System.out.println("Todo item \"" + description + "\" is completed " + completed);
    }
}
