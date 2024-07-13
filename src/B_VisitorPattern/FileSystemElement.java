package B_VisitorPattern;

public interface FileSystemElement {

    String getName();

    void accept(Visitor visitor);
}
