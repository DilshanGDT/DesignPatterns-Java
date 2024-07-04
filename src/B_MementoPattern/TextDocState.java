package B_MementoPattern;

/* Memento Pattern */

public class TextDocState {

    private String state;

    public TextDocState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
