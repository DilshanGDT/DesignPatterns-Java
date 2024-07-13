package B_VisitorPattern;

public class CalculateSizeVisitor implements Visitor {

    private int totalSize;

    @Override
    public void visit(File file) {
        totalSize += file.getSize();
    }

    @Override
    public void visit(Directory dir) {
        dir.getElements().forEach(e -> e.accept(this));
    }

    public int getTotalSize() {
        return this.totalSize;
    }

}
