package C_SingletonPattern;

public class DocPrinter {

    public void printDoc() {
        var spooler = PrintSpooler.getInstance();
        spooler.print();
    }
}
