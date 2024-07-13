package B_VisitorPattern;

public interface Visitor {

    void visit(File file);

    void visit(Directory dir);
}
