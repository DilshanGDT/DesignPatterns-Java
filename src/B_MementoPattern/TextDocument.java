package B_MementoPattern;

public class TextDocument {

    private String text = "";
    private TextDocState state = new TextDocState(text);

    public void write(String text) {
        this.text += text;
    }

    public void print() {
        System.out.println(text);
    }

    public void save() {
        state.setState(text);
    }

    public void undo() {
        text = state.getState();
    }
}
