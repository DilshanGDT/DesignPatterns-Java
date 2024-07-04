package B_MementoPattern;

public class DocViewer {

    public static void main(String[] args) {

        var textDoc = new TextDocument();
        textDoc.write("Hello World. ");
        textDoc.save();
        textDoc.print();

        textDoc.write("How are you?");
        textDoc.print();
        textDoc.undo();
    }

}
